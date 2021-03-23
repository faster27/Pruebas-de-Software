/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Compra;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dcorr
 */
public class DaoCompraTest {
      static Compra compra= new Compra();
    
    public DaoCompraTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
       
        compra.setCantidad(10);
        compra.setCodigoProducto(123);
        compra.setFecha("23/03/2021");
        compra.setPrecioCompraProducto(3000);
        compra.setcodigoCompra(200);
    }
    
    @AfterClass
    public static void tearDownClass() throws SQLException {
        
      Statement   stmt =DaoCompra.conexion.createStatement();
      stmt.executeUpdate("delete from compraproducto where codigocompra="+compra.getcodigoCompra()+"");
      
      Statement   stmt2 =DaoCompra.conexion.createStatement();
      stmt2.executeUpdate("delete from compra where codigocompra="+compra.getcodigoCompra()+"");
     
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of conexion method, of class DaoCompra.
     */
    @Test
    public void testConexion() {
        System.out.println("conexion");
        DaoCompra.conexion();
        
    }

    /**
     * Test of guardarCompra method, of class DaoCompra.
     */
    @Test
    public void testGuardarCompra() {
        System.out.println("guardarCompra");
        
        DaoCompra.guardarCompra(compra);
       
    }

    /**
     * Test of guardarCompraProducto method, of class DaoCompra.
     */
    @Test
    public void testGuardarCompraProducto() {
        System.out.println("guardarCompraProducto");
        
        String fechaVencimiento = "12/05/2021";
        String fechaAviso = "10/05/2021";
        double totalCompra = 35000.0;
        DaoCompra.guardarCompraProducto(compra, fechaVencimiento, fechaAviso, totalCompra);
        
    }
    
}
