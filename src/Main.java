import controller.ReservationController;
import entity.flightReservation.FlightReservation;

class Main {
  public static void main(String[] args) {
    FlightReservation r = new FlightReservation("Bi123", 12345678, 420, 5);
    ReservationController reservation = new ReservationController();
    /* reservation.createNewReservation(r); */
    reservation.getReservationsByDate("2023-11-07").mostrar();
    /* reservation.getFlightsBySourceAndDestination("Santa Cruz", "La Paz") */
    /*     .mostrar(); */

    /* reservation.getFlightHistoryByPassenger(13827575).mostrar(); */
  }
}
