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
            btnAddPlace.setVisible(true);
        } else {
            btnAddPlace.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        loginAs = new javax.swing.JLabel();
        fs_name = new javax.swing.JLabel();
        placeNo = new javax.swing.JLabel();
        number = new javax.swing.JLabel();
        dateText = new javax.swing.JLabel();
        dateT = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        editProfile1 = new javax.swing.JButton();
        btnAddPlace = new javax.swing.JButton();
        btnStatus = new javax.swing.JButton();

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

        jScrollPane1.setBackground(new java.awt.Color(153, 153, 0));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(800, 600));
        jScrollPane1.getViewport().setBackground(new java.awt.Color(70, 229, 155,0));

        table.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
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
    table.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            tableMouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(table);

    getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 100, 726, 430));

    loginAs.setFont(new java.awt.Font("TH Sarabun New", 0, 24)); // NOI18N
    loginAs.setText("Login as:");
    getContentPane().add(loginAs, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 72, 39));

    fs_name.setFont(new java.awt.Font("TH Sarabun New", 0, 24)); // NOI18N
    fs_name.setText("<fs_name>");
    fs_name.setText(user.getName()+" "+user.getSurname());
    getContentPane().add(fs_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 308, 39));

    placeNo.setFont(new java.awt.Font("TH Sarabun New", 0, 24)); // NOI18N
    placeNo.setText("Place: ");
    getContentPane().add(placeNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

    number.setFont(new java.awt.Font("TH Sarabun New", 0, 24)); // NOI18N
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
    getContentPane().add(number, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 70, -1));

    dateText.setFont(new java.awt.Font("TH Sarabun New", 0, 24)); // NOI18N
    dateText.setText("Date:");
    getContentPane().add(dateText, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, -1, -1));

    dateT.setFont(new java.awt.Font("TH Sarabun New", 0, 24)); // NOI18N
    dateT.setText("<Code>");
    getContentPane().add(dateT, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 60, 150, 31));

    logout.setText("Logout");
    logout.setPreferredSize(new java.awt.Dimension(70, 23));
    logout.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            logoutActionPerformed(evt);
        }
    });
    getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, 100, 30));

    editProfile1.setText("Edit Profile");
    editProfile1.setPreferredSize(new java.awt.Dimension(70, 23));
    editProfile1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            editProfile1ActionPerformed(evt);
        }
    });
    getContentPane().add(editProfile1, new org.netbeans.lib.awtextra.AbsoluteConstraints(553, 20, 100, 30));

    btnAddPlace.setText("Add Place");
    btnAddPlace.setPreferredSize(new java.awt.Dimension(70, 23));
    btnAddPlace.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnAddPlaceActionPerformed(evt);
        }
    });
    getContentPane().add(btnAddPlace, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 100, 30));

    btnStatus.setText("Your booking");
    btnStatus.setPreferredSize(new java.awt.Dimension(70, 23));
    btnStatus.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnStatusActionPerformed(evt);
        }
    });
    getContentPane().add(btnStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 100, 30));

    pack();
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddPlaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPlaceActionPerformed
        try {
            AddPlace place = new AddPlace(user);
            place.setVisible(true);
            setVisible(false);
        } catch (ParseException ex) {
            Logger.getLogger(PlaceList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAddPlaceActionPerformed

    private void editProfile1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editProfile1ActionPerformed
        try {
            EditProfile ep = new EditProfile(user);
            ep.setVisible(true);
            setVisible(false);
        } catch (ParseException ex) {
            Logger.getLogger(PlaceList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_editProfile1ActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        try {
            LoginGUI login = new LoginGUI();
            login.setVisible(true);
            setVisible(false);
        } catch (ParseException ex) {
            Logger.getLogger(PlaceList.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_logoutActionPerformed

    private void btnStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatusActionPerformed
        try {
            StatusBooking sb = new StatusBooking(user);
            sb.setVisible(true);
            setVisible(false);
        } catch (ParseException ex) {
            Logger.getLogger(PlaceList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnStatusActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        if (evt.getClickCount() == 2 && !evt.isConsumed()) {
            evt.consume();
            int index = table.getSelectedRow(); //ได้ค่า index ของ row เริ่มที่ 0
            TableModel tm = table.getModel();
            String namePlace = (String) tm.getValueAt(index, 1);
            PlaceGUI place = new PlaceGUI(user, namePlace);
            place.setVisible(true);
            setVisible(false);
        }
    }//GEN-LAST:event_tableMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int result = JOptionPane.showConfirmDialog(this, "ยืนยันการออกโปรแกรม", "ปิดโปรแกรม", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            System.exit(0);
        } else {
            return;
        }
    }//GEN-LAST:event_formWindowClosing

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
    private javax.swing.JButton btnAddPlace;
    private javax.swing.JButton btnStatus;
    private javax.swing.JLabel dateT;
    private javax.swing.JLabel dateText;
    private javax.swing.JButton editProfile1;
    private javax.swing.JLabel fs_name;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel loginAs;
    private javax.swing.JButton logout;
    private javax.swing.JLabel number;
    private javax.swing.JLabel placeNo;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
