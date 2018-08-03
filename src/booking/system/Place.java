package booking.system;

import booking.database.DBManagement;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.*;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Place {

    private String namePlace;
    private String datailPlace;
    private String filePicture;
    private String issue;
    private int placeId;

    public Place() {
    }

    public void setObjectPlace(String namePlace) throws SQLException {
        PreparedStatement pst = DBManagement.getCn().prepareStatement("select * from Bplace where PlaceName=?");
        pst.setString(1, namePlace);
        ResultSet rs = pst.executeQuery();
        rs.next();
        DBManagement.ormPlace(rs, this);
    }

    public static void addPlace(String placeName, String placeDetail, String url) throws SQLException {
        Statement st = DBManagement.getCn().createStatement();
        String fileName = url.substring(url.lastIndexOf('\\') + 1, url.length());

        try {
            String desFile = new File(".").getCanonicalPath() + "\\src\\booking\\GUI\\images\\Upload\\" + fileName;
            Files.copy(Paths.get(url), Paths.get(desFile),
                    StandardCopyOption.COPY_ATTRIBUTES, StandardCopyOption.REPLACE_EXISTING);

        } catch (IOException e1) {
            e1.printStackTrace();
        }

        String sql = "INSERT INTO Bplace (PlaceName,PlaceDetail,PlacePicture)"
                + " VALUES ('" + placeName + "','" + placeDetail + "','" + fileName + "') ";

        st.executeUpdate(sql);
    }

    public void updatePlaceNameAndDetail(String name, String detail) throws SQLException {
        PreparedStatement pst = DBManagement.getCn().prepareStatement("Update Bplace SET PlaceName=?,PlaceDetail=? WHERE PlaceID=? ");
        pst.setString(1, name);
        pst.setString(2, detail);
        pst.setInt(3, this.placeId);
        pst.executeUpdate();

        this.setNamePlace(name);
        this.setDatailPlace(detail);
    }

    public void changePicture(String fileNew) throws SQLException {
        String path = new File("src/booking/GUI/images/Upload/" + this.getFilePicture()).getAbsolutePath();
        File oldFile = new File(path);
        oldFile.delete();
        //เอาไฟล์ใหม่มาลง
        String fileName = fileNew.substring(fileNew.lastIndexOf('\\') + 1, fileNew.length());
        try {
            String desFile = new File(".").getCanonicalPath() + "\\src\\booking\\GUI\\images\\Upload\\" + fileName;
            Files.copy(Paths.get(fileNew), Paths.get(desFile),
                    StandardCopyOption.COPY_ATTRIBUTES, StandardCopyOption.REPLACE_EXISTING);

        } catch (IOException e1) {
            e1.printStackTrace();
        }
        //เอาใส่ Place กับ DB
        this.setFilePicture(fileName);
        String sqlPic = "Update Bplace SET PlacePicture='" + this.getFilePicture() + "' "
                + "WHERE PlaceID=" + this.getPlaceId() + ";";
        Statement stPic = DBManagement.getCn().createStatement();
        stPic.execute(sqlPic);
    }

    public void deletePlace() throws SQLException {
        Statement st = DBManagement.getCn().createStatement();
        int record = st.executeUpdate("delete from Bplace where PlaceID=" + this.getPlaceId());
        if (record == 1) {
            String path = new File("src/booking/GUI/images/Upload/" + this.getFilePicture()).getAbsolutePath();
            File file = new File(path);
            file.delete();
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

    public String getFilePicture() {
        return filePicture;
    }

    public void setFilePicture(String filePicture) {
        this.filePicture = filePicture;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public int getPlaceId() {
        return placeId;
    }

    public void setPlaceId(int placeId) {
        this.placeId = placeId;
    }

    /*----- End get/set -------*/
    @Override
    public String toString() {
        return "Place{" + "namePlace=" + namePlace + ", datailPlace=" + datailPlace + ", filePicture=" + filePicture + ", issue=" + issue + ", placeId=" + placeId + '}';
    }

}
