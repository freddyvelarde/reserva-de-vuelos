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
  // public NodePassenger eliFinal() {
  //   NodePassenger lastElement = new NodePassenger();
  //
  //   if (!this.esVacia()) {
  //     if (this.nroNodos() == 1) {
  //       lastElement = head;
  //       head = null;
  //     } else {
  //       NodePassenger currentNode_1 = head;
  //       NodePassenger currentNode_2 = head;
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
  /*     Passenger z = new Passenger(); */
  /*     z.leer(); */
  /*     adiPrincipio(z); */
  /*   } */
  /* } */
  /*  */
  /* public void leer2(int n) { */
  /*   for (int i = 1; i <= n; i++) { */
  /*     Passenger z = new Passenger(); */
  /*     z.leer(); */
  /*     adiFinal(z); */
  /*   } */
  /* } */

  public int nroNodos() { return size; }
}
