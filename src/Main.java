import controller.FlightController;
import controller.ReservationController;
import entity.flight.Flight;
import entity.flightReservation.FlightReservation;

class Main {
  public static void main(String[] args) {
    /* FlightController flightController = new FlightController(); */
    /* Flight f = new Flight("BO753", "La Paz", "Cochabamba", "2023-11-19", */
    /*                       "10:10", 150, 100.0); */

    /* flightController.createNewFlight(f); */
    /* flightController.getAllFlights().mostrar(); */
    ReservationController r = new ReservationController();
    /* r.createNewReservation(new FlightReservation("BO753", 13827575, 100, 3));
     */
    r.getFlightHistoryByPassenger(13827575).mostrar();
  }
}
