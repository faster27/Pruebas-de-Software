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


public class DaoFiado {
    
  public static Connection conexion = null;
  public static Statement sentencia = null;
  static ResultSet resultado = null;
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
   * @param fiado me contiene el objeto fado con la informacion del mismo para guardarla en la BD
   */  
  public static void guardarFiado(Fiado fiado) {

    try {

      // ARMA LA SENTENCIA DE INSERCCION
      String consultaSql;
      consultaSql = "INSERT INTO ventasfiadas (cedula,"                            
                + "nombrecliente,"
                + "valorfiado,"
                + "abono)"
                
                + "  VALUES (?,?,?,?)";

      try (PreparedStatement ps = conexion.prepareStatement(consultaSql)) {
        ps.setLong(1, fiado.getCedula());
        ps.setString(2, fiado.getNombrecliente());
        ps.setDouble(3, fiado.getCantidadfiada());
        ps.setDouble(4, fiado.getAbono());
            
        ps.executeQuery();
      }
    } catch (SQLException e) {

      System.out.println(e);

      JOptionPane.showMessageDialog(null, "Fiado con exito ");

    }
  }
    
  /**.
   * 
   * @param abono cantidad que el cliente quiere abonar a la cuenta
   * @param cedula identificacion del cliente para encontralo en la BD
   */
  public static void actualizarAbono(double abono, int cedula) {
    
    DaoFiado.conexion();
    double abonoviejo;
    abonoviejo = consultarAbono(cedula);
    
    double abonototal;
    abonototal = abonoviejo + abono;
        
    try {

      PreparedStatement pss = DaoFiado.conexion.prepareStatement("UPDATE ventasfiadas SET "
          + "abono='" + abonototal		
          + "' WHERE cedula='" + cedula + "'");
      pss.executeUpdate();
      JOptionPane.showMessageDialog(null, "abonado con exito");
    } catch (SQLException e) {	
      System.out.println(e);
    }
    
    
  }
  
  /**.
   * 
   * @param fiado Cantidad fiada al cliente
   * @param cedula numero para identificar al cliente que se fio
   */
  public static void actualizarFiado(double fiado, int cedula) {
    
    DaoFiado.conexion();
    double fiadoViejo;
    fiadoViejo = consultarFiado(cedula);
    
    double fiadoNuevo;
    fiadoNuevo = fiadoViejo + fiado;
        
    try {

      PreparedStatement pss = DaoFiado.conexion.prepareStatement("UPDATE ventasfiadas SET "
          + "valorfiado='" + fiadoNuevo				
          + "' WHERE cedula='" + cedula + "'");
      pss.executeUpdate();
      JOptionPane.showMessageDialog(null, "Fiado sumado con exito");

    } catch (SQLException e) {
 // TODO Auto-generated catch block
	e.printStackTrace();
    }
    
    
  }
    
    
    
  /**.
   * 
   * @param cedula Identificacion para encontrar el abono en la BD
   * @return retorna la info
   */  
  public static int consultarAbono(int cedula) {
    int abono = 0;
   
        
    String sql;
    sql = "select abono from ventasfiadas where (cedula=" + cedula + ")";
        
    try {
                        
      resultado = sentencia.executeQuery(sql);
                        
      resultado.next();                      
      abono = resultado.getInt(1);                        
    } catch (SQLException e) {			
      e.printStackTrace();
                       
      System.out.println(e);
    }
        
        
    return abono;
        
        
  }
  
  /**.
   * 
   * @param cedula identificar la persona 
   * @return retorna la info
   */  
  public static int consultarFiado(int cedula) {
    int fiado = 0;
       
        
    String sql;
    sql = "select valorfiado from ventasfiadas where (cedula=" + cedula + ")";
        
    try {
                        
      resultado = sentencia.executeQuery(sql);
                        
      if (resultado.next()) {
                        
        resultado.next();
        fiado = resultado.getInt(1);
                        
      }

    } catch (SQLException e) {
      e.printStackTrace();
      System.out.println("El cliente no tiene un fiado que actualizar");
    }
        
        
    return fiado;
        
        
  }
  
  /**.
   * 
   * @param cedula Identificar que cliente se quiere consultar en la BD
   * @return retorna el objeto con la info del cliente
   */
  public static Fiado consultarCliente(int cedula) {
    int abono = 0;
       
    Fiado cliente = new Fiado();
        
    String sql;
    sql = "select * from ventasfiadas where (cedula=" + cedula + ")";
        
    try {
                        
      resultado = sentencia.executeQuery(sql);
                        
      if (resultado.next()) {
	resultado.next();           
        cliente.setCedula(resultado.getInt(1));
        cliente.setNombrecliente(resultado.getString(2));
        cliente.setCantidadfiada(resultado.getDouble(3));
        cliente.setAbono(resultado.getDouble(4));
      }
                        
                        

    } catch (SQLException e) {
      e.printStackTrace();
      System.out.println(e);
    }
        
        
    return cliente;
        
        
  }
    
    
    
}
