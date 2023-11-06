package entity.flightReservation;

public class FlightReservation {
  private String flightNumber;
  private int ci;
  private String source;
  private String destination;
  private double price;
  private int numberOfSeats;

  public FlightReservation(String flightNumber, int ci, String source,
                           String destination, double price,
                           int numberOfSeats) {
    this.flightNumber = flightNumber;
    this.ci = ci;
    this.source = source;
    this.destination = destination;
    this.price = price;
    this.numberOfSeats = numberOfSeats;
  }
  public int getNumberOfSeats() { return numberOfSeats; }
  public void setNumberOfSeats(int numberOfSeats) {
    this.numberOfSeats = numberOfSeats;
  }

  public String getFlightNumber() { return flightNumber; }

  public String getDestination() { return destination; }

  public String getSource() { return source; }
  public int getCi() { return ci; }
  public double getPrice() { return price; }

  public void setCi(int ci) { this.ci = ci; }

  public void setFlightNumber(String flightNumber) {
    this.flightNumber = flightNumber;
  }
  public void setSource(String source) { this.source = source; }
  public void setDestination(String destination) {
    this.destination = destination;
  }
  public void setPrice(double price) { this.price = price; }

  public void mostrar() {
    System.out.println("---------------------------");
    System.out.println("flight number: " + flightNumber);
    System.out.println("ci: " + ci);
    System.out.println("source: " + source);
    System.out.println("destination: " + destination);
    System.out.println("price: " + price);
  }

  public String parseDataToCSVFormat() {
    return flightNumber + "," + ci + "," + source + "," + destination + "," +
        price + "," + numberOfSeats;
  }
}
