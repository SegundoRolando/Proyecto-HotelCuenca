/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.Date;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class Factura {
     private int numeroFactura;
    private Date fecha;
    private Cliente cliente;
    private double subtotal;
    private double iva;
    private double total;
    private List<Consumo> detalles;

public Factura(){

}

    public Factura(int numeroFactura, Date fecha, Cliente cliente, double subtotal, double iva, double total, List<Consumo> detalles) {
        this.numeroFactura = numeroFactura;
        this.fecha = fecha;
        this.cliente = cliente;
        this.subtotal = subtotal;
        this.iva = iva;
        this.total = total;
        this.detalles = detalles;
    }
    

    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setDetalles(List<Consumo> detalles) {
        this.detalles = detalles;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getIva() {
        return iva;
    }

    public double getTotal() {
        return total;
    }

    public List<Consumo> getDetalles() {
        return detalles;
    }




}