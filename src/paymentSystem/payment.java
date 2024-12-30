package paymentSystem;

public class payment {
    private int paymentID;
    public void payment(int cost,String cardNumber,int balance) {
        if (cardNumber.length() == 16){
            if (balance < cost) {
                System.out.println("Insufficient Balance");
            } else {
                balance = balance - cost;
                System.out.println("Payment Successful");
                System.out.println("Payment ID: " + paymentID);
                System.out.println("Remitted Balance: " + balance);
            }
        }
        else {
            System.out.println("Insufficient Card Number");
            System.out.println("Card number must be 16 digits!");
        }
    }
    public void setPaymentID(int paymentID) {
        this.paymentID = 10+(int)(Math.random()*500);
    }
    public int getPaymentID() {
        return paymentID;
    }
}
