/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Compra;
import vista.GUIProductos;
import modelo.Producto;
import static persistencia.DaoCompra.resultado;

/**.
 *
 * @author dcorr
 */

public class DaoProducto {
    
  public static Connection conexion = null;
  public static Statement sentencia = null;
  static ResultSet resultado = null;
  static ResultSet resultado2 = null;
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

    } catch (Exception e) {
      //TODO: HANDLE EXCEPTION
      JOptionPane.showMessageDialog(null, "error al conectar" + e);

    }

  }
  
  /**.
   * 
   * @param producto producto que se desea guardar 
   */
  
  public static void guardarProducto(Producto producto) {

    try {

      // ARMA LA SENTENCIA DE INSERCCION
      String consultaSql = "INSERT INTO productos (codigo,"
                                + "nombreproducto,"
                                + "precioventaproducto,"
                                + "categoria,"
                                + "cantidadproducto,"
                                + "cpp)"
                                + "  VALUES (?,?,?,?,?,?)";

      PreparedStatement ps = conexion.prepareStatement(consultaSql);
      ps.setLong(1, producto.getId());
      ps.setString(2, producto.getNombre());
      ps.setDouble(3, producto.getPrecioVenta());
      ps.setString(4, producto.getCategoria());
      ps.setLong(5, producto.getCantidad());
      ps.setDouble(6, producto.getCpp());
      ps.executeQuery();
      ps.close();

    } catch (SQLException e) {
      System.out.println(e);
      JOptionPane.showMessageDialog(null, "producto registrado con exito ");

    }
  }
    
  /**.
   * 
   * @param codigoProducto identificacion que se le asigna al producto 
   * @return ..
   */
  
  public static int consultarCantidad(int codigoProducto) {
    int cantidadEnStock = 0;
    // System.out.println(codigoProducto);
        
    String sql = "select cantidadproducto from productos where (codigo=" + codigoProducto + ")";
        
    try {
                        
      resultado = sentencia.executeQuery(sql);
      resultado.next();
      cantidadEnStock = resultado.getInt(1);
                        
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
      System.out.println("hola");
      System.out.println(e);
    }
        
    return cantidadEnStock;
        
        
  }
    
  /**.
   * 
   * @param codigoProducto id del producto
   * @param cantidad cantidad del producto a actualizar 
   * @param sumaResta ..
   */  
  public static void actualizarCantidad(int codigoProducto, int cantidad,int sumaResta) {
    int cantidadActual = consultarCantidad(codigoProducto);
    int cantidadNueva = 0;
    if (sumaResta == 1) {
     
      cantidadNueva = cantidadActual  + cantidad;
     
    } else {
     
      cantidadNueva = cantidadActual - cantidad;
     
    }
     
    try {

      PreparedStatement pss = DaoProducto.conexion.prepareStatement("UPDATE productos SET "
          + "cantidadproducto='" + cantidadNueva
          + "' WHERE codigo='" + codigoProducto + "'");
      pss.executeUpdate();
      JOptionPane.showMessageDialog(null, "DATOS ACTUALIZADOS");

    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
    
  /**.
     * 
     * @param codigoProducto id del producto a consultar 
     * @return ..
     */
  
  public static int consultarCpp(int codigoProducto) {
    int cpp = 0;
    // System.out.println(codigoProducto);
        
    String sql = "select cpp  from productos where (codigo=" + codigoProducto + ")";
        
    try {
      resultado = sentencia.executeQuery(sql);
      resultado.next();
      cpp = resultado.getInt(1);
                        
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
      System.out.println(e);
    }
    return cpp;
        
  } 
    
  /**.
   * 
   * @param codigoProducto id del producto
   * @param cppNuevo nuevo ponderado
   */
  
  public static void actualizarCpp(int codigoProducto, double cppNuevo) {
    
        
    int nuevoCpp = (int)cppNuevo;
     
    try {

      PreparedStatement pss = DaoProducto.conexion.prepareStatement("UPDATE productos SET "
          + "cpp='" + nuevoCpp
          + "' WHERE codigo ='" + codigoProducto + "'");
      pss.executeUpdate();
      JOptionPane.showMessageDialog(null, "DATOS ACTUALIZADOS");

    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
     
  /**.
   * 
   * @param fechaAviso fecha de aviso que el producto está proximo a vencerse 
   * @return fecha
   */   
     
  public static ArrayList consultarProductosVencimiento(String fechaAviso) {
       
    // System.out.println(codigoProducto);
    ArrayList<Object> productosVencerse = new ArrayList<>();
    ArrayList<Object> productosVencerse2 = new ArrayList<>();
        
    String sql = "select productos.nombreproducto,compraproducto.fechavencimiento,"
                + "compraproducto.fechaaviso "
                     + "from productos inner join compraproducto "
                + "on productos.codigo = compraproducto.codigoproducto "
                     + "where compraproducto.fechaaviso ='" + fechaAviso + "' "
                     + "group by productos.nombreproducto,compraproducto.fechavencimiento,"
                + "compraproducto.fechaaviso";
        
    String sql2 = "select Count(*) "
                     + "from productos inner join compraproducto "
            + "on productos.codigo = compraproducto.codigoproducto "
                     + "where compraproducto.fechaaviso ='" + fechaAviso + "'";
        
    try {
      resultado = sentencia.executeQuery(sql);
      resultado2 = sentencia.executeQuery(sql2);
      resultado2.next();
                        
      int tamano = resultado2.getInt(1);
      int i;
      for (i = 0; i < tamano;i++) {
        resultado.next();
        productosVencerse2.add( resultado.getString(1));
        productosVencerse2.add( resultado.getString(2));
        productosVencerse2.add( resultado.getString(3));
        if (productosVencerse.size() <= tamano) {
                            
          productosVencerse.add(productosVencerse2);
        }
        else {
          productosVencerse2.remove(0);
          productosVencerse2.remove(0);
          productosVencerse2.remove(0);
                            
        }
      }
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
      System.out.println(e);
    }
        
    //System.out.println(ProductosVencerse);
    return productosVencerse;
        
        
  }  
     
     
     
    
   
    
    
}
