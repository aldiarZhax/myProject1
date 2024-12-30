package Ticket;

public class Ticket implements TicketPricing{
    private int id;
    private static final int FOR_CHILDREN = 1200;
    private static final int FOR_ADULT = 2600;
    private static final int FOR_PENSION = 1700;
    private static final int FOR_STUDENTS = 1700;

    public int getpriceforchild(){
        return FOR_CHILDREN;
    }
    public int getpriceforadult(){
        return FOR_ADULT;
    }
    public int getpriceforpension(){
        return FOR_PENSION;
    }
    public int getpriceforstudent(){
        return FOR_STUDENTS;
    }
    public int getid(){
        return this.id;
    }
    public void setid(int id) {
        this.id = 100+((int) (Math.random()*10000));
    }
}
