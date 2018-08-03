package booking.GUI;

import booking.database.DBManagement;
import booking.system.*;
import java.awt.Color;
import java.sql.*;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class EditPassword extends javax.swing.JFrame {

    User user;

    public EditPassword(User user) throws ParseException {
        this.user = user;
        initComponents();
        Booking.clearBooking();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        oldPass = new javax.swing.JPasswordField();
        newPass = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        rePass = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Edit password");
        setPreferredSize(new java.awt.Dimension(600, 430));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("ยืนยัน");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel7.setOpaque(true);
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 120, 40));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("ย้อนกลับ");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel9.setOpaque(true);
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9MouseExited(evt);
            }
        });
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 120, 40));

        jLabel1.setFont(new java.awt.Font("Kanit", 3, 36)); // NOI18N
        jLabel1.setText("แก้ไขรหัสผ่าน");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 220, 60));

        jLabel3.setFont(new java.awt.Font("Kanit", 3, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("แก้ไขรหัสผ่าน");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 220, 50));

        jLabel10.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Old Password");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 160, 41));

        oldPass.setFont(new java.awt.Font("Kanit", 0, 16)); // NOI18N
        getContentPane().add(oldPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 300, 40));

        newPass.setFont(new java.awt.Font("Kanit", 0, 16)); // NOI18N
        getContentPane().add(newPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 300, 40));

        jLabel5.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("New Password");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 160, 41));

        jLabel8.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Re-EnterPassword");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 160, 41));

        rePass.setFont(new java.awt.Font("Kanit", 0, 16)); // NOI18N
        getContentPane().add(rePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 300, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/booking/GUI/images/System/818.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -16, 630, 420));

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

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        int id = user.getUserId();
        String oldPassword = oldPass.getText();
        String newPassword = newPass.getText();
        String rePassword = rePass.getText();
        try {
            String pass = user.getPasswordFormDB();
            if (!(oldPassword.equals("") || newPassword.equals("") || rePassword.equals(""))) {
                if (oldPassword.equalsIgnoreCase(pass)) {
                    if (newPassword.length() <= 12 && newPassword.length() >= 6) {
                        if (newPassword.equalsIgnoreCase(rePassword)) {
                            user.updatePassword(newPassword);
                            JOptionPane.showMessageDialog(null, "Complete edit Password" + "\n" + "  กรุณาเข้าสู่ระบบใหม่");
                            LoginGUI login = new LoginGUI();
                            login.setVisible(true);
                            setVisible(false);
                        } else {
                            JOptionPane.showMessageDialog(null, "รหัสผ่านไม่เหมือนกัน");
                            rePass.setText(null);
                            newPass.setText(null);
                            oldPass.setText(null);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "กรุณากรอกรหัสผ่าน 6-12 ตัว");

                    }
                } else {
                    JOptionPane.showMessageDialog(null, "รหัสผ่านไม่ถูกต้อง");
                    newPass.setText(null);
                }
            } else {
                JOptionPane.showMessageDialog(null, "กรุณากรอกข้อมูลให้ครบ");

            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (ParseException ex) {
            Logger.getLogger(EditPassword.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setForeground(Color.black);
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setForeground(Color.white);
    }//GEN-LAST:event_jLabel7MouseExited

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        try {
            EditProfile ep = new EditProfile(user);
            ep.setVisible(true);
            setVisible(false);
        } catch (ParseException ex) {
            Logger.getLogger(EditPassword.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setForeground(Color.black);
    }//GEN-LAST:event_jLabel9MouseEntered

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setForeground(Color.white);
    }//GEN-LAST:event_jLabel9MouseExited

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField newPass;
    private javax.swing.JPasswordField oldPass;
    private javax.swing.JPasswordField rePass;
    // End of variables declaration//GEN-END:variables
}
