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

public class StatusBooking extends javax.swing.JFrame {

    User user;
    Booking booking = new Booking();

    public StatusBooking(User inputUser) throws ParseException {
        user = inputUser;

        try {
            PreparedStatement pst = DBManagement.getCn().prepareStatement("select * from BBooking where UserID=?");
            pst.setString(1, user.getUserId() + "");
            ResultSet rs = pst.executeQuery();
            rs.next();
            DBManagement.ormBooking(rs, booking);

        } catch (SQLException se) {
            // ถ้าไม่มีการจอง จะมาเข้าตรงนี้
        }
        initComponents();
        checkBooking();
        Booking.clearBooking();
    }

    public void checkBooking() {
        if (user.getStatusBooking() == true) {
            nameText.setText(booking.getUser().getName() + " " + booking.getUser().getSurname());
            placeText.setText(booking.getPlace().getNamePlace());
            timeText.setText(booking.getDate() + " " + booking.getTimeStart() + " ถึง " + booking.getTimeEnd());
        } else {
            nameText.setText(user.getName() + " " + user.getSurname());
            placeText.setText("ไม่มีสถานที่ที่จองไว้");
            timeText.setText("ไม่มีเวลาที่จองไว้");
            btnCancelBooking.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnCancelBooking = new javax.swing.JButton();
        timeText = new javax.swing.JLabel();
        nameText = new javax.swing.JLabel();
        placeText = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("StatusBooking");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("วันเวลาที่จอง :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 120, 42));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("ชื่อ :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 40, 50));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("สถานที่จอง :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 100, 42));

        btnBack.setText("ย้อนกลับ");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 130, 30));

        btnCancelBooking.setText("ยกเลิกการจอง");
        btnCancelBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelBookingActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelBooking, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 130, 30));

        timeText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        timeText.setText("<Code>");
        jPanel1.add(timeText, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 290, 40));

        nameText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nameText.setText("<Code>");
        jPanel1.add(nameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 290, 50));

        placeText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        placeText.setText("<Code>");
        jPanel1.add(placeText, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 290, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("สถานะการจองปัจจุบัน");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 290, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        PlaceList placeList = null;
        try {
            placeList = new PlaceList(user);
        } catch (ParseException ex) {
            Logger.getLogger(StatusBooking.class.getName()).log(Level.SEVERE, null, ex);
        }
        placeList.setVisible(true);
        setVisible(false);

    }//GEN-LAST:event_btnBackActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int result = JOptionPane.showConfirmDialog(this, "ยืนยันการออกโปรแกรม", "ปิดโปรแกรม", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            System.exit(0);
        } else {
            return;
        }
    }//GEN-LAST:event_formWindowClosing
    public void getDate() throws SQLException, ParseException {
        int id = user.getUserId();
        Date date = new Date();

        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
 
        

        String dateSql = ft.format(date);
        int result = JOptionPane.showConfirmDialog(this, "ยืนยันการยกเลิกการจองห้อง", "Booking", JOptionPane.OK_CANCEL_OPTION);
        try {
            DBManagement db = new DBManagement();
            String sql = "select Date from BBooking where UserID = " + id + "";
            Statement st = db.getCn().createStatement();
            ResultSet rs = st.executeQuery(sql);
            rs.next();
            String dbDate = rs.getString("Date");
            Date todayDate = ft.parse(dateSql);
            Date startDate = ft.parse(dbDate);
            long diff = startDate.getTime() - todayDate.getTime();
            int dayDiff = (int) (diff / (24 * 60 * 60 * 1000));

            if (result == 0) {
                if (dayDiff <= 3) {
                    JOptionPane.showMessageDialog(this, "เลยกำหนดเวลาที่จะสามารถยกเลิกการจองห้องได้" + "\n" + "กรุณาติดต่อผู้ดูแล");
                } else {
                    Statement st1 = db.getCn().createStatement();
                    String sql1 = "DELETE FROM BBooking WHERE UserID ='" + id + "'";
                    st.executeUpdate(sql1);
                    String sql2 = "UPDATE Buser SET `StatusBooking` = ? WHERE `UserID` = ? ";
                    PreparedStatement pst = db.getCn().prepareStatement(sql2);
                    pst.setInt(1, 0);
                    pst.setInt(2, id);
                    pst.executeUpdate();
                    user.setStatusBooking(false);
                    nameText.setText(user.getName() + " " + user.getSurname());
                    placeText.setText("ไม่มีสถานที่ที่จองไว้");
                    timeText.setText("ไม่มีเวลาที่จองไว้");
                }

            } else {
                return;
            }
        } catch (SQLException se) {
            System.out.println(se.getMessage());
        }
    }
    private void btnCancelBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelBookingActionPerformed
        try {
            getDate();

        } catch (SQLException ex) {
            Logger.getLogger(StatusBooking.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(StatusBooking.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnCancelBookingActionPerformed

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
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCancelBooking;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nameText;
    private javax.swing.JLabel placeText;
    private javax.swing.JLabel timeText;
    // End of variables declaration//GEN-END:variables
}
