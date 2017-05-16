package booking.GUI;

import booking.system.*;
import javax.swing.*;
import booking.database.*;
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

        pic = new javax.swing.JLabel();
        submitButton = new javax.swing.JToggleButton();
        cancelButton = new javax.swing.JToggleButton();
        DatailText = new javax.swing.JLabel();
        placeNameText = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        detailPlaceField = new javax.swing.JTextArea();
        upload = new javax.swing.JButton();
        placeNameField = new javax.swing.JTextField();
        url = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Add Place");
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pic.setFont(new java.awt.Font("TH Sarabun New", 0, 24)); // NOI18N
        pic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pic.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pic.setOpaque(true);
        pic.setPreferredSize(new java.awt.Dimension(53, 33));
        getContentPane().add(pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 450, 250));

        submitButton.setFont(new java.awt.Font("TH Sarabun New", 0, 24)); // NOI18N
        submitButton.setText("ยืนยัน");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(submitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 510, 140, -1));

        cancelButton.setFont(new java.awt.Font("TH Sarabun New", 0, 24)); // NOI18N
        cancelButton.setText("ยกเลิก");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        getContentPane().add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 510, 164, -1));

        DatailText.setFont(new java.awt.Font("TH Sarabun New", 0, 24)); // NOI18N
        DatailText.setText("รายละเอียดของสถานที่");
        getContentPane().add(DatailText, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 150, 40));

        placeNameText.setFont(new java.awt.Font("TH Sarabun New", 1, 32)); // NOI18N
        placeNameText.setText("ชื่อสถานที่ :");
        getContentPane().add(placeNameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 114, 48));

        jScrollPane2.setPreferredSize(new java.awt.Dimension(166, 50));

        detailPlaceField.setColumns(20);
        detailPlaceField.setFont(new java.awt.Font("TH Sarabun New", 0, 20)); // NOI18N
        detailPlaceField.setRows(5);
        detailPlaceField.setAutoscrolls(false);
        detailPlaceField.setMinimumSize(new java.awt.Dimension(2, 30));
        jScrollPane2.setViewportView(detailPlaceField);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 700, 110));

        upload.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        upload.setText("Upload");
        upload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadActionPerformed(evt);
            }
        });
        getContentPane().add(upload, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 230, 90, 30));

        placeNameField.setFont(new java.awt.Font("TH Sarabun New", 0, 30)); // NOI18N
        getContentPane().add(placeNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 520, 48));

        url.setEditable(false);
        getContentPane().add(url, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, 170, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed

        try {
            Place.addPlace(placeNameField.getText(), detailPlaceField.getText(), url.getText());
        } catch (SQLException ex) {
            Logger.getLogger(AddPlace.class.getName()).log(Level.SEVERE, null, ex);
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
    }//GEN-LAST:event_submitButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed

        PlaceList placeList = null;
        try {
            placeList = new PlaceList(user);
        } catch (ParseException ex) {
            Logger.getLogger(AddPlace.class.getName()).log(Level.SEVERE, null, ex);
        }
        placeList.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void uploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadActionPerformed
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
    }//GEN-LAST:event_uploadActionPerformed

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
    private javax.swing.JToggleButton cancelButton;
    private javax.swing.JTextArea detailPlaceField;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel pic;
    private javax.swing.JTextField placeNameField;
    private javax.swing.JLabel placeNameText;
    private javax.swing.JToggleButton submitButton;
    private javax.swing.JButton upload;
    private javax.swing.JTextField url;
    // End of variables declaration//GEN-END:variables
}
