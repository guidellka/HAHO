/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booking.GUI;

import booking.database.DBManagement;
import booking.system.Booking;
import booking.system.Place;
import java.awt.Color;
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
    
    SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");
    SimpleDateFormat sdfTime = new SimpleDateFormat("HH:mm:ss");
    
    public BookingDetail(int bookId) throws ParseException {
        booking.addDataBookingByBookId(bookId);
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

        pic = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        userDetail = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        numBooking = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        fnameBooking = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        fBooking = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        fDatail = new javax.swing.JTextPane();
        jLabel13 = new javax.swing.JLabel();
        namePlace = new javax.swing.JLabel();
        fStartTime = new javax.swing.JLabel();
        fEndTime = new javax.swing.JLabel();
        dayBooking = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setTitle("รายละเอียดการจอง");
        setPreferredSize(new java.awt.Dimension(970, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pic.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 440, 280));

        jLabel1.setFont(new java.awt.Font("Kanit", 3, 38)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("รายละเอียดการจอง");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 330, 50));

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("< ย้อนกลับ");
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
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 130, 50));

        jLabel3.setFont(new java.awt.Font("Kanit", 0, 22)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("ชื่อสถานที่ :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 110, 41));

        jLabel4.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("รายละเอียดสถานที่");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 150, 41));

        jLabel6.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("ผู้จอง :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, 70, 41));

        userDetail.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        userDetail.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        userDetail.setText("<Code>");
        userDetail.setText(booking.getUser().getName()+" "+
            booking.getUser().getSurname()+"  \n"+
            booking.getUser().getStdId()+"  \n"+
            booking.getUser().getEmail());
        getContentPane().add(userDetail, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 510, 550, 40));

        jLabel8.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("รายละเอียดการจอง :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, -1, -1));

        jLabel9.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("ชื่อการจอง :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, -1, 40));

        jLabel2.setFont(new java.awt.Font("Kanit", 3, 38)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("รายละเอียดการจอง");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 320, -1));

        jLabel10.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("เวลา :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 390, 60, 40));

        jLabel11.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("รหัสการจอง :");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, 110, 40));

        numBooking.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        numBooking.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        numBooking.setText("<Code>");
        numBooking.setText(booking.getBookId()+"");
        getContentPane().add(numBooking, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 20, 70, 40));

        jLabel14.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("-");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 390, 30, 40));

        fnameBooking.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        fnameBooking.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fnameBooking.setText("<Code>");
        fnameBooking.setText(booking.getNameBooking());
        getContentPane().add(fnameBooking, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 210, 40));

        fBooking.setEditable(false);
        fBooking.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        fBooking.setText(booking.getDetailBooking());
        jScrollPane1.setViewportView(fBooking);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 350, 80));

        fDatail.setText(booking.getPlace().getDatailPlace());
        fDatail.setEditable(false);
        fDatail.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        jScrollPane2.setViewportView(fDatail);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, 410, 150));

        jLabel13.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("วัน/เดือน/ปี :");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, 110, 40));

        namePlace.setFont(new java.awt.Font("Kanit", 0, 22)); // NOI18N
        namePlace.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        namePlace.setText("<Code>");
        namePlace.setText(booking.getPlace().getNamePlace());
        getContentPane().add(namePlace, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, 290, 40));

        fStartTime.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        fStartTime.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fStartTime.setText("<Code>");
        fStartTime.setText(sdfTime.format(booking.getTimeStart()));
        getContentPane().add(fStartTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 390, 100, 40));

        fEndTime.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        fEndTime.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fEndTime.setText("<Code>");
        fEndTime.setText(sdfTime.format(booking.getTimeEnd()));
        getContentPane().add(fEndTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 390, 130, 40));

        dayBooking.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        dayBooking.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dayBooking.setText("<Code>");
        dayBooking.setText(sdf.format(booking.getDate()));
        getContentPane().add(dayBooking, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, 140, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/booking/GUI/images/System/dfgdfgd.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 880, 180));

        jLabel5.setFont(new java.awt.Font("Kanit", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(101, 55, 7));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/booking/GUI/images/System/gkfy.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
       try {
            ListBooking lb = new ListBooking(booking.getPlace());
            lb.setVisible(true);
            setVisible(false);
        } catch (ParseException ex) {
            Logger.getLogger(BookingDetail.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
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
