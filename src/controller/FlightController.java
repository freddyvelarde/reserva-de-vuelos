package controller;

import entity.flight.Flight;
import entity.flight.LS_NormalFlight;
import entity.flight.NodeFlight;
import helper.CurrentDate;
import helper.CurrentTime;
import service.impl.FlightServiceImpl;

public class FlightController {
  private FlightServiceImpl flightsService = new FlightServiceImpl();

  public void createNewFlight(Flight newFlight) {
    LS_NormalFlight allFlights = flightsService.getAllFlights();

    NodeFlight currentNode = allFlights.getHead();

    while (currentNode != null) {
      Flight flight = currentNode.getValue();

      if (flight.getFlightNumber().equals(newFlight.getFlightNumber())) {
        System.out.println(
            "the flight with number: " + newFlight.getFlightNumber() +
            ", is already created.");
        return;
      }

      currentNode = currentNode.getNext();
    }

    this.flightsService.createNewFlight(newFlight);
    System.out.println("New flight: " + newFlight.getFlightNumber() +
                       ", created successfully.");
  }
  public LS_NormalFlight getAllFlights() {
    return this.flightsService.getAllFlights();
  }

  public LS_NormalFlight getAvailableFlights() {
    LS_NormalFlight allFlights = this.flightsService.getAllFlights();
    LS_NormalFlight availableFlights = new LS_NormalFlight();
    NodeFlight currentNode = allFlights.getHead();

    String currentTime = new CurrentTime().getCurrentTime();
    String currentDate = new CurrentDate().getCurrentDate();

    while (currentNode != null) {

      Flight flight = currentNode.getValue();

      if (flight.getSites() > 0) {
        availableFlights.adiFinal(flight);
      }

      currentNode = currentNode.getNext();
    }
    return availableFlights;
  }
}
