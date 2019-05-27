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
    private  String acceso;
    private  String usuario;
    private  String contraseña;
    
    
    public Empleado (){
        
    }

    public Empleado(Double sueldo, String acceso, String usuario, String contraseña) {
        this.sueldo = sueldo;
        this.acceso = acceso;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    public String getAcceso() {
        return acceso;
    }

    public void setAcceso(String acceso) {
        this.acceso = acceso;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Empleado{" + "sueldo=" + sueldo + ", acceso=" + acceso + ", usuario=" + usuario + ", contrase\u00f1a=" + contraseña + '}';
    }

  
    
}
