/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista.habitacion;

import ec.edu.ups.controladores.ControladorFacturaDetalle;
import ec.edu.ups.controladores.ControladorHabitacion;
import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.modelo.FacturaDetalle;
import ec.edu.ups.modelo.Habitacion;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;

/**
 *
 * @author 
 */
public class CrearHabitacion extends javax.swing.JInternalFrame {
    private ResourceBundle mensajes;
   private ControladorHabitacion controladorProducto;
    private ControladorFacturaDetalle controladorFacturaDetalle;
    /**
     * Creates new form CrearCliente
     */
    public CrearHabitacion(ControladorHabitacion controladorProducto,ControladorFacturaDetalle controladorFacturaDetalle,ResourceBundle mensajes) {
        initComponents();
        this.controladorProducto = controladorProducto;
        this.controladorFacturaDetalle=controladorFacturaDetalle;
        this.mensajes = mensajes ;
        cambiarIdioma (mensajes);
        txtCodigo.setText(Integer.toString(this.controladorFacturaDetalle.getCodigo()));
        txtCodigo.setText(Integer.toString(controladorProducto.getCodigo()));
    }
public void cambiarIdioma(ResourceBundle mensajes){
 
    //jlbTituloCrearProd.setText(mensajes.getString("Ventana.Crear.Habitacion"));
    jlbCodigoCrearProd.setText(mensajes.getString("Ventanas.Codigo"));
    jlbNombreCrearProd.setText(mensajes.getString("Ventana.Numero.Habitacion"));
    jlbDescripcionCrearProd.setText(mensajes.getString("Ventanas.Descripcion"));
    jlbCostoCrearProd.setText(mensajes.getString("Ventanas.Costo"));
    jlbDescripcionCrearProd.setText(mensajes.getString("Ventanas.Descripcion"));
    btnCrear.setText(mensajes.getString("Ventana.CrearR.Reservacion"));
    txtCreaProducto.setText(mensajes.getString("Ventana.Crear.Producto"));
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
        jlbCostoCrearProd = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jlbDescripcionCrearProd = new javax.swing.JLabel();
        txtDetalle = new javax.swing.JTextField();
        btnCrear = new javax.swing.JButton();
        jlbNombreCrearProd = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        jlbCodigoCrearProd = new javax.swing.JLabel();
        txtCreaProducto = new javax.swing.JLabel();

        setClosable(true);

        jlbCostoCrearProd.setText("COSTO :");

        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });

        jlbDescripcionCrearProd.setText("DESCRIPCION HABITACION  :");

        txtDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDetalleActionPerformed(evt);
            }
        });

        btnCrear.setText("CREAR");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        jlbNombreCrearProd.setText("NÚMERO DE HABITACIÓN :");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtCodigo.setEditable(false);
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        jlbCodigoCrearProd.setText("CODIGO :");

        txtCreaProducto.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtCreaProducto.setText("REGISTRAR HABITACIÓN ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(txtCreaProducto))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbCodigoCrearProd)
                            .addComponent(jlbNombreCrearProd)
                            .addComponent(jlbCostoCrearProd, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbDescripcionCrearProd))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                .addComponent(txtCodigo)
                                .addComponent(txtPrecio)))))
                .addContainerGap(57, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCreaProducto)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbCodigoCrearProd)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbNombreCrearProd, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbCostoCrearProd, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlbDescripcionCrearProd)
                    .addComponent(txtDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDetalleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDetalleActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        // TODO add your handling code here:
        Habitacion producto = new Habitacion();
        producto.setCodigoProducto(Integer.parseInt(txtCodigo.getText()));
        producto.setNombre(txtNombre.getText());
        producto.setPrecio(Double.parseDouble(txtPrecio.getText()));
        producto.setDetalle(txtDetalle.getText());
        txtCodigo.setText(String.valueOf(producto.getCodigoProducto()));
        controladorProducto.cread(producto);
        txtCodigo.setText(Integer.toString(this.controladorProducto.getCodigo()));
        JOptionPane.showMessageDialog(this, "Producto Creado ", "Crear Producto", JOptionPane.INFORMATION_MESSAGE);
        txtCodigo.setText(String.valueOf(this.controladorProducto.getCodigo()));
        txtNombre.setText("");
        txtPrecio.setText("");
        txtDetalle.setText("");
    }//GEN-LAST:event_btnCrearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlbCodigoCrearProd;
    private javax.swing.JLabel jlbCostoCrearProd;
    private javax.swing.JLabel jlbDescripcionCrearProd;
    private javax.swing.JLabel jlbNombreCrearProd;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JLabel txtCreaProducto;
    private javax.swing.JTextField txtDetalle;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
