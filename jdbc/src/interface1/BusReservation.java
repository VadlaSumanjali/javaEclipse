package interface1;

interface BusBooking {

    void bookSeat();

    void cancelSeat();

    void showBooking();
}

class APSRTC implements BusBooking {

    String passengerName;
    String source;
    String destination;
    double ticketPrice;
    boolean seatBooked;

    APSRTC(String passengerName, String source, String destination) {
        this.passengerName = passengerName;
        this.source = source;
        this.destination = destination;
        this.ticketPrice = 500;
        this.seatBooked = false;
    }

    @Override
    public void bookSeat() {
        seatBooked = true;
        System.out.println("APSRTC Seat Booked");
    }

    @Override
    public void cancelSeat() {
        seatBooked = false;
        System.out.println("APSRTC Seat Cancelled");
    }

    @Override
    public void showBooking() {
        System.out.println("Bus Service: APSRTC");
        System.out.println("Passenger: " + passengerName);
        System.out.println("Source: " + source);
        System.out.println("Destination: " + destination);
        System.out.println("Ticket Price: " + ticketPrice);
        System.out.println("Booking Status: "
                + (seatBooked ? "Booked" : "Cancelled"));
    }
}

class TSRTC implements BusBooking {

    String passengerName;
    String source;
    String destination;
    double ticketPrice;
    boolean seatBooked;

    TSRTC(String passengerName, String source, String destination) {
        this.passengerName = passengerName;
        this.source = source;
        this.destination = destination;
        this.ticketPrice = 600;
        this.seatBooked = false;
    }

    @Override
    public void bookSeat() {
        seatBooked = true;
        System.out.println("TSRTC Seat Booked");
    }

    @Override
    public void cancelSeat() {
        seatBooked = false;
        System.out.println("TSRTC Seat Cancelled");
    }

    @Override
    public void showBooking() {
        System.out.println("Bus Service: TSRTC");
        System.out.println("Passenger: " + passengerName);
        System.out.println("Source: " + source);
        System.out.println("Destination: " + destination);
        System.out.println("Ticket Price: " + ticketPrice);
        System.out.println("Booking Status: "
                + (seatBooked ? "Booked" : "Cancelled"));
    }
}

class PrivateBus implements BusBooking {

    String passengerName;
    String source;
    String destination;
    double ticketPrice;
    boolean seatBooked;

    PrivateBus(String passengerName, String source, String destination) {
        this.passengerName = passengerName;
        this.source = source;
        this.destination = destination;
        this.ticketPrice = 800;
        this.seatBooked = false;
    }

    @Override
    public void bookSeat() {
        seatBooked = true;
        System.out.println("Private Bus Seat Booked");
    }

    @Override
    public void cancelSeat() {
        seatBooked = false;
        System.out.println("Private Bus Seat Cancelled");
    }

    @Override
    public void showBooking() {
        System.out.println("Bus Service: Private Bus");
        System.out.println("Passenger: " + passengerName);
        System.out.println("Source: " + source);
        System.out.println("Destination: " + destination);
        System.out.println("Ticket Price: " + ticketPrice);
        System.out.println("Booking Status: "
                + (seatBooked ? "Booked" : "Cancelled"));
    }
}

public class BusReservation {

    public static void main(String[] args) {

        BusBooking b;

        b = new APSRTC("Suman", "Hyderabad", "Vijayawada");
        b.bookSeat();
        b.showBooking();
        b.cancelSeat();
        b.showBooking();

        System.out.println();

        b = new TSRTC("Rahul", "Hyderabad", "Warangal");
        b.bookSeat();
        b.showBooking();

        System.out.println();

        b = new PrivateBus("Anu", "Hyderabad", "Bangalore");
        b.bookSeat();
        b.showBooking();
    }
}