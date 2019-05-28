/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;
import ec.edu.ups.modelo.Reserva;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author 
 */
public class ControladorReserva {
    
    private Set<Reserva> lista;
    private int numero;

    public int getCodigo() {
        return numero;
    }
    
    public ControladorReserva() {
        lista = new HashSet<>();
        numero = 1;
    }
    
    public void create(Reserva reserva){
        reserva.setCodigoReserva(numero);
        numero++;
        lista.add(reserva);
    }
    
    public Reserva read(int numero){
        for (Reserva reserva : lista) {
            if(reserva.getCodigoReserva()== numero){
                return reserva;
            }
        }
        return null;
    }
    
    public void update(Reserva reserva){
        if(lista.contains(reserva)){
            lista.remove(reserva);
            lista.add(reserva);
        }
    }
    
    public void delete(int numero){
        for (Reserva reserva : lista) {
            if(reserva.getCodigoReserva()== numero){
                lista.remove(reserva);
                break;
            }
        }
    }
    
    public void imprimir(){
        for (Reserva reserva : lista) {
            System.out.println(reserva.getCodigoReserva());
        }
    }

    public Set<Reserva> getLista() {
        return lista;
    }

    public int getNumero() {
        return numero;
    }
    
    
}
