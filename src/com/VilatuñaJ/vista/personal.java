/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.VilatuñaJ.vista;

import com.VilatuñaJ.controlador.controlador;
import com.VilatuñaJ.modelo.persona;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author UseR
 */
public class personal extends javax.swing.JFrame {
    DefaultTableModel dtm=new DefaultTableModel();
    controlador con=new controlador();
    /**
     * Creates new form personal
     */
    public personal() {
        initComponents();
        String[] titulos=new String[]{"Cédula","Nombre","Apellido","Fecha de Nacimiento","Teléfono","E-mail","Carga Horaria"};
        dtm.setColumnIdentifiers(titulos);
        tblDatos.setModel(dtm);
        activar(false);
    }
    
    public void activar(boolean k){
        btnActualizar.setEnabled(k);
        btnEliminar.setEnabled(k);
        btnLimpiar.setEnabled(k);
        btnBuscar.setEnabled(k);
        btnTam.setEnabled(k);
        btnGenerar.setEnabled(k);
    }
    
    public void agregar(){
        con.setAgregar(new persona(txtCi.getText(),txtNombre.getText(),
            txtApellido.getText(),txtFecha.getText(),txtTelefono.getText(),txtEmail.getText(),
            txtCarga.getText()));
        dtm.addRow(new Object[]{txtCi.getText(),txtNombre.getText(),
            txtApellido.getText(),txtFecha.getText(),txtTelefono.getText(),txtEmail.getText(),
            txtCarga.getText()});    
    }
    
    public void eliminar(){
        int fila=tblDatos.getSelectedRow();
        dtm.removeRow(fila);
    }
    
    public void actualizar(){
        int fila= tblDatos.getSelectedRow();
        dtm.setValueAt(txtCi.getText(), fila, 0);
        dtm.setValueAt(txtNombre.getText(), fila, 1);
        dtm.setValueAt(txtApellido.getText(), fila, 2);
        dtm.setValueAt(txtFecha.getText(), fila, 3);
        dtm.setValueAt(txtTelefono.getText(), fila, 4);
        dtm.setValueAt(txtEmail.getText(), fila, 5);
        dtm.setValueAt(txtCarga.getText(), fila, 6);
    }
    
    public void limpiar(){
        txtCi.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtFecha.setText("");
       txtTelefono.setText("");
        txtEmail.setText("");
        txtCarga.setText("");
    }
    
    public void limpiarTabla(){
        int fila= tblDatos.getRowCount();
        for (int i=fila-1 ; i>=0; i--) {
            dtm.removeRow(i);
        }
        con.eliminar();
    }
    
    public void llenarTexto(){
        int col=tblDatos.getSelectedRow();
        txtCi.setText(tblDatos.getModel().getValueAt(col,0).toString());
        txtNombre.setText(tblDatos.getModel().getValueAt(col,1).toString());
        txtApellido.setText(tblDatos.getModel().getValueAt(col,2).toString());
        txtFecha.setText(tblDatos.getModel().getValueAt(col,3).toString());
        txtTelefono.setText(tblDatos.getModel().getValueAt(col,4).toString());
        txtEmail.setText(tblDatos.getModel().getValueAt(col,5).toString());
        txtCarga.setText(tblDatos.getModel().getValueAt(col,6).toString());
    }
    
    public void validarNumeros(java.awt.event.KeyEvent evt){
        char c=evt.getKeyChar();
        if(c<'0'||c>'9'){
            evt.consume();
        } 
    }
    
    public void validarLetras(java.awt.event.KeyEvent evt){
        char c=evt.getKeyChar();
        if((c<'a'||c>'z')&&(c<'A'||c>'Z')){
            evt.consume();
        }
    }
    
    public void buscar(){
        /*String[] titulos={"Cédula","Nombre","Apellido","Dirección","Fecha de Nacimiento","E-mail"};
        String[] registros = new String[50];

            String sql = "SELECT *FROM empleados WHERE empl_cedula LIKE '%" + txtBuscar.getText() + "%' "
                    + "OR empl_nombre LIKE '%" + txtBuscar.getText() + "%'"
                    + "OR empl_mail LIKE '%" + txtBuscar.getText() + "%'"
                    + "OR empl_extension LIKE '%" + txtBuscar.getText() + "%'"
                    + "OR empl_fecha_inicio LIKE '%" + txtBuscar.getText() + "%'"
                    + "OR empl_fecha_fin LIKE '%" + txtBuscar.getText() + "%'";
            dtm = new DefaultTableModel(null, titulos);
            Conectar cc = new Conectar();
            Connection conect = cc.conexion();
            try {
                Statement st = (Statement) conect.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    registros[0] = rs.getString("empl_cedula");
                    registros[1] = rs.getString("empl_nombre");
                    registros[2] = rs.getString("empl_mail");
                    registros[3] = rs.getString("empl_extension");
                    registros[4] = rs.getString("empl_fecha_inicio");
                    registros[5] = rs.getString("empl_fecha_fin");
                    dtm.addRow(registros);
                }
                tblDatos.setModel(dtm);

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }*/
        String valor=txtBuscar.getText();
        for (int i = 0; i < tblDatos.getRowCount(); i++) {
            if(tblDatos.getValueAt(i, 0).equals(valor)){
                tblDatos.changeSelection(i, 0, false, false);
            }
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbnCi = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbnApellido = new javax.swing.JLabel();
        lbnFecha = new javax.swing.JLabel();
        lbnEmail = new javax.swing.JLabel();
        lbnTelefono = new javax.swing.JLabel();
        lbnCarga = new javax.swing.JLabel();
        txtCi = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtCarga = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnIngreso = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnTam = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        btnGenerar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Calisto MT", 2, 24)); // NOI18N
        jLabel1.setText("DATOS DE LOS DOCENTES");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbnCi.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbnCi.setText("CI:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setText("NOMBRE:");

        lbnApellido.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbnApellido.setText("APELLIDO:");

        lbnFecha.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbnFecha.setText("FECHA DE NACIMIENTO:");

        lbnEmail.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbnEmail.setText("E-MAIL:");

        lbnTelefono.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbnTelefono.setText("TÉLEFONO");

        lbnCarga.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbnCarga.setText("CARGA HORARIA:");

        txtCi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCiKeyTyped(evt);
            }
        });

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });

        txtFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFechaKeyTyped(evt);
            }
        });

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailKeyTyped(evt);
            }
        });

        txtCarga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCargaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbnCi)
                    .addComponent(lbnEmail)
                    .addComponent(lbnTelefono)
                    .addComponent(lbnFecha)
                    .addComponent(lbnApellido)
                    .addComponent(jLabel3)
                    .addComponent(lbnCarga))
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                    .addComponent(txtApellido)
                    .addComponent(txtFecha)
                    .addComponent(txtEmail)
                    .addComponent(txtCi, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbnCi)
                    .addComponent(txtCi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbnApellido)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbnFecha)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbnTelefono)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbnEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbnCarga)
                    .addComponent(txtCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnIngreso.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnIngreso.setText("INGRESO");
        btnIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresoActionPerformed(evt);
            }
        });

        btnActualizar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnTam.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnTam.setText("TAMAÑO DE ARREGLO");
        btnTam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTamActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(255, 0, 0));
        btnSalir.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIngreso)
                    .addComponent(btnActualizar)
                    .addComponent(btnEliminar)
                    .addComponent(btnLimpiar)
                    .addComponent(btnTam))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnIngreso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnActualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTam)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addContainerGap())
        );

        tblDatos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblDatos.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tblDatos = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex,int colIndex){
                return false;
            }
        };
        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDatos);

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtBuscar.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtBuscarCaretUpdate(evt);
            }
        });

        btnGenerar.setText("GENERAR DOCUMENTO");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(btnBuscar)
                        .addGap(32, 32, 32)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnGenerar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGenerar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresoActionPerformed
        // TODO add your handling code here:
        if(txtApellido.getText().isEmpty()||txtCi.getText().isEmpty()||txtCarga.getText().isEmpty()||
                txtEmail.getText().isEmpty()||txtFecha.getText().isEmpty()||
                txtNombre.getText().isEmpty()||txtTelefono.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Estos campos no debe estar vacio o incompleta,"
                    + "\ningrese la información correctamente","", 
                JOptionPane.ERROR_MESSAGE);
        }else{
            agregar();
            limpiar();
            activar(true);
        }
    }//GEN-LAST:event_btnIngresoActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        if(txtApellido.getText().isEmpty()||txtCi.getText().isEmpty()||txtCarga.getText().isEmpty()||
                txtEmail.getText().isEmpty()||txtFecha.getText().isEmpty()||
                txtNombre.getText().isEmpty()||txtTelefono.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Estos campos no debe estar vacio o incompleto,"
                    + "\ningrese la información correctamente","", 
                JOptionPane.ERROR_MESSAGE);
        }else{
            actualizar();
            limpiar();
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        eliminar();
        limpiar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        limpiarTabla();
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnTamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTamActionPerformed
        // TODO add your handling code here:
        con.imprimir();
    }//GEN-LAST:event_btnTamActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        txtBuscar.setText("");
        JOptionPane.showMessageDialog(null, con.buscar(JOptionPane.showInputDialog("Ingrese el apellido").toString()));
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        // TODO add your handling code here:
        con.generar();
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void txtCiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCiKeyTyped
        // TODO add your handling code here:
        validarNumeros(evt);
        if(txtCi.getText().length()==10){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtCiKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // TODO add your handling code here:
        validarLetras(evt);
        if(txtNombre.getText().length()>=20){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        // TODO add your handling code here:
        validarLetras(evt);
        if(txtNombre.getText().length()>=20){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void txtFechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaKeyTyped
        // TODO add your handling code here:
        if(txtFecha.getText().length()>=20){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtFechaKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        // TODO add your handling code here:
        validarNumeros(evt);
        if(txtTelefono.getText().length()>=10){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyTyped
        // TODO add your handling code here:
        if(txtEmail.getText().length()>=80){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtEmailKeyTyped

    private void txtCargaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCargaKeyTyped
        // TODO add your handling code here:
        validarNumeros(evt);
        if(txtCarga.getText().length()>=2){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtCargaKeyTyped

    private void tblDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDatosMouseClicked
        // TODO add your handling code here:
        limpiar();
        llenarTexto();
    }//GEN-LAST:event_tblDatosMouseClicked

    private void txtBuscarCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtBuscarCaretUpdate
        // TODO add your handling code here:
        buscar();
    }//GEN-LAST:event_txtBuscarCaretUpdate

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
            java.util.logging.Logger.getLogger(personal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(personal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(personal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(personal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new personal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnIngreso;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbnApellido;
    private javax.swing.JLabel lbnCarga;
    private javax.swing.JLabel lbnCi;
    private javax.swing.JLabel lbnEmail;
    private javax.swing.JLabel lbnFecha;
    private javax.swing.JLabel lbnTelefono;
    private javax.swing.JTable tblDatos;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCarga;
    private javax.swing.JTextField txtCi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
