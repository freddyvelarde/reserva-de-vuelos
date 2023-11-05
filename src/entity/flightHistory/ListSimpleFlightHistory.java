package entity.flightHistory;

public class ListSimpleFlightHistory {
  protected NodeFlightHistory head;

  public ListSimpleFlightHistory() { head = null; }

  public NodeFlightHistory getHead() { return head; }

  public void setHead(NodeFlightHistory head) { this.head = head; }
}
