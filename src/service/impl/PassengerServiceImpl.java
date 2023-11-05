package service.impl;
import entity.passenger.LS_NormalPassenger;
import entity.passenger.Passenger;
import java.util.ArrayList;
import java.util.List;
import repository.FileHandler;
import service.PassengerService;

public class PassengerServiceImpl implements PassengerService {
  private FileHandler fileHandler = new FileHandler();
  private String file = "passenger";

  public Passenger createNewPassenger(Passenger passenger) {
    List<String[]> reader = this.fileHandler.readFile(file);

    for (String[] rows : reader) {
      if (Integer.parseInt(rows[0]) == passenger.getCi()) {
        System.out.println("An error ocurred while new creating entity. CI: " +
                           passenger.getCi() + " is already in use.");
        return null;
      }
    }

    this.fileHandler.appendNewLine(file, passenger.parseDataToCSVFormat(),
                                   true);
    return passenger;
  }

  public LS_NormalPassenger getAllPassengers() {
    List<String[]> reader = this.fileHandler.readFile(file);

    LS_NormalPassenger passengers = new LS_NormalPassenger();
    passengers.readPassengerFile(reader);

    return passengers;
  }

  public Passenger updatePassenger(Passenger newPassenger) {

    this.fileHandler.updateLine(this.file,
                                Integer.toString(newPassenger.getCi()),
                                newPassenger.parseDataToCSVFormat());
    return newPassenger;
  }

  public void deletePassenger(Passenger passenger) {
    this.fileHandler.removeLine(this.file, Integer.toString(passenger.getCi()));
  }
}
