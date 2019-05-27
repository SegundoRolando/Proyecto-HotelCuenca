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
public class Habitacion {
    
    private int codigoHabitacion;
    private int numerPiso;
    private int numeroHabitacion;
    private String descripcion;
    private  double precioDiario;
    private  String tipoHabitacion;
    
    public Habitacion(){
        
    }

    public Habitacion(int codigoHabitacion, int numerPiso, int numeroHabitacion, String descripcion, double precioDiario, String tipoHabitacion) {
        this.codigoHabitacion = codigoHabitacion;
        this.numerPiso = numerPiso;
        this.numeroHabitacion = numeroHabitacion;
        this.descripcion = descripcion;
        this.precioDiario = precioDiario;
        this.tipoHabitacion = tipoHabitacion;
    }

    public int getCodigoHabitacion() {
        return codigoHabitacion;
    }

    public void setCodigoHabitacion(int codigoHabitacion) {
        this.codigoHabitacion = codigoHabitacion;
    }

    public int getNumerPiso() {
        return numerPiso;
    }

    public void setNumerPiso(int numerPiso) {
        this.numerPiso = numerPiso;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioDiario() {
        return precioDiario;
    }

    public void setPrecioDiario(double precioDiario) {
        this.precioDiario = precioDiario;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    @Override
    public String toString() {
        return "Habitacion{" + "codigoHabitacion=" + codigoHabitacion + ", numerPiso=" + numerPiso + ", numeroHabitacion=" + numeroHabitacion + ", descripcion=" + descripcion + ", precioDiario=" + precioDiario + ", tipoHabitacion=" + tipoHabitacion + '}';
    }
    
}
