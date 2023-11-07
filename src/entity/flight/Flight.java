package entity.flight;

public class Flight {
  protected String flightNumber;
  protected String source;
  protected String destination;
  protected String departureTime;
  protected int numberOfSeats;

  public Flight(String flightNumber, String source, String destination,
                String departureTime, int numberOfSeats) {
    this.flightNumber = flightNumber;
    this.source = source;
    this.destination = destination;
    this.departureTime = departureTime;
    this.numberOfSeats = numberOfSeats;
  }
  public Flight() {}

  public int updateNumberOfSeats(int numberOfSeatsBuyed) {
    if (numberOfSeats >= 1)
      this.numberOfSeats = this.numberOfSeats - numberOfSeatsBuyed;

    if (numberOfSeats <= 0)
      this.numberOfSeats = 0;

    return this.numberOfSeats;
  }

  public int getNumberOfSeats() { return numberOfSeats; }
  public void setNumberOfSeats(int numberOfSeats) {
    this.numberOfSeats = numberOfSeats;
  }

  public void setDepartureTime(String departureTime) {
    this.departureTime = departureTime;
  }
  public String getDepartureTime() { return departureTime; }

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
        departureTime + "," + numberOfSeats;
  }

  public void mostrar() {
    System.out.println("flight number: " + flightNumber);
    System.out.println("departure airport: " + source);
    System.out.println("arrival airport: " + destination);
    System.out.println("departureTime: " + departureTime);
    System.out.println("number of seats: " + numberOfSeats);
  }
}
