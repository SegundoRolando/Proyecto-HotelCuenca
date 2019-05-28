/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Producto;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author 
 */
public class ControladorProducto {
    
    private Set<Producto> lista;
    private int codigo;

    
    
    public ControladorProducto() {
        lista = new HashSet<>();
        codigo = 1;
    }
    public Set<Producto> getLista() {
        return lista;
    }

    
    public int getCodigo() {
        return codigo;
    }
    public void cread(Producto producto){
        producto.setCodigoProducto(codigo);
        lista.add(producto);
        codigo++;
    }
    
    public Producto read(int codigo){
        for (Producto producto : lista) {
            if(producto.getCodigoProducto()== codigo){
                return producto;
            }
        }
        return null;
    }
    
    public void update(Producto producto){
        if(lista.contains(producto)){
            lista.remove(producto);
            lista.add(producto);
        }
    }
    
    public void delete(int codigo){
        for (Producto producto : lista) {
            if(producto.getCodigoProducto()== codigo){
                lista.remove(producto);
                break;
            }
        }
    }
    
    
    public void printAll(){
    
        for (Producto producto : lista) {
            System.out.println(producto);
        }
    }
}
