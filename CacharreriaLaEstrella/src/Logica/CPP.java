/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;



/**
 *
 * @author dcorr
 */
public class CPP {
    
    public static double ActualizarPrecioVenta(int CantidadEnStock, double PrecioActual, int UnidadesNuevas, double CostoCompra){
    
       System.out.println(CantidadEnStock);
          System.out.println(PrecioActual);
          System.out.println(UnidadesNuevas);
          System.out.println(CostoCompra);
        

       //calcular el cpp
       double cpp_new = (CantidadEnStock*PrecioActual + UnidadesNuevas*CostoCompra)/(CantidadEnStock+UnidadesNuevas);
        
        System.out.println(cpp_new);
       return cpp_new;
    
    
    
    
    }
    
    
    
}
