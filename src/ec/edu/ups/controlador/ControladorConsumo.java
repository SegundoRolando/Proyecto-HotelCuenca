/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Consumo;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author 
 */
public class ControladorConsumo {
    
    private Set<Consumo> lista;
    private int numero;

    public int getCodigo() {
        return numero;
    }
    
    public ControladorConsumo() {
        lista = new HashSet<>();
        numero = 1;
    }
    
    public void create(Consumo consumo){
        consumo.setCodigoConsumo(numero);
        numero++;
        lista.add(consumo);
    }
    
    public Consumo read(int numero){
        for (Consumo consumo : lista) {
            if(consumo.getCodigoConsumo()== numero){
                return consumo;
            }
        }
        return null;
    }
    
    public void update(Consumo consumo){
        if(lista.contains(consumo)){
            lista.remove(consumo);
            lista.add(consumo);
        }
    }
    
    public void delete(int numero){
        for (Consumo consumo : lista) {
            if(consumo.getCodigoConsumo()== numero){
                lista.remove(consumo);
                break;
            }
        }
    }
    
    public void imprimir(){
        for (Consumo consumo : lista) {
            System.out.println(consumo.getCodigoConsumo());
        }
    }

    public Set<Consumo> getLista() {
        return lista;
    }

    public int getNumero() {
        return numero;
    }
    
    
}
