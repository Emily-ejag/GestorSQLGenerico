/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Datos.InicializadorArchivo;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author paul
 */
public class RecuperarDatos extends javax.swing.JFrame {

    private static String PATH_ARCHIVO = "archivos/META_BD.csv";
    /**
     * Creates new form RecuperarDatos
     */
    public RecuperarDatos() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    private void showVentanaPrincipal() throws IOException {
        Principal ventana = new Principal();
        ventana.setVisible(true);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        bAceptar = new javax.swing.JButton();
        bNuevos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);

        jLabel1.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel1.setText("¿Desea recuperar los datos anteriores?");

        bAceptar.setText("Aceptar");
        bAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAceptarActionPerformed(evt);
            }
        });

        bNuevos.setText("Nuevos");
        bNuevos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNuevosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(bAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(bNuevos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAceptar)
                    .addComponent(bNuevos))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAceptarActionPerformed
        
        try {
            this.dispose();
            if ( InicializadorArchivo.recuperarDatos(PATH_ARCHIVO) ) {
                JOptionPane.showMessageDialog(null, "Se ha recuperado los datos");
                
            } else {
                JOptionPane.showMessageDialog(null, "Se ha creado un nuevo archivo");
            }
            showVentanaPrincipal();
        } catch (IOException ex) {
            Logger.getLogger(RecuperarDatos.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }//GEN-LAST:event_bAceptarActionPerformed

    private void bNuevosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNuevosActionPerformed
        
        try {
            this.dispose();
            if ( InicializadorArchivo.sobreescribirDatos(PATH_ARCHIVO) ) {
                JOptionPane.showMessageDialog(null, "Se ha sobreescrito el archivo anterior", null, JOptionPane.PLAIN_MESSAGE);          
                
            } else {
                JOptionPane.showMessageDialog(null, "Se ha creado un nuevo archivo", null, JOptionPane.PLAIN_MESSAGE);   
            }
            showVentanaPrincipal();
        } catch (IOException ex) {
            Logger.getLogger(RecuperarDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bNuevosActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAceptar;
    private javax.swing.JButton bNuevos;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
