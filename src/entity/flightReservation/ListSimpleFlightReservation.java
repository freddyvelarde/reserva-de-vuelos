package entity.flightReservation;

import entity.flightReservation.NodeFlightReservation;

public class ListSimpleFlightReservation {
  protected NodeFlightReservation head;

  public ListSimpleFlightReservation() { head = null; }

  public NodeFlightReservation getHead() { return head; }

  public void setHead(NodeFlightReservation head) { this.head = head; }
}
