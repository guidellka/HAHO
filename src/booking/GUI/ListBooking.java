/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booking.GUI;

import booking.database.DBManagement;
import booking.system.Booking;
import booking.system.Place;
import booking.system.User;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class ListBooking extends javax.swing.JFrame {

    private Place place;

    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

    public ListBooking(Place inputPlace) throws ParseException {
        place = inputPlace;
        initComponents();
        addTable();
        Booking.clearBooking();

    }

    public void addTable() {

        try {
            Statement st = DBManagement.getCn().createStatement();
            ResultSet rsBooking = st.executeQuery("SELECT * FROM Buser JOIN BBooking ON (Buser.UserID=BBooking.UserID) where PlaceID=" + place.getPlaceId());
            DefaultTableModel model = (DefaultTableModel) table.getModel();

            while (rsBooking.next()) {
                String name = rsBooking.getString("Firstname");
                model.addRow(new Object[]{rsBooking.getInt("BookID"), sdf.format(rsBooking.getDate("Date")), rsBooking.getTime("TimeStart"),
                    rsBooking.getTime("TimeEnd"), name});
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jNamePlace = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setTitle("List Booking");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Kanit", 0, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ตารางเวลาของสถานที่");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 379, 46));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/booking/GUI/images/System/hhhh.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Kanit", 0, 16)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("สามารถ double click เพื่อดูรายละเอียดการจองได้");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 390, 30));

        jLabel2.setFont(new java.awt.Font("Kanit", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("สถานที่ :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 92, -1));

        jNamePlace.setFont(new java.awt.Font("Kanit", 0, 24)); // NOI18N
        jNamePlace.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jNamePlace.setText("<User Code>");
        jNamePlace.setText(place.getNamePlace());
        getContentPane().add(jNamePlace, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 300, -1));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 102), 2));
        jScrollPane1.getViewport().setBackground(new java.awt.Color(70, 229, 155,0));
        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0,0)));

        table.setFont(new java.awt.Font("Kanit", 0, 16)); // NOI18N
        table.setTableHeader(null);
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BookID","วัน/เดือน/ปี", "ตั้งเเต่เวลา", "ถึงเวลา","ชื่อผู้จอง"
            }
        )
        {public boolean isCellEditable(int row, int column){return false;}}
    );
    table.setRowHeight(30);
    table.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            tableMouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(table);

    getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 188, 611, 300));

    jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/booking/GUI/images/System/Untitled-2.jpg"))); // NOI18N
    jLabel3.setText("jLabel3");
    getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 730, 530));

    pack();
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        if (evt.getClickCount() == 2 && !evt.isConsumed()) {
            try {
                evt.consume();
                int index = table.getSelectedRow(); //ได้ค่า index ของ row เริ่มที่ 0
                TableModel tm = table.getModel();
                int bookId = (int) tm.getValueAt(index, 0);
                BookingDetail bd = new BookingDetail(bookId);
                bd.setVisible(true);
                setVisible(false);
            } catch (ParseException ex) {
                Logger.getLogger(ListBooking.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_tableMouseClicked

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jNamePlace;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
