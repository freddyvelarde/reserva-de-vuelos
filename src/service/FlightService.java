package service;

import entity.flight.Flight;
import entity.flight.LS_NormalFlight;

public interface FlightService {
  Flight createNewFlight(Flight newFlight);

  LS_NormalFlight getAllFlights();

  void updateNumberOfSeats(int numberOfSeats, String flightNumber);
}
