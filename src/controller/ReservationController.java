package controller;
import entity.flight.Flight;
import entity.flight.LS_NormalFlight;
import entity.flight.NodeFlight;
import entity.flightReservation.FlightReservation;
import entity.flightReservation.LS_NormalFlightReservation;
import entity.flightReservation.NodeFlightReservation;
import repository.FileHandler;
import service.impl.FlightReservationServiceImpl;
import service.impl.FlightServiceImpl;

public class ReservationController {
  private FlightReservationServiceImpl reservations =
      new FlightReservationServiceImpl();

  public LS_NormalFlightReservation getFlightHistoryByPassenger(int ci) {
    LS_NormalFlightReservation reservationsByPassenger =
        reservations.flightHistoryByPassenger(ci);

    if (reservationsByPassenger.nroNodos() < 1) {

      System.out.println("Empty history for: " + ci);
    }

    return reservationsByPassenger;
  }

  public void createNewReservation(FlightReservation flightReservation) {
    FlightServiceImpl flights = new FlightServiceImpl();

    LS_NormalFlight allAvailableFlights = flights.getAllFlights();

    NodeFlight currentNode = allAvailableFlights.getHead();

    while (currentNode != null) {
      Flight flight = currentNode.getValue();

      if (flight.getFlightNumber().equals(
              flightReservation.getFlightNumber())) {
        if (flight.getNumberOfSeats() >= flightReservation.getSeats()) {
          this.reservations.createNewReservation(flightReservation);

          flights.updateNumberOfSeats(flightReservation.getSeats(),
                                      flightReservation.getFlightNumber());
          System.out.println("new reservations just created successfully.");
        } else {
          System.out.println("No seats available, for flight: " +
                             flightReservation.getFlightNumber());
        }
        return;
      }

      currentNode = currentNode.getNext();
    }
    System.out.println("Flight with number: " +
                       flightReservation.getFlightNumber() + ", no available.");
  }

  public LS_NormalFlight getFlightsBySourceAndDestination(String source,
                                                          String destination) {
    LS_NormalFlight flights = new FlightServiceImpl().getAllFlights();
    LS_NormalFlight flightsBySourceAndDestination = new LS_NormalFlight();

    NodeFlight currentNode = flights.getHead();

    while (currentNode != null) {
      Flight flight = currentNode.getValue();
      if (flight.getSource().equals(source) &&
          flight.getDestination().equals(destination))
        flightsBySourceAndDestination.adiFinal(flight);
      currentNode = currentNode.getNext();
    }
    return flightsBySourceAndDestination;
  }

  public LS_NormalFlight getReservationsByDate(String date) {
    LS_NormalFlight flights = new FlightServiceImpl().getAllFlights();
    LS_NormalFlight flightsByDate = new LS_NormalFlight();

    NodeFlight currentNode = flights.getHead();

    while (currentNode != null) {
      Flight flight = currentNode.getValue();

      if (flight.getDepartureTime().equals(date))
        flightsByDate.adiFinal(flight);

      currentNode = currentNode.getNext();
    }
    return flightsByDate;
  }
}
