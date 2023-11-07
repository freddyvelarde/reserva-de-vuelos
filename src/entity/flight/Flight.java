package entity.flight;

public class Flight {
  private String flightNumber;
  private String source;
  private String destination;
  private String departureDate;
  private String departureHour;
  private int numberOfSeats;
  private double price;

  public Flight(String flightNumber, String source, String destination,
                String departureDate, String departureHour, int numberOfSeats,
                double price) {
    this.flightNumber = flightNumber;
    this.source = source;
    this.destination = destination;
    this.departureDate = departureDate;
    this.departureHour = departureHour;
    this.numberOfSeats = numberOfSeats;
    this.price = price;
  }
  public Flight() {}

  public int updateNumberOfSeats(int numberOfSeatsBuyed) {
    if (numberOfSeats >= 1)
      this.numberOfSeats = this.numberOfSeats - numberOfSeatsBuyed;

    if (numberOfSeats <= 0)
      this.numberOfSeats = 0;

    return this.numberOfSeats;
  }

  public String getDepartureHour() { return departureHour; }
  public void setDepartureHour(String departureHour) {
    this.departureHour = departureHour;
  }

  public int getNumberOfSeats() { return numberOfSeats; }
  public void setNumberOfSeats(int numberOfSeats) {
    this.numberOfSeats = numberOfSeats;
  }

  public void setDepartureTime(String departureDate) {
    this.departureDate = departureDate;
  }
  public String getDepartureTime() { return departureDate; }

  public String getFlightNumber() { return flightNumber; }

  public void setFlightNumber(String flightNumber) {
    this.flightNumber = flightNumber;
  }

  public String getSource() { return source; }

  public void setSource(String source) { this.source = source; }

  public String getDestination() { return destination; }

  public void setDestination(String destination) {
    this.destination = destination;
  }

  public String parseDataToCSVFormat() {
    return flightNumber + "," + source + "," + destination + "," +
        departureDate + "," + departureHour + "," + numberOfSeats + "," + price;
  }

  public void mostrar() {
    System.out.println("flight number: " + flightNumber);
    System.out.println("departure airport: " + source);
    System.out.println("arrival airport: " + destination);
    System.out.println("departure date: " + departureDate);
    System.out.println("departure hour" + departureHour);
    System.out.println("number of seats: " + numberOfSeats);
    System.out.println("price" + price);
  }
}
