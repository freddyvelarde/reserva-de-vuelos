package entity.flightHistory;

import entity.flightHistory.FlightHistory;

public class NodeFlightHistory {
  private FlightHistory value;
  private NodeFlightHistory next;

  public NodeFlightHistory() { this.next = null; }

  public NodeFlightHistory(FlightHistory newValue) {
    this.value = newValue;
    this.next = null;
  }

  public FlightHistory getValue() { return value; }
  public void setValue(FlightHistory value) { this.value = value; }
  public NodeFlightHistory getNext() { return next; }
  public void setNext(NodeFlightHistory next) { this.next = next; }
}
