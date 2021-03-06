import java.awt.Event;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class LoginSignup extends javax.swing.JFrame {

    
    public LoginSignup() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mudurCalisan = new javax.swing.ButtonGroup();
        popup = new javax.swing.JPopupMenu();
        exit = new javax.swing.JMenuItem();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        girisSekme = new javax.swing.JPanel();
        g_kAdiLabel = new javax.swing.JLabel();
        g_sifreLabel = new javax.swing.JLabel();
        g_kAdiTextF = new javax.swing.JTextField();
        g_sifrePassF = new javax.swing.JPasswordField();
        girisYapButton = new javax.swing.JButton();
        uyelikSekme = new javax.swing.JPanel();
        u_kAdiLabel = new javax.swing.JLabel();
        u_sifreLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        secim = new javax.swing.JLabel();
        u_kAdiTextF = new javax.swing.JTextField();
        u_sifrePassF = new javax.swing.JPasswordField();
        emailTextF = new javax.swing.JTextField();
        mudurRB = new javax.swing.JRadioButton();
        calisanRB = new javax.swing.JRadioButton();
        uyeOlButton = new javax.swing.JButton();

        exit.setText("Programdan Çık");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        popup.add(exit);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Giriş yap / Üye Ol");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        girisSekme.setComponentPopupMenu(popup);

        g_kAdiLabel.setText("Kullanıcı Adı:");

        g_sifreLabel.setText("Şifre:");

        girisYapButton.setText("Giriş Yap");
        girisYapButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                girisYapButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout girisSekmeLayout = new javax.swing.GroupLayout(girisSekme);
        girisSekme.setLayout(girisSekmeLayout);
        girisSekmeLayout.setHorizontalGroup(
            girisSekmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(girisSekmeLayout.createSequentialGroup()
                .addGroup(girisSekmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(girisSekmeLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(girisSekmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(g_kAdiLabel)
                            .addComponent(g_sifreLabel))
                        .addGap(18, 18, 18)
                        .addGroup(girisSekmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(g_kAdiTextF)
                            .addComponent(g_sifrePassF, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                    .addGroup(girisSekmeLayout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(girisYapButton)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        girisSekmeLayout.setVerticalGroup(
            girisSekmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(girisSekmeLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(girisSekmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(g_kAdiLabel)
                    .addComponent(g_kAdiTextF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(girisSekmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(g_sifreLabel)
                    .addComponent(g_sifrePassF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(girisYapButton)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Giriş Yap", girisSekme);

        u_kAdiLabel.setText("Kullanıcı Adı:");

        u_sifreLabel.setText("Şifre:");

        emailLabel.setText("Email:");

        secim.setText("Lütfen seçiniz:");

        mudurCalisan.add(mudurRB);
        mudurRB.setSelected(true);
        mudurRB.setText("Müdür");

        mudurCalisan.add(calisanRB);
        calisanRB.setText("Çalışan");

        uyeOlButton.setText("Üye Ol");
        uyeOlButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uyeOlButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout uyelikSekmeLayout = new javax.swing.GroupLayout(uyelikSekme);
        uyelikSekme.setLayout(uyelikSekmeLayout);
        uyelikSekmeLayout.setHorizontalGroup(
            uyelikSekmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(uyelikSekmeLayout.createSequentialGroup()
                .addGroup(uyelikSekmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(uyelikSekmeLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(uyelikSekmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(u_kAdiLabel)
                            .addComponent(u_sifreLabel)
                            .addComponent(emailLabel))
                        .addGap(18, 18, 18)
                        .addGroup(uyelikSekmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(u_kAdiTextF)
                            .addComponent(u_sifrePassF, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(emailTextF)))
                    .addGroup(uyelikSekmeLayout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(uyeOlButton))
                    .addGroup(uyelikSekmeLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(secim)
                        .addGap(18, 18, 18)
                        .addComponent(mudurRB)
                        .addGap(18, 18, 18)
                        .addComponent(calisanRB)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        uyelikSekmeLayout.setVerticalGroup(
            uyelikSekmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(uyelikSekmeLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(uyelikSekmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(u_kAdiTextF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(u_kAdiLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(uyelikSekmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(u_sifreLabel)
                    .addComponent(u_sifrePassF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(uyelikSekmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(emailTextF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(uyelikSekmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(secim)
                    .addComponent(mudurRB)
                    .addComponent(calisanRB))
                .addGap(18, 18, 18)
                .addComponent(uyeOlButton)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Üye Ol", uyelikSekme);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void girisYapButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_girisYapButtonActionPerformed
        
        //girilen bilgileri alıp string'de tutma
        String kAdi = g_kAdiTextF.getText();
        String sifre = g_sifrePassF.getText();
        if (kAdi.equals("") || sifre.equals("")) {
            JOptionPane.showMessageDialog(this, "Lütfen kullanıcı adınızı veya şifrenizi giriniz.");
        }
        else {
            //veritabanına bağlantı kurma
            Baglanti b = new Baglanti();
            //SQL sorgusu için oluşturulan nesneler
            PreparedStatement ps;
            ResultSet rs;
            try {
                b.baglan();
                //veritabanında girilen bilgilerin doğruluğunu sorgulama
                ps=b.c.prepareStatement("SELECT * FROM KULLANICILAR WHERE KADI=? AND SIFRE=?");
                ps.setString(1, kAdi);
                ps.setString(2, sifre);
                rs=ps.executeQuery();
                while (rs.next()) {
                        b.baglantiKes();
                        dispose(); //login sayfasını kapatır
                        Marketim m = new Marketim();
                        m.setVisible(true); //anasayfayı açar
                }
                //while'a girmezse girilen bilgiler yanlış uyarısı ver
                JOptionPane.showMessageDialog(this, "Kullanıcı adı veya şifre yanlış.");
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(LoginSignup.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_girisYapButtonActionPerformed

    private void uyeOlButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uyeOlButtonActionPerformed
        
        //girilen bilgileri alıp string'de tutma
        String kAdi = u_kAdiTextF.getText();
        String sifre = u_sifrePassF.getText();
        String mail = emailTextF.getText();
        Pattern p = Pattern.compile("^(.+)@(.+)$");
        Matcher m = p.matcher(mail);
        String tur=null;
        
        //boş bilgi girmesini önleme
        if(kAdi.equals("") || sifre.equals("") || mail.equals("")) {
            JOptionPane.showMessageDialog(this, "Lütfen bilgilerinizi eksiksiz giriniz!");
        }
        else if(!m.find()) {
            JOptionPane.showMessageDialog(this, "Emailinizde uygun olmayan karakterler bulunmuştur.");
        }
        else{
            //kullanıcı türünü belirleme
            if(mudurRB.isSelected()) {
                tur="Müdür";
            }
            else if(calisanRB.isSelected()) {
                tur="Çalışan";
            }
            
            //veritabanına bağlantı kurma
            Baglanti b = new Baglanti();
            //SQL nesneleri
            PreparedStatement ps;
            try {
                b.baglan();
                ps = b.c.prepareStatement("INSERT INTO KULLANICILAR(KADI,SIFRE,TUR,EMAIL) VALUES (?,?,?,?)");
                //Alacağımız değerleri sorguya yerleştiriyoruz
                ps.setString(1, kAdi);
                ps.setString(2, sifre);
                ps.setString(3, tur);
                ps.setString(4, mail);
                //Değişikliği uygulatma
                ps.executeUpdate();
                b.baglantiKes();
                JOptionPane.showMessageDialog(this, "Üyeliğiniz oluşturuldu. Giriş yapınız.");
                
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(LoginSignup.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_uyeOlButtonActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        Object[] secenekler = {"Evet","Hayır"};
        int cevap = JOptionPane.showOptionDialog(null, "Programdan çıkmak istediğinize emin misiniz?", "Programdan çıkıyorsunuz...", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, secenekler, null);
        if (cevap == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_exitActionPerformed

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
            java.util.logging.Logger.getLogger(LoginSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginSignup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton calisanRB;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextF;
    private javax.swing.JMenuItem exit;
    private javax.swing.JLabel g_kAdiLabel;
    private javax.swing.JTextField g_kAdiTextF;
    private javax.swing.JLabel g_sifreLabel;
    private javax.swing.JPasswordField g_sifrePassF;
    private javax.swing.JPanel girisSekme;
    private javax.swing.JButton girisYapButton;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.ButtonGroup mudurCalisan;
    private javax.swing.JRadioButton mudurRB;
    private javax.swing.JPopupMenu popup;
    private javax.swing.JLabel secim;
    private javax.swing.JLabel u_kAdiLabel;
    private javax.swing.JTextField u_kAdiTextF;
    private javax.swing.JLabel u_sifreLabel;
    private javax.swing.JPasswordField u_sifrePassF;
    private javax.swing.JButton uyeOlButton;
    private javax.swing.JPanel uyelikSekme;
    // End of variables declaration//GEN-END:variables
}
