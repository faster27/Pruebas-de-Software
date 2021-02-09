/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

/**
 *
 * @author dcorr
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import modelo.Fiado;


public class DAOFiado {
    
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
    
    
    public static void GuardarFiado(Fiado fiado) {

		try {

			// ARMA LA SENTENCIA DE INSERCCION
			String consultaSQL = "INSERT INTO ventasfiadas (cedula,"                            
                                + "nombrecliente,"
                                + "valorfiado,"
                                + "abono)"
                              
                                + "  VALUES (?,?,?,?)";

			PreparedStatement ps = conexion.prepareStatement(consultaSQL);



			ps.setLong(1, fiado.getCedula());
			ps.setString(2, fiado.getNombrecliente());
                        ps.setDouble(3, fiado.getCantidadfiada());
                        ps.setDouble(4, fiado.getAbono());
                        
			ps.executeQuery();
			ps.close();

		} catch (SQLException e) {

			System.out.println(e);

			JOptionPane.showMessageDialog(null, "Fiado con exito ");

		}
	}
    
    public static void ActualizarAbono(double abono, int cedula) {
    
        DAOFiado.conexion();
        double abonoviejo=consultarAbono(cedula);
    
       double abonototal= abonoviejo + abono;
        
     try {

			PreparedStatement pss = DAOFiado.conexion.prepareStatement("UPDATE ventasfiadas SET "
					+ "abono='" + abonototal
					
					+ "' WHERE cedula='"+ cedula + "'");
			pss.executeUpdate();
			JOptionPane.showMessageDialog(null, "abonado con exito");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
    
    }
    
    public static void ActualizarFiado(double fiado, int cedula) {
    
        DAOFiado.conexion();
        double FiadoViejo=consultarFiado(cedula);
    
       double FiadoNuevo= FiadoViejo + fiado;
        
     try {

			PreparedStatement pss = DAOFiado.conexion.prepareStatement("UPDATE ventasfiadas SET "
					+ "valorfiado='" + FiadoNuevo
					
					+ "' WHERE cedula='"+ cedula + "'");
			pss.executeUpdate();
			JOptionPane.showMessageDialog(null, "Fiado sumado con exito");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
    
    }
    
    
    
    
    public static int consultarAbono(int cedula) {
        int abono = 0;
       // System.out.println(codigoProducto);
        
        String Sql = "select abono from ventasfiadas where (cedula="+cedula+")";
        
        try {
                        
			resultado = sentencia.executeQuery(Sql);
                        
			resultado.next();
                       

			abono = resultado.getInt(1);
                        
                        

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
                       
			System.out.println(e);
		}
        
        
        return abono;
        
        
    }
    
    public static int consultarFiado(int cedula) {
        int fiado = 0;
       // System.out.println(codigoProducto);
        
        String Sql = "select valorfiado from ventasfiadas where (cedula="+cedula+")";
        
        try {
                        
			resultado = sentencia.executeQuery(Sql);
                        
			resultado.next();
                       

			fiado = resultado.getInt(1);
                        
                        

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
                       
			System.out.println("El cliente no tiene un fiado que actualizar");
		}
        
        
        return fiado;
        
        
    }
    
    public static Fiado consultarCliente(int cedula) {
        int abono = 0;
       // System.out.println(codigoProducto);
       
        Fiado cliente= new Fiado();
        
        String Sql = "select * from ventasfiadas where (cedula="+cedula+")";
        
        try {
                        
			resultado = sentencia.executeQuery(Sql);
                        
			resultado.next();
                       
                        cliente.setCedula(resultado.getInt(1));
                        cliente.setNombrecliente(resultado.getString(2));
                        cliente.setCantidadfiada(resultado.getDouble(3));
                        cliente.setAbono(resultado.getDouble(4));
			
                        
                        

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
                       
			System.out.println(e);
		}
        
        
        return cliente;
        
        
    }
    
    
    
}
