package entity.flightReservation;

public class FlightReservation {
  private String flightNumber;
  private int ci;
  private double totalPrice;
  private int sites;

  public FlightReservation(String flightNumber, int ci, double totalPrice,
                           int sites) {
    this.flightNumber = flightNumber;
    this.ci = ci;
    this.sites = sites;
    this.totalPrice = totalPrice * sites;
  }

  public void setSites(int sites) { this.sites = sites; }
  public int getSites() { return sites; }

  public String getFlightNumber() { return flightNumber; }

  public int getCi() { return ci; }
  public double getTotalPrice() { return totalPrice; }

  public void setCi(int ci) { this.ci = ci; }

  public void setTotalPrice(double totalPrice) {
    this.totalPrice = totalPrice * sites;
  }

  public void mostrar() {
    System.out.println("---------------------------");
    System.out.println("flight number: " + flightNumber);
    System.out.println("ci: " + ci);
    System.out.println("total Price: " + totalPrice);
    System.out.println("sites: " + sites);
  }
  public String parseDataToCSVFormat() {
    return flightNumber + "," + ci + "," + totalPrice + "," + sites;
  }
}
