package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Factura;
import ec.edu.ups.modelo.Reserva;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author 
 */
public class ControladorReservacion {
    
    private Set<Reserva> lista;
    private int numero;

    public int getCodigo() {
        return numero;
    }
    
    public ControladorReservacion() {
        lista = new HashSet<>();
        numero = 1;
    }
    
    public void create(Reserva reservacion){
        reservacion.setCodigoReserva(numero);
        numero++;
        lista.add(reservacion);
    }
    
    public Reserva read(int numero){
        for (Reserva reservacion : lista) {
            if(reservacion.getCodigoReserva()== numero){
                return reservacion;
            }
        }
        return null;
    }
    
    public void update(Reserva reservacion){
        if(lista.contains(reservacion)){
            lista.remove(reservacion);
            lista.add(reservacion);
        }
    }
    
    public void delete(int numero){
        for (Reserva reservacion : lista) {
            if(reservacion.getCodigoReserva()== numero){
                lista.remove(reservacion);
                break;
            }
        }
    }
    
    public void imprimir(){
        for (Reserva reservacion : lista) {
            System.out.println(reservacion.getCodigoReserva());
        }
    }

    public Set<Reserva> getLista() {
        return lista;
    }

    public int getNumero() {
        return numero;
    }
    
    
}
