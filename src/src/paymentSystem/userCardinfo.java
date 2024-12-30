    package paymentSystem;

    public class userCardinfo {
        private String cardnumber;
        private int expiryMonth;
        private int expiryYear;
        private int cvv;
        private String cardholderName;
        private int balance;

        public void setCardInfo() {
            System.out.println("------Card Info------");
            System.out.println("Enter card number:");
            setCardNumber();
            System.out.println("Enter expiry Year:");
            setExpiryYear();
            System.out.println("Enter expiry Month:");
            setExpiryMonth();
            System.out.println("Enter cvv:");
            setCvv();
            System.out.println("Enter cardholder name:");
            setCardholderName();
            System.out.println("Enter balance:");
            setBalance();
        }

        public String getCardNumber() {
            return cardnumber;
        }
        public void setCardNumber(){
            this.cardnumber=cardnumber;
        }
        public int getEpiryMonth() {
            return expiryMonth;
        }
        public void setExpiryMonth(){
            this.expiryMonth=expiryMonth;
        }
        public int getExperyYear(){
            return expiryYear;
        }
        public void setExpiryYear(){
            this.expiryYear=expiryYear;
        }
        public int getCvv(){
            return cvv;
        }
        public void setCvv(){
            this.cvv=cvv;
        }

        public String getCardholderName() {
            return cardholderName;
        }
        public void setCardholderName() {
            this.cardholderName = cardholderName;
        }
        public int getBalance(){
            return balance;
        }
        public void setBalance(){
            this.balance=balance;
        }

        @Override
        public String toString() {
            return "userCardinfo{" +
                    "cardnumber:****-****-****-" + cardnumber.substring(cardnumber.length()-4,cardnumber.length()) + '\'' +
                    ", expiryMonth=" + expiryMonth +
                    ", expiryYear=" + expiryYear +
                    ", cvv=" + cvv +
                    ", cardholderName='" + cardholderName + '\'' +
                    ", balance=" + balance +
                    '}';
        }
    }
