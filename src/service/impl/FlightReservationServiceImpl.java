package service.impl;

import entity.flightReservation.FlightReservation;
import entity.flightReservation.LS_NormalFlightReservation;
import entity.flightReservation.NodeFlightReservation;
import java.util.List;
import repository.FileHandler;
import service.FlightReservationService;

public class FlightReservationServiceImpl implements FlightReservationService {
  private String fileName = "flight-reservation";
  private FileHandler fileHandler = new FileHandler();

  public FlightReservation
  createNewReservation(FlightReservation newFlightReservation) {
    this.fileHandler.appendNewLine(
        fileName, newFlightReservation.parseDataToCSVFormat(), true);

    return newFlightReservation;
  }

  public LS_NormalFlightReservation flightHistoryByPassenger(int ci) {
    LS_NormalFlightReservation reservations = getAllReservations();
    LS_NormalFlightReservation reservationsByPassenger =
        new LS_NormalFlightReservation();

    NodeFlightReservation currentNode = reservations.getHead();

    while (currentNode != null) {
      FlightReservation data = currentNode.getValue();
      if (data.getCi() == ci) {
        reservationsByPassenger.adiFinal(data);
      }

      currentNode = currentNode.getNext();
    }
    return reservationsByPassenger;
  }

  public LS_NormalFlightReservation getAllReservations() {
    List<String[]> reservationCSV = this.fileHandler.readFile(fileName);
    LS_NormalFlightReservation reservations = new LS_NormalFlightReservation();
    reservations.readFlightReservationFile(reservationCSV);

    return reservations;
  }
}
