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
    
    
     //esto es una prena para el jenkins 
   
    
    
    public static double ActualizarCpp(int CantidadEnStock, double CppActual, int UnidadesNuevas, double CostoCompraUnidad){
    
        
          System.out.println(CantidadEnStock);
          System.out.println(CppActual);
          System.out.println(UnidadesNuevas);
          System.out.println(CostoCompraUnidad);
        

       //calcular el cpp
       double cpp_new = (CantidadEnStock*CppActual + UnidadesNuevas*CostoCompraUnidad)/(CantidadEnStock+UnidadesNuevas);
        
        System.out.println(cpp_new);
       return cpp_new;
    
    
    
    
    }
    
    
    
}
