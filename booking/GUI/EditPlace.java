package booking.GUI;

import booking.system.*;
import javax.swing.*;
import booking.database.*;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.*;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class EditPlace extends javax.swing.JFrame {

    User user;
    Place place;

    public EditPlace(User inputUser, Place inputPlace) throws ParseException {
        user = inputUser;
        place = inputPlace;
        initComponents();
        pic.setIcon(ResizeImageForApp(pic, place.getFilePicture()));
        Booking.clearBooking();
    }

    public ImageIcon ResizeImageForApp(JLabel picPlace, String filePicture) {
        ImageIcon myPic = new ImageIcon(getClass().getResource("/booking/GUI/images/Upload/" + filePicture));
        Image img = myPic.getImage();
        Image newImg = img.getScaledInstance(picPlace.getWidth(), picPlace.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
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
        deletePlace = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Edit Place");
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
        submitButton.setText("ยืนยันการแก้ไข");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(submitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 510, 140, -1));

        cancelButton.setFont(new java.awt.Font("TH Sarabun New", 0, 24)); // NOI18N
        cancelButton.setText("ยกเลิก");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        getContentPane().add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 510, 164, -1));

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
        detailPlaceField.setText(place.getDatailPlace());
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
        placeNameField.setText(place.getNamePlace());
        getContentPane().add(placeNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 520, 48));

        url.setEditable(false);
        getContentPane().add(url, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, 170, 30));

        deletePlace.setFont(new java.awt.Font("TH Sarabun New", 0, 24)); // NOI18N
        deletePlace.setText("ลบสถานที่");
        deletePlace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePlaceActionPerformed(evt);
            }
        });
        getContentPane().add(deletePlace, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 510, 140, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void updateData() throws SQLException, InterruptedException {
        /* ชื่อกับรายละเอียดเหมือนกัน  รูปต้องเเยกเเคสเป็นแก้กับไม่แก้ */
        place.updatePlaceNameAndDetail(placeNameField.getText(), detailPlaceField.getText());
        if (!(url.getText().equals(""))) {
            place.changePicture(url.getText());
        }
        sleep(3000);
        JOptionPane.showMessageDialog(null, "Edit Place Successfully");
    }

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        int result = JOptionPane.showConfirmDialog(this, "กรุณายืนยันการเปลี่ยนแปลงสถานที่", "คำเตือน", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {

            try {
                updateData();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            } catch (InterruptedException ex) {
                Logger.getLogger(EditPlace.class.getName()).log(Level.SEVERE, null, ex);
            }
            PlaceGUI p = null;
            try {
                p = new PlaceGUI(user, place.getNamePlace());
            } catch (SQLException ex) {
                Logger.getLogger(EditPlace.class.getName()).log(Level.SEVERE, null, ex);
            }
            p.setVisible(true);
            setVisible(false);

        } else {
            return;
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed

        PlaceList e = null;
        try {
            e = new PlaceList(user);
        } catch (ParseException ex) {
            Logger.getLogger(EditPlace.class.getName()).log(Level.SEVERE, null, ex);
        }
        e.setVisible(true);
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

    private void deletePlaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePlaceActionPerformed
        int result = JOptionPane.showConfirmDialog(this, "คุณต้องการลบสถานที่นี้ใช่หรือไม่", "คำเตือน", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            try {
                place.deletePlace();
                JOptionPane.showMessageDialog(null, "Delete Place Successfully");
                PlaceList pl = new PlaceList(user);
                pl.setVisible(true);
                setVisible(false);
            } catch (SQLException ex) {
                Logger.getLogger(EditPlace.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(EditPlace.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            return;
        }
    }//GEN-LAST:event_deletePlaceActionPerformed

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
            java.util.logging.Logger.getLogger(EditPlace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditPlace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditPlace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditPlace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DatailText;
    private javax.swing.JToggleButton cancelButton;
    private javax.swing.JToggleButton deletePlace;
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
