/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author dcorr
 */
public class Venta {

  
    public Venta() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
    }

    public Venta(int codigoventa, int CantidadProducto, String Fecha, double totalventa, int codigoproducto) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.codigoventa = codigoventa;
        this.CantidadProducto = CantidadProducto;
        this.Fecha = Fecha;
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
        return CantidadProducto;
    }

    public void setCantidadProducto(int CantidadProducto) {
        this.CantidadProducto = CantidadProducto;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
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
    private  int CantidadProducto;
    private String Fecha;
    private double totalventa;
    private int codigoproducto;

    

   
    
    
    
}
