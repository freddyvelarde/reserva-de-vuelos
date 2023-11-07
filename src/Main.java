import entity.passenger.Passenger;
import service.impl.PassengerServiceImpl;

class Main {
  public static void main(String[] args) {
    PassengerServiceImpl p = new PassengerServiceImpl();
    Passenger passenger1 = new Passenger(13827575, "Freddy Velarde", 21);

    p.getAllPassengers().mostrar();
  }
}
