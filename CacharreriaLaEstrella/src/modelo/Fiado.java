/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author dcorr esto es una prueba .... prueba
 */
public class Fiado {
  private int cedula;
  private String nombrecliente;
  private double cantidadfiada;
  private double abono;

  public Fiado() {
  }
  /**
 * 
 * @param cedula identisicacion
 * @param nombrecliente nombre de la persona
 * @param Cantidadfiada cantidad que se fio
 * @param abono lo que ha pagado
 */
  
  public Fiado(int cedula, String nombrecliente, double Cantidadfiada, double abono) {
    this.cedula = cedula;
    this.nombrecliente = nombrecliente;
    this.cantidadfiada = Cantidadfiada;
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
    return cantidadfiada;
  }

  public void setCantidadfiada(double cantidadfiada) {
    this.cantidadfiada = cantidadfiada;
  }

  public double getAbono() {
    return abono;
  }

    public void setAbono(double abono) {
        this.abono = abono;
    }

}
