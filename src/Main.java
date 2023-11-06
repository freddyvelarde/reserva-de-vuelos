import controller.ReservationController;
import entity.flightReservation.FlightReservation;

class Main {
  public static void main(String[] args) {
    ReservationController r = new ReservationController();
    FlightReservation f = new FlightReservation("ABC", 123, "a", "b", 120, 270);

    r.createNewReservation(f);
  }
}
