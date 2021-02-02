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
public class Producto {
    
    private  int Cantidad;
    private  int id;
    private  String nombre;
    private String categoria;
    private double PrecioVenta;

    public Producto() {
        
    }

    public Producto(int id, String nombre, String categoria, double PrecioVenta,int Cantidad) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        this.Cantidad = Cantidad;
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.PrecioVenta = PrecioVenta;
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
        return PrecioVenta;
    }

    public int getCantidad() {
        return Cantidad;
    }
    
     public void setPrecioVenta(double PrecioVenta) {
        this.PrecioVenta = PrecioVenta;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }
    
    

   

    

   
    
    
    
    
}
