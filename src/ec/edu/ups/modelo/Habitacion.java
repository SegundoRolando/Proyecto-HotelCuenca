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
    private int numeroHabitacion;
    private String descripcion;
    private  String tipoHabitacion;
    
    public Habitacion(){
        
    }

    public Habitacion(int codigoHabitacion, int numeroHabitacion, String descripcion, String tipoHabitacion) {
        this.codigoHabitacion = codigoHabitacion;
        this.numeroHabitacion = numeroHabitacion;
        this.descripcion = descripcion;
        this.tipoHabitacion = tipoHabitacion;
    }

    public int getCodigoHabitacion() {
        return codigoHabitacion;
    }

    public void setCodigoHabitacion(int codigoHabitacion) {
        this.codigoHabitacion = codigoHabitacion;
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

    
    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    @Override
    public String toString() {
        return "Habitacion{" + "codigoHabitacion=" + codigoHabitacion + ", numeroHabitacion=" + numeroHabitacion + ", descripcion=" + descripcion + ", tipoHabitacion=" + tipoHabitacion + '}';
    }

  
    
}
