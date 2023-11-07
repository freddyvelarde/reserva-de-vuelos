package entity.flight;

import entity.flight.Flight;
import entity.flight.ListSimpleFlight;
import entity.flight.NodeFlight;
import java.util.List;

public class LS_NormalFlight extends ListSimpleFlight {
  private int size;

  public LS_NormalFlight() { super(); }

  public void readFlightFile(List<String[]> flightFile) {
    for (String[] data : flightFile) {
      Flight flight =
          new Flight(data[0], data[1], data[2], data[3], data[4],
                     Integer.parseInt(data[5]), Double.parseDouble(data[6]));

      this.adiFinal(flight);
    }
  }

  public boolean esVacia() { return this.head == null; }

  public void adiPrincipio(Flight newValue) {
    NodeFlight newNode = new NodeFlight(newValue);
    newNode.setNext(this.head);
    head = newNode;
    size++;
  }

  public void adiFinal(Flight newValue) {
    NodeFlight newNode = new NodeFlight(newValue);

    if (this.esVacia()) {
      head = newNode;
      size++;
      return;
    }
    NodeFlight currentNode = head;

    while (currentNode.getNext() != null) {
      currentNode = currentNode.getNext();
    }
    currentNode.setNext(newNode);

    size++;
  }

  public void mostrar() {
    NodeFlight currentNode = head;
    int i = 1;

    if (nroNodos() < 1) {
      System.out.println("No flights added yet.");
      return;
    }

    while (currentNode != null) {
      currentNode.getValue().mostrar();
      System.out.println("Node nro: " + i);
      currentNode = currentNode.getNext();
      i++;
    }
  }

  public NodeFlight eliPrincipio() {
    NodeFlight firstElement = new NodeFlight();

    if (!this.esVacia()) {
      firstElement = head;
      head = head.getNext();
      firstElement.setNext(null);
    }
    size--;
    return firstElement;
  }

  public NodeFlight eliFinal() {
    if (this.head == null)
      return null;

    if (size == 1) {
      NodeFlight value = head;
      head = null;
      size--;
      return value;
    }

    NodeFlight currentNode = head;

    while (currentNode.getNext() != null &&
           currentNode.getNext().getNext() != null) {
      currentNode = currentNode.getNext();
    }

    if (currentNode.getNext() == null) {
      NodeFlight value = head;
      head = null;
      size--;
      return value;
    }
    NodeFlight value = currentNode.getNext();
    currentNode.setNext(null);
    size--;
    return value;
  }

  public int nroNodos() { return size; }
}
