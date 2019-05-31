/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

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
    public void cread(Habitacion producto){
        producto.setCodigoProducto(codigo);
        lista.add(producto);
        codigo++;
    }
    
    public Habitacion read(int codigo){
        for (Habitacion producto : lista) {
            if(producto.getCodigoProducto()== codigo){
                return producto;
            }
        }
        return null;
    }
    
    public void update(Habitacion producto){
        if(lista.contains(producto)){
            lista.remove(producto);
            lista.add(producto);
        }
    }
    
    public void delete(int codigo){
        for (Habitacion producto : lista) {
            if(producto.getCodigoProducto()== codigo){
                lista.remove(producto);
                break;
            }
        }
    }
    
    
    public void printAll(){
    
        for (Habitacion producto : lista) {
            System.out.println(producto);
        }
    }
}
