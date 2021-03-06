package booking.GUI;

import booking.database.DBManagement;
import booking.system.*;
import java.awt.Color;
import java.sql.*;
import java.text.ParseException;
import java.util.logging.*;
import javax.swing.*;

public class EditProfile extends javax.swing.JFrame {

    User user;
    private boolean name = true;
    private boolean surname = true;
    private boolean stdId = true;
    private boolean depart = true;
    private boolean email = true;
    private boolean qus = true;
    private boolean ans = true;

    public EditProfile(User user) throws ParseException {
        this.user = user;
        initComponents();
        combo.setSelectedItem(user.getQuestion());
        Booking.clearBooking();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nametxt = new javax.swing.JTextField(user.getName());
        surnametxt = new javax.swing.JTextField(user.getSurname());
        jLabel12 = new javax.swing.JLabel();
        facultytxt = new javax.swing.JTextField(user.getFaculty());
        emailtxt = new javax.swing.JTextField(user.getEmail());
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        idtxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        combo = new javax.swing.JComboBox<>();
        text1 = new javax.swing.JLabel();
        text2 = new javax.swing.JLabel();
        text3 = new javax.swing.JLabel();
        text4 = new javax.swing.JLabel();
        text5 = new javax.swing.JLabel();
        text6 = new javax.swing.JLabel();
        text7 = new javax.swing.JLabel();
        anstxt = new javax.swing.JTextField(user.getAnswer());
        qustxt = new javax.swing.JTextField(user.getEmail());
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("EDIT PROFILE");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        setForeground(java.awt.Color.darkGray);
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        jLabel2.setText("Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 80, 30));

        jLabel3.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        jLabel3.setText("คณะ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 50, 30));

        jLabel4.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        jLabel4.setText("คำตอบ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, 60, 30));

        jLabel6.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        jLabel6.setText("นามสกุล");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 70, 30));

        nametxt.setFont(new java.awt.Font("Kanit", 0, 14)); // NOI18N
        nametxt.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                nametxtCaretUpdate(evt);
            }
        });
        getContentPane().add(nametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 300, 30));
        nametxt.setEditable(true);

        surnametxt.setFont(new java.awt.Font("Kanit", 0, 14)); // NOI18N
        surnametxt.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                surnametxtCaretUpdate(evt);
            }
        });
        getContentPane().add(surnametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 300, 30));
        surnametxt.setEditable(true);

        jLabel12.setFont(new java.awt.Font("Kanit", 3, 36)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("แก้ไขข้อมูลส่วนตัว");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 340, 40));

        facultytxt.setFont(new java.awt.Font("Kanit", 0, 14)); // NOI18N
        facultytxt.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                facultytxtCaretUpdate(evt);
            }
        });
        getContentPane().add(facultytxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 300, 30));
        facultytxt.setEditable(true);

        emailtxt.setFont(new java.awt.Font("Kanit", 0, 14)); // NOI18N
        emailtxt.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                emailtxtCaretUpdate(evt);
            }
        });
        getContentPane().add(emailtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 300, 30));
        emailtxt.setEditable(true);

        jLabel8.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        jLabel8.setText("ชื่อ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 40, 30));

        jLabel5.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        jLabel5.setText("Email");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 50, 30));

        jLabel9.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        jLabel9.setText("คำถาม");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 60, 30));

        idtxt.setText(user.getStdId()+"");
        idtxt.setFont(new java.awt.Font("Kanit", 0, 14)); // NOI18N
        idtxt.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                idtxtCaretUpdate(evt);
            }
        });
        getContentPane().add(idtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 300, 30));
        idtxt.setEditable(true);

        jLabel7.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        jLabel7.setText("รหัสนักศึกษา");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 100, 30));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Kanit", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("แก้ไขรหัสผ่าน");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel10.setOpaque(true);
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel10MouseExited(evt);
            }
        });
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, 100, 30));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Kanit", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("เปลี่ยนคำถาม");
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
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 400, 100, 30));

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("ยืนยัน");
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel14.setOpaque(true);
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel14MouseExited(evt);
            }
        });
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 500, 150, 40));

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("ย้อนกลับ");
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel15.setOpaque(true);
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel15MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel15MouseExited(evt);
            }
        });
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 500, 150, 40));

        jLabel13.setFont(new java.awt.Font("Kanit", 3, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("แก้ไขข้อมูลส่วนตัว");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 350, 50));

        pass.setText(user.getPassword());
        pass.setFont(new java.awt.Font("Kanit", 0, 14)); // NOI18N
        getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 300, 30));
        pass.setEditable(false);

        combo.setFont(new java.awt.Font("Kanit", 0, 14)); // NOI18N
        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "คำคมที่คุณชอบมากที่สุด", "บุคคลต้นแบบในชีวิตของคุณ", "ความฝันของคุณคืออะไร", "สิ่งที่คุณอยากทำมากที่สุดในชีวิต" }));
        combo.setVisible(false);
        getContentPane().add(combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 300, 30));

        text1.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        text1.setForeground(new java.awt.Color(255, 0, 0));
        text1.setText("<Code>");
        text1.setText("");
        getContentPane().add(text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 180, 30));

        text2.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        text2.setForeground(new java.awt.Color(255, 0, 0));
        text2.setText("<Code>");
        text2.setText("");
        getContentPane().add(text2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, 180, 30));

        text3.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        text3.setForeground(new java.awt.Color(255, 0, 0));
        text3.setText("<Code>");
        text3.setText("");
        getContentPane().add(text3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, 180, 30));

        text4.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        text4.setForeground(new java.awt.Color(255, 0, 0));
        text4.setText("<Code>");
        text4.setText("");
        getContentPane().add(text4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, 180, 30));

        text5.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        text5.setForeground(new java.awt.Color(255, 0, 0));
        text5.setText("<Code>");
        text5.setText("");
        getContentPane().add(text5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 350, 180, 30));

        text6.setFont(new java.awt.Font("Kanit", 0, 15)); // NOI18N
        text6.setForeground(new java.awt.Color(19, 197, 19));
        text6.setText("<Code>");
        text6.setText("");
        getContentPane().add(text6, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 400, 100, 30));

        text7.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        text7.setForeground(new java.awt.Color(255, 0, 0));
        text7.setText("<Code>");
        text7.setText("");
        getContentPane().add(text7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 450, 180, 30));

        anstxt.setFont(new java.awt.Font("Kanit", 0, 14)); // NOI18N
        anstxt.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                anstxtCaretUpdate(evt);
            }
        });
        getContentPane().add(anstxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, 300, 30));
        emailtxt.setEditable(true);

        qustxt.setText(user.getQuestion());
        qustxt.setEditable(false);
        qustxt.setFont(new java.awt.Font("Kanit", 0, 14)); // NOI18N
        qustxt.setEnabled(false);
        qustxt.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                qustxtCaretUpdate(evt);
            }
        });
        getContentPane().add(qustxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 300, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/booking/GUI/images/System/gkfy.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 820, 610));

        setSize(new java.awt.Dimension(816, 598));
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

    private void qustxtCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_qustxtCaretUpdate
        if (qustxt.getText().equals(user.getQuestion())) {
            text6.setText("");
        } else {
            text6.setText("ถูกเปลี่ยน");
        }
    }//GEN-LAST:event_qustxtCaretUpdate

    private void anstxtCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_anstxtCaretUpdate
        if (anstxt.getText().equalsIgnoreCase(user.getAnswer())) {
            ans = true;
            anstxt.setBackground(new java.awt.Color(255, 255, 255));
            text7.setText("");
        } else if (anstxt.getText().indexOf(" ") != -1 || anstxt.getText().equalsIgnoreCase("")) {
            ans = false;
            anstxt.setBackground(new java.awt.Color(254, 80, 122));
            if (anstxt.getText().indexOf(" ") != -1) {
                text7.setText("ห้ามมี Spacebar");
            }
            if (anstxt.getText().equalsIgnoreCase("")) {
                text7.setText("กรุณากรอกข้อมูล");
            }
        } else {
            ans = true;
            anstxt.setBackground(new java.awt.Color(111, 255, 156));
            text7.setText("");
        }
    }//GEN-LAST:event_anstxtCaretUpdate

    private void nametxtCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_nametxtCaretUpdate
        if (nametxt.getText().equalsIgnoreCase(user.getName())) {
            name = true;
            nametxt.setBackground(new java.awt.Color(255, 255, 255));
            text1.setText("");
        } else if (nametxt.getText().indexOf(" ") != -1 || nametxt.getText().equalsIgnoreCase("")) {
            name = false;
            nametxt.setBackground(new java.awt.Color(254, 80, 122));
            if (nametxt.getText().indexOf(" ") != -1) {
                text1.setText("ห้ามมี Spacebar");
            }
            if (nametxt.getText().equalsIgnoreCase("")) {
                text1.setText("กรุณากรอกข้อมูล");
            }
        } else {
            name = true;
            nametxt.setBackground(new java.awt.Color(111, 255, 156));
            text1.setText("");
        }
    }//GEN-LAST:event_nametxtCaretUpdate

    private void surnametxtCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_surnametxtCaretUpdate
        if (surnametxt.getText().equalsIgnoreCase(user.getSurname())) {
            surname = true;
            surnametxt.setBackground(new java.awt.Color(255, 255, 255));
            text2.setText("");
        } else if (surnametxt.getText().indexOf(" ") != -1 || surnametxt.getText().equalsIgnoreCase("")) {
            surname = false;
            surnametxt.setBackground(new java.awt.Color(254, 80, 122));
            if (surnametxt.getText().indexOf(" ") != -1) {
                text2.setText("ห้ามมี Spacebar");
            }
            if (surnametxt.getText().equalsIgnoreCase("")) {
                text2.setText("กรุณากรอกข้อมูล");
            }
        } else {
            surname = true;
            surnametxt.setBackground(new java.awt.Color(111, 255, 156));
            text2.setText("");
        }
    }//GEN-LAST:event_surnametxtCaretUpdate

    private void idtxtCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_idtxtCaretUpdate
        try {
            long temp = Long.parseLong(idtxt.getText());
            if (idtxt.getText().equalsIgnoreCase(user.getStdId() + "")) {
                stdId = true;
                idtxt.setBackground(new java.awt.Color(255, 255, 255));
                text3.setText("");
            } else if (idtxt.getText().indexOf(" ") != -1 || idtxt.getText().equalsIgnoreCase("")
                    || idtxt.getText().length() != 11) {
                stdId = false;
                idtxt.setBackground(new java.awt.Color(254, 80, 122));
                if (idtxt.getText().indexOf(" ") != -1) {
                    text3.setText("ห้ามมี Spacebar");
                } else if (idtxt.getText().equalsIgnoreCase("")) {
                    text3.setText("กรุณากรอกข้อมูล");
                } else if (idtxt.getText().length() != 11) {
                    text3.setText("กรุณากรอกตัวเลข 11 หลัก");
                }
            } else {
                stdId = true;
                idtxt.setBackground(new java.awt.Color(111, 255, 156));
                text3.setText("");
            }
        } catch (NumberFormatException nfe) {
            text3.setText("กรุณากรอกตัวเลขเท่านั้น");
            stdId = false;
            idtxt.setBackground(new java.awt.Color(254, 80, 122));
        }
    }//GEN-LAST:event_idtxtCaretUpdate

    private void facultytxtCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_facultytxtCaretUpdate
        if (facultytxt.getText().equalsIgnoreCase(user.getFaculty())) {
            depart = true;
            facultytxt.setBackground(new java.awt.Color(255, 255, 255));
            text4.setText("");
        } else if (facultytxt.getText().equalsIgnoreCase("")) {
            depart = false;
            facultytxt.setBackground(new java.awt.Color(254, 80, 122));
            text4.setText("กรุณากรอกข้อมูล");

        } else {
            depart = true;
            facultytxt.setBackground(new java.awt.Color(111, 255, 156));
            text4.setText("");
        }
    }//GEN-LAST:event_facultytxtCaretUpdate

    private void emailtxtCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_emailtxtCaretUpdate
        if (emailtxt.getText().equalsIgnoreCase(user.getEmail())) {
            email = true;
            emailtxt.setBackground(new java.awt.Color(255, 255, 255));
            text5.setText("");
        } else if (emailtxt.getText().indexOf(" ") != -1 || emailtxt.getText().equalsIgnoreCase("")
                || emailtxt.getText().indexOf("@") == -1 || emailtxt.getText().indexOf(".") == -1) {
            email = false;
            emailtxt.setBackground(new java.awt.Color(254, 80, 122));
            if (emailtxt.getText().indexOf(" ") != -1) {
                text5.setText("ห้ามมี Spacebar");
            } else if (emailtxt.getText().equalsIgnoreCase("")) {
                text5.setText("กรุณากรอกข้อมูล");
            } else if (emailtxt.getText().indexOf("@") == -1 || emailtxt.getText().indexOf(".") == -1) {
                text5.setText("E-mail ไม่ถูกต้อง");
            }
        } else {
            email = true;
            emailtxt.setBackground(new java.awt.Color(111, 255, 156));
            text5.setText("");
        }
    }//GEN-LAST:event_emailtxtCaretUpdate

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        try {
            EditPassword editPass = new EditPassword(user);
            editPass.setVisible(true);
            setVisible(false);
        } catch (ParseException ex) {
            Logger.getLogger(EditProfile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setForeground(Color.black);
    }//GEN-LAST:event_jLabel10MouseEntered

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseExited
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setForeground(Color.white);
    }//GEN-LAST:event_jLabel10MouseExited

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        if (jLabel11.getText().equals("เปลี่ยนคำถาม")) {
            qus = false;
            jLabel11.setText("ตกลง");
            combo.setVisible(true);
            qustxt.setVisible(false);
        } else if (jLabel11.getText().equals("ตกลง")) {
            qus = true;
            jLabel11.setText("เปลี่ยนคำถาม");
            qustxt.setText(combo.getSelectedItem() + "");
            combo.setVisible(false);
            qustxt.setVisible(true);
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

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        try {
            long id = (Long.parseLong(idtxt.getText()));
            if (!(user.getName().equals(nametxt.getText()) && user.getSurname().equals(surnametxt.getText())
                    && user.getStdId() == id && user.getFaculty().equals(facultytxt.getText())
                    && user.getEmail().equals(emailtxt.getText()) && user.getQuestion().equals(qustxt.getText())
                    && user.getAnswer().equals(anstxt.getText()))) {
                if (name && surname && ans && depart && stdId && email && qus) {
                    int result = JOptionPane.showConfirmDialog(this, "คุณต้องการเปลี่ยนแปลงข้อมูลใช่หรือไม่", "ยืนยันการเปลี่ยนแปลงข้อมูล", JOptionPane.OK_CANCEL_OPTION);
                    if (result == JOptionPane.OK_OPTION) {
                        user.setName(nametxt.getText());
                        user.setSurname(surnametxt.getText());
                        user.setStdId(Long.parseLong(idtxt.getText()));
                        user.setFaculty(facultytxt.getText());
                        user.setEmail(emailtxt.getText());
                        user.setQuestion((qustxt.getText()));
                        user.setAnswer(anstxt.getText());
                        try {
                            user.editProfile();
                        } catch (SQLException ex) {
                            System.out.println(ex.getMessage());
                        }
                        JOptionPane.showMessageDialog(this, "อัพเดทข้อมูลเรียบร้อย");
                        PlaceList pl = null;
                        try {
                            pl = new PlaceList(user);
                        } catch (ParseException ex) {
                            Logger.getLogger(EditProfile.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        pl.setVisible(true);
                        setVisible(false);

                    } else {
                        return;
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "กรุณาใส่ข้อมูลให้ถูกต้อง");
                }
            } else {
                JOptionPane.showMessageDialog(this, "คุณไม่ได้ทำการเปลี่ยนแปลงข้อมูล");
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "กรุณากรอกรหัสนักศึกษาเป็นตัวเลขเท่านั้น");
        }
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseEntered
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setForeground(Color.black);
    }//GEN-LAST:event_jLabel14MouseEntered

    private void jLabel14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseExited
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setForeground(Color.white);
    }//GEN-LAST:event_jLabel14MouseExited

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        PlaceList placeList = null;
        try {
            placeList = new PlaceList(user);
        } catch (ParseException ex) {
            Logger.getLogger(EditProfile.class.getName()).log(Level.SEVERE, null, ex);
        }
        placeList.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseEntered
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setForeground(Color.black);
    }//GEN-LAST:event_jLabel15MouseEntered

    private void jLabel15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseExited
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setForeground(Color.white);
    }//GEN-LAST:event_jLabel15MouseExited

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anstxt;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JTextField emailtxt;
    private javax.swing.JTextField facultytxt;
    private javax.swing.JTextField idtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nametxt;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField qustxt;
    private javax.swing.JTextField surnametxt;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel text2;
    private javax.swing.JLabel text3;
    private javax.swing.JLabel text4;
    private javax.swing.JLabel text5;
    private javax.swing.JLabel text6;
    private javax.swing.JLabel text7;
    // End of variables declaration//GEN-END:variables
}
