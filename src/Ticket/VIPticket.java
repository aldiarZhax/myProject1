package Ticket;

public class VIPticket extends Ticket{
    public int getpriceforchild(){
        return super.getpriceforchild()*2;
    }
    public int getpriceforadult(){
        return super.getpriceforadult()*2;
    }
    public int getpriceforpension(){
        return super.getpriceforpension()*2;
    }
    public int getpriceforstudent(){
        return super.getpriceforstudent()*2;
    }
    public int getid(){
        return super.getid();
    }
    public void setid(int id) {
        super.setid(id);
    }

}
