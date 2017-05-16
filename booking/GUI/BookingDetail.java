/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booking.GUI;

import booking.database.DBManagement;
import booking.system.Booking;
import booking.system.Place;
import java.awt.Image;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class BookingDetail extends javax.swing.JFrame {

    private Booking booking = new Booking();
    
    SimpleDateFormat sdf = new SimpleDateFormat("dd'/'MMM'/'yyyy");
    SimpleDateFormat sdfTime = new SimpleDateFormat("HH:mm:ss");
    
    public BookingDetail(int bookId) throws ParseException {
        booking.addDataBooking(bookId);
        initComponents();
         pic.setIcon(ResizeImageForApp(pic,booking.getPlace().getFilePicture()));
         Booking.clearBooking();
    }
    
     public ImageIcon ResizeImageForApp(JLabel picPlace, String filePicture) {
        ImageIcon myPic = new ImageIcon(getClass().getResource("/booking/GUI/images/Upload/"+filePicture));
        Image img = myPic.getImage();
        Image newImg = img.getScaledInstance(picPlace.getWidth(), picPlace.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        pic = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        userDetail = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        numBooking = new javax.swing.JLabel();
        fnameBooking = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        fBooking = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        fDatail = new javax.swing.JTextPane();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        namePlace = new javax.swing.JLabel();
        fStartTime = new javax.swing.JLabel();
        fEndTime = new javax.swing.JLabel();
        dayBooking = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(700, 500));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Kanit", 0, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("รายละเอียดการจอง");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 286, -1));

        btnBack.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        btnBack.setText("< ย้อนกลับ");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 136, -1));

        pic.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 299, 181));

        jLabel3.setFont(new java.awt.Font("Kanit", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("ชื่อสถานที่ :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 76, 41));

        jLabel4.setFont(new java.awt.Font("Kanit", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("รายละเอียดสถานที่");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 120, 120, 41));

        jLabel6.setFont(new java.awt.Font("Kanit", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("ผู้จอง :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 51, 41));

        userDetail.setFont(new java.awt.Font("Kanit", 0, 14)); // NOI18N
        userDetail.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        userDetail.setText("<Code>");
        userDetail.setText(booking.getUser().getName()+" "+
            booking.getUser().getSurname()+"  "+
            booking.getUser().getStdId()+"  "+
            booking.getUser().getEmail());
        getContentPane().add(userDetail, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 550, 41));

        jLabel8.setFont(new java.awt.Font("Kanit", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("รายละเอียดการจอง :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        jLabel9.setFont(new java.awt.Font("Kanit", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("ชื่อการจอง :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, 40));

        jLabel10.setFont(new java.awt.Font("Kanit", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("ตั้งเเต่เวลา :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 80, 30));

        jLabel11.setFont(new java.awt.Font("Kanit", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("รหัสการจอง :");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 80, 40));

        numBooking.setFont(new java.awt.Font("Kanit", 0, 14)); // NOI18N
        numBooking.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        numBooking.setText("<Code>");
        numBooking.setText(booking.getBookId()+"");
        getContentPane().add(numBooking, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, 50, 40));

        fnameBooking.setFont(new java.awt.Font("Kanit", 0, 14)); // NOI18N
        fnameBooking.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fnameBooking.setText("<Code>");
        fnameBooking.setText(booking.getNameBooking());
        getContentPane().add(fnameBooking, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 230, 40));

        fBooking.setEditable(false);
        fBooking.setFont(new java.awt.Font("Kanit", 0, 14)); // NOI18N
        fBooking.setText(booking.getDetailBooking());
        jScrollPane1.setViewportView(fBooking);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 220, 80));

        fDatail.setText(booking.getPlace().getDatailPlace());
        fDatail.setEditable(false);
        fDatail.setFont(new java.awt.Font("Kanit", 0, 14)); // NOI18N
        jScrollPane2.setViewportView(fDatail);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 330, 90));

        jLabel12.setFont(new java.awt.Font("Kanit", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("ถึงเวลา :");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 80, 40));

        jLabel13.setFont(new java.awt.Font("Kanit", 0, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("วัน/เดือน/ปี :");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 80, 40));

        namePlace.setFont(new java.awt.Font("Kanit", 0, 14)); // NOI18N
        namePlace.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        namePlace.setText("<Code>");
        namePlace.setText(booking.getPlace().getNamePlace());
        getContentPane().add(namePlace, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 220, 40));

        fStartTime.setFont(new java.awt.Font("Kanit", 0, 14)); // NOI18N
        fStartTime.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fStartTime.setText("<Code>");
        fStartTime.setText(sdfTime.format(booking.getTimeStart()));
        getContentPane().add(fStartTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, 130, 30));

        fEndTime.setFont(new java.awt.Font("Kanit", 0, 14)); // NOI18N
        fEndTime.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fEndTime.setText("<Code>");
        fEndTime.setText(sdfTime.format(booking.getTimeEnd()));
        getContentPane().add(fEndTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, 130, 40));

        dayBooking.setFont(new java.awt.Font("Kanit", 0, 14)); // NOI18N
        dayBooking.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dayBooking.setText("<Code>");
        dayBooking.setText(sdf.format(booking.getDate()));
        getContentPane().add(dayBooking, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, 130, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        try {
            ListBooking lb = new ListBooking(booking.getPlace());
            lb.setVisible(true);
            setVisible(false);
        } catch (ParseException ex) {
            Logger.getLogger(BookingDetail.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBackActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BookingDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookingDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookingDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookingDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel dayBooking;
    private javax.swing.JTextPane fBooking;
    private javax.swing.JTextPane fDatail;
    private javax.swing.JLabel fEndTime;
    private javax.swing.JLabel fStartTime;
    private javax.swing.JLabel fnameBooking;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel namePlace;
    private javax.swing.JLabel numBooking;
    private javax.swing.JLabel pic;
    private javax.swing.JLabel userDetail;
    // End of variables declaration//GEN-END:variables
}
