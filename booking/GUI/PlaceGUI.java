package booking.GUI;

import booking.database.DBManagement;
import booking.system.*;
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
            btnEditPlace.setVisible(true);
        } else {
            btnEditPlace.setVisible(false);
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
        Booking = new javax.swing.JToggleButton();
        pic = new javax.swing.JLabel();
        placeHead = new javax.swing.JLabel();
        back = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textDetail = new javax.swing.JTextArea();
        btnEditPlace = new javax.swing.JToggleButton();
        Booking1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Place");
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        detailPlaceHead.setBackground(new java.awt.Color(153, 255, 153));
        detailPlaceHead.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        detailPlaceHead.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        detailPlaceHead.setText("รายละเอียดสถานที่");
        getContentPane().add(detailPlaceHead, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, 40));

        Booking.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Booking.setText("List Booking");
        Booking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookingActionPerformed(evt);
            }
        });
        getContentPane().add(Booking, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 430, 170, 50));

        pic.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pic.setToolTipText("");
        pic.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pic.setName(""); // NOI18N
        pic.setOpaque(true);
        pic.setPreferredSize(new java.awt.Dimension(53, 33));
        getContentPane().add(pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 450, 250));

        placeHead.setFont(new java.awt.Font("TH Sarabun New", 0, 36)); // NOI18N
        placeHead.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        placeHead.setText("<....Code.....>");
        placeHead.setText(place.getNamePlace());
        getContentPane().add(placeHead, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 520, 60));

        back.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        back.setText(" ย้อนกลับ");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 490, 170, 50));

        textDetail.setColumns(20);
        textDetail.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        textDetail.setRows(4);
        textDetail.setEditable(false);
        textDetail.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textDetail.setText(place.getDatailPlace());
        jScrollPane1.setViewportView(textDetail);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 540, 170));

        btnEditPlace.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEditPlace.setText("แก้ไขสถานที่");
        btnEditPlace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditPlaceActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditPlace, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, 120, 40));

        Booking1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Booking1.setText("จองสถานที่");
        Booking1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Booking1ActionPerformed(evt);
            }
        });
        getContentPane().add(Booking1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 370, 170, 50));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed

        PlaceList placeList = null;
        try {
            placeList = new PlaceList(user);
        } catch (ParseException ex) {
            Logger.getLogger(PlaceGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        placeList.setVisible(true);
        setVisible(false);

    }//GEN-LAST:event_backActionPerformed

    private void btnEditPlaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditPlaceActionPerformed
        try {
            EditPlace ep = new EditPlace(user, place);
            ep.setVisible(true);
            setVisible(false);
        } catch (ParseException ex) {
            Logger.getLogger(PlaceGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEditPlaceActionPerformed

    private void Booking1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Booking1ActionPerformed
        try {
            BookingGUI b = new BookingGUI(user, place);
            b.setVisible(true);
            setVisible(false);
        } catch (ParseException ex) {
            Logger.getLogger(PlaceGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Booking1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int result = JOptionPane.showConfirmDialog(this, "ยืนยันการออกโปรแกรม", "ปิดโปรแกรม", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            System.exit(0);
        } else {
            return;
        }
    }//GEN-LAST:event_formWindowClosing

    private void BookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookingActionPerformed
        try {
            ListBooking lb = new ListBooking(place);
            lb.setVisible(true);
        } catch (ParseException ex) {
            Logger.getLogger(PlaceGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BookingActionPerformed

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
    private javax.swing.JToggleButton Booking;
    private javax.swing.JToggleButton Booking1;
    private javax.swing.JToggleButton back;
    private javax.swing.JToggleButton btnEditPlace;
    private javax.swing.JLabel detailPlaceHead;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel pic;
    private javax.swing.JLabel placeHead;
    private javax.swing.JTextArea textDetail;
    // End of variables declaration//GEN-END:variables
}
