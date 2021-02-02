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
import modelo.Compra;

import vista.GUIProductos;
import modelo.Producto;
import static persistencia.DAOCompra.resultado;

/**
 *
 * @author dcorr
 */
public class DAOProducto {
    
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
    
    
    public static void GuardarProducto(Producto producto) {

		try {

			// ARMA LA SENTENCIA DE INSERCCION
			String consultaSQL = "INSERT INTO productos (codigo,"
                                + "nombreproducto,"
                                +"precioventaproducto,"
                                + "categoria,"
                                + "cantidadproducto)"
                                + "  VALUES (?,?,?,?,?)";

			PreparedStatement ps = conexion.prepareStatement(consultaSQL);



			ps.setLong(1, producto.getId());
			ps.setString(2, producto.getNombre());
                        ps.setDouble(3, producto.getPrecioVenta());
			ps.setString(4, producto.getCategoria());
                        ps.setLong(5, producto.getCantidad());
                        
			ps.executeQuery();
			ps.close();

		} catch (SQLException e) {

			System.out.println(e);

			JOptionPane.showMessageDialog(null, "producto registrado con exito ");

		}
	}
    
     public static int consultarCantidad(int codigoProducto) {
        int CantidadEnStock = 0;
       // System.out.println(codigoProducto);
        
        String Sql = "select cantidadproducto from productos where (codigo="+codigoProducto+")";
        
        try {
                        
			resultado = sentencia.executeQuery(Sql);
                        
			resultado.next();
                       

			CantidadEnStock = resultado.getInt(1);
                        
                        

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
                         System.out.println("hola");
			System.out.println(e);
		}
        
        
        return CantidadEnStock;
        
        
    }
    
    
    public static void ActualizarCantidad(int codigoProducto, int Cantidad,int SumaResta) {
    
        
     int CantidadActual= consultarCantidad(codigoProducto);
     
     int CantidadNueva=0;
     
     if (SumaResta==1){
     
         CantidadNueva= CantidadActual+Cantidad;
     
     }else{
     
        CantidadNueva= CantidadActual-Cantidad;
     
     }
     
     try {

			PreparedStatement pss = DAOProducto.conexion.prepareStatement("UPDATE productos SET "
					+ "cantidadproducto='" + CantidadNueva
					
					+ "' WHERE codigo='"+ codigoProducto + "'");
			pss.executeUpdate();
			JOptionPane.showMessageDialog(null, "DATOS ACTUALIZADOS");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
    
    }
    
    
    public static int consultarPrecioVenta(int codigoProducto) {
        int PrecioVenta = 0;
       // System.out.println(codigoProducto);
        
        String Sql = "select precioventaproducto  from productos where (codigo="+codigoProducto+")";
        
        try {
                        
			resultado = sentencia.executeQuery(Sql);
                        
			resultado.next();

			PrecioVenta = resultado.getInt(1);
                        
                        

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
                         System.out.println("hola");
			System.out.println(e);
		}
        
        
        return PrecioVenta;
        
        
    } 
    
     public static void ActualizarPrecioVenta(int codigoProducto, double PrecioVentaNuevo) {
    
        
     int precioVentaNuevo= (int)PrecioVentaNuevo;
     
    
     
     try {

			PreparedStatement pss = DAOProducto.conexion.prepareStatement("UPDATE productos SET "
					+ "precioventaproducto='" + precioVentaNuevo
					
					+ "' WHERE codigo='"+ codigoProducto + "'");
			pss.executeUpdate();
			JOptionPane.showMessageDialog(null, "DATOS ACTUALIZADOS");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
    
    }
    
   
    
    
}
