package entity.flightReservation;

public class FlightReservation {
  private String flightNumber;
  private int ci;
  private double totalPrice;
  private int seats;

  public FlightReservation(String flightNumber, int ci, double totalPrice,
                           int seats) {
    this.flightNumber = flightNumber;
    this.ci = ci;
    this.seats = seats;
    this.totalPrice = totalPrice * seats;
  }

  public void setSeats(int seats) { this.seats = seats; }
  public int getSeats() { return seats; }

  public String getFlightNumber() { return flightNumber; }

  public int getCi() { return ci; }
  public double getTotalPrice() { return totalPrice; }

  public void setCi(int ci) { this.ci = ci; }

  public void setTotalPrice(double totalPrice) {
    this.totalPrice = totalPrice * seats;
  }

  public void mostrar() {
    System.out.println("---------------------------");
    System.out.println("flight number: " + flightNumber);
    System.out.println("ci: " + ci);
    System.out.println("total Price: " + totalPrice);
    System.out.println("seats: " + seats);
  }
  public String parseDataToCSVFormat() {
    return flightNumber + "," + ci + "," + totalPrice + "," + seats;
  }
}
