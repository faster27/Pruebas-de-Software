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
import modelo.Producto;
import static persistencia.DAOProducto.conexion;
import static persistencia.DAOProducto.resultado;

/**
 *
 * @author dcorr
 */
public class DAOInformes {
     public static Connection conexion = null;
    public static Statement sentencia = null;
    
    static ResultSet resultado = null;
    static ResultSet resultado2 = null;
    
    static String cadenaDriver = "org.postgresql.Driver";
   
    
    
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
    
     public static ArrayList ConsultarInformeCategorias(String fecha1, String fecha2) {
         
         String text;
         
          ArrayList<Integer> ventas = new ArrayList<>();

		try {

			// ARMA LA SENTENCIA DE INSERCCION
                        String Consultanumerofilas="SELECT COUNT(*) from productos";
			String consultaSQL = "SELECT productos.categoria, SUM(ventaproducto.totalventaproducto) as TotalCategoria, venta.fecha FROM productos INNER JOIN ventaproducto ON productos.codigo = ventaproducto.codigoproducto INNER JOIN venta on ventaproducto.codigoventa = venta.codigoventa where venta.fecha between'"+fecha1+"'and'"+fecha2+"'group by productos.categoria, venta.fecha";
					
                        
			resultado = sentencia.executeQuery(consultaSQL);
                        
                          int i;
                        		                       
                        for (i=0; i<=1;i++){
                        resultado.next();
                        ventas.add(resultado.getInt(2));
                        }
                        
                        
                     
                   
                        
		} catch (SQLException e) {
                        e.printStackTrace();
			System.out.println(e);

			JOptionPane.showMessageDialog(null, "Reporte generado con exito ");

		}
         return ventas;  
               
               


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


