package NOV_14;

class Ticket {
    private String eventName;
    private int seatNumber;
    private double price;

    public Ticket(String eventName, int seatNumber, double price) {
        if (seatNumber <= 0 || price <= 0) {
            System.out.println("Error Invalid Input");
            System.exit(0);
        }
        this.eventName = eventName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void ticketdetails() {
        System.out.println("Regular Ticket:");
        System.out.println("Event: " + eventName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: $" + price);
    }
}

class VIPTicket extends Ticket {
    private String specialAccess;

    public VIPTicket(String eventName, int seatNumber, double price, String specialAccess) {
        super(eventName, seatNumber, price);
        this.specialAccess = specialAccess;
    }

    public String getSpecialAccess() {
        return specialAccess;
    }

    public void setSpecialAccess(String specialAccess) {
        this.specialAccess = specialAccess;
    }

    @Override
    public void ticketdetails() {
        System.out.println("\nVIP Ticket:");
        super.ticketdetails();
        System.out.println("Special Access: " + specialAccess);
    }
}

class StudentTicket extends Ticket {
    private boolean studentDiscount;

    public StudentTicket(String eventName, int seatNumber, double price, boolean studentDiscount) {
        super(eventName, seatNumber, price);
        this.studentDiscount = studentDiscount;
    }

    public boolean isStudentDiscount() {
        return studentDiscount;
    }

    public void setStudentDiscount(boolean studentDiscount) {
        this.studentDiscount = studentDiscount;
    }

    @Override
    public void ticketdetails() {
        System.out.println("\nStudent Ticket:");
        super.ticketdetails();
        System.out.println("Student Discount: " + studentDiscount);
    }
}

public class MainTicket {
    public static void main(String[] args) {
        Ticket regularTicket = new Ticket("Concert", 101, 50.0);
        regularTicket.ticketdetails();

        VIPTicket vipTicket = new VIPTicket("VIP Concert", 201, 100.0, "Backstage Access");
        vipTicket.ticketdetails();

        StudentTicket studentTicket = new StudentTicket("Student Event", 301, 30.0, true);
        studentTicket.ticketdetails();
    }
}
