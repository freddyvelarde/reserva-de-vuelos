package service.impl;

import entity.flightHistory.FlightHistory;
import entity.flightHistory.LS_NormalFlightHistory;
import entity.flightHistory.NodeFlightHistory;
import java.util.List;
import repository.FileHandler;
import service.FlightHistoryService;

public class FlightHistoryServiceImpl implements FlightHistoryService {
  private String fileName = "flight-history";
  private FileHandler fileHandler = new FileHandler();

  public FlightHistory createNewFlightHistory(FlightHistory newFlightHistory) {
    this.fileHandler.appendNewLine(
        fileName, newFlightHistory.parseDataToCSVFormat(), true);
    return newFlightHistory;
  }

  public LS_NormalFlightHistory getAllFlightHistory() {
    List<String[]> flightHistoryCSV = this.fileHandler.readFile(fileName);

    LS_NormalFlightHistory flightHistory = new LS_NormalFlightHistory();
    flightHistory.readFlightFile(flightHistoryCSV);

    return flightHistory;
  }

  public LS_NormalFlightHistory getFlightHistoryByPassenger(int ci) {
    LS_NormalFlightHistory flightHistory = this.getAllFlightHistory();

    NodeFlightHistory currentNode = flightHistory.getHead();

    LS_NormalFlightHistory flightHistoryByPassenger =
        new LS_NormalFlightHistory();

    while (currentNode != null) {

      FlightHistory data = currentNode.getValue();

      if (data.getCi() == ci) {
        flightHistoryByPassenger.adiFinal(data);
      }

      currentNode = currentNode.getNext();
    }
    return flightHistoryByPassenger;
  }
}
