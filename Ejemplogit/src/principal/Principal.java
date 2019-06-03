/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author RLCR
 */
public class Principal extends javax.swing.JFrame {


    public Principal() {
        initComponents();
        configurarRB();
    }
    
    public void configurarRB(){
        
        ButtonGroup mensajes=new ButtonGroup();
        mensajes.add(RD1);
        mensajes.add(RD2);
        mensajes.add(RD3);
        mensajes.add(RD4);
        
        RD1.setSelected(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        RD1 = new javax.swing.JRadioButton();
        RD2 = new javax.swing.JRadioButton();
        RD3 = new javax.swing.JRadioButton();
        RD4 = new javax.swing.JRadioButton();
        BtnAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RD1.setText("Ver showMessageDialog");
        jPanel1.add(RD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        RD2.setText("ver showInputDialog");
        jPanel1.add(RD2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        RD3.setText("ver showConfirmDialog");
        jPanel1.add(RD3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, 30));

        RD4.setText("ver showOprionDialog");
        jPanel1.add(RD4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        BtnAceptar.setText("Aceptar");
        BtnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 210, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAceptarActionPerformed
        
        if(RD1.isSelected()){
        JOptionPane.showMessageDialog(null, "RB1");
    }
         if(RD2.isSelected()){
         JOptionPane.showInputDialog(null, "RB2");    
         }
          if(RD3.isSelected()){
            JOptionPane.showConfirmDialog(null, "RB3");  
          }
           if(RD4.isSelected()){
               String[] rb= {"Opcion1","Opcion2","Opcion3"};
               JOptionPane.showOptionDialog(null, "RB4", "TITULO",0,0,null,rb,null);
           }
        
        
        
    }//GEN-LAST:event_BtnAceptarActionPerformed


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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAceptar;
    private javax.swing.JRadioButton RD1;
    private javax.swing.JRadioButton RD2;
    private javax.swing.JRadioButton RD3;
    private javax.swing.JRadioButton RD4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
