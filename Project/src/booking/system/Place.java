package booking.system;

import java.sql.*;
import java.util.Date;

public class Place {
    private String namePlace;
    private String datailPlace;
    private User user; // ยังไม่มี get set
    private String detailBooking;
    private Date date; //งงอยู่ 5555555 (ยังไม่มี get set)
    
    public Place() {
    }

    public Place(String namePlace) {
        this.namePlace = namePlace;
    }
    
    public Place(String namePlace, String datailPlace) {
        this.namePlace = namePlace;
        this.datailPlace = datailPlace;
    }
    public void booking(User user,String detailBooking){
        this.user = user;
        user.setStatusBooking(true);
        this.detailBooking = detailBooking;
    }
    public void clearBooking(){
        //จะตั้งให้เคลียร์ booking ที่ผ่านไปเเล้วทุกวัน 
        //ยังทำไม่เป็นจ้าาา
    }
    public void cancelBooking(){
        User temp = new User();
        user.setStatusBooking(false);
        this.detailBooking = null;
        user = temp;
    }
    public void seeUserStatus() throws ClassNotFoundException, SQLException{ //ยังไม่เสร็จเหลือแก้ว่าจะรับค่าตรง USerID มา
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql:10.4.56.12/hahoapplication","haho","hahoapp");
        Statement st = conn.createStatement();
        String word = "SELECT PlaceID * FROM BBooking WHERE UserID = ";
        ResultSet re = st.executeQuery(word);
        Statement st2 = conn.createStatement();
        String word2 = "SELECT * FROM Bplace WHERE re";
        ResultSet re2 = st2.executeQuery(word2);
        while (re2.next())
                System.out.println("Place ID :"+"PlaceID"+"\n"+
                                   "Place Name : "+"PlaceName"+"\n"+
                                   "Place Detail : "+"PlaceDetail"+"\n");
        
        }
        catch (ClassNotFoundException | SQLException e) {
        }
    }
    /*----- get/set  อยู่ข้างล่างนะ-------*/
    
    public String getNamePlace() {
        return namePlace;
    }

    public void setNamePlace(String namePlace) {
        this.namePlace = namePlace;
    }

    public String getDatailPlace() {
        return datailPlace;
    }

    public void setDatailPlace(String datailPlace) {
        this.datailPlace = datailPlace;
    }

    public String getDetailBooking() {
        return detailBooking;
    }

    public void setDetailBooking(String detailBooking) {
        this.detailBooking = detailBooking;
    }
    
    /*----- End get/set -------*/

    @Override
    public String toString() {
        return "Place";
        //เดะค่อยมาเขียนนะ ^-^'
    }
    
   
    
    
}
