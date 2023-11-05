package entity.flightHistory;

public class FlightHistory {
  private String ci;
  private String flightNumber;

  public FlightHistory(String ci, String flightNumber) {
    this.ci = ci;
    this.flightNumber = flightNumber;
  }

  public void setCi(String ci) { this.ci = ci; }
  public void setFlightNumber(String flightNumber) {
    this.flightNumber = flightNumber;
  }
  public int getCi() { return Integer.parseInt(ci); }
  public String getFlightNumber() { return flightNumber; }

  public void mostrar() {
    System.out.println("ci: " + ci);
    System.out.println("flight number: " + flightNumber);
  }

  public String parseDataToCSVFormat() { return ci + "," + flightNumber; }
}
