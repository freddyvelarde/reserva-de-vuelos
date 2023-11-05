package entity.flight;

public class ListSimpleFlight {
  protected NodeFlight head;

  public ListSimpleFlight() { head = null; }

  public NodeFlight getHead() { return head; }

  public void setHead(NodeFlight head) { this.head = head; }
}
