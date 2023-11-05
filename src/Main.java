import entity.flightReservation.LS_NormalFlightReservation;
import entity.flightReservation.TicketFlight;

class Main {
  public static void main(String[] args) {
    TicketFlight t = new TicketFlight("1ABC", 123, "a", "b", 120);
    TicketFlight t2 = new TicketFlight("2ABC", 123, "b", "a", 150);

    LS_NormalFlightReservation l = new LS_NormalFlightReservation();
    l.adiFinal(t);
    l.adiFinal(t2);
    l.mostrar();
  }
}
