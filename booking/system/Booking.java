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

    public void addDataBooking(int bookId) {
        try {
            Statement st = DBManagement.getCn().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM BBooking AS a "
                    + "INNER JOIN Buser AS b ON a.UserID = b.UserID "
                    + "INNER JOIN Bplace AS c ON a.PlaceID = c.PlaceID "
                    + "WHERE a.BookID = " + bookId);
            rs.next();
            DBManagement.ormBooking(rs, this);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }
    
    public static void clearBooking() throws ParseException  {
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
                String dateTime = rs.getString("Date")+" "+rs.getString("TimeEnd");;
                Date DBDate= ft.parse(dateTime);
                Date checkDBDate = ((bookDB.getDate()));
                
                if (nowDate.compareTo(DBDate)>=0) {
                    String deleteSql = "delete from BBooking where Date = ? ";
                    String sqlStatus = "update Buser set StatusBooking ='" + 0 + "'" + "where UserID = '" + id + "'";
                    Statement stStatus = db.getCn().createStatement();
                    stStatus.executeUpdate(sqlStatus);
                    PreparedStatement pst = DBManagement.getCn().prepareStatement(deleteSql);
                    pst.setString(1,sqlDate);
                    pst.executeUpdate();

                } else {
                
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
