package entity.flight;

public class Flight {
  private String flightNumber;
  private String departureAirport;
  private String arrivalAirport;
  private String date;

  public Flight(String flightNumber, String departureAirport,
                String arrivalAirport, String date) {
    this.flightNumber = flightNumber;
    this.departureAirport = departureAirport;
    this.arrivalAirport = arrivalAirport;
    this.date = date;
  }
  public void setDate(String date) { this.date = date; }
  public String getDate() { return date; }

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
        date;
  }
  /* @Override */
  public void mostrar() {
    System.out.println("flight number: " + flightNumber);
    System.out.println("departure airport: " + departureAirport);
    System.out.println("arrival airport: " + arrivalAirport);
    System.out.println("date: " + date);
  }
}
