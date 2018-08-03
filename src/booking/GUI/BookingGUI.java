package booking.GUI;

import booking.database.DBManagement;
import booking.system.*;
import java.awt.Color;
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

        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        placeName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        datailBooking = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        nameBooking = new javax.swing.JTextField();
        end = new javax.swing.JComboBox<>();
        start = new javax.swing.JComboBox<>();
        chooseDate = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ระบบการจอง");
        setAutoRequestFocus(false);
        setPreferredSize(new java.awt.Dimension(800, 590));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Kanit", 0, 15)); // NOI18N
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
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 300, 110, 40));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("< ย้อนกลับ");
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
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 500, 150, 40));

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("ยืนยัน");
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
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 500, 150, 40));

        jLabel1.setFont(new java.awt.Font("Kanit", 3, 40)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ระบบการจองสถานที่");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 440, 50));

        jLabel2.setFont(new java.awt.Font("Kanit", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("หัวข้อการจอง :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 180, 60));

        jLabel3.setFont(new java.awt.Font("Kanit", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("รายละเอียดการจอง :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 180, 50));

        jLabel4.setFont(new java.awt.Font("Kanit", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("สถานที่ :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 180, 60));

        jLabel9.setFont(new java.awt.Font("Kanit", 3, 40)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("ระบบการจองสถานที่");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 430, 60));

        jLabel6.setFont(new java.awt.Font("Kanit", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ถึง");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, 50, 60));

        placeName.setText(place.getNamePlace());
        placeName.setEditable(false);
        placeName.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        getContentPane().add(placeName, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 330, 40));

        jLabel7.setFont(new java.awt.Font("Kanit", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("เวลา :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 180, 60));

        datailBooking.setColumns(20);
        datailBooking.setFont(new java.awt.Font("Kanit", 0, 14)); // NOI18N
        datailBooking.setRows(5);
        jScrollPane1.setViewportView(datailBooking);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 330, 110));

        jLabel8.setFont(new java.awt.Font("Kanit", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("กำหนดวันจอง :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 180, 60));

        nameBooking.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        nameBooking.setToolTipText("");
        getContentPane().add(nameBooking, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 330, 40));

        end.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        end.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "09:00", "10:00", "11:00", "12:00","13:00","14:00","15:00","16:00" }));
        getContentPane().add(end, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, 110, 40));

        start.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        start.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "08:00","09:00","10:00","11:00","12:00","13:00","14:00","15:00","16:00","17:00","18:00" }));
        getContentPane().add(start, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, 110, 40));

        chooseDate.setFont(new java.awt.Font("Kanit", 0, 15));
        getContentPane().add(chooseDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 330, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/booking/GUI/images/System/ffff.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 570));

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

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        try {
            ListBooking lb = new ListBooking(place);
            lb.setVisible(true);
        } catch (ParseException ex) {
            Logger.getLogger(BookingGUI.class.getName()).log(Level.SEVERE, null, ex);
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
        PlaceGUI e = new PlaceGUI(user, place);
        e.setVisible(true);
        setVisible(false);
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
        Booking bookDB = new Booking();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sft = new SimpleDateFormat("HH:mm");
        String topicBooking = nameBooking.getText();
        String detail = datailBooking.getText();
        String namePlace = placeName.getText();
        int id = user.getUserId();
        String startTime = (String) start.getSelectedItem();
        String endTime = (String) end.getSelectedItem();
        int ts = Integer.parseInt(startTime.substring(0, startTime.indexOf(":")));
        int te = Integer.parseInt(endTime.substring(0, endTime.indexOf(":")));
        int placeNum = place.getPlaceId();
        String conPlaceNum = Integer.toString(placeNum);
        Date d1 = new Date();
        try {
            Statement st = DBManagement.getCn().createStatement();
            ResultSet rs = st.executeQuery("select * from BBooking");
            String dateConvert = ft.format(d1);
            Date dateToday = ft.parse(dateConvert);
            if (!((topicBooking.equals("")) || (detail.equals("")))) {
                if (ts < te) {
                    if (!(user.getStatusBooking())) {
                        Calendar c = Calendar.getInstance();
                        c.setTime(chooseDate.getDate());
                        int year = c.get(Calendar.YEAR);
                        int month = c.get(Calendar.MONTH) + 1;
                        int day = c.get(Calendar.DATE);
                        String allDate = year + "-" + month + "-" + day;
                        while (rs.next()) {
                            DBManagement.ormBooking(rs, bookDB);
                            Date checkDBDate = ((bookDB.getDate()));
                            Date checkDate = chooseDate.getDate();
                            Date checkTimeStartDB = (bookDB.getTimeStart());
                            Date checkTimeEndDB = (bookDB.getTimeEnd());
                            Date checkTimeStart = sft.parse(startTime);
                            Date checkTimeEnd = sft.parse(endTime);
                            long diff = checkDBDate.getTime() - checkDate.getTime();
                            long temp = d1.getTime() - checkDate.getTime();
                            int tempDiff = (int) (temp / (24 * 60 * 60 * 1000));
                            int dayDiff = (int) (diff / (24 * 60 * 60 * 1000));
                            long diffTimeStart = checkTimeStartDB.getTime() - checkTimeStart.getTime();
                            long diffTimeEnd = checkTimeStartDB.getTime() - checkTimeEnd.getTime();
                            int hourDiffStart = (int) (diffTimeStart / (60 * 60 * 1000) % 24);
                            int hourDiffEnd = (int) (diffTimeEnd / (60 * 60 * 1000) % 24);
                            if (temp<0) {
                                    if (bookDB.getPlace().getPlaceId() == placeNum) {
                                    if (dayDiff == 0) {
                                        if (hourDiffStart <= 0) {
                                            //เวลาเริ่มตรง
                                            JOptionPane.showMessageDialog(this, "ไม่สามารถจองเวลานี้ได้");
                                            break;
                                        } else if (hourDiffEnd < 0) {
                                            JOptionPane.showMessageDialog(this, "ไม่สามารถจองเวลานี้ได้");
                                            break;
                                            //เวลาจบตรง

                                        } else {
                                            // System.out.println("วันตรง เเต่เวลาไม่ชนกับคนอื่น จองได้");
                                            Booking.booking(id, conPlaceNum, allDate, topicBooking, detail, startTime, endTime);
                                            user.setStatusBooking(true);
                                            JOptionPane.showMessageDialog(this, "จองห้องเรียบร้อย");
                                            PlaceGUI p = new PlaceGUI(user, place);
                                            p.setVisible(true);
                                            setVisible(false);
                                            break;
                                        }
                                    } else {
                                        //*System.out.println("วันไม่ตรง จองได้");
                                        Booking.booking(id, conPlaceNum, allDate, topicBooking, detail, startTime, endTime);
                                        user.setStatusBooking(true);
                                        JOptionPane.showMessageDialog(this, "จองห้องเรียบร้อย");
                                        PlaceGUI p = new PlaceGUI(user, place);
                                        p.setVisible(true);
                                        setVisible(false);
                                        break;
                                    }
                                } else {
                                    Booking.booking(id, conPlaceNum, allDate, topicBooking, detail, startTime, endTime);
                                    user.setStatusBooking(true);
                                    JOptionPane.showMessageDialog(this, "จองห้องเรียบร้อย");
                                    PlaceGUI p = new PlaceGUI(user, place);
                                    p.setVisible(true);
                                    setVisible(false);
                                    break;
                                }
                            } else {
                                JOptionPane.showMessageDialog(this, "กรุณาเลือกวันที่ให้ถูกต้อง(เลือกได้เฉพาะวันที่กำลังจะมาถึงเท่านั้น)");
                                break;
                            }
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
        } catch (SQLException se) {
            System.out.println(se.getMessage());
        } catch (ParseException ex) {
            Logger.getLogger(BookingGUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "กรุณาเลือกวันที่ต้องการจอง");
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
    private com.toedter.calendar.JDateChooser chooseDate;
    private javax.swing.JTextArea datailBooking;
    private javax.swing.JComboBox<String> end;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameBooking;
    private javax.swing.JTextField placeName;
    private javax.swing.JComboBox<String> start;
    // End of variables declaration//GEN-END:variables
}
