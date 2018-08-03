package booking.database;

import booking.system.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBManagement {

    private static String driver = "com.mysql.jdbc.Driver";
    private static String user = "haho";
    private static String password = "hahoapp";
    private static String url = "jdbc:mysql://10.4.56.12/hahoapplication?zeroDateTimeBehavior=convertToNull&characterEncoding=UTF-8";

    public static User ormUser(ResultSet rs, User user) {
        try {
            int userId = rs.getInt("UserID");
            String username = rs.getString("Username");
            String pass = rs.getString("Password");
            long stdid = rs.getLong("StudentID");
            String name = rs.getString("Firstname");
            String surname = rs.getString("Surname");
            String depart = rs.getString("Department");
            String mail = rs.getString("Email");
            String question = rs.getString("Security_Question");
            String answer = rs.getString("Security_Answer");
            boolean book = rs.getBoolean("StatusBooking");
            boolean admin = rs.getBoolean("StatusAdmin");

            user.setUserId(userId);
            user.setUsername(username);
            user.setPassword(pass);
            user.setStdId(stdid);
            user.setName(name);
            user.setSurname(surname);
            user.setFaculty(depart);
            user.setEmail(mail);
            user.setQuestion(question);
            user.setAnswer(answer);
            user.setStatusBooking(book);
            user.setStatusAdmin(admin);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return user;
    }

    public static Place ormPlace(ResultSet rs, Place place) {
        try {
            int placeId = rs.getInt("PlaceID");
            String name = rs.getString("PlaceName");
            String detail = rs.getString("PlaceDetail");
            String pic = rs.getString("PlacePicture");

            place.setPlaceId(placeId);
            place.setNamePlace(name);
            place.setDatailPlace(detail);
            place.setFilePicture(pic);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return place;
    }

    public static Booking ormBooking(ResultSet rs, Booking booking) {
        try {
            int bookId = rs.getInt("BookID");
            Place place = new Place();
            User user = new User();
            String name = rs.getString("nameBooking");
            String detail = rs.getString("detailBooking");
            Date date = rs.getDate("Date");
            Time timeStart = rs.getTime("TimeStart");
            Time timeEnd = rs.getTime("TimeEnd");

            PreparedStatement pstPlace = DBManagement.getCn().prepareStatement("select * from Bplace where placeID= ?");
            pstPlace.setString(1, rs.getInt("PlaceID") + "");
            ResultSet rsPlace = pstPlace.executeQuery();
            rsPlace.next();

            PreparedStatement pstUser = DBManagement.getCn().prepareStatement("select * from Buser where UserID= ?");
            pstUser.setString(1, rs.getInt("UserID") + "");
            ResultSet rsUser = pstUser.executeQuery();
            rsUser.next();

            booking.setBookId(bookId);
            booking.setPlace(ormPlace(rsPlace, place));
            booking.setUser(ormUser(rsUser, user));
            booking.setNameBooking(name);
            booking.setDetailBooking(detail);
            booking.setDate(date);
            booking.setTimeStart(timeStart);
            booking.setTimeEnd(timeEnd);

        } catch (SQLException ex) {

        }
        return booking;
    }

    public static Connection getCn() {
        Connection cn = null;
        try {
            Class.forName(driver);
            cn = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return cn;
    }

}
