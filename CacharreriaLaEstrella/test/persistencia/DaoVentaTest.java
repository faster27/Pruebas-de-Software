/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import modelo.Venta;
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
public class DaoVentaTest {
    static Venta venta = new Venta();
    
    public DaoVentaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        venta.setCantidadProducto(5);
        venta.setCodigoproducto(123);
        venta.setCodigoventa(501);
        venta.setFecha("23/03/2021");
        venta.setTotalventa(5000);
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of conexion method, of class DaoVenta.
     */
    @Test
    public void testConexion() {
        System.out.println("conexion");
        DaoVenta.conexion();
        
    }
     /**
     * Test of guardarVentaProducto method, of class DaoVenta.
     */
    @Test
    public void testGuardarVentaProducto() {
        System.out.println("guardarVentaProducto");
     
        double costoCpp = 5000;
        DaoVenta.guardarVentaProducto(venta, costoCpp);
      
    }
    
    /**
     * Test of guardarVenta method, of class DaoVenta.
     */
    @Test
    public void testGuardarVenta() {
        System.out.println("guardarVenta");
    
        DaoVenta.guardarVenta(venta);
      
    }

   
    
}
