/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableCellRenderer;
import org.jdesktop.observablecollections.ObservableList;
//import org.openmarkov.core.model.network.ProbNode;

/**
 *
 * @author jorge
 */
public class vistaRB extends javax.swing.JFrame {

    /**
     * Creates new form modulo2
     */
    public vistaRB() {

        initComponents();
        //ExampleAPI ea = new ExampleAPI();
        //listobservable.addAll(ea.obtenerdatos());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnrun = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtClases = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtRelaciones = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtIndividuos = new javax.swing.JTextArea();
        imagePanel1 = new com.mycsistemas.swingec.panel.ImagePanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnrun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gear_run.png"))); // NOI18N
        btnrun.setText("Ejecutar");
        btnrun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrunActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/brush.png"))); // NOI18N
        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtClases.setColumns(20);
        txtClases.setRows(5);
        jScrollPane2.setViewportView(txtClases);

        txtRelaciones.setColumns(20);
        txtRelaciones.setRows(5);
        jScrollPane3.setViewportView(txtRelaciones);

        txtIndividuos.setColumns(20);
        txtIndividuos.setRows(5);
        jScrollPane4.setViewportView(txtIndividuos);

        imagePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cis.png"))); // NOI18N

        javax.swing.GroupLayout imagePanel1Layout = new javax.swing.GroupLayout(imagePanel1);
        imagePanel1.setLayout(imagePanel1Layout);
        imagePanel1Layout.setHorizontalGroup(
            imagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        imagePanel1Layout.setVerticalGroup(
            imagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 128, Short.MAX_VALUE)
        );

        jLabel1.setText("CLASES");

        jLabel2.setText("RELACIONES");

        jLabel3.setText("INDIVIDUOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(imagePanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnrun)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(228, 228, 228)))))
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(218, 218, 218)
                .addComponent(jLabel3)
                .addGap(107, 107, 107))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(imagePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnrun)
                    .addComponent(jButton1))
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnrunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrunActionPerformed
        WebSemantica w = new WebSemantica();
        w.obtenerDatos();
        String s = "";
        txtClases.setText("");

        for (int i = 0; i < WebSemantica.listaclases.size(); i++) {
            s = s + WebSemantica.listaclases.get(i) + "\n";
            txtClases.setText(s);
        }
        s = "";
        for (int i = 0; i < WebSemantica.listaRelaciones.size(); i++) {
            s = s + WebSemantica.listaRelaciones.get(i) + "\n";
            txtRelaciones.setText(s);
        }
        s = "";
        for (int i = 0; i < WebSemantica.listaindividuos.size(); i++) {
            s = s + WebSemantica.listaindividuos.get(i) + "\n";
            txtIndividuos.setText(s);
        }
        WebSemantica.listaRelaciones.clear();
        WebSemantica.listaclases.clear();
        WebSemantica.listaindividuos.clear();
    }//GEN-LAST:event_btnrunActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        WebSemantica.listaRelaciones.clear();
        WebSemantica.listaclases.clear();
        WebSemantica.listaindividuos.clear();
        txtClases.setText(null);
        txtRelaciones.setText(null);
        txtIndividuos.setText(null);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(vistaRB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaRB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaRB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaRB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaRB().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnrun;
    private com.mycsistemas.swingec.panel.ImagePanel imagePanel1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea txtClases;
    private javax.swing.JTextArea txtIndividuos;
    private javax.swing.JTextArea txtRelaciones;
    // End of variables declaration//GEN-END:variables
    private List<String> listnodo = new ArrayList();
    //private List<ProbNode> listnodo = new ArrayList();
    private ObservableList<String> listobservable = org.jdesktop.observablecollections.ObservableCollections.observableList(listnodo);

    public List<String> getListnodo() {
        return listnodo;
    }

    public void setListnodo(List<String> listnodo) {
        this.listnodo = listnodo;
    }

    public ObservableList<String> getListobservable() {
        return listobservable;
    }

    public void setListobservable(ObservableList<String> listobservable) {
        this.listobservable = listobservable;
    }
}
