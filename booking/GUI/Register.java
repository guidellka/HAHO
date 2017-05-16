package booking.GUI;

import booking.database.DBManagement;
import booking.system.Booking;
import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Register extends javax.swing.JFrame {

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
        confirm = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        name = new javax.swing.JLabel();
        surnametxt = new javax.swing.JTextField();
        surname = new javax.swing.JLabel();
        nametxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Register");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel1.setText("Register");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, -1));

        idre.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        idre.setText("Username :");
        jPanel1.add(idre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 130, -1));
        jPanel1.add(idtextre, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 306, 29));

        stnum.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        stnum.setText("รหัส นศ    :");
        jPanel1.add(stnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, -1, -1));
        jPanel1.add(sttextnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 306, 29));
        jPanel1.add(factext, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 306, 29));

        fac.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        fac.setText("คณะ        :");
        jPanel1.add(fac, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, -1, -1));

        email.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        email.setText("Email       :");
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, -1, -1));
        jPanel1.add(emailtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 306, 29));

        pass.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        pass.setText("Password :");
        jPanel1.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, -1, -1));
        jPanel1.add(passfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 306, 30));

        repass.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        repass.setText("Re-Enter  :");
        jPanel1.add(repass, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, -1, -1));

        ans.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ans.setText("คำตอบ     :");
        jPanel1.add(ans, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, -1, -1));

        qcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "คำคมที่คุณชอบมากที่สุด", "บุคคลต้นแบบในชีวิตของคุณ", "ความฝันของคุณคืออะไร", "สิ่งที่คุณอยากทำมากที่สุดในชีวิต" }));
        jPanel1.add(qcombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 420, 306, 32));

        qtext1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        qtext1.setText("คำถาม     :");
        jPanel1.add(qtext1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, -1, -1));
        jPanel1.add(repassfield1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, 306, 30));
        jPanel1.add(anstext, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 460, 306, 29));

        confirm.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        confirm.setText("Confirm");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });
        jPanel1.add(confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 520, 128, -1));

        cancel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cancel.setText("Cancel");
        cancel.setPreferredSize(new java.awt.Dimension(95, 31));
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel1.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 520, 136, -1));

        name.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        name.setText("ชื่อ          :");
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, -1));
        jPanel1.add(surnametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 306, 29));

        surname.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        surname.setText("นามสกุล   :");
        jPanel1.add(surname, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, -1, -1));
        jPanel1.add(nametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 306, 29));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cancelActionPerformed

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
        try {
            DBManagement db = new DBManagement();
            Statement st = db.getCn().createStatement();
            ResultSet rs = st.executeQuery("select * from Buser");
            String word = "";
            if (idtextre.getText().equals("") || sttextnum.getText().equals("") || nametxt.getText().equals("")
                || surnametxt.getText().equals("") || factext.getText().equals("") || emailtext.getText().equals("")
                || passfield.getText().equals("")|| repassfield1.getText().equals("") || anstext.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "ต้องกรุณากรอกให้ครบ");
            } else {
                while (rs.next()) {
                    if (rs.getString("Username").equalsIgnoreCase(idtextre.getText())) {
                        word += "Username ";
                        if (rs.getString("StudentID").equals(sttextnum.getText())) {
                            word += ",Student ID ";
                            if (rs.getString("Email").equalsIgnoreCase(emailtext.getText())) {
                                word += ",Email ";
                            }
                            emailtext.setText(null);
                            sttextnum.setText(null);
                        } else if (rs.getString("Email").equalsIgnoreCase(emailtext.getText())) {
                            word += ",Email ";
                        }
                        JOptionPane.showMessageDialog(this, "" + word + "is already use");
                        idtextre.setText(null);
                        break;
                    } else if (rs.getString("StudentID").equals(sttextnum.getText())) {
                        word += "Student ID ";
                        if (rs.getString("Email").equalsIgnoreCase(emailtext.getText())) {
                            word += ",Email ";
                        }
                        JOptionPane.showMessageDialog(this, "" + word + "is already use");
                        emailtext.setText(null);
                        sttextnum.setText(null);
                        break;
                    } else if (rs.getString("Email").equalsIgnoreCase(emailtext.getText())) {
                        JOptionPane.showMessageDialog(this, "Email is already use");
                        emailtext.setText(null);
                        break;
                    } else if (!passfield.getText().equalsIgnoreCase(repassfield1.getText())) {
                        JOptionPane.showMessageDialog(this, "Password ไม่ตรงกัน");
                        passfield.setText(null);
                        repassfield1.setText(null);
                        break;
                    } else if(sttextnum.getText().length() != 11){
                        if(sttextnum.getText().length() < 11){
                           JOptionPane.showMessageDialog(this, "รหัสนักศึกษาไม่ถึง 11 ตัว"); 
                        }
                        else{
                           JOptionPane.showMessageDialog(this, "รหัสนักศึกษาเกิน 11 ตัว");
                        }
                        sttextnum.setText(null);
                        break;                    } else {
                        long stdid = Long.parseLong(sttextnum.getText());
                        String sql = "insert into Buser(Username,StudentID,Firstname,Surname,Department"
                                + ",Email,Password,Security_Question,Security_Answer)"
                                + "values ('" + idtextre.getText() + "',"
                                + stdid + ",'"
                                + nametxt.getText() + "','"
                                + surnametxt.getText() + "','"
                                + factext.getText() + "','"
                                + emailtext.getText() + "','"
                                + passfield.getText() + "','"
                                + qcombo.getSelectedItem() + "','"
                                + anstext.getText() + "') ";
                        st.executeUpdate(sql);
                        JOptionPane.showMessageDialog(null, "การสมัครเข้าใช้เสร็จเรียบร้อย");
                        LoginGUI login = new LoginGUI();
                        login.setVisible(true);
                        setVisible(false);
                        break;
                    }
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ไม่สามารถใช้ Username นี้ได้");
            idtextre.setText(null);
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "กรุณากรอกรหัสนักศึกษาเป็นตัวเลขเท่านัน้");
            sttextnum.setText(null);
        } catch (ParseException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_confirmActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
         int result = JOptionPane.showConfirmDialog(this,"ยืนยันการออกโปรแกรม","ปิดโปรแกรม",JOptionPane.OK_CANCEL_OPTION);
        if(result == JOptionPane.OK_OPTION){
            System.exit(0);
        }
        else {
            return;
        }
    }//GEN-LAST:event_formWindowClosing

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
    private javax.swing.JButton cancel;
    private javax.swing.JButton confirm;
    private javax.swing.JLabel email;
    private javax.swing.JTextField emailtext;
    private javax.swing.JLabel fac;
    private javax.swing.JTextField factext;
    private javax.swing.JLabel idre;
    private javax.swing.JTextField idtextre;
    private javax.swing.JLabel jLabel1;
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
    // End of variables declaration//GEN-END:variables
}
