package entity.flight;

import entity.flight.Flight;

public class NodeFlight {
  private Flight value;
  private NodeFlight next;

  public NodeFlight() { this.next = null; }

  public NodeFlight(Flight newValue) {
    this.value = newValue;
    this.next = null;
  }

  public Flight getValue() { return value; }
  public void setValue(Flight value) { this.value = value; }
  public NodeFlight getNext() { return next; }
  public void setNext(NodeFlight next) { this.next = next; }
}
