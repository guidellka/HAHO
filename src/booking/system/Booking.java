/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booking.system;

import booking.system.*;
import booking.GUI.BookingGUI;
import booking.GUI.StatusBooking;
import booking.database.DBManagement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Booking {

    private User user;
    private Place place;
    private int bookId;
    private String nameBooking;
    private String detailBooking;
    private Date timeStart;
    private Date timeEnd;
    private Date date;

    public void addDataBookingByBookId(int bookId) {
        try {
            Statement st = DBManagement.getCn().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM BBooking WHERE BookID = " + bookId);
            rs.next();
            DBManagement.ormBooking(rs, this);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void addDataBookingByUserId(int userId) {
        try {
            Statement st = DBManagement.getCn().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM BBooking WHERE userID = " + userId);
            rs.next();
            DBManagement.ormBooking(rs, this);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public String getDateBookingByUserId() throws SQLException {
        String result = "";
        String sql = "select Date from BBooking where UserID = " + this.user.getUserId();
        Statement st = DBManagement.getCn().createStatement();
        ResultSet rs = st.executeQuery(sql);
        rs.next();
        result = rs.getString("Date");
        return result;
    }

    public static void booking(int id, String conPlaceNum, String allDate, String topicBooking, String detail, String startTime, String endTime) throws SQLException {
        String upSql = "INSERT INTO BBooking" + "(UserID,PlaceID,Date,nameBooking,detailBooking,TimeStart,TimeEnd)" + "VALUES (?,?,?,?,?,?,?)";
        PreparedStatement pst = DBManagement.getCn().prepareStatement(upSql);
        pst.setString(1, id + "");
        pst.setString(2, conPlaceNum);
        pst.setString(3, allDate);
        pst.setString(4, topicBooking);
        pst.setString(5, detail);
        pst.setString(6, startTime + ":00");
        pst.setString(7, endTime + ":00");
        pst.executeUpdate();

        String sqlStatus = "update Buser set StatusBooking ='" + 1 + "'" + "where UserID = '" + id + "'";
        Statement stStatus = DBManagement.getCn().createStatement();
        stStatus.executeUpdate(sqlStatus);
    }

    public void deleteBooking() throws SQLException {
        Statement st = DBManagement.getCn().createStatement();
        String sql1 = "DELETE FROM BBooking WHERE UserID ='" + this.user.getUserId() + "'";
        String sql2 = "UPDATE Buser SET `StatusBooking` = 0 WHERE `UserID` = " + this.user.getUserId();
        st.executeUpdate(sql1);
        st.executeUpdate(sql2);
    }

    public static void clearBooking() throws ParseException {
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat sft = new SimpleDateFormat("HH:mm:ss");
        Date dd = new Date();
        String date = ft.format(dd);
        String time = sft.format(dd);
        Date nowDate = ft.parse(date);
        Date nowTime = sft.parse(time);
        Booking bookDB = new Booking();
        try {
            DBManagement db = new DBManagement();
            String sql = "select * from BBooking ";
            Statement st = db.getCn().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                DBManagement.ormBooking(rs, bookDB);
                String id = rs.getString("UserID");
                String sqlDate = rs.getString("Date");
                String sqlGetTime = rs.getString("TimeEnd");
                String dateTime = rs.getString("Date") + " " + rs.getString("TimeEnd");;
                Date DBDate = ft.parse(dateTime);
                Date checkDBDate = ((bookDB.getDate()));
                if (nowDate.compareTo(DBDate) >= 0) {
                    String deleteSql = "delete from BBooking where Date = ? ";
                    String sqlStatus = "update Buser set StatusBooking ='" + 0 + "'" + "where UserID = '" + id + "'";
                    Statement stStatus = db.getCn().createStatement();
                    stStatus.executeUpdate(sqlStatus);
                    PreparedStatement pst = DBManagement.getCn().prepareStatement(deleteSql);
                    pst.setString(1, sqlDate);
                    pst.executeUpdate();
                }
            }
        } catch (SQLException se) {
            System.out.println(se.getMessage());
        }
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public String getNameBooking() {
        return nameBooking;
    }

    public void setNameBooking(String nameBooking) {
        this.nameBooking = nameBooking;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getDetailBooking() {
        return detailBooking;
    }

    public void setDetailBooking(String detailBooking) {
        this.detailBooking = detailBooking;
    }

    public Date getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(Date timeStart) {
        this.timeStart = timeStart;
    }

    public Date getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(Date timeEnd) {
        this.timeEnd = timeEnd;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Booking{" + "user=" + user + ", place=" + place + ", bookId=" + bookId + ", timeStart=" + timeStart + ", timeEnd=" + timeEnd + ", date=" + date + '}';
    }

}
