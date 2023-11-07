package service.impl;

import entity.flight.Flight;
import entity.flight.LS_NormalFlight;
import java.util.List;
import repository.FileHandler;
import service.FlightService;

public class FlightServiceImpl implements FlightService {
  private String fileName = "flight";
  private FileHandler fileHandler = new FileHandler();

  public Flight createNewFlight(Flight newFlight) {
    this.fileHandler.appendNewLine(fileName, newFlight.parseDataToCSVFormat(),
                                   true);
    return newFlight;
  }

  public void updateNumberOfSites(int numberOfSites, String flightNumber) {
    List<String[]> flightCSV = this.fileHandler.readFile(fileName);
    Flight flight = null;
    for (String[] data : flightCSV) {
      if (data[0].equals(flightNumber)) {
        flight =
            new Flight(data[0], data[1], data[2], data[3], data[4],
                       Integer.parseInt(data[5]), Double.parseDouble(data[6]));
        flight.updateNumberOfSites(numberOfSites);
      }
    }
    if (flight != null)
      this.fileHandler.updateLine(fileName, flightNumber,
                                  flight.parseDataToCSVFormat());
  }

  public LS_NormalFlight getAllFlights() {
    List<String[]> flightCsv = fileHandler.readFile(fileName);

    LS_NormalFlight flights = new LS_NormalFlight();
    flights.readFlightFile(flightCsv);

    return flights;
  }
}
