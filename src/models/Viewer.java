package models;

import java.util.ArrayList;

public class Viewer {
    private static int Viewer_ID_counter = 1;
    private int Viewer_ID = 0;
    private String Viewer_Email;
    private String Viewer_Email_Password;
    private ArrayList<String> Viewer_Info = new ArrayList<>();

    public Viewer(String email, String password) {
        Viewer_Info.add(this.Viewer_Email = email);
        Viewer_Info.add(this.Viewer_Email_Password = password);
        this.Viewer_ID = Viewer_ID_counter++;
        Viewer_Info.add(String.valueOf(this.Viewer_ID));
    }

    public String getViewer_Email() {
        return Viewer_Email;
    }

    public void setViewer_Email(String email) {
        this.Viewer_Email = email;
    }
    public String getViewer_Email_Password() {
        return Viewer_Email_Password;
    }
    public void setViewer_Email_Password(String password) {
        this.Viewer_Email_Password = password;
    }

    @Override
    public String toString() {
        return "Viewer{" +
                "Viewer_ID=" + Viewer_ID +
                ", Viewer_Email='" + Viewer_Email + '\'' +
                ", Viewer_Email_Password='" + Viewer_Email_Password + '\'' +
                ", Viewer_Info=" + Viewer_Info +
                '}';
    }
}
