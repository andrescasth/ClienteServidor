/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package InterfazProyecto;

import com.mycompany.proyectoclienteservidor.Alojamiento;
import com.mycompany.proyectoclienteservidor.Pais;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author andre
 */
public class Alojamientos extends javax.swing.JFrame {

    /**
     * Creates new form Alojamientos
     */
    DefaultTableModel mt = new DefaultTableModel();
    public Alojamientos() {
        initComponents();
        
        String sqlPaises = "SELECT * FROM t_alojamientos";
        
        Connection nuevaConexion; 
        
        
        
        
        // Paises
        try {
            nuevaConexion = DriverManager.getConnection("jdbc:mysql://localhost/paises?serverTimezone=UTC", "root","Rojo2001.");

        Statement st;
        String ids[] = {"Pais","Ciudad", "Precio","Cantidad"};
        mt.setColumnIdentifiers(ids);
        
        jTable2.setModel(mt);
        
        String[] dato = new String[4];
        
            st = nuevaConexion.createStatement();
            
            ResultSet result = st.executeQuery(sqlPaises);
            
            while(result.next()){
                dato[0]= result.getString(2);
                dato[1]= result.getString(3);
                dato[2]= result.getString(4);
                dato[3]= result.getString(5);
                
                
                mt.addRow(dato);
            }
        } catch (SQLException ex) {
            Logger.getLogger(HomeAdmin.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel3 = new javax.swing.JPanel();
        btnCerrarAlojamiento = new javax.swing.JButton();
        btnBorrarAlojamiento = new javax.swing.JButton();
        btnActualizarAlojamiento = new javax.swing.JButton();
        btnAgregarAlojameinto = new javax.swing.JButton();
        txtAlojamientoPais = new javax.swing.JTextField();
        lblPaisAgregar1 = new javax.swing.JLabel();
        lblTipoAgregar1 = new javax.swing.JLabel();
        lblPrecioAgregar1 = new javax.swing.JLabel();
        txtPrecioAlojamiento = new javax.swing.JTextField();
        lblFechaAgregar1 = new javax.swing.JLabel();
        txtPersonasAlojamiento = new javax.swing.JTextField();
        txtCiudadAlojamiento = new javax.swing.JTextField();
        txtAlojamientoPais1 = new javax.swing.JTextField();
        lblPaisAgregar2 = new javax.swing.JLabel();
        lblTipoAgregar2 = new javax.swing.JLabel();
        txtCiudadAlojamiento1 = new javax.swing.JTextField();
        btnActualizarAlojamiento1 = new javax.swing.JButton();
        btnAgregarAlojameinto1 = new javax.swing.JButton();
        txtPrecioAlojamiento1 = new javax.swing.JTextField();
        lblPrecioAgregar2 = new javax.swing.JLabel();
        btnBorrarAlojamiento1 = new javax.swing.JButton();
        btnCerrarAlojamiento1 = new javax.swing.JButton();
        txtPersonasAlojamiento1 = new javax.swing.JTextField();
        lblFechaAgregar2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        txtAlojamientoPais2 = new javax.swing.JTextField();
        lblPaisAgregar3 = new javax.swing.JLabel();
        lblTipoAgregar3 = new javax.swing.JLabel();
        txtCiudadAlojamiento2 = new javax.swing.JTextField();
        btnActualizarAlojamiento2 = new javax.swing.JButton();
        btnAgregarAlojameinto2 = new javax.swing.JButton();
        txtPrecioAlojamiento2 = new javax.swing.JTextField();
        lblPrecioAgregar3 = new javax.swing.JLabel();
        btnBorrarAlojamiento2 = new javax.swing.JButton();
        btnCerrarAlojamiento2 = new javax.swing.JButton();
        txtPersonasAlojamiento2 = new javax.swing.JTextField();
        lblFechaAgregar3 = new javax.swing.JLabel();
        txtIDAlojamiento = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        btnCerrarAlojamiento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCerrarAlojamiento.setText("Cerrar");

        btnBorrarAlojamiento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBorrarAlojamiento.setText("Borrar");
        btnBorrarAlojamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarAlojamientoActionPerformed(evt);
            }
        });

        btnActualizarAlojamiento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnActualizarAlojamiento.setText("Actualizar");
        btnActualizarAlojamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarAlojamientoActionPerformed(evt);
            }
        });

        btnAgregarAlojameinto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAgregarAlojameinto.setText("Agregar");
        btnAgregarAlojameinto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAlojameintoActionPerformed(evt);
            }
        });

        txtAlojamientoPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlojamientoPaisActionPerformed(evt);
            }
        });

        lblPaisAgregar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPaisAgregar1.setText("Pais");

        lblTipoAgregar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTipoAgregar1.setText("Ciudad");

        lblPrecioAgregar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPrecioAgregar1.setText("Precio");

        lblFechaAgregar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFechaAgregar1.setText("Fecha");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(txtCiudadAlojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(324, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtAlojamientoPais, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblPaisAgregar1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(29, 29, 29)
                                    .addComponent(btnActualizarAlojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(38, 38, 38)
                                    .addComponent(lblTipoAgregar1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(btnAgregarAlojameinto, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(51, 51, 51)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtPrecioAlojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblPrecioAgregar1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBorrarAlojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtPersonasAlojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblFechaAgregar1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCerrarAlojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap()))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(279, 279, 279)
                .addComponent(txtCiudadAlojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(324, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(244, 244, 244)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblPrecioAgregar1)
                                .addComponent(lblFechaAgregar1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtPersonasAlojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPrecioAlojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblPaisAgregar1)
                                .addComponent(lblTipoAgregar1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtAlojamientoPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCerrarAlojamiento)
                        .addComponent(btnActualizarAlojamiento)
                        .addComponent(btnAgregarAlojameinto)
                        .addComponent(btnBorrarAlojamiento))
                    .addGap(244, 244, 244)))
        );

        txtAlojamientoPais1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlojamientoPais1ActionPerformed(evt);
            }
        });

        lblPaisAgregar2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPaisAgregar2.setText("Pais");

        lblTipoAgregar2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTipoAgregar2.setText("Ciudad");

        btnActualizarAlojamiento1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnActualizarAlojamiento1.setText("Actualizar");
        btnActualizarAlojamiento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarAlojamiento1ActionPerformed(evt);
            }
        });

        btnAgregarAlojameinto1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAgregarAlojameinto1.setText("Agregar");
        btnAgregarAlojameinto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAlojameinto1ActionPerformed(evt);
            }
        });

        lblPrecioAgregar2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPrecioAgregar2.setText("Precio");

        btnBorrarAlojamiento1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBorrarAlojamiento1.setText("Borrar");
        btnBorrarAlojamiento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarAlojamiento1ActionPerformed(evt);
            }
        });

        btnCerrarAlojamiento1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCerrarAlojamiento1.setText("Cerrar");

        lblFechaAgregar2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFechaAgregar2.setText("Fecha");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("¡Bienvenido Admin!");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Pais", "Ciudad", "Precio", "Cantidad de Personas"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        txtAlojamientoPais2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlojamientoPais2ActionPerformed(evt);
            }
        });

        lblPaisAgregar3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPaisAgregar3.setText("Pais");

        lblTipoAgregar3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTipoAgregar3.setText("Ciudad");

        btnActualizarAlojamiento2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnActualizarAlojamiento2.setText("Actualizar");
        btnActualizarAlojamiento2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarAlojamiento2ActionPerformed(evt);
            }
        });

        btnAgregarAlojameinto2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAgregarAlojameinto2.setText("Agregar");
        btnAgregarAlojameinto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAlojameinto2ActionPerformed(evt);
            }
        });

        lblPrecioAgregar3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPrecioAgregar3.setText("Precio");

        btnBorrarAlojamiento2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBorrarAlojamiento2.setText("Borrar");
        btnBorrarAlojamiento2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarAlojamiento2ActionPerformed(evt);
            }
        });

        btnCerrarAlojamiento2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCerrarAlojamiento2.setText("Cerrar");

        lblFechaAgregar3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFechaAgregar3.setText("Cantidad");

        jLabel2.setText("ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(21, 21, 21)
                                            .addComponent(lblPaisAgregar3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addContainerGap()
                                            .addComponent(txtAlojamientoPais2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(47, 47, 47)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblTipoAgregar3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtCiudadAlojamiento2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnActualizarAlojamiento2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(btnAgregarAlojameinto2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtIDAlojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(37, 37, 37)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblPrecioAgregar3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPrecioAlojamiento2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnBorrarAlojamiento2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnCerrarAlojamiento2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPersonasAlojamiento2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblFechaAgregar3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPaisAgregar3)
                    .addComponent(lblTipoAgregar3)
                    .addComponent(lblPrecioAgregar3)
                    .addComponent(lblFechaAgregar3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAlojamientoPais2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCiudadAlojamiento2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPersonasAlojamiento2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecioAlojamiento2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizarAlojamiento2)
                    .addComponent(btnAgregarAlojameinto2)
                    .addComponent(btnBorrarAlojamiento2)
                    .addComponent(btnCerrarAlojamiento2))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIDAlojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBorrarAlojamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarAlojamientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBorrarAlojamientoActionPerformed

    private void btnActualizarAlojamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarAlojamientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarAlojamientoActionPerformed

    private void btnAgregarAlojameintoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAlojameintoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarAlojameintoActionPerformed

    private void txtAlojamientoPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlojamientoPaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlojamientoPaisActionPerformed

    private void txtAlojamientoPais1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlojamientoPais1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlojamientoPais1ActionPerformed

    private void btnActualizarAlojamiento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarAlojamiento1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarAlojamiento1ActionPerformed

    private void btnAgregarAlojameinto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAlojameinto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarAlojameinto1ActionPerformed

    private void btnBorrarAlojamiento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarAlojamiento1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBorrarAlojamiento1ActionPerformed

    private void txtAlojamientoPais2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlojamientoPais2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlojamientoPais2ActionPerformed

    private void btnActualizarAlojamiento2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarAlojamiento2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarAlojamiento2ActionPerformed

    private void btnAgregarAlojameinto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAlojameinto2ActionPerformed
        Alojamiento alojamiento = new Alojamiento();

        alojamiento.setPais(txtAlojamientoPais2.getText());
        alojamiento.setCiudad(txtCiudadAlojamiento2.getText());
        alojamiento.setPrecio(Double.parseDouble(txtPrecioAlojamiento2.getText()));
        alojamiento.setCantidad(Integer.parseInt(txtPersonasAlojamiento2.getText()));

        mt.addRow(new Object[]{alojamiento.getPais(), alojamiento.getCiudad(), alojamiento.getPrecio(), alojamiento.getCantidad()});
        txtAlojamientoPais2.setText("");
        txtCiudadAlojamiento2.setText("");
        txtPrecioAlojamiento2.setText("");
        txtPersonasAlojamiento2.setText("");

        //BASES DE DATOS
        try{
            Connection nuevaConexion = DriverManager.getConnection("jdbc:mysql://localhost/paises?serverTimezone=UTC", "root","Rojo2001.");
            String comando = "INSERT INTO t_alojamientos( pais, ciudad, precio, cantidad)"
            + "VALUES(?,?,?,?)";

            PreparedStatement comandoPreparado = nuevaConexion.prepareStatement(comando);

            comandoPreparado.setString(1, alojamiento.getPais());
            comandoPreparado.setString(2, alojamiento.getCiudad());
            comandoPreparado.setDouble(3, alojamiento.getPrecio());
            comandoPreparado.setInt(4, alojamiento.getCantidad());

            comandoPreparado.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al conectar con la Base de Datos "+ex.getMessage());

        }
    }//GEN-LAST:event_btnAgregarAlojameinto2ActionPerformed

    private void btnBorrarAlojamiento2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarAlojamiento2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBorrarAlojamiento2ActionPerformed

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
            java.util.logging.Logger.getLogger(Alojamientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alojamientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alojamientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alojamientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alojamientos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarAlojamiento;
    private javax.swing.JButton btnActualizarAlojamiento1;
    private javax.swing.JButton btnActualizarAlojamiento2;
    private javax.swing.JButton btnAgregarAlojameinto;
    private javax.swing.JButton btnAgregarAlojameinto1;
    private javax.swing.JButton btnAgregarAlojameinto2;
    private javax.swing.JButton btnBorrarAlojamiento;
    private javax.swing.JButton btnBorrarAlojamiento1;
    private javax.swing.JButton btnBorrarAlojamiento2;
    private javax.swing.JButton btnCerrarAlojamiento;
    private javax.swing.JButton btnCerrarAlojamiento1;
    private javax.swing.JButton btnCerrarAlojamiento2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblFechaAgregar1;
    private javax.swing.JLabel lblFechaAgregar2;
    private javax.swing.JLabel lblFechaAgregar3;
    private javax.swing.JLabel lblPaisAgregar1;
    private javax.swing.JLabel lblPaisAgregar2;
    private javax.swing.JLabel lblPaisAgregar3;
    private javax.swing.JLabel lblPrecioAgregar1;
    private javax.swing.JLabel lblPrecioAgregar2;
    private javax.swing.JLabel lblPrecioAgregar3;
    private javax.swing.JLabel lblTipoAgregar1;
    private javax.swing.JLabel lblTipoAgregar2;
    private javax.swing.JLabel lblTipoAgregar3;
    private javax.swing.JTextField txtAlojamientoPais;
    private javax.swing.JTextField txtAlojamientoPais1;
    private javax.swing.JTextField txtAlojamientoPais2;
    private javax.swing.JTextField txtCiudadAlojamiento;
    private javax.swing.JTextField txtCiudadAlojamiento1;
    private javax.swing.JTextField txtCiudadAlojamiento2;
    private javax.swing.JTextField txtIDAlojamiento;
    private javax.swing.JTextField txtPersonasAlojamiento;
    private javax.swing.JTextField txtPersonasAlojamiento1;
    private javax.swing.JTextField txtPersonasAlojamiento2;
    private javax.swing.JTextField txtPrecioAlojamiento;
    private javax.swing.JTextField txtPrecioAlojamiento1;
    private javax.swing.JTextField txtPrecioAlojamiento2;
    // End of variables declaration//GEN-END:variables
}
