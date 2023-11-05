package entity.flightReservation;

import entity.flightReservation.TicketFlight;

public class NodeTicketFlight {
  private TicketFlight value;
  private NodeTicketFlight next;

  public NodeTicketFlight() { this.next = null; }

  public NodeTicketFlight(TicketFlight newValue) {
    this.value = newValue;
    this.next = null;
  }

  public TicketFlight getValue() { return value; }
  public void setValue(TicketFlight value) { this.value = value; }
  public NodeTicketFlight getNext() { return next; }
  public void setNext(NodeTicketFlight next) { this.next = next; }
}
