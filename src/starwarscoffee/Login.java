/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starwarscoffee;

/**
 *
 * @author ROG
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kolomUser = new javax.swing.JTextField();
        btnMasuk = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        kolomPass = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(kolomUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 250, -1));

        btnMasuk.setText("MASUK");
        btnMasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasukActionPerformed(evt);
            }
        });
        getContentPane().add(btnMasuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 90, -1));

        btnKeluar.setText("KELUAR");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });
        getContentPane().add(btnKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 90, -1));

        kolomPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kolomPassActionPerformed(evt);
            }
        });
        getContentPane().add(kolomPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 250, -1));

        jLabel1.setFont(new java.awt.Font("Tekton Pro Ext", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Silahkan Login User");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 220, 60));

        jLabel2.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Username");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\ROG\\Desktop\\backgroundDefault.jpg")); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kolomPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kolomPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kolomPassActionPerformed

    private void btnMasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasukActionPerformed
        FormKasir Laund = new FormKasir();
        Laund.setVisible(true);     
        this.dispose();
    }//GEN-LAST:event_btnMasukActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
    this.dispose();    }//GEN-LAST:event_btnKeluarActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnMasuk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField kolomPass;
    private javax.swing.JTextField kolomUser;
    // End of variables declaration//GEN-END:variables
}
