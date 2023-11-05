package service;

import entity.flightHistory.FlightHistory;
import entity.flightHistory.LS_NormalFlightHistory;

public interface FlightHistoryService {

  FlightHistory createNewFlightHistory(FlightHistory newFlightHistory);

  LS_NormalFlightHistory getAllFlightHistory();

  LS_NormalFlightHistory getFlightHistoryByPassenger(int ci);
}
