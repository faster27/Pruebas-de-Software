/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author dcorr esto es una prueba ....
 * 
 */
public class Fiado {
    
    private  int cedula;
    private  String nombrecliente;
    private  double Cantidadfiada;
    private  double abono;

    public Fiado() {
    }

    public Fiado(int cedula, String nombrecliente, double Cantidadfiada, double abono) {
        this.cedula = cedula;
        this.nombrecliente = nombrecliente;
        this.Cantidadfiada = Cantidadfiada;
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
        return Cantidadfiada;
    }

    public void setCantidadfiada(double Cantidadfiada) {
        this.Cantidadfiada = Cantidadfiada;
    }

    public double getAbono() {
        return abono;
    }

    public void setAbono(double abono) {
        this.abono = abono;
    }
    
    
    
}
