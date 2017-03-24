
package booking.GUI;

import java.awt.Color;

public class Place extends javax.swing.JFrame {
    
    public Place() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        detailPlaceHead = new javax.swing.JLabel();
        detailPlaceText = new javax.swing.JLabel();
        Edit = new javax.swing.JToggleButton();
        Booking = new javax.swing.JToggleButton();
        cancelBooking = new javax.swing.JToggleButton();
        pic = new javax.swing.JLabel();
        Head = new javax.swing.JLabel();
        placeHead = new javax.swing.JLabel();
        calendar = new javax.swing.JToggleButton();
        back = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Place List");
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        detailPlaceHead.setBackground(new java.awt.Color(153, 255, 153));
        detailPlaceHead.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        detailPlaceHead.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        detailPlaceHead.setText("รายละเอียดสถานที่");

        detailPlaceText.setBackground(new java.awt.Color(51, 255, 153));
        detailPlaceText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        detailPlaceText.setText("Detail");
        detailPlaceText.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        detailPlaceText.setDoubleBuffered(true);
        detailPlaceText.setOpaque(true);

        Edit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Edit.setText("แก้ไขสถานที่");
        Edit.setMaximumSize(new java.awt.Dimension(97, 25));
        Edit.setMinimumSize(new java.awt.Dimension(97, 25));
        Edit.setPreferredSize(new java.awt.Dimension(97, 25));
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });

        Booking.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Booking.setText("จองสถานที่");
        Booking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookingActionPerformed(evt);
            }
        });

        cancelBooking.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cancelBooking.setText("ยกเลิกการจอง");
        cancelBooking.setToolTipText("");

        pic.setBackground(new java.awt.Color(255, 204, 204));
        pic.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pic.setText("Picture");
        pic.setToolTipText("");
        pic.setName(""); // NOI18N
        pic.setOpaque(true);

        Head.setFont(new java.awt.Font("TH Sarabun New", 0, 30)); // NOI18N
        Head.setText("ชื่อสถานที่ : ");

        placeHead.setFont(new java.awt.Font("TH Sarabun New", 0, 30)); // NOI18N
        placeHead.setForeground(new java.awt.Color(255, 51, 51));
        placeHead.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        placeHead.setText("<.....ชื่อสถานที่.....>");

        calendar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        calendar.setText("Calendar");
        calendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calendarActionPerformed(evt);
            }
        });

        back.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        back.setText("< ย้อนกลับ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(Head)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(placeHead, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 183, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(detailPlaceText, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(detailPlaceHead)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Booking, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(calendar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cancelBooking, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)))
                    .addComponent(pic, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Head, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(placeHead, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pic, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(calendar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Booking, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(detailPlaceHead, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(detailPlaceText, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(Edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditActionPerformed

    private void BookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BookingActionPerformed

    private void calendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calendarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_calendarActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Place.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Place.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Place.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Place.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Place().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Booking;
    private javax.swing.JToggleButton Edit;
    private javax.swing.JLabel Head;
    private javax.swing.JToggleButton back;
    private javax.swing.JToggleButton calendar;
    private javax.swing.JToggleButton cancelBooking;
    private javax.swing.JLabel detailPlaceHead;
    private javax.swing.JLabel detailPlaceText;
    private javax.swing.JLabel pic;
    private javax.swing.JLabel placeHead;
    // End of variables declaration//GEN-END:variables
}
