package interface1;

interface TicketBooking {

    void bookTicket();

    void cancelTicket();

    void showTicketDetails();
}

class PVR implements TicketBooking {

    String movieName;
    int seatNumber;
    String customerName;
    boolean booked;

    PVR(String movieName, int seatNumber, String customerName) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.customerName = customerName;
        this.booked = false;
    }

    @Override
    public void bookTicket() {
        booked = true;
        System.out.println("PVR Ticket Booked Successfully");
    }

    @Override
    public void cancelTicket() {
        booked = false;
        System.out.println("PVR Ticket Cancelled");
    }

    @Override
    public void showTicketDetails() {
        System.out.println("Theatre: PVR");
        System.out.println("Movie: " + movieName);
        System.out.println("Seat: " + seatNumber);
        System.out.println("Customer: " + customerName);
        System.out.println("Booking Status: " + (booked ? "Booked" : "Cancelled"));
    }
}

class INOX implements TicketBooking {

    String movieName;
    int seatNumber;
    String customerName;
    boolean booked;

    INOX(String movieName, int seatNumber, String customerName) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.customerName = customerName;
        this.booked = false;
    }

    @Override
    public void bookTicket() {
        booked = true;
        System.out.println("INOX Booking Confirmed");
    }

    @Override
    public void cancelTicket() {
        booked = false;
        System.out.println("INOX Booking Cancelled");
    }

    @Override
    public void showTicketDetails() {
        System.out.println("Theatre: INOX");
        System.out.println("Movie: " + movieName);
        System.out.println("Seat: " + seatNumber);
        System.out.println("Customer: " + customerName);
        System.out.println("Booking Status: " + (booked ? "Booked" : "Cancelled"));
    }
}

class Cinepolis implements TicketBooking {

    String movieName;
    int seatNumber;
    String customerName;
    boolean booked;

    Cinepolis(String movieName, int seatNumber, String customerName) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.customerName = customerName;
        this.booked = false;
    }

    @Override
    public void bookTicket() {
        booked = true;
        System.out.println("Cinepolis Ticket Successfully Booked");
    }

    @Override
    public void cancelTicket() {
        booked = false;
        System.out.println("Cinepolis Ticket Cancelled");
    }

    @Override
    public void showTicketDetails() {
        System.out.println("Theatre: Cinepolis");
        System.out.println("Movie: " + movieName);
        System.out.println("Seat: " + seatNumber);
        System.out.println("Customer: " + customerName);
        System.out.println("Booking Status: " + (booked ? "Booked" : "Cancelled"));
    }
}

public class MovieTicketBooking {

    public static void main(String[] args) {

        TicketBooking t;

        t = new PVR("Pushpa", 10, "Suman");

        t.bookTicket();
        t.showTicketDetails();
        t.cancelTicket();
        t.showTicketDetails();

        System.out.println();

        t = new INOX("RRR", 15, "Rahul");

        t.bookTicket();
        t.showTicketDetails();

        System.out.println();

        t = new Cinepolis("Bahubali", 20, "Anu");

        t.bookTicket();
        t.showTicketDetails();
    }
}