import entity.Passenger;
import java.util.List;
import service.impl.PassengerServiceImpl;

class Main {
  public static void main(String[] args) {
    Passenger p = new Passenger(4, "Jesus Navarro", 20);

    PassengerServiceImpl model = new PassengerServiceImpl();
    model.create("passenger", p.parseDataToCSVFormat());
  }
}
