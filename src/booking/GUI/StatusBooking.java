package booking.GUI;

import booking.database.*;
import booking.system.*;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.awt.Color;

public class StatusBooking extends javax.swing.JFrame {

    User user;
    Booking booking = new Booking();

    public StatusBooking(User inputUser) throws ParseException {
        user = inputUser;
        booking.addDataBookingByUserId(user.getUserId());
        initComponents();
        checkBooking();
        Booking.clearBooking();
    }

    public void checkBooking() {
        nameText.setText(user.getName() + " " + user.getSurname());
        if (user.getStatusBooking() == true) {
            SimpleDateFormat fd = new SimpleDateFormat("dd-MMM-yyyy");
            SimpleDateFormat ft = new SimpleDateFormat("HH:mm");
            placeText.setText(booking.getPlace().getNamePlace());
            timeText.setText(fd.format(booking.getDate()) + " เวลา " + ft.format(booking.getTimeStart()) + " - " + ft.format(booking.getTimeEnd()));
        } else {
            placeText.setText("ไม่มีสถานที่ที่จองไว้");
            timeText.setText("ไม่มีเวลาที่จองไว้");
            jLabel9.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        timeText = new javax.swing.JLabel();
        nameText = new javax.swing.JLabel();
        placeText = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("StatusBooking");
        setPreferredSize(new java.awt.Dimension(500, 330));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        jLabel2.setText("วันเวลาที่จอง :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 120, 42));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("ย้อนกลับ");
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
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 150, 40));

        jLabel10.setFont(new java.awt.Font("Kanit", 1, 30)); // NOI18N
        jLabel10.setText("สถานะการจองปัจจุบัน");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 290, 60));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("ยกเลิกการจอง");
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
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 150, 40));

        jLabel11.setBackground(new java.awt.Color(204, 204, 204));
        jLabel11.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("ยกเลิกการจอง");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
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
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 150, 40));

        jLabel3.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        jLabel3.setText("ชื่อ :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 40, 50));

        jLabel4.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        jLabel4.setText("สถานที่จอง :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 100, 42));

        timeText.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        timeText.setText("<Code>");
        jPanel1.add(timeText, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 290, 40));

        nameText.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        nameText.setText("<Code>");
        jPanel1.add(nameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 290, 50));

        placeText.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        placeText.setText("<Code>");
        jPanel1.add(placeText, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 290, 40));

        jLabel7.setFont(new java.awt.Font("Kanit", 1, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("สถานะการจองปัจจุบัน");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 290, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/booking/GUI/images/System/unnamed.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-620, -100, 1190, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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
    public void getDate() {
        try {
            int id = user.getUserId();
            Date date = new Date();
            SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
            String dateSql = ft.format(date);
            int result = JOptionPane.showConfirmDialog(this, "ยืนยันการยกเลิกการจองห้อง", "Booking", JOptionPane.OK_CANCEL_OPTION);
            String dbDate = booking.getDateBookingByUserId();
            Date todayDate = ft.parse(dateSql);
            Date startDate = ft.parse(dbDate);
            long diff = startDate.getTime() - todayDate.getTime();
            int dayDiff = (int) (diff / (24 * 60 * 60 * 1000));
            if (result == 0) {
                if (dayDiff <= 3) {
                    JOptionPane.showMessageDialog(this, "เลยกำหนดเวลาที่จะสามารถยกเลิกการจองห้องได้" + "\n" + "กรุณาติดต่อผู้ดูแล");
                } else {
                    booking.deleteBooking();
                    user.setStatusBooking(false);
                    JOptionPane.showMessageDialog(this, "ลบการจองของคุณเเล้ว");
                    PlaceList placeList = null;
                    try {
                        placeList = new PlaceList(user);
                    } catch (ParseException ex) {
                        Logger.getLogger(PlaceGUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    placeList.setVisible(true);
                    setVisible(false);
                }

            } else {
                return;
            }
        } catch (SQLException ex) {

        } catch (ParseException ex) {

        }

    }
    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        PlaceList placeList = null;
        try {
            placeList = new PlaceList(user);
        } catch (ParseException ex) {
            Logger.getLogger(StatusBooking.class.getName()).log(Level.SEVERE, null, ex);
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
        getDate();
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

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MouseEntered

    private void jLabel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MouseExited

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StatusBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StatusBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StatusBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StatusBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nameText;
    private javax.swing.JLabel placeText;
    private javax.swing.JLabel timeText;
    // End of variables declaration//GEN-END:variables
}
