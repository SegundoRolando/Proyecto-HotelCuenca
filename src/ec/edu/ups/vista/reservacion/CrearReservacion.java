
package ec.edu.ups.vista.reservacion;

import ec.edu.ups.controladores.ControladorReservacion;
import ec.edu.ups.modelo.Reserva;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class CrearReservacion extends javax.swing.JInternalFrame {

    /**
     * Creates new form CrearReservacion
     */
    private ControladorReservacion controladorReservacion;
    
    
        public CrearReservacion(ControladorReservacion controladorReservacion) {
        initComponents();
        this.controladorReservacion= controladorReservacion;
         txtCodigo.setText(Integer.toString(controladorReservacion.getCodigo()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jlbCodigoHabitacion = new javax.swing.JLabel();
        txtCodiHabitacion = new javax.swing.JTextField();
        jblCodigoTrabajador = new javax.swing.JLabel();
        txtFechIngre = new javax.swing.JTextField();
        jblFeReser = new javax.swing.JLabel();
        txtCodTrabaador = new javax.swing.JTextField();
        jlbFechaSal = new javax.swing.JLabel();
        txtFechReser = new javax.swing.JTextField();
        jlbFechIngre = new javax.swing.JLabel();
        txtCosAloj = new javax.swing.JTextField();
        jlbCosAloj = new javax.swing.JLabel();
        txtFechSal = new javax.swing.JTextField();
        btnCrear = new javax.swing.JButton();

        setClosable(true);

        jblCodigo.setText("CODIGO :");

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        jlbCodigoHabitacion.setText("NUMERO HABITACION :");

        txtCodiHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodiHabitacionActionPerformed(evt);
            }
        });

        jblCodigoTrabajador.setText("NUMERO TRABAJADOR :");

        jblFeReser.setText("FECHA DE RESERVA :");

        jlbFechaSal.setText("FECHA DE SALIDA  :");

        jlbFechIngre.setText("FECHA DE INGRESO :");

        jlbCosAloj.setText("COSTO DE ALOJAMIENTO :");

        btnCrear.setText("CREAR");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jblCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlbCodigoHabitacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jblCodigoTrabajador, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                .addComponent(jblFeReser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlbFechaSal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlbFechIngre, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jlbCosAloj, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCosAloj, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtCodiHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCodTrabaador, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtFechReser)
                                .addComponent(txtFechIngre)
                                .addComponent(txtFechSal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(btnCrear)))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbCodigoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodiHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblCodigoTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodTrabaador, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblFeReser, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechReser, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbFechIngre, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechIngre, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbFechaSal, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechSal, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbCosAloj, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCosAloj, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCrear)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        Reserva reserva = new Reserva();
        reserva.setCodigoReserva(Integer.parseInt(txtCodigo.getText()));
        reserva.setCodigoHabitacion(Integer.parseInt(txtCodiHabitacion.getText()));
        reserva.setCodigoTrabajador(Integer.parseInt(txtCodTrabaador.getText()));
        reserva.setFechaReserva((txtFechReser.getText()));
        reserva.setFechaIngreso(txtFechIngre.getText());
        reserva.setFechaSalida(txtFechSal.getText());
        reserva.setCostoAlojamiento(Double.parseDouble(txtCosAloj.getText()));
        txtCodigo.setText(String.valueOf(reserva.getCodigoReserva()));
        controladorReservacion.create(reserva);
        txtCodigo.setText(Integer.toString(this.controladorReservacion.getCodigo()));
        JOptionPane.showMessageDialog(this, "RESERRVACION CREADA", "Crear RESERVACION", JOptionPane.INFORMATION_MESSAGE);
        txtCodigo.setText(String.valueOf(this.controladorReservacion.getCodigo()));
        txtCodiHabitacion.setText("");
        txtCodTrabaador.setText("");
        txtFechReser.setText("");
        txtFechIngre.setText("");
        txtFechSal.setText("");
        txtCosAloj.setText("");
           // TODO add your handling code here:
        
    }//GEN-LAST:event_btnCrearActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtCodiHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodiHabitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodiHabitacionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jblCodigo;
    private javax.swing.JLabel jblCodigoTrabajador;
    private javax.swing.JLabel jblFeReser;
    private javax.swing.JLabel jlbCodigoHabitacion;
    private javax.swing.JLabel jlbCosAloj;
    private javax.swing.JLabel jlbFechIngre;
    private javax.swing.JLabel jlbFechaSal;
    private javax.swing.JTextField txtCodTrabaador;
    private javax.swing.JTextField txtCodiHabitacion;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCosAloj;
    private javax.swing.JTextField txtFechIngre;
    private javax.swing.JTextField txtFechReser;
    private javax.swing.JTextField txtFechSal;
    // End of variables declaration//GEN-END:variables
}
