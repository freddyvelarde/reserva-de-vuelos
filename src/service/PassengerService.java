package service;
import entity.passenger.LS_NormalPassenger;
import entity.passenger.Passenger;

public interface PassengerService {
  Passenger createNewPassenger(Passenger passenger);

  LS_NormalPassenger getAllPassengers();
}
