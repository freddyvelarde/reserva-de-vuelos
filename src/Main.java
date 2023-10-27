
import Passenger.Passenger;
import com.storeData.DataHandler;

class Main {
  public static void main(String[] args) {
    Passenger p = new Passenger(1, "Luis", 20);

    DataHandler<Passenger> model = new DataHandler<Passenger>();

    model.create("passenger", p.parseDataToCSVFormat());

    System.out.println("Hello, world!");
  }
}
