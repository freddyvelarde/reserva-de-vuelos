package entity.flight;

public class Flight {
  private String flightNumber; // Unique id
  private String source;
  private String destination;
  private String departureDate;
  private String departureHour;
  private int sites;
  private double price;

  public Flight(String flightNumber, String source, String destination,
                String departureDate, String departureHour, int sites,
                double price) {
    this.flightNumber = flightNumber;
    this.source = source;
    this.destination = destination;
    this.departureDate = departureDate;
    this.departureHour = departureHour;
    this.sites = sites;
    this.price = price;
  }
  public Flight() {}

  public int updateNumberOfSites(int sitesBuyed) {
    if (sites >= 1)
      this.sites = this.sites - sitesBuyed;

    if (sites <= 0)
      this.sites = 0;

    return this.sites;
  }

  public String getDepartureHour() { return departureHour; }
  public void setDepartureHour(String departureHour) {
    this.departureHour = departureHour;
  }

  public int getSites() { return sites; }
  public void setSites(int sites) { this.sites = sites; }

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
        departureDate + "," + departureHour + "," + sites + "," + price;
  }

  public void mostrar() {
    System.out.println("flight number: " + flightNumber);
    System.out.println("departure airport: " + source);
    System.out.println("arrival airport: " + destination);
    System.out.println("departure date: " + departureDate);
    System.out.println("departure hour" + departureHour);
    System.out.println("number of sites: " + sites);
    System.out.println("price" + price);
  }
}
