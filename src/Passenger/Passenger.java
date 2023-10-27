package Passenger;

public class Passenger {
  private int ci; // unique ID
  private String name;
  private int age;

  public Passenger(int ci, String name, int age) {
    this.name = name;
    this.age = age;
    this.ci = ci;
  }

  public String getName() { return name; }

  public void setName(String name) { this.name = name; }

  public int getAge() { return age; }

  public void setAge(int age) { this.age = age; }

  public void setCi(int ci) { this.ci = ci; }
  public int getCi() { return ci; }

  public String parseDataToCSVFormat() { return name + "," + age + "," + ci; }

  @Override
  public String toString() {
    return "Passenger{"
        + "name='" + name + '\'' + ", age=" + age + '}';
  }
}
