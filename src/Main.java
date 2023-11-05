import entity.flightHistory.FlightHistory;
import entity.flightHistory.LS_NormalFlightHistory;
import service.impl.FlightHistoryServiceImpl;

class Main {
  public static void main(String[] args) {
    FlightHistoryServiceImpl h = new FlightHistoryServiceImpl();

    LS_NormalFlightHistory l = h.getFlightHistoryByPassenger(123);

    l.mostrar();
  }
}
