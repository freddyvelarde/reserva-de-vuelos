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
      Flight flight = new Flight(data[0], data[1], data[2], data[3],
                                 Integer.parseInt(data[4]));

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
  // public NodeFlight eliFinal() {
  //   NodeFlight lastElement = new NodeFlight();
  //
  //   if (!this.esVacia()) {
  //     if (this.nroNodos() == 1) {
  //       lastElement = head;
  //       head = null;
  //     } else {
  //       NodeFlight currentNode_1 = head;
  //       NodeFlight currentNode_2 = head;
  //
  //       while (currentNode_1.getNext() != null) {
  //         currentNode_2 = currentNode_1;
  //         currentNode_1 = currentNode_1.getNext();
  //       }
  //       lastElement = currentNode_1;
  //       currentNode_2.setNext(null);
  //     }
  //   }
  //   return lastElement;
  // }

  /* public void leer1(int n) { */
  /*   for (int i = 1; i <= n; i++) { */
  /*     Flight z = new Flight(); */
  /*     z.leer(); */
  /*     adiPrincipio(z); */
  /*   } */
  /* } */
  /*  */
  /* public void leer2(int n) { */
  /*   for (int i = 1; i <= n; i++) { */
  /*     Flight z = new Flight(); */
  /*     z.leer(); */
  /*     adiFinal(z); */
  /*   } */
  /* } */

  public int nroNodos() { return size; }
}
