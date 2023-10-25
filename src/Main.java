import Passenger.Passenger;
import com.handleFile.HandleFile;

class Main {
  public static void main(String[] args) {
    Passenger p = new Passenger("Erick Silva", 23, 12345);
    HandleFile fileHandler = new HandleFile();

    // fileHandler.appendNewLine("passenger", p.parseDataToCSVFormat(), true);
    fileHandler.removeLine("passenger", p);
    /* System.out.println(p.parseDataToCSVFormat()); */
  }
}
