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
import static persistencia.DAOCompra.resultado;

/**
 *
 * @author dcorr
 */
public class DAOProducto {
    
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
    
    
    public static void GuardarProducto(Producto producto) {

		try {

			// ARMA LA SENTENCIA DE INSERCCION
			String consultaSQL = "INSERT INTO productos (codigo,"
                                + "nombreproducto,"
                                +"precioventaproducto,"
                                + "categoria,"
                                + "cantidadproducto,"
                                + "cpp)"
                                + "  VALUES (?,?,?,?,?,?)";

			PreparedStatement ps = conexion.prepareStatement(consultaSQL);



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
    
    
    public static int consultarCpp(int codigoProducto) {
        int Cpp = 0;
       // System.out.println(codigoProducto);
        
        String Sql = "select cpp  from productos where (codigo="+codigoProducto+")";
        
        try {
                        
			resultado = sentencia.executeQuery(Sql);
                        
			resultado.next();

			Cpp = resultado.getInt(1);
                        
                        

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
                         System.out.println("hola");
			System.out.println(e);
		}
        
        
        return Cpp;
        
        
    } 
    
     public static void ActualizarCpp(int codigoProducto, double CppNuevo) {
    
        
     int NuevoCpp= (int)CppNuevo;
     
    
     
     try {

			PreparedStatement pss = DAOProducto.conexion.prepareStatement("UPDATE productos SET "
					+ "cpp='" + NuevoCpp
					
					+ "' WHERE codigo='"+ codigoProducto + "'");
			pss.executeUpdate();
			JOptionPane.showMessageDialog(null, "DATOS ACTUALIZADOS");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
    
    }
     
     
     
     public static ArrayList consultarProductosVencimiento(String FechaAviso) {
       
       // System.out.println(codigoProducto);
        ArrayList<Object> ProductosVencerse = new ArrayList<>();
        ArrayList<Object> ProductosVencerse2 = new ArrayList<>();
        
        String Sql = "select productos.nombreproducto,compraproducto.fechavencimiento,compraproducto.fechaaviso "
                     + "from productos inner join compraproducto on productos.codigo = compraproducto.codigoproducto "
                     + "where compraproducto.fechaaviso ='"+FechaAviso+"' "
                     +"group by productos.nombreproducto,compraproducto.fechavencimiento,compraproducto.fechaaviso";
        
        String Sql2 ="select Count(*) "
                     + "from productos inner join compraproducto on productos.codigo = compraproducto.codigoproducto "
                     + "where compraproducto.fechaaviso ='"+FechaAviso+"'";
        
        try {
                        
			resultado = sentencia.executeQuery(Sql);
                        resultado2 = sentencia.executeQuery(Sql2);
                        
			
                        resultado2.next();
                        
                        int tamano = resultado2.getInt(1);
                        
                           
                        int i;
                        		                       
                        for (i=0; i<tamano;i++){
                        resultado.next();
                        
                        
                            ProductosVencerse2.add( resultado.getString(1));
                            ProductosVencerse2.add( resultado.getString(2));
                            ProductosVencerse2.add( resultado.getString(3));
                            
                            if(ProductosVencerse.size()<=tamano){
                            
                                 ProductosVencerse.add( ProductosVencerse2);
                                
                            
                            }
                            else{
                                ProductosVencerse2.remove(0);
                                ProductosVencerse2.remove(0);
                                ProductosVencerse2.remove(0);
                            
                            }
                            
                           
                            
                            
                        
                            
                      
                        
                        
                        }
			
                        
                        

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
		}
        
        //System.out.println(ProductosVencerse);
        return ProductosVencerse;
        
        
    }  
     
     
     
    
   
    
    
}
