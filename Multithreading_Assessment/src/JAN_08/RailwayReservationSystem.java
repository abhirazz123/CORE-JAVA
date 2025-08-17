package JAN_08;
//RailwayReservationSystem.java

class RailwayReservation implements Runnable {
 int availableSeats = 1; // Only 1 seat is available
 int wantedSeats;

 RailwayReservation(int wantedSeats) {
     this.wantedSeats = wantedSeats;
 }

 public void run() {
     String name = Thread.currentThread().getName();

     System.out.println(name + " entered the booking system...");

     System.out.println(name + " checking available seats...");
     if (availableSeats >= wantedSeats) {
         System.out.println(name + " found seat available. Booking now...");

         // Simulating delay in booking
         try {
             Thread.sleep(1000); // Delay to simulate race condition
         } catch (InterruptedException e) {}

         availableSeats -= wantedSeats;
         System.out.println(name + " successfully booked " + wantedSeats + " seat(s).");
     } else {
         System.out.println(name + " sorry, seat not available.");
     }
 }
}

public class RailwayReservationSystem {
 public static void main(String[] args) {
     RailwayReservation reservation = new RailwayReservation(1);

     Thread t1 = new Thread(reservation);
     Thread t2 = new Thread(reservation);

     t1.setName("Person1");
     t2.setName("Person2");

     t1.start();
     t2.start();
 }
}

