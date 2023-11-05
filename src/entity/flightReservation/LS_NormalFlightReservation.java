package entity.flightReservation;

import entity.flightReservation.ListSimpleFlightReservation;
import entity.flightReservation.NodeTicketFlight;
import entity.flightReservation.TicketFlight;
import java.util.List;

public class LS_NormalFlightReservation extends ListSimpleFlightReservation {
  private int size;

  public LS_NormalFlightReservation() { super(); }

  public void readFlightReservationFile(List<String[]> flightFile) {
    for (String[] data : flightFile) {
      TicketFlight flightReservation =
          new TicketFlight(data[0], Integer.parseInt(data[1]), data[2], data[3],
                           Double.parseDouble(data[4]));
      this.adiFinal(flightReservation);
    }
  }

  public boolean esVacia() { return this.head == null; }

  public void adiPrincipio(TicketFlight newValue) {
    NodeTicketFlight newNode = new NodeTicketFlight(newValue);
    newNode.setNext(this.head);
    head = newNode;
    size++;
  }

  public void adiFinal(TicketFlight newValue) {
    NodeTicketFlight newNode = new NodeTicketFlight(newValue);

    if (this.esVacia()) {
      head = newNode;
      size++;
      return;
    }
    NodeTicketFlight currentNode = head;

    while (currentNode.getNext() != null) {
      currentNode = currentNode.getNext();
    }
    currentNode.setNext(newNode);

    size++;
  }

  public void mostrar() {
    NodeTicketFlight currentNode = head;
    int i = 1;

    while (currentNode != null) {
      currentNode.getValue().mostrar();
      System.out.println("Node nro: " + i);
      currentNode = currentNode.getNext();
      i++;
    }
  }

  public NodeTicketFlight eliPrincipio() {
    NodeTicketFlight firstElement = new NodeTicketFlight();

    if (!this.esVacia()) {
      firstElement = head;
      head = head.getNext();
      firstElement.setNext(null);
    }
    size--;
    return firstElement;
  }

  public NodeTicketFlight eliFinal() {
    if (this.head == null)
      return null;

    if (size == 1) {
      NodeTicketFlight value = head;
      head = null;
      size--;
      return value;
    }

    NodeTicketFlight currentNode = head;

    while (currentNode.getNext() != null &&
           currentNode.getNext().getNext() != null) {
      currentNode = currentNode.getNext();
    }

    if (currentNode.getNext() == null) {
      NodeTicketFlight value = head;
      head = null;
      size--;
      return value;
    }
    NodeTicketFlight value = currentNode.getNext();
    currentNode.setNext(null);
    size--;
    return value;
  }
  // public NodeTicketFlight eliFinal() {
  //   NodeTicketFlight lastElement = new NodeTicketFlight();
  //
  //   if (!this.esVacia()) {
  //     if (this.nroNodos() == 1) {
  //       lastElement = head;
  //       head = null;
  //     } else {
  //       NodeTicketFlight currentNode_1 = head;
  //       NodeTicketFlight currentNode_2 = head;
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
  /*     NodeTicketFlight z = new NodeTicketFlight(); */
  /*     z.leer(); */
  /*     adiPrincipio(z); */
  /*   } */
  /* } */
  /*  */
  /* public void leer2(int n) { */
  /*   for (int i = 1; i <= n; i++) { */
  /*     NodeTicketFlight z = new NodeTicketFlight(); */
  /*     z.leer(); */
  /*     adiFinal(z); */
  /*   } */
  /* } */

  public int nroNodos() { return size; }
}
