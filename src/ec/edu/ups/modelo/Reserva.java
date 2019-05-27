/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.Date;

/**
 *
 * @author ASUS
 */
public class Reserva {
    
    private  int codigoReserva;
    private int codigoHabitacion;
    private  int codigoCliente;
    private int codigoTrabajador;
    private  String  tipoReserva;
    private  Date fechaReserva;
    private Date fechaIngreso;
    private Date fechaSalida;
    private double costoAlojamiento;

    public Reserva() {
    }

    public Reserva(int codigoReserva, int codigoHabitacion, int codigoCliente, int codigoTrabajador, String tipoReserva, Date fechaReserva, Date fechaIngreso, Date fechaSalida, double costoAlojamiento) {
        this.codigoReserva = codigoReserva;
        this.codigoHabitacion = codigoHabitacion;
        this.codigoCliente = codigoCliente;
        this.codigoTrabajador = codigoTrabajador;
        this.tipoReserva = tipoReserva;
        this.fechaReserva = fechaReserva;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.costoAlojamiento = costoAlojamiento;
    }

    public int getCodigoReserva() {
        return codigoReserva;
    }

    public void setCodigoReserva(int codigoReserva) {
        this.codigoReserva = codigoReserva;
    }

    public int getCodigoHabitacion() {
        return codigoHabitacion;
    }

    public void setCodigoHabitacion(int codigoHabitacion) {
        this.codigoHabitacion = codigoHabitacion;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public int getCodigoTrabajador() {
        return codigoTrabajador;
    }

    public void setCodigoTrabajador(int codigoTrabajador) {
        this.codigoTrabajador = codigoTrabajador;
    }

    public String getTipoReserva() {
        return tipoReserva;
    }

    public void setTipoReserva(String tipoReserva) {
        this.tipoReserva = tipoReserva;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public double getCostoAlojamiento() {
        return costoAlojamiento;
    }

    public void setCostoAlojamiento(double costoAlojamiento) {
        this.costoAlojamiento = costoAlojamiento;
    }

    @Override
    public String toString() {
        return "Reserva{" + "codigoReserva=" + codigoReserva + ", codigoHabitacion=" + codigoHabitacion + ", codigoCliente=" + codigoCliente + ", codigoTrabajador=" + codigoTrabajador + ", tipoReserva=" + tipoReserva + ", fechaReserva=" + fechaReserva + ", fechaIngreso=" + fechaIngreso + ", fechaSalida=" + fechaSalida + ", costoAlojamiento=" + costoAlojamiento + '}';
    }
    
    
    
}
