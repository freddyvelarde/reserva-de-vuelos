import controller.ReservationController;
import entity.flightReservation.FlightReservation;

class Main {
  public static void main(String[] args) {
    ReservationController r = new ReservationController();
    FlightReservation f = new FlightReservation("BO123", 13827575, 420, 3);
    r.createNewReservation(f);
  }
}
