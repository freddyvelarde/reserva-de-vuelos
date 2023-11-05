package service.impl;

import entity.flight.Flight;
import entity.flight.LS_NormalFlight;
import java.util.List;
import repository.FileHandler;

public class FlightServiceImpl {
  private String fileName = "flight";
  private FileHandler fileHandler = new FileHandler();

  public Flight createNewFlight(Flight newFlight) {
    this.fileHandler.appendNewLine(fileName, newFlight.parseDataToCSVFormat(),
                                   true);
    return newFlight;
  }

  public LS_NormalFlight getAllFlights() {
    List<String[]> flightCsv = fileHandler.readFile(fileName);

    LS_NormalFlight flights = new LS_NormalFlight();
    flights.readFlightFile(flightCsv);

    return flights;
  }
}