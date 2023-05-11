package siralamaguı;

/**
 *
 * @author User
 */
public class SiralamalarGUI extends javax.swing.JFrame {

    Siralamalar siralamalar;
    
    public SiralamalarGUI() {
        initComponents();
        setLocationRelativeTo(null);
        siralamalar = new Siralamalar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        txtBoyut = new javax.swing.JTextField();
        btnDiziOlustur = new javax.swing.JButton();
        cbSiralamalar = new javax.swing.JComboBox<>();
        btnCizdir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblSayac = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblSirasiz = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblSirali = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        lblMessage = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sıralama Algoritmalarıı");

        jLabel1.setText("Dizi Boyutu:");

        txtBoyut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBoyutKeyReleased(evt);
            }
        });

        btnDiziOlustur.setText("OLUŞTUR");
        btnDiziOlustur.setEnabled(false);
        btnDiziOlustur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiziOlusturActionPerformed(evt);
            }
        });

        cbSiralamalar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Lütfen Algoritma Seçiniz>", "Selection Sort", "Quick Sort", "Merge Sort", "Bubble Sort" }));

        btnCizdir.setText("ÇİZDİR");
        btnCizdir.setEnabled(false);
        btnCizdir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCizdirActionPerformed(evt);
            }
        });

        jLabel2.setText("Sayac:");

        jLabel3.setText("Sırasız:");

        jLabel4.setText("Sıralı:");

        jLabel5.setText("Geçen Süre:");

        lblMessage.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMessage.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtBoyut, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnDiziOlustur, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblSayac, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblSirasiz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblSirali, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbSiralamalar, 0, 184, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCizdir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBoyut, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDiziOlustur, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(lblSirasiz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSiralamalar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCizdir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSirali, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblSayac, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    String sayilar[];
    int sayi[];
    void diziOlustur(){
        int N = Integer.parseInt(txtBoyut.getText());
        String str = siralamalar.olustur(N);
        sayilar = str.split(" ");
        sayi = new int[N];
        for (int i = 0; i < N; i++) {
            sayi[i] = Integer.parseInt(sayilar[i]);
        }
    }
    
    String yazdir(){
        String str = "[";
        for (int i = 0; i < sayi.length-1; i++) {
            str += sayi[i] + ", ";
        }
        str += sayi[sayi.length-1] + "]";
        return str;
    }
    
    String secim;
    private void btnDiziOlusturActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiziOlusturActionPerformed
        diziOlustur();
        lblSirasiz.setText(yazdir());
        btnCizdir.setEnabled(true);
    }//GEN-LAST:event_btnDiziOlusturActionPerformed

    private void btnCizdirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCizdirActionPerformed
        Grafik grafik = new Grafik();
        //grafik.setVisible(true);
        secim = cbSiralamalar.getSelectedItem() + "";
        switch (secim) {
            case "<Lütfen Algoritma Seçiniz>":
                lblSirali.setText("Lütfen bir sıralama algoritması seçiniz!");
                lblSayac.setText("");
                lblTime.setText("");
                break;
            case "Selection Sort":
                sayi = siralamalar.selectionSort(sayi, sayi.length);
                lblSirali.setText(yazdir());
                lblTime.setText(siralamalar.time + "");
                lblSayac.setText(siralamalar.sayac + "");
                siralamalar.setSecilen("Selection Sort");
                grafik.secilen = siralamalar.getSecilen();
                break;
            case "Quick Sort":
                sayi = siralamalar.quickSort(sayi, 0, sayi.length-1);
                lblSirali.setText(yazdir());
                lblTime.setText(siralamalar.time + "");
                lblSayac.setText(siralamalar.sayac + "");
                siralamalar.setSecilen("Quick Sort");
                grafik.secilen = siralamalar.getSecilen();
                break;
            case "Merge Sort":
                int N = sayi.length;
                sayi = siralamalar.mergeSort(sayi, 0, N-1);
                lblSirali.setText(yazdir());
                lblTime.setText(siralamalar.time + "");
                lblSayac.setText(siralamalar.sayac + "");
                siralamalar.setSecilen("Merge Sort");
                grafik.secilen = siralamalar.getSecilen();
                break;
            case "Bubble Sort":
                sayi = siralamalar.bubbleSort(sayi);
                lblSirali.setText(yazdir());
                lblTime.setText(siralamalar.time + "");
                lblSayac.setText(siralamalar.sayac + "");
                siralamalar.setSecilen("Bubble Sort");
                grafik.secilen = siralamalar.getSecilen();
                break;
            default:
                throw new AssertionError();
        }
        Thread thread = new Thread(){
            String str = "Grafik olusturuluyor";
            @Override
            public void run(){
                lblMessage.setText(str);
                try {
                    for (int i = 0; i < 6; i++) {
                        Thread.sleep(500);
                        if(i %3 == 0){
                            str = "Grafik olusturuluyor";
                            lblMessage.setText(str);
                            Thread.sleep(500);
                        }
                        str += ".";
                        lblMessage.setText(str);
                    }
                } catch (Exception e) {
                }
                
                grafik.setVisible(true);
                //grafik.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            }
        };
        thread.start();
    }//GEN-LAST:event_btnCizdirActionPerformed

    private void txtBoyutKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBoyutKeyReleased
        if(txtBoyut.getText().length() == 0){
            btnDiziOlustur.setEnabled(false);
        }
        else{
            btnDiziOlustur.setEnabled(true);
        }
    }//GEN-LAST:event_txtBoyutKeyReleased

    
    
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
            java.util.logging.Logger.getLogger(SiralamalarGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SiralamalarGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SiralamalarGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SiralamalarGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SiralamalarGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCizdir;
    private javax.swing.JButton btnDiziOlustur;
    private javax.swing.JComboBox<String> cbSiralamalar;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblSayac;
    private javax.swing.JLabel lblSirali;
    private javax.swing.JLabel lblSirasiz;
    private javax.swing.JLabel lblTime;
    private javax.swing.JTextField txtBoyut;
    // End of variables declaration//GEN-END:variables
}
