import controller.ReservationController;
import entity.flightReservation.FlightReservation;

class Main {
  public static void main(String[] args) {
    FlightReservation f = new FlightReservation("BO123", 13827575, 100.0, 5);
    // f.mostrar();
    ReservationController r = new ReservationController();
    r.createNewReservation(f);
  }
}
