/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

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
public class CppTest {
    
    public CppTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
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
     * Test of actualizarCpp method, of class Cpp.
     */
    @Test
    public void testActualizarCpp() {
        System.out.println("actualizarCpp");
        int cantidadEnStock = 20;
        double cppActual = 300;
        int unidadesNuevas = 10;
        double costoCompraUnidad = 200;
        double expResult = 266.666;
        double result = Cpp.actualizarCpp(cantidadEnStock, cppActual, unidadesNuevas, costoCompraUnidad);
        System.out.println(result);
        assertEquals(expResult, result, 0.5);
        
        
    }
    
}
