package service.impl;

import entity.flightReservation.LS_NormalFlightReservation;
import entity.flightReservation.NodeTicketFlight;
import entity.flightReservation.TicketFlight;
import java.util.List;
import repository.FileHandler;
import service.FlightReservationService;

public class FlightReservationServiceImpl implements FlightReservationService {
  private String fileName = "flight-reservation";
  private FileHandler fileHandler = new FileHandler();

  public TicketFlight createNewReservation(TicketFlight newTicketFlight) {
    this.fileHandler.appendNewLine(
        fileName, newTicketFlight.parseDataToCSVFormat(), true);

    return newTicketFlight;
  }

  public LS_NormalFlightReservation flightHistoryByPassenger(int ci) {
    LS_NormalFlightReservation reservations = getAllReservations();
    LS_NormalFlightReservation reservationsByPassenger =
        new LS_NormalFlightReservation();

    NodeTicketFlight currentNode = reservations.getHead();

    while (currentNode != null) {
      TicketFlight data = currentNode.getValue();
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
