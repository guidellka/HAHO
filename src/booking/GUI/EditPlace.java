package booking.GUI;

import booking.system.*;
import javax.swing.*;
import booking.database.*;
import java.awt.Color;
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
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        DatailText = new javax.swing.JLabel();
        placeNameText = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        detailPlaceField = new javax.swing.JTextArea();
        placeNameField = new javax.swing.JTextField();
        url = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Edit Place");
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pic.setBackground(new java.awt.Color(255, 255, 255));
        pic.setFont(new java.awt.Font("TH Sarabun New", 0, 24)); // NOI18N
        pic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pic.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pic.setOpaque(true);
        pic.setPreferredSize(new java.awt.Dimension(53, 33));
        getContentPane().add(pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 450, 250));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("ลบสถานที่");
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
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 500, 150, 50));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("ยืนยันการแก้ไข");
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
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 500, 150, 50));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("ยกเลิก");
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
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 500, 150, 50));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Kanit", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("upload");
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
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 230, 100, 30));

        DatailText.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        DatailText.setText("รายละเอียดของสถานที่");
        getContentPane().add(DatailText, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, 40));

        placeNameText.setFont(new java.awt.Font("Kanit", 1, 24)); // NOI18N
        placeNameText.setText("ชื่อสถานที่ :");
        getContentPane().add(placeNameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 114, 48));

        jScrollPane2.setPreferredSize(new java.awt.Dimension(166, 50));

        detailPlaceField.setColumns(20);
        detailPlaceField.setFont(new java.awt.Font("Kanit", 0, 16)); // NOI18N
        detailPlaceField.setRows(5);
        detailPlaceField.setAutoscrolls(false);
        detailPlaceField.setMinimumSize(new java.awt.Dimension(2, 30));
        detailPlaceField.setText(place.getDatailPlace());
        jScrollPane2.setViewportView(detailPlaceField);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 700, 110));

        placeNameField.setFont(new java.awt.Font("Kanit", 0, 22)); // NOI18N
        placeNameField.setText(place.getNamePlace());
        getContentPane().add(placeNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 520, 48));

        url.setEditable(false);
        url.setFont(new java.awt.Font("Kanit", 0, 14)); // NOI18N
        getContentPane().add(url, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, 170, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/booking/GUI/images/System/1511.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-290, -340, -1, -1));

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

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int result = JOptionPane.showConfirmDialog(this, "ยืนยันการออกโปรแกรม", "ปิดโปรแกรม", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            System.exit(0);
        } else {
            return;
        }
    }//GEN-LAST:event_formWindowClosing

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
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
        PlaceGUI p = null;
        p = new PlaceGUI(user, place);
        p.setVisible(true);
        setVisible(false);
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

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
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
    private javax.swing.JTextArea detailPlaceField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
