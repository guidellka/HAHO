package booking.GUI;

import booking.system.*;
import java.awt.Color;
import java.sql.*;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Register extends javax.swing.JFrame {

    private boolean usernameCheck = false;
    private boolean emailCheck = false;
    private boolean passCheck = false;
    private boolean stdIdCheck = false;

    public Register() throws ParseException {
        initComponents();
        Booking.clearBooking();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        idre = new javax.swing.JLabel();
        idtextre = new javax.swing.JTextField();
        stnum = new javax.swing.JLabel();
        sttextnum = new javax.swing.JTextField();
        factext = new javax.swing.JTextField();
        fac = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        emailtext = new javax.swing.JTextField();
        pass = new javax.swing.JLabel();
        passfield = new javax.swing.JPasswordField();
        repass = new javax.swing.JLabel();
        ans = new javax.swing.JLabel();
        qcombo = new javax.swing.JComboBox<>();
        qtext1 = new javax.swing.JLabel();
        repassfield1 = new javax.swing.JPasswordField();
        anstext = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        surnametxt = new javax.swing.JTextField();
        surname = new javax.swing.JLabel();
        nametxt = new javax.swing.JTextField();
        text5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        text3 = new javax.swing.JLabel();
        text4 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Register");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Kanit", 3, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Register");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 230, 60));

        idre.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        idre.setText("Username :");
        jPanel1.add(idre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 100, -1));

        idtextre.setFont(new java.awt.Font("Kanit", 0, 14)); // NOI18N
        idtextre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                idtextreFocusLost(evt);
            }
        });
        jPanel1.add(idtextre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 306, 29));

        stnum.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        stnum.setText("รหัส นศ    :");
        jPanel1.add(stnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, -1, -1));

        sttextnum.setFont(new java.awt.Font("Kanit", 0, 14)); // NOI18N
        sttextnum.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                sttextnumFocusLost(evt);
            }
        });
        jPanel1.add(sttextnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 306, 29));

        factext.setFont(new java.awt.Font("Kanit", 0, 14)); // NOI18N
        jPanel1.add(factext, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 306, 29));

        fac.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        fac.setText("คณะ        :");
        jPanel1.add(fac, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        email.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        email.setText("Email       :");
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, -1, -1));

        emailtext.setFont(new java.awt.Font("Kanit", 0, 14)); // NOI18N
        emailtext.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailtextFocusLost(evt);
            }
        });
        jPanel1.add(emailtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 306, 29));

        pass.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        pass.setText("Password   :");
        jPanel1.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, -1, -1));

        passfield.setFont(new java.awt.Font("Kanit", 0, 14)); // NOI18N
        passfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                passfieldFocusLost(evt);
            }
        });
        jPanel1.add(passfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 190, 30));

        repass.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        repass.setText("Re-Enter  :");
        jPanel1.add(repass, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, -1, -1));

        ans.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        ans.setText("คำตอบ     :");
        jPanel1.add(ans, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, -1, -1));

        qcombo.setFont(new java.awt.Font("Kanit", 0, 14)); // NOI18N
        qcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "คำคมที่คุณชอบมากที่สุด", "บุคคลต้นแบบในชีวิตของคุณ", "ความฝันของคุณคืออะไร", "สิ่งที่คุณอยากทำมากที่สุดในชีวิต" }));
        jPanel1.add(qcombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 306, 32));

        qtext1.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        qtext1.setText("คำถาม     :");
        jPanel1.add(qtext1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, -1, -1));

        repassfield1.setFont(new java.awt.Font("Kanit", 0, 14)); // NOI18N
        jPanel1.add(repassfield1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, 220, 30));

        anstext.setFont(new java.awt.Font("Kanit", 0, 14)); // NOI18N
        jPanel1.add(anstext, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 306, 29));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Cancel");
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
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 150, 50));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Confirm");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel8.setOpaque(true);
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
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 460, 150, 50));

        jLabel3.setFont(new java.awt.Font("Kanit", 3, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Register");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 230, 70));

        name.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        name.setText("ชื่อ :");
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 40, -1));

        surnametxt.setFont(new java.awt.Font("Kanit", 0, 14)); // NOI18N
        jPanel1.add(surnametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 270, 29));

        surname.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        surname.setText("นามสกุล :");
        jPanel1.add(surname, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, -1, -1));

        nametxt.setFont(new java.awt.Font("Kanit", 0, 14)); // NOI18N
        jPanel1.add(nametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 220, 29));

        text5.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        text5.setForeground(new java.awt.Color(255, 0, 0));
        text5.setText("<code>");
        text5.setText("");
        jPanel1.add(text5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, 220, 30));

        jLabel2.setFont(new java.awt.Font("Kanit", 0, 14)); // NOI18N
        jLabel2.setText("รหัสผ่าน 6-12 ตัว โดยเป็นตัวเลขหรือตัวอักษรภาษาอังกฤษ  ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 350, 30));

        text3.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        text3.setForeground(new java.awt.Color(255, 0, 0));
        text3.setText("<code>");
        text3.setText("");
        jPanel1.add(text3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 220, 30));

        text4.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        text4.setForeground(new java.awt.Color(255, 0, 0));
        text4.setText("<code>");
        text4.setText("");
        jPanel1.add(text4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 220, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/booking/GUI/images/System/gkfy.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 540));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 540));

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

    private void emailtextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailtextFocusLost
        if (emailtext.getText().indexOf(" ") != -1 || emailtext.getText().equalsIgnoreCase("")
                || emailtext.getText().indexOf("@") == -1 || emailtext.getText().indexOf(".") == -1) {
            emailCheck = false;
            if (emailtext.getText().indexOf(" ") != -1) {
                text5.setText("ห้ามมี Spacebar");
            } else if (emailtext.getText().equalsIgnoreCase("")) {
                text5.setText("");
            } else if (emailtext.getText().indexOf("@") == -1 || emailtext.getText().indexOf(".") == -1) {
                text5.setText("E-mail ไม่ถูกต้อง");
            }
        } else {
            emailCheck = true;
            text5.setText("");
        }
    }//GEN-LAST:event_emailtextFocusLost

    private void passfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passfieldFocusLost
        String newps = passfield.getText();
        if (newps.length() >= 6 && newps.length() <= 12) {
            for (int i = 0; i < newps.length(); i++) {
                if (!((newps.charAt(i) >= '0' && newps.charAt(i) <= '9') || (newps.charAt(i) >= 'a' && newps.charAt(i) <= 'z')
                        || (newps.charAt(i) >= 'A' && newps.charAt(i) <= 'Z'))) {
                    passCheck = false;
                    jLabel2.setForeground(Color.red);
                    break;
                } else {
                    jLabel2.setForeground(Color.black);
                    passCheck = true;
                }
            }
        } else {
            jLabel2.setForeground(Color.red);
            passCheck = false;
        }
    }//GEN-LAST:event_passfieldFocusLost

    private void sttextnumFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sttextnumFocusLost
        try {
            long temp = Long.parseLong(sttextnum.getText());
            if (sttextnum.getText().indexOf(" ") != -1 || sttextnum.getText().equalsIgnoreCase("")
                    || sttextnum.getText().length() != 11) {
                stdIdCheck = false;
                if (sttextnum.getText().indexOf(" ") != -1) {
                    text3.setText("ห้ามมี Spacebar");
                } else if (sttextnum.getText().equalsIgnoreCase("")) {
                    text3.setText("");
                } else if (sttextnum.getText().length() != 11) {
                    text3.setText("กรุณากรอกตัวเลข 11 หลัก");
                }
            } else {
                stdIdCheck = true;
                text3.setText("");
            }
        } catch (NumberFormatException nfe) {
            text3.setText("กรุณากรอกตัวเลขเท่านั้น");
            stdIdCheck = false;
        }
    }//GEN-LAST:event_sttextnumFocusLost

    private void idtextreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idtextreFocusLost
        if (!(idtextre.getText().equals(""))) {
            boolean result = User.checkUsername(idtextre.getText());
            if (result) {
                text4.setText("");
                usernameCheck = true;
            } else {
                text4.setText("ไม่สามารถใช้ username นี้ได้");
                usernameCheck = false;
            }
        }
    }//GEN-LAST:event_idtextreFocusLost

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        try {
            LoginGUI login = new LoginGUI();
            login.setVisible(true);
            setVisible(false);
        } catch (ParseException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
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

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        if (!(idtextre.getText().equals("") || sttextnum.getText().equals("") || nametxt.getText().equals("")
                || surnametxt.getText().equals("") || factext.getText().equals("") || emailtext.getText().equals("")
                || passfield.getText().equals("") || repassfield1.getText().equals("") || anstext.getText().equals(""))) {
            if (passfield.getText().equals(repassfield1.getText())) {
                if (usernameCheck && emailCheck && passCheck && stdIdCheck) {
                    String userTemp = idtextre.getText();
                    String stdIdTemp = sttextnum.getText();
                    String nameTemp = nametxt.getText();
                    String surnameTemp = surnametxt.getText();
                    String departTemp = factext.getText();
                    String emailTemp = emailtext.getText();
                    String passTemp = passfield.getText();
                    String qusTemp = (String) qcombo.getSelectedItem();
                    String ansTemp = anstext.getText();
                    try {
                        User.Register(userTemp, stdIdTemp, nameTemp, surnameTemp, departTemp, emailTemp, passTemp, qusTemp, ansTemp);
                    } catch (SQLException ex) {
                        System.out.println(ex.getMessage());
                    }
                    JOptionPane.showMessageDialog(null, "การสมัครเข้าใช้เสร็จเรียบร้อย");
                    LoginGUI login = null;
                    try {
                        login = new LoginGUI();
                    } catch (ParseException ex) {
                        System.out.println(ex.getMessage());
                    }
                    login.setVisible(true);
                    setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(this, "กรุณากรอกข้อมูลให้ถูกต้อง");
                }
            } else {
                JOptionPane.showMessageDialog(this, "กรุณาใส่ Password ให้เหมือนกัน");
            }
        } else {
            JOptionPane.showMessageDialog(this, "ต้องกรุณากรอกให้ครบ");
        }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setForeground(Color.black);
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setForeground(Color.white);
    }//GEN-LAST:event_jLabel8MouseExited

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Register().setVisible(true);
                } catch (ParseException ex) {
                    Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ans;
    private javax.swing.JTextField anstext;
    private javax.swing.JLabel email;
    private javax.swing.JTextField emailtext;
    private javax.swing.JLabel fac;
    private javax.swing.JTextField factext;
    private javax.swing.JLabel idre;
    private javax.swing.JTextField idtextre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel name;
    private javax.swing.JTextField nametxt;
    private javax.swing.JLabel pass;
    private javax.swing.JPasswordField passfield;
    private javax.swing.JComboBox<String> qcombo;
    private javax.swing.JLabel qtext1;
    private javax.swing.JLabel repass;
    private javax.swing.JPasswordField repassfield1;
    private javax.swing.JLabel stnum;
    private javax.swing.JTextField sttextnum;
    private javax.swing.JLabel surname;
    private javax.swing.JTextField surnametxt;
    private javax.swing.JLabel text3;
    private javax.swing.JLabel text4;
    private javax.swing.JLabel text5;
    // End of variables declaration//GEN-END:variables
}
