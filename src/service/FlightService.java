package service;

import entity.flight.Flight;
import entity.flight.LS_NormalFlight;

public interface FlightService {
  Flight createNewFlight(Flight newFlight);

  LS_NormalFlight getAllFlights();

  void updateNumberOfSites(int numberOfSites, String flightNumber);
}
