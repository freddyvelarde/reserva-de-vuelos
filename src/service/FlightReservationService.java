package service;

import entity.flightReservation.FlightReservation;
import entity.flightReservation.LS_NormalFlightReservation;

public interface FlightReservationService {

  FlightReservation
  createNewReservation(FlightReservation newFlightReservation);

  LS_NormalFlightReservation getAllReservations();

  LS_NormalFlightReservation flightHistoryByPassenger(int ci);
}
