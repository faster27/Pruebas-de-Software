/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**.
 *
 * @author dcorr En esta clase esta la definicion del objeto compra
 */
public class Compra {
  private  int codigoCompra;
  private  double precioCompraProducto;
  private  int cantidad;
  private String fecha; 
  private int codigoProducto;
        

  public Compra() {
        
  }
  
  /**.
   * 
   * @param codigoCompra Codigo para identificar la compra en l base de datos
   * @param precioCompraProducto Precio por producto que esta incluido en la compra
   * @param cantidad Cantidad del producto que esta en la compra
   * @param fecha Fecha en la que se realizo la compra
   * @param codigoProducto Codigo unico para identificar el producto en la BD
   */
  public Compra(int codigoCompra, double precioCompraProducto, 
          int cantidad, String fecha,int codigoProducto) {
       
    this.codigoCompra = codigoCompra;
    this.precioCompraProducto = precioCompraProducto;
    this.cantidad = cantidad;
    this.fecha = fecha;
    this.codigoProducto = codigoProducto;
  }

  public void setCodigoProducto(int codigoProducto) {
    this.codigoProducto = codigoProducto;
  }
    
  public int getCodigoProducto() {
    return codigoProducto;
  }

  public int getcodigoCompra() {
    return codigoCompra;
  }

  public void setcodigoCompra(int id) {
    this.codigoCompra = id;
  }

  public void setPrecioCompraProducto(double precioCompraProducto) {
    this.precioCompraProducto = precioCompraProducto;
  }

  public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
  }

  public void setFecha(String fecha) {
    this.fecha = fecha;
  }

  public double getPrecioCompraProducto() {
    return precioCompraProducto;
  }

  public int getCantidad() {
    return cantidad;
  }

  public String getFecha() {
    return fecha;
  }

    
}
