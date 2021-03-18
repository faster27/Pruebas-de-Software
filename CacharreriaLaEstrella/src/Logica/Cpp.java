/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;



/**.
 *
 * @author dcorr
 */

public class Cpp {
  /**
   * 
   * @param cantidadEnStock Cantidad de un producto que se tiene en bodega
   * @param cppActual Nos dice cual es el valor cpp actual del producto
   * @param unidadesNuevas cuantas unidades se compraron en el nuevo ingreso
   * @param costoCompraUnidad valor unitario del producto
   * @return .
   */
    
  public static double actualizarCpp(int cantidadEnStock, double cppActual, 
          int unidadesNuevas, double costoCompraUnidad) {
    
        
    System.out.println(cantidadEnStock);
    System.out.println(cppActual);
    System.out.println(unidadesNuevas);
    System.out.println(costoCompraUnidad);
        

    //calcular el cpp
    double cppNew;
    
    cppNew = (cantidadEnStock * cppActual + unidadesNuevas * costoCompraUnidad)
            / (cantidadEnStock + unidadesNuevas);
        
    //System.out.println(cpp_new);
    return cppNew;   
  }
    
    
    
}
