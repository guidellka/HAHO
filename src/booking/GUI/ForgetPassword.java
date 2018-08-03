package booking.GUI;

import booking.database.DBManagement;
import booking.system.Booking;
import booking.system.User;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ForgetPassword extends javax.swing.JFrame {
//มาเช็คด้วยนะ พาสต้องใส่ตัวเลขกับภาษาอังกฤษ 6-12 ตัว 

    private boolean passLength = false;

    public ForgetPassword() throws ParseException {
        initComponents();
        Booking.clearBooking();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        id = new javax.swing.JLabel();
        qus = new javax.swing.JLabel();
        idtext = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        qbox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        ans = new javax.swing.JLabel();
        newpassword = new javax.swing.JLabel();
        repassword = new javax.swing.JLabel();
        anstext = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        newpasstext = new javax.swing.JPasswordField();
        repasstext = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("ForgetPassword");
        setMaximumSize(new java.awt.Dimension(800, 580));
        setMinimumSize(new java.awt.Dimension(800, 580));
        setPreferredSize(new java.awt.Dimension(800, 580));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        id.setFont(new java.awt.Font("Kanit", 3, 22)); // NOI18N
        id.setText("Username :");
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, -1));

        qus.setFont(new java.awt.Font("Kanit", 3, 22)); // NOI18N
        qus.setText("คำถาม :");
        getContentPane().add(qus, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, -1, 30));

        idtext.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        getContentPane().add(idtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 320, 40));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Confirm");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel11.setOpaque(true);
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel11MouseExited(evt);
            }
        });
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 150, 50));

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Reset");
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel12.setOpaque(true);
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel12MouseExited(evt);
            }
        });
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 450, 150, 50));

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Cancel");
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel13.setOpaque(true);
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel13MouseExited(evt);
            }
        });
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 450, 150, 50));

        qbox.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        qbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "คำคมที่คุณชอบมากที่สุด", "บุคคลต้นแบบในชีวิตของคุณ", "ความฝันของคุณคืออะไร", "สิ่งที่คุณอยากทำมากที่สุดในชีวิต" }));
        qbox.setPreferredSize(new java.awt.Dimension(6, 20));
        getContentPane().add(qbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 320, 40));

        jLabel6.setFont(new java.awt.Font("Kanit", 3, 48)); // NOI18N
        jLabel6.setText("Reset Password");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 32, -1, 60));

        ans.setFont(new java.awt.Font("Kanit", 3, 22)); // NOI18N
        ans.setText("คำตอบ : ");
        getContentPane().add(ans, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 89, -1));

        newpassword.setFont(new java.awt.Font("Kanit", 3, 22)); // NOI18N
        newpassword.setText("New-Password : ");
        getContentPane().add(newpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, -1, -1));

        repassword.setFont(new java.awt.Font("Kanit", 3, 22)); // NOI18N
        repassword.setText("Re-Password   :");
        getContentPane().add(repassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 181, -1));

        anstext.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        getContentPane().add(anstext, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 320, 40));

        jLabel1.setFont(new java.awt.Font("Kanit", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Reset Password");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        newpasstext.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        newpasstext.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                newpasstextFocusLost(evt);
            }
        });
        getContentPane().add(newpasstext, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 320, 40));

        repasstext.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        getContentPane().add(repasstext, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, 320, 40));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 230, 10));

        jLabel2.setFont(new java.awt.Font("Kanit", 0, 16)); // NOI18N
        jLabel2.setText("รหัสผ่าน 6-12 ตัว โดยเป็นตัวเลขหรือตัวอักษรภาษาอังกฤษ  ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 380, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/booking/GUI/images/System/gkfy.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-150, -100, 1120, 740));

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

    private void newpasstextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_newpasstextFocusLost
        String newps = newpasstext.getText();
        if (newps.length() >= 6 && newps.length() <= 12) {
            for (int i = 0; i < newps.length(); i++) {
                if (!((newps.charAt(i) >= '0' && newps.charAt(i) <= '9') || (newps.charAt(i) >= 'a' && newps.charAt(i) <= 'z')
                        || (newps.charAt(i) >= 'A' && newps.charAt(i) <= 'Z'))) {
                    passLength = false;
                    newpasstext.setBackground(new java.awt.Color(254, 80, 122));
                    jLabel2.setForeground(Color.red);
                    break;
                } else {
                    jLabel2.setForeground(Color.black);
                    newpasstext.setBackground(new java.awt.Color(255, 255, 255));
                    passLength = true;
                }
            }
        } else {
            newpasstext.setBackground(new java.awt.Color(254, 80, 122));
            jLabel2.setForeground(Color.red);
        }
    }//GEN-LAST:event_newpasstextFocusLost

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        String userName = idtext.getText();
        String qus = (String) qbox.getSelectedItem();
        String ans = anstext.getText();
        String newps = newpasstext.getText();
        String reps = repasstext.getText();
        if (!(userName.equals("") || ans.equals("") || newps.equals("") || reps.equals(""))) {
            if (!(newps.equals(reps))) {
                JOptionPane.showMessageDialog(this, "กรุณาใส่รหัสผ่านให้เหมือนกัน");
            } else {
                try {
                    boolean check = User.checkForgetPassword(userName, qus, ans);
                    if (check && passLength) {
                        User.updateForgetPassword(userName, reps);
                        JOptionPane.showMessageDialog(null, "การเปลี่ยนแปลงข้อมูลสำเร็จเรียบร้อย" + "/n" + "กรุณาลงชื่อเข้าใช้ใหม่");
                        LoginGUI login = new LoginGUI();
                        login.setVisible(true);
                        setVisible(false);
                    } else {
                        JOptionPane.showMessageDialog(this, "ข้อมูลไม่ถูกต้อง กรุณาตรวจสอบข้อมูล");
                    }
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                } catch (ParseException ex) {
                    Logger.getLogger(ForgetPassword.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "กรุณากรอกข้อมูลให้ครบ");
        }
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseEntered
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setForeground(Color.black);
    }//GEN-LAST:event_jLabel11MouseEntered

    private void jLabel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseExited
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setForeground(Color.white);
    }//GEN-LAST:event_jLabel11MouseExited

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        idtext.setText(null);
        anstext.setText(null);
        newpasstext.setText(null);
        repasstext.setText(null);
        qbox.setSelectedIndex(0);

    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseEntered
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setForeground(Color.black);
    }//GEN-LAST:event_jLabel12MouseEntered

    private void jLabel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseExited
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setForeground(Color.white);
    }//GEN-LAST:event_jLabel12MouseExited

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        try {
            LoginGUI login = new LoginGUI();
            login.setVisible(true);
            setVisible(false);
        } catch (ParseException ex) {
            Logger.getLogger(ForgetPassword.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseEntered
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setForeground(Color.black);
    }//GEN-LAST:event_jLabel13MouseEntered

    private void jLabel13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseExited
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setForeground(Color.white);
    }//GEN-LAST:event_jLabel13MouseExited

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
            java.util.logging.Logger.getLogger(ForgetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ForgetPassword().setVisible(true);
                } catch (ParseException ex) {
                    Logger.getLogger(ForgetPassword.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ans;
    private javax.swing.JTextField anstext;
    private javax.swing.JLabel id;
    private javax.swing.JTextField idtext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField newpasstext;
    private javax.swing.JLabel newpassword;
    private javax.swing.JComboBox<String> qbox;
    private javax.swing.JLabel qus;
    private javax.swing.JPasswordField repasstext;
    private javax.swing.JLabel repassword;
    // End of variables declaration//GEN-END:variables
}
