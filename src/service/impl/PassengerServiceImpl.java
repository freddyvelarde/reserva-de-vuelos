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

  /* public PassengerServiceImpl() { super(); } */

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

  // read methods
  // public List<String[]> findManyById(String file, String id) {
  //   List<String[]> table = this.readFile(file);
  //
  //   List<String[]> data = new ArrayList<>();
  //
  //   for (String[] row : table) {
  //     if (row[2].equals(id)) {
  //       data.add(row);
  //       System.out.println(row[0]);
  //       System.out.println(row[1]);
  //       System.out.println(row[2]);
  //     }
  //   }
  //   return data;
  // }

  /* public String[] findOneById(String file, String id) { */
  /*   List<String[]> table = this.readFile(file); */
  /*  */
  /*   String[] data = null; */
  /*  */
  /*   for (String[] row : table) { */
  /*     if (row[2].equals(id)) { */
  /*       data = row; */
  /*     } */
  /*   } */
  /*  */
  /*   return data; */
  /* } */
  /*  */
  /* // update methods */
  /* public void update() {} */
  /*  */
  /* // delete methods */
  /* public void delete() {} */
}
