package booking.GUI;

import booking.database.DBManagement;
import booking.system.*;
import java.awt.Color;
import java.sql.*;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class LoginGUI extends javax.swing.JFrame {

    private User user = new User();

    public LoginGUI() throws ParseException {
        initComponents();
        Booking.clearBooking();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Head = new javax.swing.JLabel();
        passwordText = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        userText = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        regis = new javax.swing.JButton();
        forgetPassword = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Login");
        setFont(new java.awt.Font("Kanit", 0, 10)); // NOI18N
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        Head.setFont(new java.awt.Font("Kanit", 1, 34)); // NOI18N
        Head.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Head.setText("Welcome To KMUTT Booking System");
        getContentPane().add(Head);
        Head.setBounds(60, 70, 700, 70);

        passwordText.setFont(new java.awt.Font("Kanit", 0, 16)); // NOI18N
        passwordText.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        passwordText.setText("Password   :");
        getContentPane().add(passwordText);
        passwordText.setBounds(240, 320, 100, 30);

        jLabel4.setFont(new java.awt.Font("Kanit", 1, 24)); // NOI18N
        jLabel4.setText("Login Account");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(310, 220, 180, 40);

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOpaque(true);
        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(340, 300, 200, 2);

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator3.setOpaque(true);
        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(340, 350, 200, 2);

        userText.setFont(new java.awt.Font("Kanit", 0, 16)); // NOI18N
        userText.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        userText.setText("Username  :");
        getContentPane().add(userText);
        userText.setBounds(240, 270, 90, 30);

        usernameField.setBackground(new java.awt.Color(70, 229, 155,0));
        usernameField.setFont(new java.awt.Font("Kanit", 0, 14)); // NOI18N
        usernameField.setBorder(null);
        usernameField.setOpaque(false);
        getContentPane().add(usernameField);
        usernameField.setBounds(350, 270, 180, 29);

        passwordField.setFont(new java.awt.Font("Kanit", 0, 14)); // NOI18N
        passwordField.setBorder(null);
        passwordField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        passwordField.setBackground(new java.awt.Color(70, 229, 155,0));
        passwordField.setOpaque(false);
        getContentPane().add(passwordField);
        passwordField.setBounds(350, 320, 180, 30);

        login.setFont(new java.awt.Font("Kanit", 1, 16)); // NOI18N
        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login);
        login.setBounds(320, 370, 140, 40);

        regis.setFont(new java.awt.Font("Kanit", 0, 14)); // NOI18N
        regis.setText("Register");
        regis.setOpaque(false);
        regis.setPreferredSize(new java.awt.Dimension(800, 600));
        regis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regisActionPerformed(evt);
            }
        });
        getContentPane().add(regis);
        regis.setBounds(240, 420, 140, 31);

        forgetPassword.setFont(new java.awt.Font("Kanit", 0, 14)); // NOI18N
        forgetPassword.setText("ลืมรหัสผ่าน");
        forgetPassword.setPreferredSize(new java.awt.Dimension(79, 25));
        forgetPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgetPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(forgetPassword);
        forgetPassword.setBounds(390, 420, 140, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/booking/GUI/images/System/bgFFF.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 210, 500, 330);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/booking/GUI/images/System/bgFFF2.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 70, 880, 460);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/booking/GUI/images/System/bgLogin.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 600);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void regisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regisActionPerformed
        try {
            Register regis = new Register();
            regis.setVisible(true);
            setVisible(false);
        } catch (ParseException ex) {
            Logger.getLogger(LoginGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_regisActionPerformed

    private void forgetPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgetPasswordActionPerformed
        try {
            ForgetPassword fg = new ForgetPassword();
            fg.setVisible(true);
            setVisible(false);
        } catch (ParseException ex) {
            Logger.getLogger(LoginGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_forgetPasswordActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        if (usernameField.getText().equals("") && passwordField.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "กรุณากรอก Username และ Password");
        } else if (passwordField.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "กรุณากรอก Password");
        } else if (usernameField.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "กรุณากรอก Username");
        } else {
            boolean result=false;
            try {
                result = user.login(usernameField.getText(), passwordField.getText());
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            if (result) {
                PlaceList placeList = null;
                try {
                    placeList = new PlaceList(user);
                } catch (ParseException ex) {
                    Logger.getLogger(LoginGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                placeList.setVisible(true);
                setVisible(false);
            } else {
                JOptionPane.showMessageDialog(this, "Username or Password incorrect");
                usernameField.setText(null);
                passwordField.setText(null);
            }
        }
    }//GEN-LAST:event_loginActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int result = JOptionPane.showConfirmDialog(this, "ยืนยันการออกโปรแกรม", "ปิดโปรแกรม", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            System.exit(0);
        } else {
            return;
        }
    }//GEN-LAST:event_formWindowClosing

    public static void main(String args[]) {

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

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new LoginGUI().setVisible(true);
                } catch (ParseException ex) {
                    Logger.getLogger(LoginGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Head;
    private javax.swing.JToggleButton forgetPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordText;
    private javax.swing.JButton regis;
    private javax.swing.JLabel userText;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
