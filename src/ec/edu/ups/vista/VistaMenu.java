/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import com.sun.swing.internal.plaf.basic.resources.basic;
import ec.edu.ups.vista.factura.ListarFactura;


import ec.edu.ups.vista.factura.CrearFactura;
import ec.edu.ups.vista.factura.EliminarFactura;
import ec.edu.ups.vista.cliente.EliminarCliente;
import ec.edu.ups.vista.cliente.ActualizarCliente;
import ec.edu.ups.vista.cliente.CrearCliente;
import ec.edu.ups.vista.cliente.ListarCliente;
import ec.edu.ups.vista.cliente.BuscarCliente;
import ec.edu.ups.vista.producto.ActualizarProductos;
import ec.edu.ups.vista.producto.BuscarProducto;
import ec.edu.ups.vista.producto.ListarProductos;
import ec.edu.ups.vista.producto.CrearProducto;
import ec.edu.ups.vista.producto.EliminarProducto;
import ec.edu.ups.controladores.ControladorCliente;
import ec.edu.ups.controladores.ControladorEmpleado;
import ec.edu.ups.controladores.ControladorFactura;
import ec.edu.ups.controladores.ControladorFacturaDetalle;
import ec.edu.ups.controladores.ControladorProducto;
import ec.edu.ups.controladores.ControladorReservacion;
import ec.edu.ups.vista.empleado.ActualizarEmpleado;
import ec.edu.ups.vista.empleado.BuscarEmpleado;
import ec.edu.ups.vista.empleado.CrearEmpleado;
import ec.edu.ups.vista.empleado.EliminarEmpleado;
import ec.edu.ups.vista.empleado.ListarEmpleado;
import ec.edu.ups.vista.factura.BuscarFactura;
import ec.edu.ups.vista.reservacion.ActualizarReservacion;
import ec.edu.ups.vista.reservacion.BuscarReservacion;
import ec.edu.ups.vista.reservacion.CrearReservacion;
import ec.edu.ups.vista.reservacion.EliminarReservacion;
import ec.edu.ups.vista.reservacion.LIstarReservacion;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author 
 */
public class VistaMenu extends javax.swing.JFrame {

    private ControladorCliente controladorCliente;
    private ControladorProducto controladorProducto;
    private ControladorFactura controladorFactura;
    private ControladorFacturaDetalle controladorFacturaDetalle;
    private ControladorReservacion controladorReservacion;
    private ControladorEmpleado controadorEmpleado;
    private Locale localizacion;
    private ResourceBundle mensajes;

    /**
     * Creates new form VistaPrincipal
     */
    public VistaMenu() {
        initComponents();
        setLocationRelativeTo(null);
        controladorCliente = new ControladorCliente();
        controladorProducto = new ControladorProducto();
        controladorFactura = new ControladorFactura();
        controladorFacturaDetalle=new ControladorFacturaDetalle();
        controladorReservacion =new ControladorReservacion();
        controadorEmpleado=new ControladorEmpleado();
        //System.out.println("Localizacion por defecto :"+Locale.getDefault().getLanguage());
        localizacion = new Locale("es", "EC");
        Locale.setDefault(localizacion);
        //System.out.println("Localizacion forzada :"+Locale.getDefault().getLanguage());
        //mensajes = ResourceBundle.getBundle("ec.edu.ups.idiomas.mensajes", Locale.getDefault());//tengo que poner el nombre del paquete mas el nombre del archivo
        //System.out.println("Mensajes");
        //System.out.println(mensajes.getString("menu.item.crear"));
        cambiarIdioma();
    }

    public void cambiarIdioma() {
        mensajes = ResourceBundle.getBundle("ec.edu.ups.idiomas.mensajes", Locale.getDefault());
        
        clienteMenu.setText(mensajes.getString("menu.cliente"));
        productoMenu.setText(mensajes.getString("menu.producto"));
        EmpleadoMenu1.setText(mensajes.getString("menu.empleado"));
        facturaMenu2.setText(mensajes.getString("menu.reservacion"));
        facturaMenu.setText(mensajes.getString("menu.factura"));
        idiomaMenu.setText(mensajes.getString("menu.idiomas"));

        itmCreateCliente.setText(mensajes.getString("menu.item.crear"));
        itmCreateProducto.setText(mensajes.getString("menu.item.crear"));
        itmCreateFactura.setText(mensajes.getString("menu.item.crear"));
        itmCreateEmpleado.setText(mensajes.getString("menu.item.crear"));
        itmCreateReservacion2.setText(mensajes.getString("menu.item.crear"));

        itmReadCliente.setText(mensajes.getString("menu.item.buscar"));
        itmReadProducto.setText(mensajes.getString("menu.item.buscar"));
        itmReadFactura.setText(mensajes.getString("menu.item.buscar"));
        itmReadrEmpleado.setText(mensajes.getString("menu.item.buscar"));
        itmReadReservacion2.setText(mensajes.getString("menu.item.buscar"));

        itmUpdateCliente.setText(mensajes.getString("menu.item.actualizar"));
        itmUpdateProducto.setText(mensajes.getString("menu.item.actualizar"));
        itmUpdateEmpleado.setText(mensajes.getString("menu.item.actualizar"));
        itmUpdateReservacion2.setText(mensajes.getString("menu.item.actualizar"));
        
        itmDeleateCliente.setText(mensajes.getString("menu.item.eliminar"));
        itmDeleateProducto.setText(mensajes.getString("menu.item.eliminar"));
        itmDeleateFactura.setText(mensajes.getString("menu.item.eliminar"));
        itmDeleateEmpleado.setText(mensajes.getString("menu.item.eliminar"));
        itmDeleateReservacion2.setText(mensajes.getString("menu.item.eliminar"));
        
        itmListarCliente.setText(mensajes.getString("menu.item.listar"));
        itmListarProducto.setText(mensajes.getString("menu.item.listar"));
        itmListarFactura.setText(mensajes.getString("menu.item.listar"));
        itmListarEmpleado.setText(mensajes.getString("menu.item.listar"));
        itmListarReservacion2.setText(mensajes.getString("menu.item.listar"));
        
        
        
        
       // itmCreateFactura.setText(mensajes.getString("menu.item.crear"));        itm
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jToggleButton1 = new javax.swing.JToggleButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        clienteMenu = new javax.swing.JMenu();
        itmCreateCliente = new javax.swing.JMenuItem();
        itmReadCliente = new javax.swing.JMenuItem();
        itmUpdateCliente = new javax.swing.JMenuItem();
        itmDeleateCliente = new javax.swing.JMenuItem();
        itmListarCliente = new javax.swing.JMenuItem();
        productoMenu = new javax.swing.JMenu();
        itmCreateProducto = new javax.swing.JMenuItem();
        itmReadProducto = new javax.swing.JMenuItem();
        itmUpdateProducto = new javax.swing.JMenuItem();
        itmDeleateProducto = new javax.swing.JMenuItem();
        itmListarProducto = new javax.swing.JMenuItem();
        facturaMenu = new javax.swing.JMenu();
        itmCreateFactura = new javax.swing.JMenuItem();
        itmReadFactura = new javax.swing.JMenuItem();
        itmDeleateFactura = new javax.swing.JMenuItem();
        itmListarFactura = new javax.swing.JMenuItem();
        facturaMenu2 = new javax.swing.JMenu();
        itmCreateReservacion2 = new javax.swing.JMenuItem();
        itmReadReservacion2 = new javax.swing.JMenuItem();
        itmUpdateReservacion2 = new javax.swing.JMenuItem();
        itmDeleateReservacion2 = new javax.swing.JMenuItem();
        itmListarReservacion2 = new javax.swing.JMenuItem();
        EmpleadoMenu1 = new javax.swing.JMenu();
        itmCreateEmpleado = new javax.swing.JMenuItem();
        itmReadrEmpleado = new javax.swing.JMenuItem();
        itmUpdateEmpleado = new javax.swing.JMenuItem();
        itmDeleateEmpleado = new javax.swing.JMenuItem();
        itmListarEmpleado = new javax.swing.JMenuItem();
        idiomaMenu = new javax.swing.JMenu();
        itmEspanolFactura1 = new javax.swing.JMenuItem();
        itmInglesFactura1 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("jMenu3");

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        jMenu6.setText("File");
        jMenuBar3.add(jMenu6);

        jMenu7.setText("Edit");
        jMenuBar3.add(jMenu7);

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jToggleButton1.setText("jToggleButton1");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        clienteMenu.setMnemonic('f');
        clienteMenu.setText("Cliente");

        itmCreateCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        itmCreateCliente.setMnemonic('o');
        itmCreateCliente.setText("CREAR");
        itmCreateCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCreateClienteActionPerformed(evt);
            }
        });
        clienteMenu.add(itmCreateCliente);

        itmReadCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        itmReadCliente.setMnemonic('s');
        itmReadCliente.setText("LEER");
        itmReadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmReadClienteActionPerformed(evt);
            }
        });
        clienteMenu.add(itmReadCliente);

        itmUpdateCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        itmUpdateCliente.setMnemonic('a');
        itmUpdateCliente.setText("ACTUALIZAR");
        itmUpdateCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmUpdateClienteActionPerformed(evt);
            }
        });
        clienteMenu.add(itmUpdateCliente);

        itmDeleateCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        itmDeleateCliente.setMnemonic('x');
        itmDeleateCliente.setText("ELIMINAR");
        itmDeleateCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmDeleateClienteActionPerformed(evt);
            }
        });
        clienteMenu.add(itmDeleateCliente);

        itmListarCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        itmListarCliente.setText("LISTAR");
        itmListarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmListarClienteActionPerformed(evt);
            }
        });
        clienteMenu.add(itmListarCliente);

        menuBar.add(clienteMenu);

        productoMenu.setText("Producto");

        itmCreateProducto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        itmCreateProducto.setMnemonic('o');
        itmCreateProducto.setText("CREAR");
        itmCreateProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCreateProductoActionPerformed(evt);
            }
        });
        productoMenu.add(itmCreateProducto);

        itmReadProducto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        itmReadProducto.setMnemonic('s');
        itmReadProducto.setText("LEER");
        itmReadProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmReadProductoActionPerformed(evt);
            }
        });
        productoMenu.add(itmReadProducto);

        itmUpdateProducto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        itmUpdateProducto.setMnemonic('a');
        itmUpdateProducto.setText("ACTUALIZAR");
        itmUpdateProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmUpdateProductoActionPerformed(evt);
            }
        });
        productoMenu.add(itmUpdateProducto);

        itmDeleateProducto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        itmDeleateProducto.setMnemonic('x');
        itmDeleateProducto.setText("ELIMINAR");
        itmDeleateProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmDeleateProductoActionPerformed(evt);
            }
        });
        productoMenu.add(itmDeleateProducto);

        itmListarProducto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        itmListarProducto.setText("LISTAR");
        itmListarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmListarProductoActionPerformed(evt);
            }
        });
        productoMenu.add(itmListarProducto);

        menuBar.add(productoMenu);

        facturaMenu.setText("Factura");

        itmCreateFactura.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        itmCreateFactura.setMnemonic('o');
        itmCreateFactura.setText("CREAR");
        itmCreateFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCreateFacturaActionPerformed(evt);
            }
        });
        facturaMenu.add(itmCreateFactura);

        itmReadFactura.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        itmReadFactura.setMnemonic('s');
        itmReadFactura.setText("LEER");
        itmReadFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmReadFacturaActionPerformed(evt);
            }
        });
        facturaMenu.add(itmReadFactura);

        itmDeleateFactura.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        itmDeleateFactura.setMnemonic('x');
        itmDeleateFactura.setText("ELIMINAR");
        itmDeleateFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmDeleateFacturaActionPerformed(evt);
            }
        });
        facturaMenu.add(itmDeleateFactura);

        itmListarFactura.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        itmListarFactura.setText("LISTAR");
        itmListarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmListarFacturaActionPerformed(evt);
            }
        });
        facturaMenu.add(itmListarFactura);

        menuBar.add(facturaMenu);

        facturaMenu2.setText("Reservacion");

        itmCreateReservacion2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        itmCreateReservacion2.setMnemonic('o');
        itmCreateReservacion2.setText("CREAR");
        itmCreateReservacion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCreateReservacion2ActionPerformed(evt);
            }
        });
        facturaMenu2.add(itmCreateReservacion2);

        itmReadReservacion2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        itmReadReservacion2.setMnemonic('s');
        itmReadReservacion2.setText("LEER");
        itmReadReservacion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmReadReservacion2ActionPerformed(evt);
            }
        });
        facturaMenu2.add(itmReadReservacion2);

        itmUpdateReservacion2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        itmUpdateReservacion2.setMnemonic('a');
        itmUpdateReservacion2.setText("ACTUALIZAR");
        itmUpdateReservacion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmUpdateReservacion2ActionPerformed(evt);
            }
        });
        facturaMenu2.add(itmUpdateReservacion2);

        itmDeleateReservacion2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        itmDeleateReservacion2.setMnemonic('x');
        itmDeleateReservacion2.setText("ELIMINAR");
        itmDeleateReservacion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmDeleateReservacion2ActionPerformed(evt);
            }
        });
        facturaMenu2.add(itmDeleateReservacion2);

        itmListarReservacion2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        itmListarReservacion2.setText("LISTAR");
        itmListarReservacion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmListarReservacion2ActionPerformed(evt);
            }
        });
        facturaMenu2.add(itmListarReservacion2);

        menuBar.add(facturaMenu2);

        EmpleadoMenu1.setMnemonic('f');
        EmpleadoMenu1.setText("Empleado");

        itmCreateEmpleado.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        itmCreateEmpleado.setMnemonic('o');
        itmCreateEmpleado.setText("CREAR");
        itmCreateEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCreateEmpleadoActionPerformed(evt);
            }
        });
        EmpleadoMenu1.add(itmCreateEmpleado);

        itmReadrEmpleado.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        itmReadrEmpleado.setMnemonic('s');
        itmReadrEmpleado.setText("LEER");
        itmReadrEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmReadrEmpleadoActionPerformed(evt);
            }
        });
        EmpleadoMenu1.add(itmReadrEmpleado);

        itmUpdateEmpleado.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        itmUpdateEmpleado.setMnemonic('a');
        itmUpdateEmpleado.setText("ACTUALIZAR");
        itmUpdateEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmUpdateEmpleadoActionPerformed(evt);
            }
        });
        EmpleadoMenu1.add(itmUpdateEmpleado);

        itmDeleateEmpleado.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        itmDeleateEmpleado.setMnemonic('x');
        itmDeleateEmpleado.setText("ELIMINAR");
        itmDeleateEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmDeleateEmpleadoActionPerformed(evt);
            }
        });
        EmpleadoMenu1.add(itmDeleateEmpleado);

        itmListarEmpleado.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        itmListarEmpleado.setText("LISTAR");
        itmListarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmListarEmpleadoActionPerformed(evt);
            }
        });
        EmpleadoMenu1.add(itmListarEmpleado);

        menuBar.add(EmpleadoMenu1);

        idiomaMenu.setText("Idiomas");

        itmEspanolFactura1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        itmEspanolFactura1.setMnemonic('o');
        itmEspanolFactura1.setText("Español");
        itmEspanolFactura1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmEspanolFactura1ActionPerformed(evt);
            }
        });
        idiomaMenu.add(itmEspanolFactura1);

        itmInglesFactura1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        itmInglesFactura1.setMnemonic('s');
        itmInglesFactura1.setText("Ingles");
        itmInglesFactura1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmInglesFactura1ActionPerformed(evt);
            }
        });
        idiomaMenu.add(itmInglesFactura1);

        menuBar.add(idiomaMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1003, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itmDeleateClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmDeleateClienteActionPerformed
        EliminarCliente deleteCliente = new EliminarCliente(controladorCliente,mensajes);
        deleteCliente.setVisible(true);
        desktopPane.add(deleteCliente);
    }//GEN-LAST:event_itmDeleateClienteActionPerformed

    private void itmListarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmListarClienteActionPerformed
        ListarCliente listarCliente=new ListarCliente(controladorCliente,mensajes);
        listarCliente.setVisible(true);
        desktopPane.add(listarCliente);      
        
        
    }//GEN-LAST:event_itmListarClienteActionPerformed

    private void itmCreateClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCreateClienteActionPerformed
        // TODO add your handling code here:
        CrearCliente crearCliente = new CrearCliente(controladorCliente,mensajes);
        crearCliente.setVisible(true);
        desktopPane.add(crearCliente);

    }//GEN-LAST:event_itmCreateClienteActionPerformed

    private void itmReadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmReadClienteActionPerformed
        // TODO add your handling code here:
        BuscarCliente readCliente = new BuscarCliente(controladorCliente,mensajes);
        readCliente.setVisible(true);
        desktopPane.add(readCliente);
    }//GEN-LAST:event_itmReadClienteActionPerformed

    private void itmUpdateClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmUpdateClienteActionPerformed
        // TODO add your handling code here:
        ActualizarCliente updateCliente = new ActualizarCliente(controladorCliente,mensajes);
        updateCliente.setVisible(true);
        desktopPane.add(updateCliente);
    }//GEN-LAST:event_itmUpdateClienteActionPerformed

    private void itmCreateProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCreateProductoActionPerformed
        // TODO add your handling code here:
        CrearProducto crearProducto = new CrearProducto(controladorProducto,controladorFacturaDetalle,mensajes);
        crearProducto.setVisible(true);
        desktopPane.add(crearProducto);
    }//GEN-LAST:event_itmCreateProductoActionPerformed

    private void itmReadProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmReadProductoActionPerformed
        // TODO add your handling code here:
        BuscarProducto readProducto = new BuscarProducto(controladorProducto,mensajes);
        readProducto.setVisible(true);
        desktopPane.add(readProducto);
    }//GEN-LAST:event_itmReadProductoActionPerformed

    private void itmUpdateProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmUpdateProductoActionPerformed
        // TODO add your handling code here:
        ActualizarProductos updateProducto = new ActualizarProductos(controladorProducto,mensajes);
        updateProducto.setVisible(true);
        desktopPane.add(updateProducto);
    }//GEN-LAST:event_itmUpdateProductoActionPerformed

    private void itmDeleateProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmDeleateProductoActionPerformed
        // TODO add your handling code here:
        EliminarProducto deleteProducto = new EliminarProducto(controladorProducto,mensajes);
        deleteProducto.setVisible(true);
        desktopPane.add(deleteProducto);
    }//GEN-LAST:event_itmDeleateProductoActionPerformed

    private void itmListarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmListarProductoActionPerformed
        ListarProductos listarProducto=new ListarProductos(controladorProducto,mensajes);
        listarProducto.setVisible(true);
        desktopPane.add(listarProducto); 
       
    }//GEN-LAST:event_itmListarProductoActionPerformed

    private void itmEspanolFactura1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmEspanolFactura1ActionPerformed
       // TODO add your handling code here:
        localizacion=new Locale("es","EC");
        Locale.setDefault(localizacion);
        cambiarIdioma();        
    }//GEN-LAST:event_itmEspanolFactura1ActionPerformed

    private void itmInglesFactura1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmInglesFactura1ActionPerformed
        // TODO add your handling code here:
        
        localizacion=new Locale("en","US");
        Locale.setDefault(localizacion);
        cambiarIdioma();
    }//GEN-LAST:event_itmInglesFactura1ActionPerformed

    private void itmListarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmListarFacturaActionPerformed
        ListarFactura listarFacturas=new ListarFactura(controladorFactura);
        listarFacturas.setVisible(true);
        desktopPane.add(listarFacturas);

    }//GEN-LAST:event_itmListarFacturaActionPerformed

    private void itmDeleateFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmDeleateFacturaActionPerformed

    }//GEN-LAST:event_itmDeleateFacturaActionPerformed

    private void itmReadFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmReadFacturaActionPerformed
        BuscarFactura buscarFactura=new BuscarFactura(controladorFactura, controladorCliente, controladorProducto, controladorFacturaDetalle);
        buscarFactura.setVisible(true);
        desktopPane.add(buscarFactura);
    }//GEN-LAST:event_itmReadFacturaActionPerformed

    private void itmCreateFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCreateFacturaActionPerformed
        // TODO add your handling code here:
        CrearFactura crearFactura = new CrearFactura(controladorFactura, controladorCliente,controladorProducto,controladorFacturaDetalle,controladorReservacion);
        crearFactura.setVisible(true);
        desktopPane.add(crearFactura);
    }//GEN-LAST:event_itmCreateFacturaActionPerformed

    private void itmCreateEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCreateEmpleadoActionPerformed
        // TODO add your handling code here:
        CrearEmpleado crearEmpleado=new CrearEmpleado(controadorEmpleado,mensajes);
        crearEmpleado.setVisible(true);
        desktopPane.add(crearEmpleado);
        
    }//GEN-LAST:event_itmCreateEmpleadoActionPerformed

    private void itmReadrEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmReadrEmpleadoActionPerformed
        // TODO add your handling code here:
        BuscarEmpleado buscarEmpleado=new BuscarEmpleado(controadorEmpleado,mensajes);
        buscarEmpleado.setVisible(true);
        desktopPane.add(buscarEmpleado);
    }//GEN-LAST:event_itmReadrEmpleadoActionPerformed

    private void itmUpdateEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmUpdateEmpleadoActionPerformed
        // TODO add your handling code here:
        ActualizarEmpleado actualizarEmpleado=new ActualizarEmpleado(controadorEmpleado,mensajes);
        actualizarEmpleado.setVisible(true);
        desktopPane.add(actualizarEmpleado);
    }//GEN-LAST:event_itmUpdateEmpleadoActionPerformed

    private void itmDeleateEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmDeleateEmpleadoActionPerformed
        // TODO add your handling code here:
        EliminarEmpleado eliminarEmpleado=new EliminarEmpleado(controadorEmpleado,mensajes);
        eliminarEmpleado.setVisible(true);
        desktopPane.add(eliminarEmpleado);
    }//GEN-LAST:event_itmDeleateEmpleadoActionPerformed

    private void itmListarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmListarEmpleadoActionPerformed
        // TODO add your handling code here:
        ListarEmpleado listarEmpleado =new ListarEmpleado(controadorEmpleado,mensajes);
        listarEmpleado.setVisible(true);
        desktopPane.add(listarEmpleado);
    }//GEN-LAST:event_itmListarEmpleadoActionPerformed

    private void itmCreateReservacion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCreateReservacion2ActionPerformed
        CrearReservacion crearReservacion=new CrearReservacion(controladorReservacion,mensajes);
        crearReservacion.setVisible(true);
        desktopPane.add(crearReservacion);
    }//GEN-LAST:event_itmCreateReservacion2ActionPerformed

    private void itmReadReservacion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmReadReservacion2ActionPerformed
        // TODO add your handling code here:
        BuscarReservacion buscar = new BuscarReservacion(controladorReservacion,mensajes);
        buscar.setVisible(true);
        desktopPane.add(buscar);
    }//GEN-LAST:event_itmReadReservacion2ActionPerformed

    private void itmUpdateReservacion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmUpdateReservacion2ActionPerformed
        // TODO add your handling code here:
        ActualizarReservacion actualizarReservacion=new ActualizarReservacion(controladorReservacion,mensajes);
        actualizarReservacion.setVisible(true);
        desktopPane.add(actualizarReservacion);
    }//GEN-LAST:event_itmUpdateReservacion2ActionPerformed

    private void itmDeleateReservacion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmDeleateReservacion2ActionPerformed
        // TODO add your handling code here:
        EliminarReservacion eliminarReservacion=new EliminarReservacion(controladorReservacion,mensajes);
        eliminarReservacion.setVisible(true);
        desktopPane.add(eliminarReservacion);
    }//GEN-LAST:event_itmDeleateReservacion2ActionPerformed

    private void itmListarReservacion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmListarReservacion2ActionPerformed
        // TODO add your handling code here:
        LIstarReservacion listarReservacion=new LIstarReservacion(controladorReservacion,mensajes);
        listarReservacion.setVisible(true);
        desktopPane.add(listarReservacion);

    }//GEN-LAST:event_itmListarReservacion2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu EmpleadoMenu1;
    private javax.swing.JMenu clienteMenu;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu facturaMenu;
    private javax.swing.JMenu facturaMenu2;
    private javax.swing.JMenu idiomaMenu;
    private javax.swing.JMenuItem itmCreateCliente;
    private javax.swing.JMenuItem itmCreateEmpleado;
    private javax.swing.JMenuItem itmCreateFactura;
    private javax.swing.JMenuItem itmCreateProducto;
    private javax.swing.JMenuItem itmCreateReservacion2;
    private javax.swing.JMenuItem itmDeleateCliente;
    private javax.swing.JMenuItem itmDeleateEmpleado;
    private javax.swing.JMenuItem itmDeleateFactura;
    private javax.swing.JMenuItem itmDeleateProducto;
    private javax.swing.JMenuItem itmDeleateReservacion2;
    private javax.swing.JMenuItem itmEspanolFactura1;
    private javax.swing.JMenuItem itmInglesFactura1;
    private javax.swing.JMenuItem itmListarCliente;
    private javax.swing.JMenuItem itmListarEmpleado;
    private javax.swing.JMenuItem itmListarFactura;
    private javax.swing.JMenuItem itmListarProducto;
    private javax.swing.JMenuItem itmListarReservacion2;
    private javax.swing.JMenuItem itmReadCliente;
    private javax.swing.JMenuItem itmReadFactura;
    private javax.swing.JMenuItem itmReadProducto;
    private javax.swing.JMenuItem itmReadReservacion2;
    private javax.swing.JMenuItem itmReadrEmpleado;
    private javax.swing.JMenuItem itmUpdateCliente;
    private javax.swing.JMenuItem itmUpdateEmpleado;
    private javax.swing.JMenuItem itmUpdateProducto;
    private javax.swing.JMenuItem itmUpdateReservacion2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu productoMenu;
    // End of variables declaration//GEN-END:variables

}
