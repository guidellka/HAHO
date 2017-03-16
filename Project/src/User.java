public class User {
    private String name;
    private  String surname;
    private long stdId;
    private boolean statusBooking = false;

    public User() {
        this("Unknown","Unknown",000000);
    }

    public User(String name, String surname, long stdId) {
        this.name = name;
        this.surname = surname;
        this.stdId = stdId;
    }

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

    public void setStdId(long stdId) {
        this.stdId = stdId;
    }

    public boolean isStatusBooking() {
        return statusBooking;
    }

    public void setStatusBooking(boolean statusBooking) {
        this.statusBooking = statusBooking;
    }

    @Override
    public String toString() {
        return  "Name:" + name + " " + surname +
                "\nStudent ID: " + stdId +
                "\nStatus booking:" + (statusBooking==true?"Reservations":"No reservation") ;
    }
    

            
    
}
