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
public class Empleado extends Persona {

    private  Double sueldo;
    
    
    
    public Empleado (){
        
    }

    public Empleado(Double sueldo) {
        this.sueldo = sueldo;
        
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

  
    
}
