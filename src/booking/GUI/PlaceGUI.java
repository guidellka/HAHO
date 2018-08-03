package booking.GUI;

import booking.database.DBManagement;
import booking.system.*;
import java.awt.Color;
import java.awt.Image;
import java.sql.*;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PlaceGUI extends javax.swing.JFrame {

    private User user;
    private Place place = new Place();

    public PlaceGUI(User inputUser, String inputNamePlace) throws SQLException {
        user = inputUser;
        place.setObjectPlace(inputNamePlace);
        initComponents();
        pic.setIcon(ResizeImageForApp(pic, place.getFilePicture()));
        hideEditPlace();

    }

    public PlaceGUI(User inputUser, Place inputPlace) {
        user = inputUser;
        place = inputPlace;
        initComponents();
        pic.setIcon(ResizeImageForApp(pic, place.getFilePicture()));
        hideEditPlace();

    }

    public void hideEditPlace() {
        if (user.getStatusAdmin()) {
            jLabel12.setVisible(true);
        } else {
            jLabel12.setVisible(false);
        }
    }

    public ImageIcon ResizeImageForApp(JLabel picPlace, String filePicture) {
        ImageIcon myPic = new ImageIcon(getClass().getResource("/booking/GUI/images/Upload/" + filePicture));
        Image img = myPic.getImage();
        Image newImg = img.getScaledInstance(picPlace.getWidth(), picPlace.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        detailPlaceHead = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        pic = new javax.swing.JLabel();
        placeHead = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textDetail = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Place");
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setPreferredSize(new java.awt.Dimension(1024, 500));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        detailPlaceHead.setBackground(new java.awt.Color(153, 255, 153));
        detailPlaceHead.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        detailPlaceHead.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        detailPlaceHead.setText("รายละเอียดสถานที่");
        getContentPane().add(detailPlaceHead, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, -1, 40));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("ย้อนกลับ");
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
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 150, 50));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("List Booking");
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
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 350, 150, 50));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("จองสถานที่");
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
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 350, 150, 50));

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("แก้ไขสถานที่");
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
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 110, 150, 50));

        pic.setFont(new java.awt.Font("Kanit", 0, 24)); // NOI18N
        pic.setForeground(new java.awt.Color(204, 204, 204));
        pic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pic.setToolTipText("");
        pic.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pic.setName(""); // NOI18N
        pic.setOpaque(true);
        pic.setPreferredSize(new java.awt.Dimension(53, 33));
        getContentPane().add(pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 490, 290));

        placeHead.setFont(new java.awt.Font("Kanit", 0, 32)); // NOI18N
        placeHead.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        placeHead.setText("<....Code.....>");
        placeHead.setText(place.getNamePlace());
        getContentPane().add(placeHead, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 610, 60));

        textDetail.setColumns(20);
        textDetail.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        textDetail.setRows(4);
        textDetail.setEditable(false);
        textDetail.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textDetail.setText(place.getDatailPlace());
        jScrollPane1.setViewportView(textDetail);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, 420, 170));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/booking/GUI/images/System/1511.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -180, 1030, 900));

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

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        PlaceList placeList = null;
        try {
            placeList = new PlaceList(user);
        } catch (ParseException ex) {
            Logger.getLogger(PlaceGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        placeList.setVisible(true);
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
        try {
            ListBooking lb = new ListBooking(place);
            lb.setVisible(true);
        } catch (ParseException ex) {
            Logger.getLogger(PlaceGUI.class.getName()).log(Level.SEVERE, null, ex);
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
        try {
            BookingGUI b = new BookingGUI(user, place);
            b.setVisible(true);
            setVisible(false);
        } catch (ParseException ex) {
            Logger.getLogger(PlaceGUI.class.getName()).log(Level.SEVERE, null, ex);
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
        try {
            EditPlace ep = new EditPlace(user, place);
            ep.setVisible(true);
            setVisible(false);
        } catch (ParseException ex) {
            Logger.getLogger(PlaceGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
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

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PlaceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlaceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlaceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlaceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel detailPlaceHead;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel pic;
    private javax.swing.JLabel placeHead;
    private javax.swing.JTextArea textDetail;
    // End of variables declaration//GEN-END:variables
}
