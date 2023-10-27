import Passenger.Passenger;
import com.handleFile.FileHandler;
import com.storeData.StoreData;
import java.util.List;

class Main {
  public static void main(String[] args) {
    Passenger p = new Passenger(2, "Erick Silva", 20);

    StoreData model = new StoreData();
    model.create("passenger", p.parseDataToCSVFormat());
  }
}
