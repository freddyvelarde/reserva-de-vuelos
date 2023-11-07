package controller;
import entity.flight.Flight;
import entity.flight.LS_NormalFlight;
import entity.flight.NodeFlight;
import entity.flightReservation.FlightReservation;
import repository.FileHandler;
import service.impl.FlightReservationServiceImpl;
import service.impl.FlightServiceImpl;

public class ReservationController {
  private FlightReservationServiceImpl reservations =
      new FlightReservationServiceImpl();

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
        break;
      }

      currentNode = currentNode.getNext();
    }
  }
}
