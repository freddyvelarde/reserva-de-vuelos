import entity.flightReservation.TicketFlight;
import service.impl.FlightReservationServiceImpl;

class Main {
  public static void main(String[] args) {
    TicketFlight t = new TicketFlight("1ABz", 124, "a", "b", 130);

    FlightReservationServiceImpl f = new FlightReservationServiceImpl();

    f.getAllReservationsByPassenger(124).mostrar();
  }
}
