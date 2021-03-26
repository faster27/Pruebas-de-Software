/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import modelo.Fiado;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author felipe
 */
public class DaoFiadoTest {
     static Fiado fiado = new Fiado();
     
    public DaoFiadoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    fiado.setCantidadfiada(15);
    fiado.setAbono(8);
    fiado.setCedula(1234);
    fiado.setNombrecliente("pedro");
      
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
     * Test of conexion method, of class DaoFiado.
     */
    @Test
    public void testConexion() {
        System.out.println("conexion");
        DaoFiado.conexion();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of guardarFiado method, of class DaoFiado.
     */
    @Test
    public void testGuardarFiado() {
        System.out.println("guardarFiado");
        Fiado fiado = null;
        DaoFiado.guardarFiado(fiado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizarAbono method, of class DaoFiado.
     */
    @Test
    public void testActualizarAbono() {
        System.out.println("actualizarAbono");
        double abono = 0.0;
        int cedula = 0;
        DaoFiado.actualizarAbono(abono, cedula);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizarFiado method, of class DaoFiado.
     */
    @Test
    public void testActualizarFiado() {
        System.out.println("actualizarFiado");
        double fiado = 0.0;
        int cedula = 0;
        DaoFiado.actualizarFiado(fiado, cedula);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultarAbono method, of class DaoFiado.
     */
    @Test
    public void testConsultarAbono() {
        System.out.println("consultarAbono");
        int cedula = 0;
        int expResult = 0;
        int result = DaoFiado.consultarAbono(cedula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultarFiado method, of class DaoFiado.
     */
    @Test
    public void testConsultarFiado() {
        System.out.println("consultarFiado");
        int cedula = 0;
        int expResult = 0;
        int result = DaoFiado.consultarFiado(cedula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultarCliente method, of class DaoFiado.
     */
    @Test
    public void testConsultarCliente() {
        System.out.println("consultarCliente");
        int cedula = 0;
        Fiado expResult = null;
        Fiado result = DaoFiado.consultarCliente(cedula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
