/* import java.util.List; */
// import entity.passenger.ListSimplePassenger;
import entity.passenger.Passenger;
import service.impl.PassengerServiceImpl;

class Main {
  public static void main(String[] args) {
    Passenger p = new Passenger(2, "Freddy Erick Velarde Silva", 22);
    // Passenger p2 = new Passenger(6, "Erick Silva", 20);
    // LS_NormalPassenger l = new LS_NormalPassenger();
    // l.adiFinal(p);
    // l.adiFinal(p2);
    // l.mostrar();

    /*  */
    PassengerServiceImpl model = new PassengerServiceImpl();
    model.deletePassenger(p);
    /* model.updatePassenger(p); */
    /* model.createNewPassenger(p); */
    /* model.getAllPassengers().mostrar(); */
    // model.create("passenger", p.parseDataToCSVFormat());
  }
}
