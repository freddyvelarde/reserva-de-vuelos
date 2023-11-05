import entity.flight.Flight;
/* import entity.flight.LS_NormalFlight; */
import service.impl.FlightServiceImpl;

class Main {
  public static void main(String[] args) {
    Flight f2 = new Flight("2ABC", "B", "A", "06/11/2023");

    FlightServiceImpl flights = new FlightServiceImpl();

    flights.getAllFlights().mostrar();
  }
}
