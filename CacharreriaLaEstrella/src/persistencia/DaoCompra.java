/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package persistencia;

import modelo.Compra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


/**.
 *
 * @author dcorr
 */
public class DaoCompra {

  public static Connection conexion = null;
  public static Statement sentencia = null;
  static ResultSet resultado = null;
  static String cadenaDriver = "org.postgresql.Driver";
  
  /**.
   * Este es el metodo que me conecta con la base de datos de la cacharreria la estrella
   */
  
  public static void conexion() {
        
    String clave = "1234";
    String url = "jdbc:postgresql://localhost:5432/CacharreriaLaEstrella";
    String usuario = "postgres";

    try {

      Class.forName(cadenaDriver);
      conexion = DriverManager.getConnection(url, usuario, clave);
      sentencia = conexion.createStatement();
    } catch (ClassNotFoundException | SQLException e) {
      //TODO: HANDLE EXCEPTION
      JOptionPane.showMessageDialog(null, "error al conectar" + e);

    }

  }
   
  /**.
   * 
   * @param compra  Este metodo me guarda una compra en la base de datos 
   */
      
  public static void guardarCompra(Compra compra) {
    
    try {

      // ARMA LA SENTENCIA DE INSERCCION
      String consultaSql;
      consultaSql = "INSERT INTO compra (codigocompra,"                            
                + "fecha)"
                + "  VALUES (?,?)";

      try (PreparedStatement ps = conexion.prepareStatement(consultaSql)) {
        ps.setLong(1, compra.getcodigoCompra());
        ps.setString(2, compra.getFecha());
               
        ps.executeQuery();
      }

    } catch (SQLException e) {

      System.out.println(e);

      JOptionPane.showMessageDialog(null, "Producto comprado con exito ");
    }
  }
  
  /**.
   * 
   * @param compra Este es el objeto que me contiene toda la info acerca de la compra
   * @param fechaVencimiento Esta es la fecha de vencimiento del producto
   * @param fechaAviso Esta es la fecha de aviso cuando el producto esta proximo a vencerse
   * @param totalCompra El resultado total de todas las compras que se relaizan en la cacharreria
   */
  public static void guardarCompraProducto(Compra compra,String fechaVencimiento,
          String fechaAviso,double totalCompra) {

    try {

      // ARMA LA SENTENCIA DE INSERCCION
      String consultaSql;
      consultaSql = "INSERT INTO compraproducto "
                + "(codigoproducto,codigocompra,preciounidadcompra,"
                + "cantidad,fechavencimiento,fechaaviso,totalcompra)"
                + " VALUES (?,?,?,?,?,?,?)";

      try (PreparedStatement ps = conexion.prepareStatement(consultaSql)) {
        ps.setLong(1, compra.getCodigoProducto());
        ps.setLong(2, compra.getcodigoCompra());
        ps.setDouble(3, compra.getPrecioCompraProducto());
        ps.setLong(4, compra.getCantidad());
        ps.setString(5, fechaVencimiento);
        ps.setString(6, fechaAviso);
        ps.setDouble(7, totalCompra);
            
            
            
        ps.executeQuery();
      }

    } catch (SQLException e) {

      System.out.println(e);

      JOptionPane.showMessageDialog(null, "Producto comprado con exito ");

    }
  }
   
    
    

    

   
    
}
