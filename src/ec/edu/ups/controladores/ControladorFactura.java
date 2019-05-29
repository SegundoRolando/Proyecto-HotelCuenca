/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.modelo.Factura;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author 
 */
public class ControladorFactura {
    
    private Set<Factura> lista;
    private int numero;

    public int getCodigo() {
        return numero;
    }
    
    public ControladorFactura() {
        lista = new HashSet<>();
        numero = 1;
    }
    
    public void create(Factura facturaCabecera){
        facturaCabecera.setNumeroFactura(numero);
        numero++;
        lista.add(facturaCabecera);
    }
    
    public Factura read(int numero){
        for (Factura facturaCabecera : lista) {
            if(facturaCabecera.getNumeroFactura()== numero){
                return facturaCabecera;
            }
        }
        return null;
    }
    
    public void update(Factura facturaCabecera){
        if(lista.contains(facturaCabecera)){
            lista.remove(facturaCabecera);
            lista.add(facturaCabecera);
        }
    }
    
    public void delete(int numero){
        for (Factura facturaCabecera : lista) {
            if(facturaCabecera.getNumeroFactura()== numero){
                lista.remove(facturaCabecera);
                break;
            }
        }
    }
    
    public void imprimir(){
        for (Factura facturaCabecera : lista) {
            System.out.println(facturaCabecera.getNumeroFactura());
        }
    }

    public Set<Factura> getLista() {
        return lista;
    }

    public int getNumero() {
        return numero;
    }
    
    
}
