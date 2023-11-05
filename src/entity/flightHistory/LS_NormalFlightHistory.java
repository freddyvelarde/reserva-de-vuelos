package entity.flightHistory;

/* import entity.flightHistory.FlightHistory; */
import entity.flightHistory.ListSimpleFlightHistory;
import entity.flightHistory.NodeFlightHistory;
import java.util.List;

public class LS_NormalFlightHistory extends ListSimpleFlightHistory {
  private int size;

  public LS_NormalFlightHistory() { super(); }

  public void readFlightFile(List<String[]> flightHistoryFile) {
    for (String[] data : flightHistoryFile) {
      FlightHistory flightHistory = new FlightHistory(data[0], data[1]);

      this.adiFinal(flightHistory);
    }
  }

  public boolean esVacia() { return this.head == null; }

  public void adiPrincipio(FlightHistory newValue) {
    NodeFlightHistory newNode = new NodeFlightHistory(newValue);
    newNode.setNext(this.head);
    head = newNode;
    size++;
  }

  public void adiFinal(FlightHistory newValue) {
    NodeFlightHistory newNode = new NodeFlightHistory(newValue);

    if (this.esVacia()) {
      head = newNode;
      size++;
      return;
    }
    NodeFlightHistory currentNode = head;

    while (currentNode.getNext() != null) {
      currentNode = currentNode.getNext();
    }
    currentNode.setNext(newNode);

    size++;
  }

  public void mostrar() {
    NodeFlightHistory currentNode = head;
    int i = 1;

    while (currentNode != null) {
      currentNode.getValue().mostrar();
      System.out.println("Node nro: " + i);
      currentNode = currentNode.getNext();
      i++;
    }
  }

  public NodeFlightHistory eliPrincipio() {
    NodeFlightHistory firstElement = new NodeFlightHistory();

    if (!this.esVacia()) {
      firstElement = head;
      head = head.getNext();
      firstElement.setNext(null);
    }
    size--;
    return firstElement;
  }

  public NodeFlightHistory eliFinal() {
    if (this.head == null)
      return null;

    if (size == 1) {
      NodeFlightHistory value = head;
      head = null;
      size--;
      return value;
    }

    NodeFlightHistory currentNode = head;

    while (currentNode.getNext() != null &&
           currentNode.getNext().getNext() != null) {
      currentNode = currentNode.getNext();
    }

    if (currentNode.getNext() == null) {
      NodeFlightHistory value = head;
      head = null;
      size--;
      return value;
    }
    NodeFlightHistory value = currentNode.getNext();
    currentNode.setNext(null);
    size--;
    return value;
  }
  // public NodeFlightHistory eliFinal() {
  //   NodeFlightHistory lastElement = new NodeFlightHistory();
  //
  //   if (!this.esVacia()) {
  //     if (this.nroNodos() == 1) {
  //       lastElement = head;
  //       head = null;
  //     } else {
  //       NodeFlightHistory currentNode_1 = head;
  //       NodeFlightHistory currentNode_2 = head;
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
  /*     FlightHistory z = new FlightHistory(); */
  /*     z.leer(); */
  /*     adiPrincipio(z); */
  /*   } */
  /* } */
  /*  */
  /* public void leer2(int n) { */
  /*   for (int i = 1; i <= n; i++) { */
  /*     FlightHistory z = new FlightHistory(); */
  /*     z.leer(); */
  /*     adiFinal(z); */
  /*   } */
  /* } */

  public int nroNodos() { return size; }
}
