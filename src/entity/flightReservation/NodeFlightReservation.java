package entity.flightReservation;

import entity.flightReservation.FlightReservation;

public class NodeFlightReservation {
  private FlightReservation value;
  private NodeFlightReservation next;

  public NodeFlightReservation() { this.next = null; }

  public NodeFlightReservation(FlightReservation newValue) {
    this.value = newValue;
    this.next = null;
  }

  public FlightReservation getValue() { return value; }
  public void setValue(FlightReservation value) { this.value = value; }
  public NodeFlightReservation getNext() { return next; }
  public void setNext(NodeFlightReservation next) { this.next = next; }
}
