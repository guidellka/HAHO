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

        bg = new javax.swing.JPanel();
        id = new javax.swing.JLabel();
        qus = new javax.swing.JLabel();
        idtext = new javax.swing.JTextField();
        reset = new javax.swing.JButton();
        bconfirm1 = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        qbox = new javax.swing.JComboBox<>();
        ans = new javax.swing.JLabel();
        newpassword = new javax.swing.JLabel();
        repassword = new javax.swing.JLabel();
        anstext = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        newpasstext = new javax.swing.JPasswordField();
        repasstext = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("ForgetPassword");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        bg.setPreferredSize(new java.awt.Dimension(800, 600));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        id.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        id.setText("Username :");
        bg.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, -1));

        qus.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        qus.setText("คำถาม :");
        bg.add(qus, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, -1, 30));
        bg.add(idtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 309, 30));

        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        bg.add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 439, 100, 47));

        bconfirm1.setText("Confirm");
        bconfirm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bconfirm1ActionPerformed(evt);
            }
        });
        bg.add(bconfirm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 439, 100, 47));

        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        bg.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(468, 439, 100, 47));

        qbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "คำคมที่คุณชอบมากที่สุด", "บุคคลต้นแบบในชีวิตของคุณ", "ความฝันของคุณคืออะไร", "สิ่งที่คุณอยากทำมากที่สุดในชีวิต" }));
        qbox.setPreferredSize(new java.awt.Dimension(6, 20));
        bg.add(qbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 309, 29));

        ans.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ans.setText("คำตอบ : ");
        bg.add(ans, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 89, -1));

        newpassword.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        newpassword.setText("New-Password : ");
        bg.add(newpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, -1, -1));

        repassword.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        repassword.setText("Re-Password   :");
        bg.add(repassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 181, -1));
        bg.add(anstext, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 309, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Reset Password");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

        newpasstext.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                newpasstextFocusLost(evt);
            }
        });
        bg.add(newpasstext, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 310, 29));
        bg.add(repasstext, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 310, 29));
        bg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 230, 10));
        bg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 230, 10));

        jLabel2.setText("รหัสผ่าน 6-12 ตัว โดยเป็นตัวเลขหรือตัวอักษรภาษาอังกฤษ  ");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 350, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        try {
            LoginGUI login = new LoginGUI();
            login.setVisible(true);
            setVisible(false);
        } catch (ParseException ex) {
            Logger.getLogger(ForgetPassword.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cancelActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        idtext.setText(null);
        anstext.setText(null);
        newpasstext.setText(null);
        repasstext.setText(null);
        qbox.setSelectedIndex(0);

    }//GEN-LAST:event_resetActionPerformed

    private void bconfirm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bconfirm1ActionPerformed
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
    }//GEN-LAST:event_bconfirm1ActionPerformed

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
    private javax.swing.JButton bconfirm1;
    private javax.swing.JPanel bg;
    private javax.swing.JButton cancel;
    private javax.swing.JLabel id;
    private javax.swing.JTextField idtext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField newpasstext;
    private javax.swing.JLabel newpassword;
    private javax.swing.JComboBox<String> qbox;
    private javax.swing.JLabel qus;
    private javax.swing.JPasswordField repasstext;
    private javax.swing.JLabel repassword;
    private javax.swing.JButton reset;
    // End of variables declaration//GEN-END:variables
}
