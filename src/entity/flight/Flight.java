package entity.flight;

public class Flight {
  private String flightNumber;
  private String departureAirport;
  private String arrivalAirport;
  private String departureTime;

  public Flight(String flightNumber, String departureAirport,
                String arrivalAirport, String departureTime) {
    this.flightNumber = flightNumber;
    this.departureAirport = departureAirport;
    this.arrivalAirport = arrivalAirport;
    this.departureTime = departureTime;
  }
  public void setDepartureTime(String departureTime) {
    this.departureTime = departureTime;
  }
  public String getDepartureTime() { return departureTime; }

  public String getFlightNumber() { return flightNumber; }

  public void setFlightNumber(String flightNumber) {
    this.flightNumber = flightNumber;
  }

  public String getDepartureAirport() { return departureAirport; }

  public void setDepartureAirport(String departureAirport) {
    this.departureAirport = departureAirport;
  }

  public String getArrivalAirport() { return arrivalAirport; }

  public void setArrivalAirport(String arrivalAirport) {
    this.arrivalAirport = arrivalAirport;
  }

  public String parseDataToCSVFormat() {
    return flightNumber + "," + departureAirport + "," + arrivalAirport + "," +
        departureTime;
  }
  /* @Override */
  public void mostrar() {
    System.out.println("flight number: " + flightNumber);
    System.out.println("departure airport: " + departureAirport);
    System.out.println("arrival airport: " + arrivalAirport);
    System.out.println("departureTime: " + departureTime);
  }
}
