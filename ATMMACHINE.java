/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andreiana Mae
 */
public class ATMMACHINE extends javax.swing.JFrame {

    /**
     * Creates new form ATMMACHINE
     */
    public ATMMACHINE() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JInternalFrame1 = new javax.swing.JInternalFrame();
        TITLE1 = new javax.swing.JLabel();
        Full_Name = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        PiN = new javax.swing.JLabel();
        Pin = new javax.swing.JTextField();
        LOGIN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JInternalFrame1.setVisible(true);

        TITLE1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        TITLE1.setText("ATM TRANSACTION");

        Full_Name.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Full_Name.setText("Enter Full Name");

        Name.setText("jTextField1");

        PiN.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        PiN.setText("Enter Your Pin");

        Pin.setText("jTextField1");

        LOGIN.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        LOGIN.setText("LOG IN");
        LOGIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGINActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JInternalFrame1Layout = new javax.swing.GroupLayout(JInternalFrame1.getContentPane());
        JInternalFrame1.getContentPane().setLayout(JInternalFrame1Layout);
        JInternalFrame1Layout.setHorizontalGroup(
            JInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JInternalFrame1Layout.createSequentialGroup()
                .addGroup(JInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JInternalFrame1Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(Full_Name))
                    .addGroup(JInternalFrame1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(PiN))
                    .addGroup(JInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Pin, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(JInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JInternalFrame1Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JInternalFrame1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(TITLE1)
                                .addGap(9, 9, 9))))
                    .addGroup(JInternalFrame1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(LOGIN, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        JInternalFrame1Layout.setVerticalGroup(
            JInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JInternalFrame1Layout.createSequentialGroup()
                .addComponent(TITLE1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Full_Name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Pin, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PiN)
                .addGap(35, 35, 35)
                .addComponent(LOGIN, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LOGINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGINActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LOGINActionPerformed

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
            java.util.logging.Logger.getLogger(ATMMACHINE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ATMMACHINE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ATMMACHINE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ATMMACHINE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ATMMACHINE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Full_Name;
    private javax.swing.JInternalFrame JInternalFrame1;
    private javax.swing.JButton LOGIN;
    private javax.swing.JTextField Name;
    private javax.swing.JLabel PiN;
    private javax.swing.JTextField Pin;
    private javax.swing.JLabel TITLE1;
    // End of variables declaration//GEN-END:variables
}
