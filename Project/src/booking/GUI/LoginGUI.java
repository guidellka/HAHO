
package booking.GUI;

public class LoginGUI extends javax.swing.JFrame {

    public LoginGUI() {
        initComponents();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Head = new javax.swing.JLabel();
        passwordText = new javax.swing.JLabel();
        userText = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        login = new javax.swing.JButton();
        regis = new javax.swing.JButton();
        PasswordField = new javax.swing.JPasswordField();
        forgetPassword = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        Head.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        Head.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Head.setText("Welcome To KMUTT Booking System");
        getContentPane().add(Head);
        Head.setBounds(160, 150, 481, 54);

        passwordText.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        passwordText.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        passwordText.setText("Password    :");
        getContentPane().add(passwordText);
        passwordText.setBounds(210, 270, 73, 40);

        userText.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        userText.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        userText.setText("Username  :");
        getContentPane().add(userText);
        userText.setBounds(210, 220, 68, 40);

        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });
        getContentPane().add(usernameField);
        usernameField.setBounds(290, 230, 190, 29);

        login.setFont(new java.awt.Font("Gadugi", 1, 16)); // NOI18N
        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login);
        login.setBounds(500, 230, 82, 82);

        regis.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        regis.setText("Register");
        regis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regisActionPerformed(evt);
            }
        });
        getContentPane().add(regis);
        regis.setBounds(230, 330, 140, 31);

        PasswordField.setText("jPasswordField1");
        PasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFieldActionPerformed(evt);
            }
        });
        getContentPane().add(PasswordField);
        PasswordField.setBounds(290, 280, 190, 30);

        forgetPassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        forgetPassword.setText("ลืมรหัสผ่าน");
        forgetPassword.setPreferredSize(new java.awt.Dimension(79, 25));
        forgetPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgetPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(forgetPassword);
        forgetPassword.setBounds(380, 330, 140, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFieldActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginActionPerformed

    private void regisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regisActionPerformed

    private void PasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordFieldActionPerformed

    private void forgetPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgetPasswordActionPerformed
//        ForgetPassword form2 = new ForgetPassword(); 
//        form2.setVisible(true);
//        setVisible(false);
    }//GEN-LAST:event_forgetPasswordActionPerformed

 
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
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Head;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JToggleButton forgetPassword;
    private javax.swing.JButton login;
    private javax.swing.JLabel passwordText;
    private javax.swing.JButton regis;
    private javax.swing.JLabel userText;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
