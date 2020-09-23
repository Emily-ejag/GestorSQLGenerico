/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jeffer
 */
public class MostrarTabla extends javax.swing.JDialog {

    /**
     * Creates new form NewJDialog
     * @param parent
     * @param modal
     * @param nombreTabla
     */

    public MostrarTabla(java.awt.Frame parent, boolean modal,String nombreTabla) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        lNombreTabla.setText(nombreTabla);
    }
    
    public void generarTabla(String campos) {
        DefaultTableModel modelo = new DefaultTableModel(null,campos.split(",")){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        
        this.tCampos.setModel(modelo);
        
        /*this.tSalida.getSelectionModel().addListSelectionListener(
            new ListSelectionListener(){
                @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    nombreTabla = (String) tSalida.getModel().getValueAt(
                            tSalida.getSelectedRow(), 0);
                    bMostrar.setEnabled(true);
                }
            }
            }
        );*/
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lNombreTabla = new javax.swing.JLabel();
        btnEditarCampo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tCampos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lNombreTabla.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        lNombreTabla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lNombreTabla.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnEditarCampo.setText("Editar");
        btnEditarCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarCampoActionPerformed(evt);
            }
        });

        tCampos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tCampos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lNombreTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnEditarCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lNombreTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditarCampo)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCampoActionPerformed
        
        EdicionCampo edicionCampo = new EdicionCampo(new javax.swing.JFrame(), true,lNombreTabla.getText(),jScrollPane1);
        edicionCampo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnEditarCampoActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditarCampo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lNombreTabla;
    private javax.swing.JTable tCampos;
    // End of variables declaration//GEN-END:variables
}