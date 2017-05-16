package booking.GUI;

import booking.database.DBManagement;
import booking.system.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class BookingGUI extends javax.swing.JFrame {

    private User user;
    private Place place;
    private Booking booking;
// สถานที่ วัน เวลา เรียงตามลำดับ
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    // ใน DB เป็นแบบนี้ YYYY-MM-DD
    public BookingGUI(User inputUser, Place inputPlace) throws ParseException {
        user = inputUser;
        place = inputPlace;
        initComponents();
        chooseDate.setDateFormatString("yyyy-MM-dd");
        Booking.clearBooking();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        placeName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        datailBooking = new javax.swing.JTextArea();
        btnCencel = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnConfirm1 = new javax.swing.JButton();
        nameBooking = new javax.swing.JTextField();
        btnListBooking = new javax.swing.JButton();
        end = new javax.swing.JComboBox<>();
        start = new javax.swing.JComboBox<>();
        chooseDate = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("ระบบการจอง");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, 58));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("หัวข้อการจอง :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 170, 60));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("รายละเอียดการจอง :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 170, 60));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("สถานที่ :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 170, 60));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ถึง");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, 40, 60));

        placeName.setText(place.getNamePlace());
        placeName.setEditable(false);
        getContentPane().add(placeName, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 330, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("เวลา :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, 170, 60));

        datailBooking.setColumns(20);
        datailBooking.setRows(5);
        jScrollPane1.setViewportView(datailBooking);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 330, 110));

        btnCencel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCencel.setText("< ย้อนกลับ");
        btnCencel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCencelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCencel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 510, 150, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("กำหนดวันจอง :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 170, 60));

        btnConfirm1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnConfirm1.setText("ยืนยัน");
        btnConfirm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirm1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfirm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 510, 150, 40));

        nameBooking.setToolTipText("");
        getContentPane().add(nameBooking, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 330, 40));

        btnListBooking.setText("List Booking");
        btnListBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListBookingActionPerformed(evt);
            }
        });
        getContentPane().add(btnListBooking, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 300, 100, 40));

        end.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "09:00", "10:00", "11:00", "12:00","13:00","14:00","15:00","16:00" }));
        getContentPane().add(end, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 440, 110, 40));

        start.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "08:00","09:00","10:00","11:00","12:00","13:00","14:00","15:00","16:00","17:00","18:00" }));
        getContentPane().add(start, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, 110, 40));
        getContentPane().add(chooseDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 330, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCencelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCencelActionPerformed
        PlaceGUI e = new PlaceGUI(user, place);
        e.setVisible(true);
        setVisible(false);

    }//GEN-LAST:event_btnCencelActionPerformed

    private void btnConfirm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirm1ActionPerformed
        Booking bookDB = new Booking();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sft = new SimpleDateFormat("HH:mm");
        String topicBooking = nameBooking.getText();
        String detail = datailBooking.getText();
        String namePlace = placeName.getText();
        String chooseDateNow = chooseDate.getDateFormatString();
        int id = user.getUserId();
        String conUserID = Integer.toString(id);
        String startTime = (String) start.getSelectedItem();
        String endTime = (String) end.getSelectedItem();
        int placeNum = place.getPlaceId();
        String conPlaceNum = Integer.toString(placeNum);
        Calendar c = Calendar.getInstance();
        c.setTime(chooseDate.getDate());
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DATE);
        String allDate = year + "-" + month + "-" + day;
        int ts = Integer.parseInt(startTime.substring(0, startTime.indexOf(":")));
        int te = Integer.parseInt(endTime.substring(0, endTime.indexOf(":")));
        try {
            DBManagement db = new DBManagement();
            String sql = "select * from BBooking ";
            Statement st = db.getCn().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                DBManagement.ormBooking(rs, bookDB);
                Date checkDBDate = ((bookDB.getDate()));
                Date checkDate = chooseDate.getDate();
                Date checkTimeStartDB = (bookDB.getTimeStart());
                Date checkTimeEndDB = (bookDB.getTimeEnd());
                Date checkTimeStart = sft.parse(startTime);
                Date checkTimeEnd = sft.parse(endTime);
                long diff = checkDBDate.getTime() - checkDate.getTime();
                int dayDiff = (int) (diff / (24 * 60 * 60 * 1000));
                long diffTimeStart = checkTimeStartDB.getTime() - checkTimeStart.getTime();
                long diffTimeEnd = checkTimeEndDB.getTime() - checkTimeEnd.getTime();
                int hourDiffStart = (int) (diffTimeStart / (60 * 60 * 1000) % 24);
                int minuteDiffStart = (int) (diffTimeStart / (60 * 1000) % 60);
                int hourDiffEnd = (int) (diffTimeEnd / (60 * 60 * 1000) % 24);
                int minuteDiffEnd = (int) (diffTimeEnd / (60 * 1000) % 60);
                if (!(nameBooking.equals("")) && !(datailBooking.equals(""))) {
                    if (ts < te) {
                        if (!(user.getStatusBooking())) {
                            if (bookDB.getPlace().getPlaceId() == placeNum) {
                                if (dayDiff == 0) {
                                    if (hourDiffStart == 0 && minuteDiffStart == 0) {
                                        //System.out.println("เข้าเวลาเริ่มตรง");
                                        JOptionPane.showMessageDialog(this, "ไม่สามารถจองเวลานี้ได้");
                                    } else if (hourDiffEnd == 0 && minuteDiffEnd == 0) {
                                        JOptionPane.showMessageDialog(this, "ไม่สามารถจองเวลานี้ได้");
                                        //System.out.println("เวลาจบตรง");
                                        //เวลาจบตรง
                                    } else if (hourDiffStart <= 0) {
                                        JOptionPane.showMessageDialog(this, "ไม่สามารถจองเวลานี้ได้");
                                        //System.out.println("เวลาเริ่มเวลาจบไม่ตรงเเต่อยู่ในช่วงของคนอื่น");
                                        //เวลาเริ่มเวลาจบไม่ตรงเเต่อยู่ในช่วงของคนอื่น
                                    } else if (hourDiffEnd >= 0) {
                                        JOptionPane.showMessageDialog(this, "ไม่สามารถจองเวลานี้ได้");

                                    } else {
                                        // System.out.println("วันตรง เเต่เวลาไม่ชนกับคนอื่น จองได้");
                                        String upSql = "INSERT INTO BBooking" + "(UserID,PlaceID,Date,nameBooking,detailBooking,TimeStart,TimeEnd)" + "VALUES (?,?,?,?,?,?,?)";
                                        PreparedStatement pst = DBManagement.getCn().prepareStatement(upSql);
                                        String sqlStatus = "update Buser set StatusBooking ='" + 1 + "'" + "where UserID = '" + id + "'";
                                        Statement stStatus = db.getCn().createStatement();
                                        stStatus.executeUpdate(sqlStatus);
                                        pst.setString(1, conUserID);
                                        pst.setString(2, conPlaceNum);
                                        pst.setString(3, allDate);
                                        pst.setString(4, topicBooking);
                                        pst.setString(5, detail);
                                        pst.setString(6, startTime + ":00");
                                        pst.setString(7, endTime + ":00");
                                        pst.executeUpdate();
                                        user.setStatusBooking(true);
                                        JOptionPane.showMessageDialog(this, "จองห้องเรียบร้อย");
                                        //โน้ต อิอิ
                                        //เวลาจองได้ ให้ user.setStatusBooking(false) เเล้วก้ออัพขึ้น DB ด้วย 
                                    }
                                } else {
                                    /*System.out.println("วันไม่ตรง จองได้");
                                    System.out.println(diff);*/
                                    String upSql = "INSERT INTO BBooking" + "(UserID,PlaceID,Date,nameBooking,detailBooking,TimeStart,TimeEnd)" + "VALUES (?,?,?,?,?,?,?)";
                                    PreparedStatement pst = DBManagement.getCn().prepareStatement(upSql);
                                    String sqlStatus = "update Buser set StatusBooking ='" + 1 + "'" + "where UserID = '" + id + "'";
                                    Statement stStatus = db.getCn().createStatement();
                                    stStatus.executeUpdate(sqlStatus);
                                    pst.setString(1, conUserID);
                                    pst.setString(2, conPlaceNum);
                                    pst.setString(3, allDate);
                                    pst.setString(4, topicBooking);
                                    pst.setString(5, detail);
                                    pst.setString(6, startTime + ":00");
                                    pst.setString(7, endTime + ":00");
                                    pst.executeUpdate();
                                    user.setStatusBooking(true);
                                    JOptionPane.showMessageDialog(this, "จองห้องเรียบร้อย");
                                    //เวลาจองได้ ให้ user.setStatusBooking(true) เเล้วก้ออัพขึ้น DB ด้วย
                                }
                            } else {
                                String upSql = "INSERT INTO BBooking" + "(UserID,PlaceID,Date,nameBooking,detailBooking,TimeStart,TimeEnd)" + "VALUES (?,?,?,?,?,?,?)";
                                PreparedStatement pst = DBManagement.getCn().prepareStatement(upSql);
                                String sqlStatus = "update Buser set StatusBooking ='" + 1 + "'" + "where UserID = '" + id + "'";
                                Statement stStatus = db.getCn().createStatement();
                                stStatus.executeUpdate(sqlStatus);
                                pst.setString(1, conUserID);
                                pst.setString(2, conPlaceNum);
                                pst.setString(3, allDate);
                                pst.setString(4, topicBooking);
                                pst.setString(5, detail);
                                pst.setString(6, startTime + ":00");
                                pst.setString(7, endTime + ":00");
                                pst.executeUpdate();
                                user.setStatusBooking(true);
                                JOptionPane.showMessageDialog(this, "จองห้องเรียบร้อย");

                            }
                        } else {
                            JOptionPane.showMessageDialog(this, "คุณมีการจองห้องไว้แล้ว");
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "รูปแบบของเวลาไม่ถูกต้อง");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "กรุณากรอกข้อมูลให้ครบ");
                }
//                if (!(user.getStatusBooking())){
//                    if (bookDB.getPlace().getPlaceId()==placeNum){
//                        if (diff==0&&hourDiffEnd>=1&&hourDiffStart<=0){   
//                           JOptionPane.showMessageDialog(this,"วันและเวลานี้มีการจองไปแล้ว กรุณาเลือกวันหรือเวลาใหม่ครับ");    
//                        }
//                        else {
//                            /*String upSql = "UPDATE BBooking SET UserID ='"+id+"',"+"PlaceID='"+place.getPlaceId()+"',"+"Date ='"+chooseDateNow+"',"+"nameBooking ='"+topicBooking+
//                                            "',"+"detailBooking = '"+detail+"',"+"TimeStart ='"+startTime+"',"+"TimeEnd='"+endTime+"'";*/
//                            String upSql = "INSERT INTO BBooking"+"(UserID,PlaceID,Date,detailBooking,TimeStart,TimeEnd)"+"VALUES (?,?,?,?,?,?)";
//                            PreparedStatement pst = DBManagement.getCn().prepareStatement(upSql);
//                            String sqlStatus = "update Buser set StatusBooking ='"+1+"'"+"where UserID = '"+id+"'";
//                            Statement stStatus = db.getCn().createStatement();
//                            stStatus.executeUpdate(sqlStatus);
//                            pst.setString(1,conUserID);
//                            pst.setString(2,conPlaceNum);
//                            pst.setString(3,allDate);
//                            pst.setString(4,topicBooking);
//                            pst.setString(5,detail);
//                            pst.setString(6,startTime+":00");
//                            pst.setString(7,endTime+":00");
//                            pst.executeUpdate();
//                            
//                            user.setStatusBooking(true);
//                            JOptionPane.showMessageDialog(this,"จองห้องเรียบร้อย");
//                           
//                            break;
//                        }
//                        if (diff==0&&hourDiffStart==0&&minuteDiffStart==0&&hourDiffEnd==0&&minuteDiffEnd==0){
//                            JOptionPane.showMessageDialog(this,"วันและเวลานี้มีการจองไปแล้ว กรุณาเลือกวันหรือเวลาใหม่ครับ");
//                        }
//                        else{
//                            /*String upSql = "UPDATE BBooking SET UserID ='"+id+"',"+"PlaceID='"+place.getPlaceId()+"',"+"Date ='"+chooseDateNow+"',"+"nameBooking ='"+topicBooking+
//                                            "',"+"detailBooking = '"+detail+"',"+"TimeStart ="+startTime+"',"+"TimeEnd='"+endTime+"'";*/
//                            String upSql = "INSERT INTO BBooking"+"(UserID,PlaceID,Date,detailBooking,TimeStart,TimeEnd)"+"VALUES (?,?,?,?,?,?)";
//                            PreparedStatement pst = DBManagement.getCn().prepareStatement(upSql);
//                            String sqlStatus = "update Buser set StatusBooking ='"+1+"'"+"where UserID = '"+id+"'";
//                            Statement stStatus = db.getCn().createStatement();
//                            stStatus.executeUpdate(sqlStatus);
//                            pst.setString(1,conUserID);
//                            pst.setString(2,conPlaceNum);
//                            pst.setString(3,allDate);
//                           pst.setString(4,topicBooking);
//                            pst.setString(5,detail);
//                            pst.setString(6,startTime+":00");
//                            pst.setString(7,endTime+":00");
//                            pst.executeUpdate();
//                            user.setStatusBooking(true);
//                            JOptionPane.showMessageDialog(this,"จองห้องเรียบร้อย");
//                            break;
//                        }
//
//                        if (diff!=0){
//                            
//                            /*String upSql = "UPDATE BBooking SET UserID ='"+id+"',"+"PlaceID='"+place.getPlaceId()+"',"+"Date ='"+chooseDateNow+"',"+"nameBooking ='"+topicBooking+
//                                            "',"+"detailBooking = '"+detail+"',"+"TimeStart ="+startTime+"',"+"TimeEnd='"+endTime+"'";*/
//                            String upSql = "INSERT INTO BBooking"+"(UserID,PlaceID,Date,detailBooking,TimeStart,TimeEnd)"+"VALUES (?,?,?,?,?,?)";
//                            PreparedStatement pst = DBManagement.getCn().prepareStatement(upSql);
//                            String sqlStatus = "update Buser set StatusBooking ='"+1+"'"+"where UserID = '"+id+"'";
//                            Statement stStatus = db.getCn().createStatement();
//                            stStatus.executeUpdate(sqlStatus);
//                            pst.setString(1,conUserID);
//                            pst.setString(2,conPlaceNum);
//                            pst.setString(3,allDate);
//                            pst.setString(4,topicBooking);
//                            pst.setString(5,detail);
//                            pst.setString(6,startTime+":00");
//                            pst.setString(7,endTime+":00");
//                            user.setStatusBooking(true);
//                            pst.executeUpdate();
//                            //Statement stUp = db.getCn().createStatement();       
//                            //stUp.execute(upSql);
//                            JOptionPane.showMessageDialog(this,"จองห้องเรียบร้อย");
//                            break;
//                        }
//                        else {
//
//                        }
//                        if (diff==0&&hourDiffStart==0&&hourDiffStart>=1){
//                            JOptionPane.showMessageDialog(this,"วันและเวลานี้มีการจองไปแล้ว กรุณาเลือกวันหรือเวลาใหม่ครับ");
//                        }
//                        else{
//                             String upSql = "INSERT INTO BBooking"+"(UserID,PlaceID,Date,nameBooking,detailBooking,TimeStart,TimeEnd)"+"VALUES (?,?,?,?,?,?,?)";
//                            PreparedStatement pst = DBManagement.getCn().prepareStatement(upSql);
//                            String sqlStatus = "update Buser set StatusBooking ='"+1+"'"+"where UserID = '"+id+"'";
//                            Statement stStatus = db.getCn().createStatement();
//                            stStatus.executeUpdate(sqlStatus);
//                            pst.setString(1,conUserID);
//                            pst.setString(2,conPlaceNum);
//                            pst.setString(3,allDate);
//                            pst.setString(4,topicBooking);
//                            pst.setString(5,detail);
//                            pst.setString(6,startTime+":00");
//                            pst.setString(7,endTime+":00");
//                            pst.executeUpdate();
//                            user.setStatusBooking(true);
//                            JOptionPane.showMessageDialog(this,"จองห้องเรียบร้อย");
//                            break;
//                    
//                        }
//                    }
//                    else{
//                        /*String upSql = "UPDATE BBooking SET UserID ='"+id+"',"+"PlaceID='"+place.getPlaceId()+"',"+"Date ='"+chooseDateNow+"',"+"nameBooking ='"+topicBooking+
//                                                                    "',"+"detailBooking = '"+detail+"',"+"TimeStart ="+startTime+"',"+"TimeEnd='"+endTime+"'";*/
//                           String upSql = "INSERT INTO BBooking"+"(UserID,PlaceID,Date,nameBooking,detailBooking,TimeStart,TimeEnd)"+"VALUES (?,?,?,?,?,?,?)";
//                            PreparedStatement pst = DBManagement.getCn().prepareStatement(upSql);
//                            String sqlStatus = "update Buser set StatusBooking ='"+1+"'"+"where UserID = '"+id+"'";
//                            Statement stStatus = db.getCn().createStatement();
//                            stStatus.executeUpdate(sqlStatus);
//                            pst.setString(1,conUserID);
//                            pst.setString(2,conPlaceNum);
//                            pst.setString(3,allDate);
//                            pst.setString(4,topicBooking);
//                            pst.setString(5,detail);
//                            pst.setString(6,startTime+":00");
//                            pst.setString(7,endTime+":00");
//                            pst.executeUpdate();
//                            user.setStatusBooking(true);
//                            JOptionPane.showMessageDialog(this,"จองห้องเรียบร้อย");
//                            break;
//                    }
//                }
//                else{
//                    JOptionPane.showMessageDialog(this,"คุณมีการจองห้องไว้แล้ว");
//                }
            }
        } catch (SQLException se) {
            System.out.println(se.getMessage());
        } catch (ParseException ex) {
            Logger.getLogger(BookingGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnConfirm1ActionPerformed

    private void btnListBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListBookingActionPerformed
        try {
            ListBooking lb = new ListBooking(place);
            lb.setVisible(true);
        } catch (ParseException ex) {
            Logger.getLogger(BookingGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnListBookingActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BookingGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookingGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookingGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookingGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCencel;
    private javax.swing.JButton btnConfirm1;
    private javax.swing.JButton btnListBooking;
    private com.toedter.calendar.JDateChooser chooseDate;
    private javax.swing.JTextArea datailBooking;
    private javax.swing.JComboBox<String> end;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameBooking;
    private javax.swing.JTextField placeName;
    private javax.swing.JComboBox<String> start;
    // End of variables declaration//GEN-END:variables
}
