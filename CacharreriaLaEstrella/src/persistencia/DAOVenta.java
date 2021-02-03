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
import modelo.Venta;
import static persistencia.DAOProducto.cadenaDriver;
import static persistencia.DAOProducto.conexion;
/**
 *
 * @author dcorr
 */
public class DAOVenta {
    
    public static Connection conexion = null;
    public static Statement sentencia = null;
    static ResultSet resultado = null;
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
    
    public static void GuardarVenta(Venta venta) {

		try {

			// ARMA LA SENTENCIA DE INSERCCION
			String consultaSQL = "INSERT INTO venta (codigoventa,"
                               
                                +"fecha)"
                             
                              
                                + "  VALUES (?,?)";

			PreparedStatement ps = conexion.prepareStatement(consultaSQL);


			ps.setLong(1, venta.getCodigoventa());
			
                        ps.setString(2, venta.getFecha());
			
                        
			ps.executeQuery();
			ps.close();

		} catch (SQLException e) {

			System.out.println(e);

			JOptionPane.showMessageDialog(null, "Producto vendido con exito ");

		}
	}
    
    public static void GuardarVentaProducto(Venta nuevaVenta, double CostoCpp) {

		try {

			// ARMA LA SENTENCIA DE INSERCCION
			String consultaSQL = "INSERT INTO ventaproducto (codigoventa,codigoproducto,cantidad,totalventaproducto,cppcostos) VALUES (?,?,?,?,?)";

			PreparedStatement ps = conexion.prepareStatement(consultaSQL);



			ps.setLong(1, nuevaVenta.getCodigoventa());
			ps.setLong(2, nuevaVenta.getCodigoproducto());
                        ps.setLong(3, nuevaVenta.getCantidadProducto());
			ps.setDouble(4, nuevaVenta.getTotalventa());
                        ps.setDouble(5, CostoCpp);
                        
                        
                        
			ps.executeQuery();
			ps.close();

		} catch (SQLException e) {

			System.out.println(e);

			JOptionPane.showMessageDialog(null, "Producto comprado con exito ");

		}
	}
    
    
    
    
}
