public class User {
    private String name;
    private  String surname;
    private long stdId;
    private String faculty;
    private String email;
    
    private boolean statusBooking = false;

    public User() {
        this("Unknown","Unknown",000000);
    }

    public User(String name, String surname, long stdId) {
        this.name = name;
        this.surname = surname;
        this.stdId = stdId;
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
    
    /*----- End get/set -------*/
    
    @Override
    public String toString() {
        return  "\nStudent ID: " + stdId +
                "\nName:" + name + " " + surname +
                "\nStatus booking:" + (statusBooking==true?"Reservations":"No reservation") ;
    }
    

            
    
}
