package entity.passenger;

public class NodePassenger {
  private Passenger value;
  private NodePassenger next;

  public NodePassenger() { this.next = null; }

  public NodePassenger(Passenger newValue) {
    this.value = newValue;
    this.next = null;
  }

  public Passenger getValue() { return value; }
  public void setValue(Passenger value) { this.value = value; }
  public NodePassenger getNext() { return next; }
  public void setNext(NodePassenger next) { this.next = next; }
}
