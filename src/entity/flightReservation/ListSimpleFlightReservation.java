package entity.flightReservation;

import entity.flightReservation.NodeTicketFlight;

public class ListSimpleFlightReservation {
  protected NodeTicketFlight head;

  public ListSimpleFlightReservation() { head = null; }

  public NodeTicketFlight getHead() { return head; }

  public void setHead(NodeTicketFlight head) { this.head = head; }
}
