/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista.producto;

import ec.edu.ups.controlador.ControladorFacturaDetalle;
import ec.edu.ups.controlador.ControladorProducto;
import ec.edu.ups.modelo.Factura;
import ec.edu.ups.modelo.Producto;
import java.util.ResourceBundle;
import java.util.Set;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 
 */
public class VentanaListarProductos extends javax.swing.JInternalFrame {
private ControladorProducto controladorProducto;
private ResourceBundle mensajes;
    /**
     * Creates new form ListarClientes
     */
    public VentanaListarProductos(ControladorProducto controladorProducto,ResourceBundle mensajes) {
        initComponents();
        this.controladorProducto=controladorProducto;
        this.mensajes = mensajes ;
        llenarDatos();
        cambiarIdioma( mensajes );
    }
     public void cambiarIdioma(ResourceBundle mensajes ){
   
   jlbTituloListaProducto.setText(mensajes.getString("Ventana.Listar.Producto"));
   
   }
    
      public void llenarDatos(){
        DefaultTableModel modelo=(DefaultTableModel)tblListarProductos.getModel();
        Set<Producto>lista=controladorProducto.getLista();
        for(Producto producto:lista){
            Object[]datos={producto.getCodigoProducto(),producto.getDetalle(),
            producto.getNombre(),producto.getPrecio()};
            modelo.addRow(datos);
        }
        
      }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblListarProductos = new javax.swing.JTable();
        jlbTituloListaProducto = new javax.swing.JLabel();

        setClosable(true);

        tblListarProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "CANTIDAD", "NOMBRE", "COSTO"
            }
        ));
        jScrollPane1.setViewportView(tblListarProductos);

        jlbTituloListaProducto.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jlbTituloListaProducto.setText("LISTA PRODUCTO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addComponent(jlbTituloListaProducto)
                .addContainerGap(355, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jlbTituloListaProducto)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlbTituloListaProducto;
    private javax.swing.JTable tblListarProductos;
    // End of variables declaration//GEN-END:variables

}
