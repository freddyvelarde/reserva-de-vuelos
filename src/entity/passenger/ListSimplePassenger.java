package entity.passenger;

public class ListSimplePassenger {
  protected NodePassenger head;

  public ListSimplePassenger() { head = null; }

  public NodePassenger getHead() { return head; }

  public void setHead(NodePassenger head) { this.head = head; }
}
