package entity.flightReservation;

import entity.flightReservation.FlightReservation;
import entity.flightReservation.ListSimpleFlightReservation;
import entity.flightReservation.NodeFlightReservation;
import java.util.List;

public class LS_NormalFlightReservation extends ListSimpleFlightReservation {
  private int size;

  public LS_NormalFlightReservation() { super(); }

  public void readFlightReservationFile(List<String[]> flightFile) {
    for (String[] data : flightFile) {
      FlightReservation flightReservation = new FlightReservation(
          data[0], Integer.parseInt(data[1]), data[2], data[3],
          Double.parseDouble(data[4]), Integer.parseInt(data[5]));
      this.adiFinal(flightReservation);
    }
  }

  public boolean esVacia() { return this.head == null; }

  public void adiPrincipio(FlightReservation newValue) {
    NodeFlightReservation newNode = new NodeFlightReservation(newValue);
    newNode.setNext(this.head);
    head = newNode;
    size++;
  }

  public void adiFinal(FlightReservation newValue) {
    NodeFlightReservation newNode = new NodeFlightReservation(newValue);

    if (this.esVacia()) {
      head = newNode;
      size++;
      return;
    }
    NodeFlightReservation currentNode = head;

    while (currentNode.getNext() != null) {
      currentNode = currentNode.getNext();
    }
    currentNode.setNext(newNode);

    size++;
  }

  public void mostrar() {
    NodeFlightReservation currentNode = head;
    int i = 1;

    while (currentNode != null) {
      currentNode.getValue().mostrar();
      System.out.println("NodeFlightReservation nro: " + i);
      currentNode = currentNode.getNext();
      i++;
    }
  }

  public NodeFlightReservation eliPrincipio() {
    NodeFlightReservation firstElement = new NodeFlightReservation();

    if (!this.esVacia()) {
      firstElement = head;
      head = head.getNext();
      firstElement.setNext(null);
    }
    size--;
    return firstElement;
  }

  public NodeFlightReservation eliFinal() {
    if (this.head == null)
      return null;

    if (size == 1) {
      NodeFlightReservation value = head;
      head = null;
      size--;
      return value;
    }

    NodeFlightReservation currentNode = head;

    while (currentNode.getNext() != null &&
           currentNode.getNext().getNext() != null) {
      currentNode = currentNode.getNext();
    }

    if (currentNode.getNext() == null) {
      NodeFlightReservation value = head;
      head = null;
      size--;
      return value;
    }
    NodeFlightReservation value = currentNode.getNext();
    currentNode.setNext(null);
    size--;
    return value;
  }

  public int nroNodos() { return size; }
}
