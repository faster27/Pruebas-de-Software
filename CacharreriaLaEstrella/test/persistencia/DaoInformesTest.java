/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.ArrayList;
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
public class DaoInformesTest {
    static ArrayList resultado;
    static ArrayList resultado2;
    static ArrayList resultado3;
     static ArrayList resultado4;
      static ArrayList resultado5;
    public DaoInformesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
         resultado = DaoInformes.consultarinformecompra("23/03/2021", "23/03/2021");
         resultado2 = DaoInformes.consultarInformeCostos("23/03/2021", "23/03/2021");
         resultado3 = DaoInformes.consultainformecategorias("23/03/2021", "23/03/2021");
         resultado4 = DaoInformes.consultarinformemasvendidos("23/03/2021", "23/03/2021");
         resultado5 = DaoInformes.consultarStock();
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
     * Test of conexion method, of class DaoInformes.
     */
    @Test
    public void testConexion() {
        System.out.println("conexion");
        DaoInformes.conexion();
     
    }

    /**
     * Test of consultainformecategorias method, of class DaoInformes.
     */
    @Test
    public void testConsultainformecategorias() {
        System.out.println("consultainformecategorias");
        String fecha1 = "23/03/2021";
        String fecha2 = "23/03/2021";
        ArrayList expResult = resultado3;
        ArrayList result = DaoInformes.consultainformecategorias(fecha1, fecha2);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of consultarInformeCostos method, of class DaoInformes.
     */
    @Test
    public void testConsultarInformeCostos() {
        System.out.println("consultarInformeCostos");
        String fecha1 = "23/03/2021";
        String fecha2 = "23/03/2021";
        ArrayList expResult = resultado2;
        ArrayList result = DaoInformes.consultarInformeCostos(fecha1, fecha2);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of consultarinformecompra method, of class DaoInformes.
     */
    @Test
    public void testConsultarinformecompra() {
        System.out.println("consultarinformecompra");
        String fecha1 =  "23/03/2021";
        String fecha2 =  "23/03/2021";
        ArrayList expResult = resultado;
        ArrayList result = DaoInformes.consultarinformecompra(fecha1, fecha2);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of consultarinformemasvendidos method, of class DaoInformes.
     */
    @Test
    public void testConsultarinformemasvendidos() {
        System.out.println("consultarinformemasvendidos");
        String fecha1 = "23/03/2021";
        String fecha2 = "23/03/2021";
        ArrayList expResult = resultado4;
        ArrayList result = DaoInformes.consultarinformemasvendidos(fecha1, fecha2);
        assertEquals(expResult, result);
     
    }

    /**
     * Test of consultarStock method, of class DaoInformes.
     */
    @Test
    public void testConsultarStock() {
        System.out.println("consultarStock");
        ArrayList expResult = resultado5;
        ArrayList result = DaoInformes.consultarStock();
        assertEquals(expResult, result);
       
    }
    
}
