import entity.flightHistory.FlightHistory;
import entity.flightHistory.LS_NormalFlightHistory;

class Main {
  public static void main(String[] args) {
    FlightHistory f = new FlightHistory("123", "1ABC");
    FlightHistory f2 = new FlightHistory("124", "2ABC");

    LS_NormalFlightHistory l = new LS_NormalFlightHistory();

    l.adiFinal(f);
    l.adiFinal(f2);

    l.mostrar();
  }
}
