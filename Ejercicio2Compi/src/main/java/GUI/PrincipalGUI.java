/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Principal.Controlador;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Alex
 */
public class PrincipalGUI extends javax.swing.JFrame {

    private Controlador control;

    public PrincipalGUI(Controlador control) {
        initComponents();
        this.control = control;
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        analizar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaTexto = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ANALIZATEXT");
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new java.awt.GridLayout(3, 1));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jPanel4);

        analizar.setBackground(new java.awt.Color(0, 0, 0));
        analizar.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        analizar.setForeground(new java.awt.Color(255, 255, 255));
        analizar.setText("Analizar");
        analizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                analizarMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                analizarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                analizarMouseReleased(evt);
            }
        });
        analizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analizarActionPerformed(evt);
            }
        });
        jPanel1.add(analizar);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new java.awt.GridLayout(1, 2));
        jPanel1.add(jPanel2);

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        areaTexto.setBackground(new java.awt.Color(102, 102, 102));
        areaTexto.setColumns(20);
        areaTexto.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        areaTexto.setRows(5);
        jScrollPane2.setViewportView(areaTexto);

        getContentPane().add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new java.awt.GridLayout(1, 1));

        jLabel4.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel4.setText("   ");
        jPanel3.add(jLabel4);

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void analizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analizarActionPerformed
        control.analizar();
    }//GEN-LAST:event_analizarActionPerformed

    private void analizarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_analizarMousePressed

    }//GEN-LAST:event_analizarMousePressed

    private void analizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_analizarMouseClicked

    }//GEN-LAST:event_analizarMouseClicked

    private void analizarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_analizarMouseReleased

    }//GEN-LAST:event_analizarMouseReleased

    public JTextArea getAreaTexto() {
        return areaTexto;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton analizar;
    private javax.swing.JTextArea areaTexto;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
