/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**.
 *
 * @author dcorr En esta clase está definido el objeto fiado 
 * 
 * 
 */
public class Fiado {
    
  private  int cedula;
  private  String nombrecliente;
  private  double cantidadFiada;
  private  double abono;

  public Fiado() {
  }

  /**.
   * @param cedula identificacion del deudor 
   * @param nombrecliente  nombre de la persona que solicitó el fiado 
   * @param cantidadFiada  valor total de los productos que se fiaron 
   * @param abono valor que el deudor abona a su deuda 
   */
  
  public Fiado(int cedula, String nombrecliente, double cantidadFiada, double abono) {
    this.cedula = cedula;
    this.nombrecliente = nombrecliente;
    this.cantidadFiada = cantidadFiada;
    this.abono = abono;
  }

  public int getCedula() {
    return cedula;
  }

  public void setCedula(int cedula) {
    this.cedula = cedula;
  }

  public String getNombrecliente() {
    return nombrecliente;
  }

  public void setNombrecliente(String nombrecliente) {
    this.nombrecliente = nombrecliente;
  }

  public double getCantidadfiada() {
    return cantidadFiada;
  }

  public void setCantidadfiada(double cantidadFiada) {
    this.cantidadFiada = cantidadFiada;
  }

  public double getAbono() {
    return abono;
  }

  public void setAbono(double abono) {
    this.abono = abono;
  }
    
    
    
}
