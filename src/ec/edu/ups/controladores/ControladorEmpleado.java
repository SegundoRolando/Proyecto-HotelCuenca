/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;
import ec.edu.ups.modelo.Empleado;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author ivan
 */
public class ControladorEmpleado {
    
    private Set<Empleado> lista;
    private int codigo;

    public Set<Empleado> getLista() {
        return lista;
    }
    
    public ControladorEmpleado() {
        lista = new HashSet<>();
        codigo = 1;
    }
     public int getCodigo() {
        return codigo;
        
    }
    public void create(Empleado empleado){
        empleado.setCodigo(codigo);
        codigo++;
        lista.add(empleado);
    }
    
    public Empleado read(int codigo){
        for (Empleado empleado : lista) {
            if(empleado.getCodigo() == codigo){
                return empleado;
            }
        }
        return null;
    }
    public Empleado read(String cedula){
        for (Empleado empleado : lista) {
            if(empleado.getCedula().equals(cedula)){
                return empleado;
            }
        }
        return null;
    }
    
    public void update(Empleado empleado){
    
        if (lista.contains(empleado)){
        
            lista.remove(empleado);
            lista.add(empleado);
        }
    }
    
   public void remove(int codigo){
    
        for (Empleado empleado : lista) {
            
            if (empleado.getCodigo()==codigo){
            
                lista.remove(empleado);
                break;
            }
        }
    }
    
      public void printAll(){
    
        for (Empleado empleado : lista) {
            System.out.println(empleado);
        }
    }

   
}
