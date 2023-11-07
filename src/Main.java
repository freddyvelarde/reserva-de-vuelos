import controller.FlightController;

public class Main {
  public static void main(String[] args) {

    FlightController f = new FlightController();
    f.getAvailableFlights().mostrar();
  }
}
