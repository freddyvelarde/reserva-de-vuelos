
import Passenger.Passenger;
import com.handleFile.FileHandler;
import com.storeData.DataHandler;
import java.util.List;

class Main {
  public static void main(String[] args) {

    DataHandler model = new DataHandler();
    String[] d = model.findOneById("passenger", "12344");

    for (String c : d) {
      System.out.println(c);
    }
  }
}
