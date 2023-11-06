import entity.flight.Flight;
import service.impl.FlightServiceImpl;

class Main {
  public static void main(String[] args) {
    Flight f = new Flight("ABC", "a", "b", "06/11/2023", 250);

    FlightServiceImpl flights = new FlightServiceImpl();

    flights.updateNumberOfSeats(150, "BCD");
  }
}
