package service;

import entity.flightReservation.LS_NormalFlightReservation;
import entity.flightReservation.TicketFlight;

public interface FlightReservationService {

  TicketFlight createNewReservation(TicketFlight newTicketFlight);

  LS_NormalFlightReservation getAllReservations();

  LS_NormalFlightReservation flightHistoryByPassenger(int ci);
}
