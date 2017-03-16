
import java.util.*;

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
    
    
  
    
    
}
