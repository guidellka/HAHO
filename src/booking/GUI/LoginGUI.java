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

        jLabel2 = new javax.swing.JLabel();
        passwordText = new javax.swing.JLabel();
        Head = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Head2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        userText = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();

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

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Login");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(540, 270, 90, 80);

        passwordText.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        passwordText.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        passwordText.setText("Password   :");
        getContentPane().add(passwordText);
        passwordText.setBounds(180, 320, 130, 30);

        Head.setFont(new java.awt.Font("Kanit", 3, 40)); // NOI18N
        Head.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Head.setText("Welcome To KMUTT Booking System");
        getContentPane().add(Head);
        Head.setBounds(40, 70, 720, 50);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Kanit", 0, 16)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ลืมรหัสผ่าน");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });
        getContentPane().add(jLabel6);
        jLabel6.setBounds(410, 390, 140, 30);

        Head2.setFont(new java.awt.Font("Kanit", 3, 40)); // NOI18N
        Head2.setForeground(new java.awt.Color(204, 204, 204));
        Head2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Head2.setText("Welcome To KMUTT Booking System");
        getContentPane().add(Head2);
        Head2.setBounds(20, 80, 770, 40);

        jLabel4.setFont(new java.awt.Font("Kanit", 3, 28)); // NOI18N
        jLabel4.setText("Login Account");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(310, 210, 210, 40);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Kanit", 0, 16)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Register");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
        });
        getContentPane().add(jLabel8);
        jLabel8.setBounds(250, 390, 140, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/booking/GUI/images/System/Untitled-2.png"))); // NOI18N
        jLabel7.setText("jLabel6");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(580, 480, 200, 90);

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOpaque(true);
        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(310, 300, 200, 2);

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator3.setOpaque(true);
        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(310, 350, 200, 2);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/booking/GUI/images/System/bgFFF2.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 50, 800, 490);

        userText.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        userText.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        userText.setText("Username  :");
        getContentPane().add(userText);
        userText.setBounds(180, 270, 120, 30);

        usernameField.setBackground(new java.awt.Color(70, 229, 155,0));
        usernameField.setFont(new java.awt.Font("Kanit", 0, 16)); // NOI18N
        usernameField.setBorder(null);
        usernameField.setOpaque(false);
        getContentPane().add(usernameField);
        usernameField.setBounds(320, 270, 180, 29);

        passwordField.setFont(new java.awt.Font("Kanit", 0, 16)); // NOI18N
        passwordField.setBorder(null);
        passwordField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        passwordField.setBackground(new java.awt.Color(70, 229, 155,0));
        passwordField.setOpaque(false);
        getContentPane().add(passwordField);
        passwordField.setBounds(320, 320, 180, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/booking/GUI/images/System/bgFFF.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 180, 650, 360);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/booking/GUI/images/System/unnamed.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, -10, 800, 630);

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator4.setOpaque(true);
        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator4);
        jSeparator4.setBounds(330, 300, 200, 2);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int result = JOptionPane.showConfirmDialog(this, "ยืนยันการออกโปรแกรม", "ปิดโปรแกรม", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            System.exit(0);
        } else {
            return;
        }
    }//GEN-LAST:event_formWindowClosing

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        if (usernameField.getText().equals("") && passwordField.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "กรุณากรอก Username และ Password");
        } else if (passwordField.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "กรุณากรอก Password");
        } else if (usernameField.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "กรุณากรอก Username");
        } else {
            boolean result = false;
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
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        jLabel2.setOpaque(true);
        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        jLabel2.setOpaque(false);
        jLabel2.setForeground(Color.black);
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        try {
            ForgetPassword fg = new ForgetPassword();
            fg.setVisible(true);
            setVisible(false);
        } catch (ParseException ex) {
            Logger.getLogger(LoginGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        jLabel6.setOpaque(true);
        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        jLabel6.setOpaque(false);
        jLabel6.setForeground(Color.black);
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
         try {
            Register regis = new Register();
            regis.setVisible(true);
            setVisible(false);
        } catch (ParseException ex) {
            Logger.getLogger(LoginGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
        jLabel8.setOpaque(true);
        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
        jLabel8.setOpaque(false);
        jLabel8.setForeground(Color.black);
    }//GEN-LAST:event_jLabel8MouseExited

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
    private javax.swing.JLabel Head2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordText;
    private javax.swing.JLabel userText;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
