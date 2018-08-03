package booking.GUI;

import booking.system.*;
import javax.swing.*;
import booking.database.*;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.*;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.filechooser.FileNameExtensionFilter;

public class AddPlace extends javax.swing.JFrame {

    User user;

    public AddPlace(User user) throws ParseException {
        this.user = user;
        initComponents();
        Booking.clearBooking();
    }

    public ImageIcon ResizeImage(JLabel picPlace, String path) {
        ImageIcon myPic = new ImageIcon(path);
        Image img = myPic.getImage();
        Image newImg = img.getScaledInstance(picPlace.getWidth(), picPlace.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pic = new javax.swing.JLabel();
        DatailText = new javax.swing.JLabel();
        placeNameText = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        detailPlaceField = new javax.swing.JTextArea();
        placeNameField = new javax.swing.JTextField();
        url = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Add Place");
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
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
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 510, 150, 50));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("ยกเลิก");
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
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 510, 150, 50));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Kanit", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("upload");
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
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 230, 90, 30));

        pic.setBackground(new java.awt.Color(255, 255, 255));
        pic.setFont(new java.awt.Font("Kanit", 0, 24)); // NOI18N
        pic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pic.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pic.setOpaque(true);
        pic.setPreferredSize(new java.awt.Dimension(53, 33));
        getContentPane().add(pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 470, 260));

        DatailText.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        DatailText.setText("รายละเอียดของสถานที่");
        getContentPane().add(DatailText, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 180, 40));

        placeNameText.setFont(new java.awt.Font("Kanit", 1, 24)); // NOI18N
        placeNameText.setText("ชื่อสถานที่ :");
        getContentPane().add(placeNameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 114, 48));

        jScrollPane2.setPreferredSize(new java.awt.Dimension(166, 50));

        detailPlaceField.setColumns(20);
        detailPlaceField.setFont(new java.awt.Font("Kanit", 0, 16)); // NOI18N
        detailPlaceField.setRows(5);
        detailPlaceField.setAutoscrolls(false);
        detailPlaceField.setMinimumSize(new java.awt.Dimension(2, 30));
        jScrollPane2.setViewportView(detailPlaceField);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 700, 110));

        placeNameField.setFont(new java.awt.Font("Kanit", 0, 22)); // NOI18N
        getContentPane().add(placeNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 520, 48));

        url.setEditable(false);
        url.setFont(new java.awt.Font("Kanit", 0, 14)); // NOI18N
        getContentPane().add(url, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, 170, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/booking/GUI/images/System/1511.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 880, 690));

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
        if (!(placeNameField.getText().equals("") || detailPlaceField.getText().equals("") || url.getText().equals(""))) {
            try {
                Place.addPlace(placeNameField.getText(), detailPlaceField.getText(), url.getText());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "ขออภัยเกิดข้อผิดพลาดบางอย่าง \nกรุณาเปลี่ยนชื่อรูปที่ท่านอัพโหลด");
            }
            JOptionPane.showMessageDialog(null, "Add Inserted Successfully");
            PlaceList placeList = null;
            try {
                placeList = new PlaceList(user);
            } catch (ParseException ex) {
                Logger.getLogger(AddPlace.class.getName()).log(Level.SEVERE, null, ex);
            }
            placeList.setVisible(true);
            setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "กรุณากรอกข้อมูลให้ครบ");
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
        PlaceList placeList = null;
        try {
            placeList = new PlaceList(user);
        } catch (ParseException ex) {
            Logger.getLogger(AddPlace.class.getName()).log(Level.SEVERE, null, ex);
        }
        placeList.setVisible(true);
        setVisible(false);
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

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        JFileChooser fileopen = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg", "gif", "png");
        fileopen.addChoosableFileFilter(filter);

        int ret = fileopen.showDialog(null, "Choose file");

        if (ret == JFileChooser.APPROVE_OPTION) {
            File selectFile = fileopen.getSelectedFile();
            String path = selectFile.getAbsolutePath();
            url.setText(fileopen.getSelectedFile().toString());
            pic.setIcon(ResizeImage(pic, path));
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
            java.util.logging.Logger.getLogger(AddPlace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddPlace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddPlace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddPlace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DatailText;
    private javax.swing.JTextArea detailPlaceField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel pic;
    private javax.swing.JTextField placeNameField;
    private javax.swing.JLabel placeNameText;
    private javax.swing.JTextField url;
    // End of variables declaration//GEN-END:variables
}
