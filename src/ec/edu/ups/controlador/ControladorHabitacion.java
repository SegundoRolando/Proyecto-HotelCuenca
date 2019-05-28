/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Habitacion;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author 
 */
public class ControladorHabitacion {
    
    private Set<Habitacion> lista;
    private int codigo;

    
    
    public ControladorHabitacion() {
        lista = new HashSet<>();
        codigo = 1;
    }
    public Set<Habitacion> getLista() {
        return lista;
    }

    
    public int getCodigo() {
        return codigo;
    }
    public void cread(Habitacion habitacion){
        habitacion.setCodigoHabitacion(codigo);
        lista.add(habitacion);
        codigo++;
    }
    
    public Habitacion read(int codigo){
        for (Habitacion habitacion : lista) {
            if(habitacion.getCodigoHabitacion()== codigo){
                return habitacion;
            }
        }
        return null;
    }
    
    public void update(Habitacion habitacion){
        if(lista.contains(habitacion)){
            lista.remove(habitacion);
            lista.add(habitacion);
        }
    }
    
    public void delete(int codigo){
        for (Habitacion habitacion : lista) {
            if(habitacion.getCodigoHabitacion()== codigo){
                lista.remove(habitacion);
                break;
            }
        }
    }
    
    
    public void printAll(){
    
        for (Habitacion  habitacion : lista) {
            System.out.println(habitacion);
        }
    }
}

