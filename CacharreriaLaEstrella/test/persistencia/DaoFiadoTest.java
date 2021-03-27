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
        
    }

    /**
     * Test of guardarFiado method, of class DaoFiado.
     */
    @Test
    public void testGuardarFiado() {
        System.out.println("guardarFiado");
        DaoFiado.guardarFiado(fiado);
    }


    /**
     * Test of consultarFiado method, of class DaoFiado.
     */
    @Test
    public void testConsultarFiado() {
        System.out.println("consultarFiado");
        double  cantidadf = 15;
        DaoFiado.consultarFiado(15);
     
    }

    
}
