import models.*;

import java.util.Scanner;

public class MyProject {
    public static void main(String[] args){

        Viewer human1 = new Viewer(1, 18, "maksat_201@gmail.com");
        Viewer human2 = new Viewer(2,19,"aldikf228@gmail.com");
        System.out.println("Person info:");
        System.out.println(human1.toString());
        System.out.println(human2.toString());

        System.out.println();

        Cinema cinema_info1=new Cinema("Cinemoving San Polo","Venice");
        Cinema cinema_info2=new Cinema("Grand Lumière Cinema", "Paris");
        System.out.println("Cinema info:");
        System.out.println(cinema_info1.toString());
        System.out.println(cinema_info2.toString());

        System.out.println();

        Film film1= new Film("Quentin Tarantino","Pulp Fiction","154 minutes","Crime");
        Film film2= new Film("Gai Rich","Ministry of Ungentlemanly Warfare","122 minutes","Action");

        System.out.println("Film info:");
        System.out.println(film1.toString());
        System.out.println(film2.toString());
        System.out.println("Is film1 same as film2: "+(film1.equals(film2)? "YES":"NO"));
    }



    }

