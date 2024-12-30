import Ticket.*;
import models.Viewer;
import paymentSystem.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("-------Welcome to Autorization-------");
            System.out.println("1.Sign in");
            System.out.println("2.Sign up");
            System.out.print("Please enter your choice:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Please enter your email: ");
                    String email = sc.next();
                    if (email.contains("@")) {
                        System.out.print("Please enter your password: ");
                        String password = sc.next();
                        mainRunner runner = new mainRunner();
                        Viewer viewer = new Viewer(email,password);
                        runner.getTicket();

                    } else if (!(email.contains("@"))) {
                        System.out.println("Error,enter a valid email address");

                    }
                    break;
                case 2:
                    System.out.print("Please enter your email: ");
                    email = sc.next();
                    if (email.contains("@")) {
                        System.out.print("Please enter your password: ");
                        String password = sc.next();
                        System.out.print("Enter your password again: ");
                        String passwordAgain = sc.next();
                        if (password.equals(passwordAgain)) {
                            mainRunner ie = new mainRunner();
                            System.out.println("Successfull!");
                            ie.getTicket();

                        } else {
                            System.out.println("Error, password do not similar!");
                        }
                        break;

                    }
                    else{
                        System.out.println("Error, email address does not correct!");
                    }
            }
        }
    }
}
class mainRunner{
    Scanner sc = new Scanner(System.in);
    bookingTicket book = new bookingTicket();
    public void getTicket(){
        while (true){
            System.out.println("-------Welcome to the book tickets-------");
            System.out.println("1.Get place");
            System.out.println("2.Book ticket");
            System.out.println("3.Exit");
            System.out.print("Enter your choice between 1 and 3: ");
            System.out.println();
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    book.showPlace();
                    break;
                case 2:
                    System.out.println("What type of ticket would you like to use?");
                    System.out.println("1.Plain Ticket");
                    System.out.println("2.VIP Ticket");
                    int type = sc.nextInt();
                    Ticket ticket = new Ticket();

                    switch (type){
                        case 1:
                            System.out.println("----------------");
                            System.out.println("1.Children");
                            System.out.println("2.Adults");
                            System.out.println("3.Pension");
                            System.out.println("4.Student");
                            System.out.println("----------------");
                            int choose = sc.nextInt();
                            switch (choose){
                                case 1:
                                    System.out.println("Ticket for child's: "+ticket.getpriceforchild());
                                    break;
                                case 2:
                                    System.out.println("Ticket for adult's"+ticket.getpriceforadult());
                                    break;
                                case 3:
                                    System.out.println("Ticket for pension's"+ticket.getpriceforpension());
                                    break;
                                case 4:
                                    System.out.println("Ticket for student's: "+ticket.getpriceforstudent());
                                    break;
                                default:
                                    System.out.println("Incorrect choice");
                                    break;
                            }
                        case 2:
                            System.out.println("------------------");
                            System.out.println("1.Children");
                            System.out.println("2.Adults");
                            System.out.println("3.Pension");
                            System.out.println("4.Student");
                            System.out.println("------------------");
                            int choose2 = sc.nextInt();
                            VIPticket ticket2 = new VIPticket();
                            switch (choose2){
                                case 1:
                                    System.out.println("Price for children(VIP): "+ticket2.getpriceforchild());
                                    break;
                                case 2:
                                    System.out.println("Price for adult(VIP): "+ticket2.getpriceforadult());
                                    break;
                                case 3:
                                    System.out.println("Price for pension(VIP): "+ticket2.getpriceforpension());
                                    break;
                                case 4:
                                    System.out.println("Price for students(VIP): "+ticket2.getpriceforstudent());
                                    break;

                                default:
                                    System.out.println("Incorrect choice!");
                                    break;

                            }

                    }

                    book.bookTicket();
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    return;
            }

        }
    }
}

