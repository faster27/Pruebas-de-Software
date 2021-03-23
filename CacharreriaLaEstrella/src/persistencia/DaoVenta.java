/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package persistencia;

import modelo.Venta;

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
public class DaoVenta {
    
  public static Connection conexion = null;
  public static Statement sentencia = null;
  static ResultSet resultado = null;
  static String cadenaDriver = "org.postgresql.Driver";
   
  /**.
   * @author dcorr
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
   * @param venta venta realizada 
   */
  
  public static void guardarVenta(Venta venta) {

    try {

      // ARMA LA SENTENCIA DE INSERCCION
      String consultaSql = "INSERT INTO venta (codigoventa,"
                               
          + "fecha)"
          + "  VALUES (?,?)";

        try (PreparedStatement ps = conexion.prepareStatement(consultaSql)) {
            ps.setLong(1, venta.getCodigoventa());
            ps.setString(2, venta.getFecha());
            ps.executeQuery();
        }

    } catch (SQLException e) {

      System.out.println(e);
      JOptionPane.showMessageDialog(null, "Producto vendido con exito ");

    }
  }
    
  /**.
   * 
   * @param nuevaVenta nueva venta realizada 
   * @param costoCpp costo ponderado 
   */
  public static void guardarVentaProducto(Venta nuevaVenta, double costoCpp) {

    try {
      conexion();
      // ARMA LA SENTENCIA DE INSERCCION
      String consultaSql = "INSERT INTO ventaproducto (codigoventa,codigoproducto,"
              + "cantidad,totalventaproducto,cppcostos)"
              + " VALUES (?,?,?,?,?)";

            PreparedStatement ps = conexion.prepareStatement(consultaSql);
            ps.setLong(1, nuevaVenta.getCodigoventa());
            ps.setLong(2, nuevaVenta.getCodigoproducto());
            ps.setLong(3, nuevaVenta.getCantidadProducto());
            ps.setDouble(4, nuevaVenta.getTotalventa());
            ps.setDouble(5, costoCpp);
            ps.executeQuery();
        

    } catch (SQLException e) {

      System.out.println(e);
      JOptionPane.showMessageDialog(null, "Producto vendido con exito ");

    }
  }
    
    
    
    
}
