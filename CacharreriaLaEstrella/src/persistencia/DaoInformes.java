/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**.
 *
 * @author dcorr
 */

public class DaoInformes {
  public static Connection conexion = null;
  public static Statement sentencia = null;
  static ResultSet resultado = null;
  static ResultSet resultado2 = null;  
  static String cadenaDriver = "org.postgresql.Driver";
   
    
  /**.
   * @clave
   * @url
   * @usuario
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
      JOptionPane.showMessageDialog(null, "error al conectar" + e);

    }
  }
   
  /**.
   * 
   * @param fecha1 Fecha desde donde comienzo la consulta
   * @param fecha2 Fecha final de la consulta
   * @return retorna la info 
   */
  public static ArrayList consultarInformeCategorias(String fecha1, String fecha2) {
         
    String text;
         
    ArrayList<Integer> ventas = new ArrayList<>();
    ArrayList<String> categoria = new ArrayList<>();
    ArrayList<Object> Resultado = new ArrayList<>();

    try {

      // ARMA LA SENTENCIA DE INSERCCION
      String consultanumerofilas;
      consultanumerofilas = "SELECT Count(*) FROM productos "
                + "INNER JOIN ventaproducto ON productos.codigo = ventaproducto.codigoproducto "
                + "INNER JOIN venta on ventaproducto.codigoventa = venta.codigoventa "
                + "where venta.fecha between'" + fecha1 + "'and'" + fecha2 + "'";
      String consultaSql = "SELECT productos.categoria, SUM(ventaproducto.totalventaproducto) "
              + "as TotalCategoria "
              + "FROM productos INNER JOIN "
              + "ventaproducto ON productos.codigo = ventaproducto.codigoproducto "
              + "INNER JOIN venta on ventaproducto.codigoventa = venta.codigoventa "
              + "where venta.fecha between'" + fecha1 + "'and'" + fecha2 + "'"
              + "group by productos.categoria";
					                       
      resultado = sentencia.executeQuery(consultaSql);
      resultado2 = sentencia.executeQuery(consultanumerofilas);
      resultado2.next();
      int i;                      		                       
      for (i = 0; i < resultado2.getInt(1);i++) {
                            
        if (resultado.next()) {
                               

          categoria.add(resultado.getString(1));
          ventas.add(resultado.getInt(2));
          resultado.next();
        } else{
                            
        }
                            
                            
      }
                        
      Resultado.add(categoria);
      Resultado.add(ventas);
                   
                        
    } catch (SQLException e) {
      e.printStackTrace();
      System.out.println(e);

      JOptionPane.showMessageDialog(null, "Reporte generado con exito ");

    }
    return Resultado;  
               
  }
     
     
    public static ArrayList ConsultarInformeCostos(String fecha1, String fecha2) {
         
         String text;
         
          ArrayList<Integer> ventas = new ArrayList<>();
          ArrayList<String> Categoria = new ArrayList<>();
          ArrayList<Object> Resultado = new ArrayList<>();

		try {

			// ARMA LA SENTENCIA DE INSERCCION
                        String Consultanumerofilas="SELECT Count(*) FROM productos INNER JOIN ventaproducto ON productos.codigo = ventaproducto.codigoproducto INNER JOIN venta on ventaproducto.codigoventa = venta.codigoventa where venta.fecha between'"+fecha1+"'and'"+fecha2+"'";
			String consultaSQL = "SELECT productos.categoria, SUM(ventaproducto.cppcostos) as TotalCategoria FROM productos INNER JOIN ventaproducto ON productos.codigo = ventaproducto.codigoproducto INNER JOIN venta on ventaproducto.codigoventa = venta.codigoventa where venta.fecha between'"+fecha1+"'and'"+fecha2+"'group by productos.categoria";
					
                        
			resultado = sentencia.executeQuery(consultaSQL);
                        resultado2 = sentencia.executeQuery(Consultanumerofilas);
                        resultado2.next();
                          int i;
                        		                       
                        for (i=0; i<resultado2.getInt(1);i++){
                            
                            if (resultado.next()){
                            
                            
                            Categoria.add(resultado.getString(1));
                            ventas.add(resultado.getInt(2));
                            resultado.next();
                            }else{}
                            
                            
                        }
                        
                        Resultado.add(Categoria);
                        Resultado.add(ventas);
                   
                        
		} catch (SQLException e) {
                        e.printStackTrace();
			System.out.println(e);

			JOptionPane.showMessageDialog(null, "Reporte generado con exito ");

		}
         return Resultado;  
               
               


	}
    
    
    public static ArrayList ConsultarInformeCompra(String fecha1, String fecha2) {
         
         String text;
         
          ArrayList<Integer> compra = new ArrayList<>();
          ArrayList<String> Categoria = new ArrayList<>();
          ArrayList<Object> Resultado = new ArrayList<>();

		try {

			// ARMA LA SENTENCIA DE INSERCCION
                        String Consultanumerofilas="SELECT Count(*) FROM productos INNER JOIN ventaproducto ON productos.codigo = ventaproducto.codigoproducto INNER JOIN venta on ventaproducto.codigoventa = venta.codigoventa where venta.fecha between'"+fecha1+"'and'"+fecha2+"'";
			String consultaSQL = "SELECT productos.nombreproducto, SUM(compraproducto.totalcompra) as TotalCategoria FROM productos INNER JOIN compraproducto ON productos.codigo = compraproducto.codigoproducto INNER JOIN compra on compraproducto.codigocompra = compra.codigocompra where compra.fecha between'"+fecha1+"'and'"+fecha2+"'group by productos.nombreproducto";
					
                        
			resultado = sentencia.executeQuery(consultaSQL);
                        resultado2 = sentencia.executeQuery(Consultanumerofilas);
                        resultado2.next();
                        
                        
                          int i;
                        		                       
                        for (i=0; i<resultado2.getInt(1);i++){
                            
                            if(resultado.next()){
                                
                                Categoria.add(resultado.getString(1));
                                compra.add(resultado.getInt(2));
                                resultado.next();
                            }else{}
                            
                          
                            
                           
                        }
                        
                        Resultado.add(Categoria);
                        Resultado.add(compra);
                   
                        
		} catch (SQLException e) {
                        e.printStackTrace();
			System.out.println(e);

			JOptionPane.showMessageDialog(null, "Reporte generado con exito ");

		}
         return Resultado;  
               
               


	}
    
    public static ArrayList ConsultarInformeMasVendidos(String fecha1, String fecha2) {
         
         String text;
         
          ArrayList<Integer> MasVendidos = new ArrayList<>();
          ArrayList<String> NombreProducto = new ArrayList<>();
          ArrayList<Object> Resultado = new ArrayList<>();

		try {

			// ARMA LA SENTENCIA DE INSERCCION
                        String Consultanumerofilas="SELECT Count(*) FROM productos INNER JOIN ventaproducto ON productos.codigo = ventaproducto.codigoproducto INNER JOIN venta on ventaproducto.codigoventa = venta.codigoventa where venta.fecha between'"+fecha1+"'and'"+fecha2+"'";
			String consultaSQL = "SELECT productos.nombreproducto, SUM(ventaproducto.cantidad) as TotalCategoria " +
                                            "FROM productos INNER JOIN ventaproducto ON productos.codigo = ventaproducto.codigoproducto INNER JOIN " +
                                            "venta on ventaproducto.codigoventa = venta.codigoventa where venta.fecha " +
                                            "between'"+fecha1+"' and '"+fecha2+"' group by productos.nombreproducto order by TotalCategoria desc";
					
                        
			resultado = sentencia.executeQuery(consultaSQL);
                        resultado2 = sentencia.executeQuery(Consultanumerofilas);
                        resultado2.next();
                          int i;
                        		                       
                        for (i=0; i<resultado2.getInt(1);i++){
                            
                            if(resultado.next()){
                               

                                NombreProducto.add(resultado.getString(1));
                                MasVendidos.add(resultado.getInt(2));
                                 resultado.next();
                            }else{
                            
                            }
                            
                            
                        }
                        
                        Resultado.add(NombreProducto);
                        Resultado.add(MasVendidos);
                   
                        
		} catch (SQLException e) {
                        e.printStackTrace();
			System.out.println(e);

			JOptionPane.showMessageDialog(null, "Reporte generado con exito ");

		}
         return Resultado;  
               
               


	}
     
     
     
     
public static ArrayList ConsultarStock() {
         
         String text;
         
          ArrayList<String> NombreProductos = new ArrayList<>();
          ArrayList<Integer> CantidadProducto = new ArrayList<>();
          ArrayList<Object> ResultadoTotal = new ArrayList<>();

		try {

			// ARMA LA SENTENCIA DE INSERCCION
			String consultaSQL = "select nombreproducto,cantidadproducto from productos";
			String consultaSQL2 = "SELECT COUNT(*) from productos"	;	
                        
			resultado = sentencia.executeQuery(consultaSQL);
                        resultado2 = sentencia.executeQuery(consultaSQL2);
                       
                        resultado2.next();
                        int i;
                        int tamano=resultado2.getInt(1);
                        		                       
                        for (i=0; i<tamano;i++){
                        resultado.next();
                        NombreProductos.add(resultado.getString(1));
                        CantidadProducto.add(resultado.getInt(2));
                        }
                        
                        ResultadoTotal.add(NombreProductos);
                        ResultadoTotal.add(CantidadProducto);
                        
                        
                        
                     
                   
                        
		} catch (SQLException e) {
                        e.printStackTrace();
			System.out.println(e);

			JOptionPane.showMessageDialog(null, "Reporte generado con exito ");

		}
         return ResultadoTotal;  
               
              

	}     
    
    
    
}


