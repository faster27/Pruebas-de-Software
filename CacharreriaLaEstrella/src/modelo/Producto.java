/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**. 
 *
 * @author dcorr en esta clase está la definición del objeto producto 
 */
public class Producto {
  private  int cantidad;
  private  int id;
  private  String nombre;
  private String categoria;
  private double precioVenta;
  private double cpp;

  public Producto() {
        
  }
  
  /**.
   * 
   * @param id es el numero para identificar el producto 
   * @param nombre nombre del producto 
   * @param categoria la categoria a la cual pertenece el producto (aseo, alimentos, medicina)
   * @param precioVenta precio asignado al producto para la venta 
   * @param cantidad cantidad disponible del producto 
   * @param cpp ponderado 
   */
  public Producto(int id, String nombre, String categoria, 
         double precioVenta,int cantidad,double cpp) {
    //throw new UnsupportedOperationException("Not supported yet."); 
    //To change body of generated methods, choose Tools | Templates.
        
    this.cantidad = cantidad;
    this.id = id;
    this.nombre = nombre;
    this.categoria = categoria;
    this.precioVenta = precioVenta;
    this.cpp = cpp;
  }

  public double getCpp() {
    return cpp;
  }

  public void setCpp(double cpp) {
    this.cpp = cpp;
  }
    
    
  
  public int getId() {
    return id;
  }

  public String getNombre() {
    return nombre;
  }

  public String getCategoria() {
    return categoria;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }
    
  public double getPrecioVenta() {
    return precioVenta;
  }

  public int getCantidad() {
    return cantidad;
  }
    
  public void setPrecioVenta(double precioVenta) {
    this.precioVenta = precioVenta;
  }

  public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
  }
    
    

   

    

   
    
    
    
    
}
