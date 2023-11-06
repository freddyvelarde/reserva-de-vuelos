import entity.flight.Flight;
import service.impl.FlightReservationServiceImpl;
import service.impl.FlightServiceImpl;

class Main {
  public static void main(String[] args) {

    FlightReservationServiceImpl r = new FlightReservationServiceImpl();

    r.flightHistoryByPassenger(123).mostrar();
  }
}
