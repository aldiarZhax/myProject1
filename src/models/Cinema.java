package models;

public class Cinema {
    private String Cinema_Name;
    private String Location;
    public Cinema(String Cinema_Name,String Cinema_Location){
        this.Cinema_Name=Cinema_Name;
        this.Location=Cinema_Location;
    }

    public String getCinema_Name() {return Cinema_Name;}
    public void setCinema_Name(String Cinema_Name){this.Cinema_Name=Cinema_Name;}

    public String getLocation(){return Location;}
    public void setLocation(String location) {this.Location = location;}

    @Override
    public String toString() {
        return "Cinema{" +
                "Cinema_Name='" + Cinema_Name + '\'' +
                ", Location='" + Location + '\'' +
                '}';
    }
}
