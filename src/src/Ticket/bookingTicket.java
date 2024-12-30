package Ticket;

import java.util.Scanner;

public class bookingTicket {
        private int n;
        private int m;
        public int[][] place = new int[][] {
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
        };
        public void bookTicket() {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the row index:");
                this.n = sc.nextInt();
                System.out.print("Enter the column index:");
                this.m = sc.nextInt();

                if (n < 0 || n > place.length - 1 || m < 0 || m > place[0].length - 1) {
                    System.out.println("Invalid place index");
                }
                if (place[n-1][m-1] == 1) {
                    System.out.println("The ticket is already booked");
                }else{
                    place[n-1][m-1] = 1;
                }
            }catch(Exception e) {
                System.out.println("Invalid input,please print integer numbers!");
            }
        }
        public void showPlace(){
            for(int[] row:place){
                for(int column:row){
                    System.out.print(column+" ");
                }
                System.out.println();

            }
        }
}
