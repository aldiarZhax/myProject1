package models;

import java.time.Duration;
import java.util.Objects;

public class Film {
    private String Film_Author;
    private String Film_Title;
    private String Film_Duration;
    private String Genre;
    public Film(String Author,String Title,String Duration,String Genre){
        this.Film_Author=Author;
        this.Film_Title=Title;
        this.Film_Duration=Duration;
        this.Genre=Genre;
    }
    public String getFilm_Author(){return Film_Author;}
    public void setFilm_Author(String Author){this.Film_Author=Author;}

    public String getFilm_Title(){return Film_Title;}
    public void setFilm_Title(String Title){this.Film_Title=Title;}

    public String getFilm_Time(){return Film_Duration;}
    public void setFilm_Time(String Duration){this.Film_Duration= Duration;}

    public String getGenre(){return Genre;}
    public void setGenre(String Genre){this.Genre=Genre;}

    @Override
    public String toString() {
        return "Film{" +
                "Film_Author='" + Film_Author + '\'' +
                ", Film_Title='" + Film_Title + '\'' +
                ", Film_Duration='" + Film_Duration + '\'' +
                ", Genre='" + Genre + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Film film = (Film) o;
        return Objects.equals(Film_Title, film.Film_Title);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(Film_Title);
    }
}
