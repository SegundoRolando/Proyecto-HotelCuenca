/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *
 * @author ASUS
 */
public class Consumo {
    private  int codigoConsumo;
    private  int codigoReserva;
    private  int codigoProducto;
    private  Double cantidad;
    private  Double precioVenta;

    public Consumo() {
    }

    public Consumo(int codigoConsumo, int codigoReserva, int codigoProducto, Double cantidad, double precioVenta) {
        this.codigoConsumo = codigoConsumo;
        this.codigoReserva = codigoReserva;
        this.codigoProducto = codigoProducto;
        this.cantidad = cantidad;
        this.precioVenta = precioVenta;
    }

    public int getCodigoConsumo() {
        return codigoConsumo;
    }

    public void setCodigoConsumo(int codigoConsumo) {
        this.codigoConsumo = codigoConsumo;
    }

    public int getCodigoReserva() {
        return codigoReserva;
    }

    public void setCodigoReserva(int codigoReserva) {
        this.codigoReserva = codigoReserva;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    @Override
    public String toString() {
        return "Consumo{" + "codigoConsumo=" + codigoConsumo + ", codigoReserva=" + codigoReserva + ", codigoProducto=" + codigoProducto + ", cantidad=" + cantidad + ", precioVenta=" + precioVenta + '}';
    }
            
    
}
