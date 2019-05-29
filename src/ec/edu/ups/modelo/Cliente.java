/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *
 * @author
 */
public class Cliente extends Persona {

    private int codigoCliente;

    public Cliente() {
    }

    public Cliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public Cliente(int codigoCliente, int codigo, String nombre, String cedula, String telefono, String direccion, String email, String login, String contraseña) {
        super(codigo, nombre, cedula, telefono, direccion, email, login, contraseña);
        this.codigoCliente = codigoCliente;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }
}
