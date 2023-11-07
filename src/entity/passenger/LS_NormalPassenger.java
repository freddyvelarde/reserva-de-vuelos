package entity.passenger;

import entity.passenger.ListSimplePassenger;
import entity.passenger.NodePassenger;
import entity.passenger.Passenger;
import java.util.List;

public class LS_NormalPassenger extends ListSimplePassenger {
  private int size;

  public LS_NormalPassenger() { super(); }

  public void readPassengerFile(List<String[]> passengerFile) {
    for (String[] data : passengerFile) {
      Passenger passenger = new Passenger(Integer.parseInt(data[0]), data[1],
                                          Integer.parseInt(data[2]));

      this.adiFinal(passenger);
    }
  }

  public boolean esVacia() { return this.head == null; }

  public void adiPrincipio(Passenger newValue) {
    NodePassenger newNode = new NodePassenger(newValue);
    newNode.setNext(this.head);
    head = newNode;
    size++;
  }

  public void adiFinal(Passenger newValue) {
    NodePassenger newNode = new NodePassenger(newValue);

    if (this.esVacia()) {
      head = newNode;
      size++;
      return;
    }
    NodePassenger currentNode = head;

    while (currentNode.getNext() != null) {
      currentNode = currentNode.getNext();
    }
    currentNode.setNext(newNode);

    size++;
  }

  public void mostrar() {
    NodePassenger currentNode = head;
    int i = 1;
    if (nroNodos() < 1) {
      System.out.println("No passengers added yet.");
      return;
    }

    while (currentNode != null) {
      currentNode.getValue().mostrar();
      System.out.println("Node nro: " + i);
      currentNode = currentNode.getNext();
      i++;
    }
  }

  public NodePassenger eliPrincipio() {
    NodePassenger firstElement = new NodePassenger();

    if (!this.esVacia()) {
      firstElement = head;
      head = head.getNext();
      firstElement.setNext(null);
    }
    size--;
    return firstElement;
  }

  public NodePassenger eliFinal() {
    if (this.head == null)
      return null;

    if (size == 1) {
      NodePassenger value = head;
      head = null;
      size--;
      return value;
    }

    NodePassenger currentNode = head;

    while (currentNode.getNext() != null &&
           currentNode.getNext().getNext() != null) {
      currentNode = currentNode.getNext();
    }

    if (currentNode.getNext() == null) {
      NodePassenger value = head;
      head = null;
      size--;
      return value;
    }
    NodePassenger value = currentNode.getNext();
    currentNode.setNext(null);
    size--;
    return value;
  }

  public int nroNodos() { return size; }
}
