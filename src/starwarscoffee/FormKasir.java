package starwarscoffee;
import javax.swing.JOptionPane;
import com.sun.glass.events.KeyEvent;

public class FormKasir extends javax.swing.JFrame {

    private int bayar;

    /**
     * Creates new form FormKasir
     */
    public FormKasir() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        kolomPesanan = new javax.swing.JComboBox<>();
        kolomJumlah = new javax.swing.JTextField();
        kolomHarga = new javax.swing.JTextField();
        kolomTotal = new javax.swing.JTextField();
        kolomBayar = new javax.swing.JTextField();
        kolomKembali = new javax.swing.JTextField();
        btnReset = new javax.swing.JButton();
        btnHitung = new javax.swing.JButton();
        btnBayar = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        kolomReport = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tekton Pro Ext", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("STARWARS COFFEE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Perpetua Titling MT", 1, 13)); // NOI18N
        jLabel2.setText("PESANAN");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Perpetua Titling MT", 1, 13)); // NOI18N
        jLabel3.setText("JUMLAH");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Perpetua Titling MT", 1, 13)); // NOI18N
        jLabel4.setText("HARGA");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Perpetua Titling MT", 1, 13)); // NOI18N
        jLabel5.setText("TOTAL");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, -1, -1));

        jLabel6.setFont(new java.awt.Font("Perpetua Titling MT", 1, 13)); // NOI18N
        jLabel6.setText("BAYAR");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, -1, -1));

        jLabel7.setFont(new java.awt.Font("Perpetua Titling MT", 1, 13)); // NOI18N
        jLabel7.setText("KEMBALI");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, -1, -1));

        kolomPesanan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih Menu--", "Latte", "Cappuccino", "Frappuccino", "Mochaccino", "Flat White", "Espresso", "Americano", "" }));
        kolomPesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kolomPesananActionPerformed(evt);
            }
        });
        getContentPane().add(kolomPesanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 200, -1));

        kolomJumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kolomJumlahActionPerformed(evt);
            }
        });
        kolomJumlah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                kolomJumlahKeyTyped(evt);
            }
        });
        getContentPane().add(kolomJumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 120, -1));

        kolomHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kolomHargaActionPerformed(evt);
            }
        });
        getContentPane().add(kolomHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 120, -1));

        kolomTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kolomTotalActionPerformed(evt);
            }
        });
        getContentPane().add(kolomTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 120, -1));

        kolomBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kolomBayarActionPerformed(evt);
            }
        });
        getContentPane().add(kolomBayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 120, -1));

        kolomKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kolomKembaliActionPerformed(evt);
            }
        });
        getContentPane().add(kolomKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 120, -1));

        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        btnHitung.setText("HITUNG");
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });
        getContentPane().add(btnHitung, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, -1, -1));

        btnBayar.setText("BAYAR");
        btnBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBayarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 120, 70, -1));

        btnKeluar.setText("KELUAR");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });
        getContentPane().add(btnKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 230, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tempus Sans ITC", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 51));
        jLabel8.setText("BEST COFFEE SHOP IN BONTANG");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tekton Pro", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Lokasi : Jl. Muara Badak No. 22, Bontang Selatan");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tekton Pro", 0, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Call for order :  082251471130");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        kolomReport.setColumns(20);
        kolomReport.setRows(5);
        jScrollPane1.setViewportView(kolomReport);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 270, 120));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/starwarscoffee/1.jpg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kolomPesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kolomPesananActionPerformed
      if(kolomPesanan.getSelectedItem().equals("Latte")){
            kolomHarga.setText("10000");
      }else if(kolomPesanan.getSelectedItem().equals("Cappuccino")){
            kolomHarga.setText("10000");
      }else if(kolomPesanan.getSelectedItem().equals("Frappuccino")){
            kolomHarga.setText("15000");
      }else if(kolomPesanan.getSelectedItem().equals("Flat White")){
            kolomHarga.setText("8000");
      }else if(kolomPesanan.getSelectedItem().equals("Mochaccino")){
            kolomHarga.setText("10000");
      }else if(kolomPesanan.getSelectedItem().equals("Espresso")){
            kolomHarga.setText("15000");            
      }else if(kolomPesanan.getSelectedItem().equals("Americano")){
            kolomHarga.setText("15000");    
        }
    }//GEN-LAST:event_kolomPesananActionPerformed

    private void kolomJumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kolomJumlahActionPerformed
    int harga = Integer.parseInt(kolomHarga.getText());
    int jumlah = Integer.parseInt(kolomJumlah.getText());
    int total = harga*jumlah;
    kolomJumlah.setText(""+jumlah);       
    }//GEN-LAST:event_kolomJumlahActionPerformed

    private void kolomHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kolomHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kolomHargaActionPerformed

    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed
    String nama = kolomHarga.getText();
    Integer jumlah = Integer.parseInt( kolomJumlah.getText() );
    int pesanan = kolomPesanan.getSelectedIndex();
    int harga = 0;
    int total = 0;
    switch(pesanan){
        case (0):
            break;
        case (1):
            harga = 10000;
            break;
        case (2):
            harga = 10000;
            break;
        case (3) :
            harga = 15000;
            break;
        case (4) :
            harga = 10000;
            break;
        case (5) :
            harga = 8000;
            break;
        case (6) :
            harga = 15000;
            break;
        case (7) :
            harga = 15000;
            break;
 }
 total = harga * jumlah;
 kolomTotal.setText(""+total);
 
    }//GEN-LAST:event_btnHitungActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
    kolomHarga.setText("");
    kolomJumlah.setText("");
    kolomTotal.setText("");
    kolomBayar.setText("");
    kolomKembali.setText("");
    kolomReport.setText("");
    kolomPesanan.setSelectedIndex(0);
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
    System.exit(0);

    }//GEN-LAST:event_btnKeluarActionPerformed

    private void kolomKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kolomKembaliActionPerformed
    
    }//GEN-LAST:event_kolomKembaliActionPerformed

    private void btnBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBayarActionPerformed
    int Bayar = Integer.parseInt(kolomBayar.getText());
    int total = Integer.parseInt(kolomTotal.getText());
    Integer jumlah = Integer.parseInt( kolomJumlah.getText() );
    int pesanan = kolomPesanan.getSelectedIndex();
    if (bayar>total){
    kolomReport.setText("Masukkan jumlah yang valid");      
    }
    else if(total>=bayar){
    int kembali = Bayar - total;
    kolomKembali.setText(""+kembali);
    kolomReport.setText("Terima kasih telah membeli "+kolomPesanan.getItemAt(pesanan)+ " \nsebanyak "+jumlah+" item.");
    }
    }//GEN-LAST:event_btnBayarActionPerformed

    private void kolomJumlahKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kolomJumlahKeyTyped
    if (!Character.isDigit(evt.getKeyChar())&& evt.getKeyChar()!=KeyEvent.VK_BACKSPACE){
    evt.consume();
    JOptionPane.showMessageDialog(null, "Hanya boleh masukkan angka saja!!");
    }
    }//GEN-LAST:event_kolomJumlahKeyTyped

    private void kolomBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kolomBayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kolomBayarActionPerformed

    private void kolomTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kolomTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kolomTotalActionPerformed

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
            java.util.logging.Logger.getLogger(FormKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FormKasir().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBayar;
    private javax.swing.JButton btnHitung;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kolomBayar;
    private javax.swing.JTextField kolomHarga;
    private javax.swing.JTextField kolomJumlah;
    private javax.swing.JTextField kolomKembali;
    private javax.swing.JComboBox<String> kolomPesanan;
    private javax.swing.JTextArea kolomReport;
    private javax.swing.JTextField kolomTotal;
    // End of variables declaration//GEN-END:variables
}
