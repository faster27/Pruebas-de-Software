/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**.
 *
 * @author dcorr
 */
public class Venta {

  /**.
  * venta
  */
  public Venta() {
        //throw new UnsupportedOperationException("Not supported yet.");
        //To change body of generated methods, choose Tools | Templates.
        
  }
  /**.
 * 
 * @param codigoventa identificacion de la venta
 * @param cantidadProducto cantidad de productos vendidos 
 * @param fecha fecha en la que se realizo la venta 
 * @param totalventa total de la venta realizada 
 * @param codigoproducto  codigo del producto que se vendió 
 */
  
  public Venta(int codigoventa, int cantidadProducto, String fecha, 
            double totalventa, int codigoproducto) {
    //throw new UnsupportedOperationException("Not supported yet."); 
    //To change body of generated methods, choose Tools | Templates.
    this.codigoventa = codigoventa;
    this.cantidadProducto = cantidadProducto;
    this.fecha = fecha;
    this.totalventa = totalventa;
    this.codigoproducto = codigoproducto;
  }

    

  public int getCodigoventa() {
    return codigoventa;
  }

  public void setCodigoventa(int codigoventa) {
    this.codigoventa = codigoventa;
  }

  public int getCantidadProducto() {
    return cantidadProducto;
  }

  public void setCantidadProducto(int cantidadProducto) {
    this.cantidadProducto = cantidadProducto;
  }

  public String getFecha() {
    return fecha;
  }

  public void setFecha(String fecha) {
    this.fecha = fecha;
  }

  public double getTotalventa() {
    return totalventa;
  }

  public void setTotalventa(double totalventa) {
    this.totalventa = totalventa;
  }

  public int getCodigoproducto() {
    return codigoproducto;
  }

  public void setCodigoproducto(int codigoproducto) {
    this.codigoproducto = codigoproducto;
  }

  private  int codigoventa;
  private  int cantidadProducto;
  private String fecha;
  private double totalventa;
  private int codigoproducto;

    

   
    
    
    
}
