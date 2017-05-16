package booking.system;

import booking.database.DBManagement;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class User {

    private long stdId;
    private  int userId;
    private String username;
    private String password;
    private String name;
    private String surname;
    private String faculty;
    private String email;
    private String question;
    private String answer;
    private boolean statusBooking;
    private boolean statusAdmin;

    public User() {
    }

    public User(int stdId, String name, String surname) {
        this.stdId = stdId;
        this.name = name;
        this.surname = surname;
    }

    public User(int stdId, String username, String password, String name, String surname, String faculty, String email, String question, String answer) {
        this.stdId = stdId;
        this.username = username;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.email = email;
        this.question = question;
        this.answer = answer;
    }

    public boolean login(String username, String password) throws SQLException {
        boolean result = false;
        PreparedStatement pst = DBManagement.getCn().prepareStatement("select * from Buser where username= ?");
        pst.setString(1, username);
        ResultSet rs = pst.executeQuery();
        rs.next();
        if (rs.getString("Username").equals(username)) {
            if (rs.getString("Password").equals(password)) {
                DBManagement.ormUser(rs, this);
                result = true;
            }
        }
        return result;
    }

    public static boolean checkForgetPassword(String username, String qus, String ans) throws SQLException {
        boolean result = false;
        Statement st = DBManagement.getCn().createStatement();
        String sql = "SELECT Security_Question,Security_Answer FROM Buser WHERE Username ='" + username + "'";
        ResultSet rs = st.executeQuery(sql);
        rs.next();
        String secq = rs.getString("Security_Question");
        String seca = rs.getString("Security_Answer");
        if (qus.equals(secq) && ans.equals(seca)) {
            result = true;
        }
        return result;
    }

    public static void updateForgetPassword(String username, String pass) throws SQLException {
        Statement st = DBManagement.getCn().createStatement();
        String sql = "UPDATE Buser SET Password ='" + pass + "'" + " WHERE Username='" + username + "'";
        st.executeUpdate(sql);
    }

    public void editProfile() throws SQLException {
        Statement st = DBManagement.getCn().createStatement();
        String sql = "UPDATE `Buser` SET `StudentID` = '" + this.stdId + "',"
                + " `Firstname` = '" + this.name + "', `Surname` = '" + this.surname + "',"
                + " `Department` = '" + this.faculty + "', `Email` = '" + this.email + "', "
                + "`Security_Question` = '" + this.question + "', "
                + "`Security_Answer` = '" + this.answer + "' "
                + "WHERE `Buser`.`UserID` = " + this.userId;
        st.executeUpdate(sql);
    }

    public String getPasswordFormDB() throws SQLException {
        String pass = "";
        Statement st = DBManagement.getCn().createStatement();
        String sql = "SELECT * FROM Buser WHERE UserID ='" + this.userId + "'";
        ResultSet rs = st.executeQuery(sql);
        rs.next();
        pass = rs.getString("Password");
        return pass;
    }

    public void updatePassword(String newPass) throws SQLException {
        Statement st = DBManagement.getCn().createStatement();
        String sql = "UPDATE Buser SET Password = '" + newPass + "'" + "WHERE UserID ='"
                + this.userId + "'";
        st.executeUpdate(sql);
    }

    /*----- get/set  อยู่ข้างล่างนะ-------*/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public long getStdId() {
        return stdId;
    }

    public int getUserId() {
        return userId;
    }

    public boolean isStatusBooking() {
        return statusBooking;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setStdId(long stdId) {
        this.stdId = stdId;
    }

    public boolean getStatusBooking() {
        return statusBooking;
    }

    public void setStatusBooking(boolean statusBooking) {
        this.statusBooking = statusBooking;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean getStatusAdmin() {
        return statusAdmin;
    }

    public void setStatusAdmin(boolean statusAdmin) {
        this.statusAdmin = statusAdmin;
    }

    /*----- End get/set -------*/
    @Override
    public String toString() {
        return "\nStudent ID: " + stdId
                + "\nName:" + name + " " + surname
                + "\nStatus booking: " + (statusBooking == true ? "Reservations" : "No reservation");
    }
    
}
