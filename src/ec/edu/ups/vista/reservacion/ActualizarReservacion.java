
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista.reservacion;

import ec.edu.ups.controladores.ControladorReservacion;
import ec.edu.ups.modelo.Habitacion;
import ec.edu.ups.modelo.Reserva;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class ActualizarReservacion extends javax.swing.JInternalFrame {
   private ControladorReservacion controladorReservacion; 
   private ResourceBundle mensajes;
    /**
     * Creates new form ActualizarReservacion
     */
    public ActualizarReservacion(ControladorReservacion controladorReservacion,ResourceBundle mensajes) {
        this.controladorReservacion=controladorReservacion;
        initComponents();
        this. mensajes = mensajes;
        cambiarIdioma (mensajes);
    }
    public void cambiarIdioma(ResourceBundle mensajes){  
   btnBuscar.setText(mensajes.getString("Ventanas.Buscar.Reservacion"));
   btnActualizar.setText(mensajes.getString("Ventana.Actualizar.Reservacion"));
   
   jlbActualizarReservacion.setText(mensajes.getString("Ventana.Titulo.Actualizar"));
   jblCodigoCrearReservacion.setText(mensajes.getString("Ventanas.CodigoReservacion"));
   jblCodigoHabitacion.setText(mensajes.getString("Ventanas.CodigoH"));
   jlbCodigoEmpleado.setText(mensajes.getString("Ventanas.CodigoEH"));
   jlbFechaReserva.setText(mensajes.getString("Ventanas.FechaR"));
   jlbFechaIngreso.setText(mensajes.getString("Ventanas.FechaI"));
   jlbFechaSalida.setText(mensajes.getString("Ventanas.FechaS"));
   jlbCostoAlojamiento.setText(mensajes.getString("Ventanas.CostoR"));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jblCodigoCrearReservacion = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        txtFechaReserva = new javax.swing.JTextField();
        txtFechaIngreso = new javax.swing.JTextField();
        txtNumHabitacion = new javax.swing.JTextField();
        jblCodigoHabitacion = new javax.swing.JLabel();
        jlbCodigoEmpleado = new javax.swing.JLabel();
        jlbFechaReserva = new javax.swing.JLabel();
        jlbFechaIngreso = new javax.swing.JLabel();
        txtCodigoEmpleado = new javax.swing.JTextField();
        jlbFechaSalida = new javax.swing.JLabel();
        txtFechaSalida = new javax.swing.JTextField();
        jlbCostoAlojamiento = new javax.swing.JLabel();
        txtCostoAlojamiento = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        jlbActualizarReservacion = new javax.swing.JLabel();

        setClosable(true);

        jblCodigoCrearReservacion.setText("INGRESAR CODIGO :");

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jblCodigoHabitacion.setText("Número de Habitación :");

        jlbCodigoEmpleado.setText("Còdigo del Empleado:");

        jlbFechaReserva.setText("Fecha de rerva:");

        jlbFechaIngreso.setText("Fecha de Ingreso:");

        jlbFechaSalida.setText("Fecha de Salida:");

        jlbCostoAlojamiento.setText("Costo de alojamiento:");

        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        jlbActualizarReservacion.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jlbActualizarReservacion.setForeground(new java.awt.Color(0, 0, 0));
        jlbActualizarReservacion.setText("ACTUALIZAR RESERVACIÓN ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jblCodigoHabitacion)
                    .addComponent(jlbCodigoEmpleado)
                    .addComponent(jlbFechaReserva)
                    .addComponent(jlbFechaIngreso)
                    .addComponent(jlbFechaSalida)
                    .addComponent(jlbCostoAlojamiento)
                    .addComponent(jblCodigoCrearReservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscar)
                        .addGap(27, 27, 27))
                    .addComponent(txtFechaSalida, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCodigoEmpleado)
                            .addComponent(txtFechaReserva)
                            .addComponent(txtNumHabitacion, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                            .addComponent(txtFechaIngreso))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtCostoAlojamiento, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE))
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(btnActualizar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jlbActualizarReservacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jlbActualizarReservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblCodigoCrearReservacion)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblCodigoHabitacion)
                    .addComponent(txtNumHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbCodigoEmpleado)
                    .addComponent(txtCodigoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbFechaReserva)
                    .addComponent(txtFechaReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbFechaIngreso)
                    .addComponent(txtFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbFechaSalida)
                    .addComponent(txtFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbCostoAlojamiento)
                    .addComponent(txtCostoAlojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(btnActualizar)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        int codigo = Integer.parseInt(txtCodigo.getText());
        Reserva reserva = controladorReservacion.read(codigo);
        txtNumHabitacion.setText(Integer.toString(reserva.getCodigoHabitacion()));
        txtCodigoEmpleado.setText(Integer.toString(reserva.getCodigoTrabajador()));
        txtFechaReserva.setText(reserva.getFechaReserva());
        txtFechaIngreso.setText(reserva.getFechaIngreso());
        txtFechaSalida.setText(reserva.getFechaSalida());
        txtCostoAlojamiento.setText(Double.toString(reserva.getCostoAlojamiento()));
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
         Reserva reserva = controladorReservacion.read(Integer.parseInt(txtCodigo.getText()));     
        reserva.setCodigoReserva(Integer.parseInt(txtCodigo.getText()));
        reserva.setCodigoHabitacion(Integer.parseInt(txtNumHabitacion.getText()));
        reserva.setCodigoTrabajador(Integer.parseInt(txtCodigoEmpleado.getText()));
        reserva.setFechaIngreso(txtFechaIngreso.getText());
        reserva.setFechaReserva(txtFechaReserva.getText());
        reserva.setFechaSalida(txtFechaSalida.getText());
        reserva.setCostoAlojamiento(Double.parseDouble(txtCostoAlojamiento.getText()));
        txtCodigo.setText(Integer.toString(this.controladorReservacion.getCodigo()));
        JOptionPane.showMessageDialog(this, "RESERRVACION CREADA", "Crear RESERVACION", JOptionPane.INFORMATION_MESSAGE);
        txtCodigo.setText(String.valueOf(this.controladorReservacion.getCodigo()));
        controladorReservacion.update(reserva);
        txtNumHabitacion.setText("");
        txtCodigoEmpleado.setText("");
        txtFechaReserva.setText("");
        txtFechaIngreso.setText("");
        txtFechaSalida.setText("");
        txtCostoAlojamiento.setText("");
    }//GEN-LAST:event_btnActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jblCodigoCrearReservacion;
    private javax.swing.JLabel jblCodigoHabitacion;
    private javax.swing.JLabel jlbActualizarReservacion;
    private javax.swing.JLabel jlbCodigoEmpleado;
    private javax.swing.JLabel jlbCostoAlojamiento;
    private javax.swing.JLabel jlbFechaIngreso;
    private javax.swing.JLabel jlbFechaReserva;
    private javax.swing.JLabel jlbFechaSalida;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigoEmpleado;
    private javax.swing.JTextField txtCostoAlojamiento;
    private javax.swing.JTextField txtFechaIngreso;
    private javax.swing.JTextField txtFechaReserva;
    private javax.swing.JTextField txtFechaSalida;
    private javax.swing.JTextField txtNumHabitacion;
    // End of variables declaration//GEN-END:variables
}
