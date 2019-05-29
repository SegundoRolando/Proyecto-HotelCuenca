/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.modelo.FacturaDetalle;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author 
 */
public class ControladorFacturaDetalle {
    
    private Set<FacturaDetalle> lista;
    private int numero;

    public int getCodigo() {
        return numero;
    }
    
    public ControladorFacturaDetalle() {
        lista = new HashSet<>();
        numero = 1;
    }
    
    public void create(FacturaDetalle facturaDetalle){
        facturaDetalle.setCodigo(numero);
        numero++;
        lista.add(facturaDetalle);
    }
    
    public FacturaDetalle read(int numero){
        for (FacturaDetalle facturaDetalle : lista) {
            if(facturaDetalle.getCodigo()== numero){
                return facturaDetalle;
            }
        }
        return null;
    }
    
    public void update(FacturaDetalle facturaDetalle){
        if(lista.contains(facturaDetalle)){
            lista.remove(facturaDetalle);
            lista.add(facturaDetalle);
        }
    }
    
    public void delete(int numero){
        for (FacturaDetalle facturaDetalle : lista) {
            if(facturaDetalle.getCodigo()== numero){
                lista.remove(facturaDetalle);
                break;
            }
        }
    }
    
    public void imprimir(){
        for (FacturaDetalle facturaDetalle : lista) {
            System.out.println(facturaDetalle.getCodigo());
        }
    }

    public Set<FacturaDetalle> getLista() {
        return lista;
    }

    public int getNumero() {
        return numero;
    }
    
}
