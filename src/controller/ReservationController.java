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
    System.out.println(":0");
    FlightServiceImpl flights = new FlightServiceImpl();

    LS_NormalFlight allAvailableFlights = flights.getAllFlights();

    NodeFlight currentNode = allAvailableFlights.getHead();

    while (currentNode != null) {
      Flight flight = currentNode.getValue();

      if (flight.getFlightNumber().equals(
              flightReservation.getFlightNumber())) {
        this.reservations.createNewReservation(flightReservation);

        flights.updateNumberOfSeats(flightReservation.getSeats(),
                                    flightReservation.getFlightNumber());
        System.out.println("new reservations just created successfully.");
      }

      currentNode = currentNode.getNext();
    }
  }
}
