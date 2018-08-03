package booking.GUI;

import booking.system.*;
import booking.database.*;
import java.awt.Color;
import java.sql.*;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.*;

public class PlaceList extends javax.swing.JFrame {

    private User user;
    SimpleDateFormat sdf = new SimpleDateFormat("dd'/'MM'/'yy HH:mm:ss");

    public PlaceList(User inputUser) throws ParseException {

        user = inputUser;
        initComponents();
        clock();
        addTable();
        hideAddPlace();
        Booking.clearBooking();

    }

    public void addTable() {
        try {
            Statement st = DBManagement.getCn().createStatement();
            ResultSet rsPlace = st.executeQuery("select * from Bplace");

            PreparedStatement pst = DBManagement.getCn().prepareStatement("select * from BBooking where PlaceID=?");

            DefaultTableModel model = (DefaultTableModel) table.getModel();

            int i = 1;
            while (rsPlace.next()) {
                pst.setString(1, rsPlace.getInt("PlaceID") + "");
                model.addRow(new Object[]{i++, rsPlace.getString("PlaceName")});
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public void clock() {
        Thread clock = new Thread() {
            public void run() {
                try {
                    while (true) {
                        dateT.setText(sdf.format(new Date()));
                        sleep(1000);
                    }
                } catch (InterruptedException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        };
        clock.start();
    }

    public void hideAddPlace() {
        if (user.getStatusAdmin()) {
            jLabel10.setVisible(true);
        } else {
            jLabel10.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginAs = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fs_name = new javax.swing.JLabel();
        placeNo = new javax.swing.JLabel();
        number = new javax.swing.JLabel();
        dateT = new javax.swing.JLabel();
        dateText = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("List Place");
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginAs.setFont(new java.awt.Font("Kanit", 0, 20)); // NOI18N
        loginAs.setForeground(new java.awt.Color(51, 51, 51));
        loginAs.setText("Login as:");
        getContentPane().add(loginAs, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 100, 30));

        jLabel9.setBackground(new java.awt.Color(255, 102, 102));
        jLabel9.setFont(new java.awt.Font("Kanit", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Your Booking");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 102)));
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
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 120, 30));

        jLabel10.setBackground(new java.awt.Color(255, 102, 102));
        jLabel10.setFont(new java.awt.Font("Kanit", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Add Place");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 102)));
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
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 120, 30));

        jLabel11.setBackground(new java.awt.Color(255, 102, 102));
        jLabel11.setFont(new java.awt.Font("Kanit", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Edit Profile");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 102)));
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
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 120, 30));

        jLabel12.setBackground(new java.awt.Color(255, 102, 102));
        jLabel12.setFont(new java.awt.Font("Kanit", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Logout");
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 102)));
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
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, 120, 30));

        jLabel2.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("กรุณาเลือกสถานที่(double click)  เพื่อจองหรือดูตารางเวลาของสถานที่นั้นๆ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 600, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/booking/GUI/images/System/Untitled-3.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, 40));

        fs_name.setFont(new java.awt.Font("Kanit", 0, 20)); // NOI18N
        fs_name.setForeground(new java.awt.Color(51, 51, 51));
        fs_name.setText("<fs_name>");
        fs_name.setText(user.getName()+" "+user.getSurname());
        getContentPane().add(fs_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 308, 30));

        placeNo.setFont(new java.awt.Font("Kanit", 0, 20)); // NOI18N
        placeNo.setForeground(new java.awt.Color(51, 51, 51));
        placeNo.setText("Place: ");
        getContentPane().add(placeNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        number.setFont(new java.awt.Font("Kanit", 0, 20)); // NOI18N
        number.setForeground(new java.awt.Color(51, 51, 51));
        number.setText("<Code>");
        try{
            Statement st = DBManagement.getCn().createStatement();
            ResultSet rs = st.executeQuery("select * from Bplace");
            while(rs.next()){
                if(rs.last()){
                    number.setText(rs.getRow()+"");
                }
            }
        }catch(SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        getContentPane().add(number, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 50, -1));

        dateT.setFont(new java.awt.Font("Kanit", 0, 20)); // NOI18N
        dateT.setForeground(new java.awt.Color(51, 51, 51));
        dateT.setText("<Code>");
        getContentPane().add(dateT, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, 180, 31));

        dateText.setFont(new java.awt.Font("Kanit", 0, 20)); // NOI18N
        dateText.setForeground(new java.awt.Color(51, 51, 51));
        dateText.setText("Date:");
        getContentPane().add(dateText, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 50, -1));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 102), 2));
        jScrollPane1.getViewport().setBackground(new java.awt.Color(70, 229, 155,0));
        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0,0)));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(800, 600));

        table.setFont(new java.awt.Font("Kanit", 0, 15)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ลับดับ", "ชื่อสถานที่"
            }
        )
        {public boolean isCellEditable(int row, int column){return false;}}
    );
    table.setOpaque(false);
    table.setRequestFocusEnabled(false);
    table.setRowHeight(40);
    table.setTableHeader(null);
    table.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            tableMouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(table);

    getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 750, 340));

    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/booking/GUI/images/System/Untitled-2.jpg"))); // NOI18N
    jLabel1.setText("jLabel1");
    getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -130, 1460, 800));

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

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        if (evt.getClickCount() == 2 && !evt.isConsumed()) {
            try {
                evt.consume();
                int index = table.getSelectedRow(); //ได้ค่า index ของ row เริ่มที่ 0
                TableModel tm = table.getModel();
                String namePlace = (String) tm.getValueAt(index, 1);
                PlaceGUI place = new PlaceGUI(user, namePlace);
                place.setVisible(true);
                setVisible(false);
            } catch (SQLException ex) {
                Logger.getLogger(PlaceList.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_tableMouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        try {
            StatusBooking sb = new StatusBooking(user);
            sb.setVisible(true);
            setVisible(false);
        } catch (ParseException ex) {
            Logger.getLogger(PlaceList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setForeground(Color.white);
    }//GEN-LAST:event_jLabel9MouseEntered

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 102)));
        jLabel9.setBackground(new java.awt.Color(255, 102, 102));
        jLabel9.setForeground(Color.white);
    }//GEN-LAST:event_jLabel9MouseExited

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        try {
            AddPlace place = new AddPlace(user);
            place.setVisible(true);
            setVisible(false);
        } catch (ParseException ex) {
            Logger.getLogger(PlaceList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setForeground(Color.white);
    }//GEN-LAST:event_jLabel10MouseEntered

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseExited
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 102)));
        jLabel10.setBackground(new java.awt.Color(255, 102, 102));
        jLabel10.setForeground(Color.white);
    }//GEN-LAST:event_jLabel10MouseExited

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        try {
            EditProfile ep = new EditProfile(user);
            ep.setVisible(true);
            setVisible(false);
        } catch (ParseException ex) {
            Logger.getLogger(PlaceList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseEntered
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setForeground(Color.white);
    }//GEN-LAST:event_jLabel11MouseEntered

    private void jLabel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseExited
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 102)));
        jLabel11.setBackground(new java.awt.Color(255, 102, 102));
        jLabel11.setForeground(Color.white);
    }//GEN-LAST:event_jLabel11MouseExited

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        try {
            LoginGUI login = new LoginGUI();
            login.setVisible(true);
            setVisible(false);
        } catch (ParseException ex) {
            Logger.getLogger(PlaceList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseEntered
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setForeground(Color.white);
    }//GEN-LAST:event_jLabel12MouseEntered

    private void jLabel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseExited
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 102)));
        jLabel12.setBackground(new java.awt.Color(255, 102, 102));
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
            java.util.logging.Logger.getLogger(PlaceList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlaceList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlaceList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlaceList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new PlaceList().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dateT;
    private javax.swing.JLabel dateText;
    private javax.swing.JLabel fs_name;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel loginAs;
    private javax.swing.JLabel number;
    private javax.swing.JLabel placeNo;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
