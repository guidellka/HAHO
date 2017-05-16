package booking.GUI;

import booking.database.DBManagement;
import booking.system.*;
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

        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        oldPass = new javax.swing.JPasswordField();
        newPass = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        rePass = new javax.swing.JPasswordField();
        btnConfirm = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        jButton6.setText("ยืนยันการเปลี่ยนรหัสผ่าน");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Edit password");
        setPreferredSize(new java.awt.Dimension(600, 400));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("แก้ไขรหัสผ่าน");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 150, 27));

        jLabel10.setText("Old Password");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 117, 41));
        getContentPane().add(oldPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 300, 30));
        getContentPane().add(newPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 300, 30));

        jLabel5.setText("New Password");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 117, 41));

        jLabel8.setText("Re-EnterPassword");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 117, 41));
        getContentPane().add(rePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 300, 29));

        btnConfirm.setText("ยืนยัน");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 90, 30));

        btnBack.setText("ย้อนกลับ");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 90, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
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

    }//GEN-LAST:event_btnConfirmActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        try {
            EditProfile ep = new EditProfile(user);
            ep.setVisible(true);
            setVisible(false);
        } catch (ParseException ex) {
            Logger.getLogger(EditPassword.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBackActionPerformed

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
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPasswordField newPass;
    private javax.swing.JPasswordField oldPass;
    private javax.swing.JPasswordField rePass;
    // End of variables declaration//GEN-END:variables
}
