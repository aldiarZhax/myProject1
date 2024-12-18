package models;

public class Viewer{
    private int Viewer_ID;
    private int age;
    private String Viewer_Email;
    boolean isEmail=true;
    boolean isAge=true;

    public Viewer(int id,int age,String email){
        this.Viewer_ID=id;
        this.age=age;
        this.Viewer_Email=email;
    }
    public int getAge(){return age;}
    public void setAge(int age){this.age=age;}

    public String getViewer_Email(){return Viewer_Email;}
    public void setViewer_Email(String email){this.Viewer_Email=email;}

    @Override
    public String toString() {
        return "Viewer{" +
                "Viewer_ID=" + Viewer_ID +
                ", age=" + age +
                ", Viewer_Email='" + Viewer_Email + '\'' +
                '}';
    }
}
