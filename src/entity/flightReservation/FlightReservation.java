package entity.flightReservation;

public class FlightReservation {
  private String flightNumber;
  private int ci;
  private double price;
  private int seats;

  public FlightReservation(String flightNumber, int ci, double price,
                           int seats) {
    this.flightNumber = flightNumber;
    this.ci = ci;
    this.price = price;
    this.seats = seats;
  }
  public void setSeats(int seats) { this.seats = seats; }
  public int getSeats() { return seats; }

  public String getFlightNumber() { return flightNumber; }

  public int getCi() { return ci; }
  public double getPrice() { return price; }

  public void setCi(int ci) { this.ci = ci; }

  public void setPrice(double price) { this.price = price; }

  public void mostrar() {
    System.out.println("---------------------------");
    System.out.println("flight number: " + flightNumber);
    System.out.println("ci: " + ci);
    System.out.println("price: " + price);
    System.out.println("seats: " + seats);
  }
  public String parseDataToCSVFormat() {
    return flightNumber + "," + ci + "," + price + "," + seats;
  }
}
