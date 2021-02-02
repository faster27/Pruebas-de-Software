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
import javax.swing.JOptionPane;

import vista.GUICompra;
import modelo.Compra;
import modelo.Producto;
import static persistencia.DAOProducto.cadenaDriver;

/**
 *
 * @author dcorr
 */
public class DAOCompra {
    
    public static Connection conexion = null;
    public static Statement sentencia = null;
    static ResultSet resultado = null;
    static String cadenaDriver = "org.postgresql.Driver";
    
     public static void conexion() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    
      
    
    public static void GuardarCompra(Compra compra) {

		try {

			// ARMA LA SENTENCIA DE INSERCCION
			String consultaSQL = "INSERT INTO compra (codigocompra,"                            
                                + "fecha)"
                              
                                + "  VALUES (?,?)";

			PreparedStatement ps = conexion.prepareStatement(consultaSQL);



			ps.setLong(1, compra.getcodigoCompra());
			
			ps.setString(2, compra.getFecha());
                    
                        
                        
			ps.executeQuery();
			ps.close();

		} catch (SQLException e) {

			System.out.println(e);

			JOptionPane.showMessageDialog(null, "Producto comprado con exito ");

		}
	}
    
    public static void GuardarCompraProducto(Compra compra, String FechaVencimiento, String FechaAviso) {

		try {

			// ARMA LA SENTENCIA DE INSERCCION
			String consultaSQL = "INSERT INTO compraproducto (codigoproducto,codigocompra,preciounidadcompra,cantidad,fechavencimiento,fechaaviso) VALUES (?,?,?,?,?,?)";

			PreparedStatement ps = conexion.prepareStatement(consultaSQL);



			ps.setLong(1, compra.getCodigoProducto());
			ps.setLong(2, compra.getcodigoCompra());
                        ps.setDouble(3, compra.getPrecioCompraProducto());
			ps.setLong(4, compra.getCantidad());
                        ps.setString(5, FechaVencimiento);
                        ps.setString(6, FechaAviso);
                        
                        
                        
			ps.executeQuery();
			ps.close();

		} catch (SQLException e) {

			System.out.println(e);

			JOptionPane.showMessageDialog(null, "Producto comprado con exito ");

		}
	}
   
    
    

    

   
    
}
