package entity.passenger;

public class Passenger {
  private int ci; // unique ID
  private String name;
  private int age;
  // private int attributeCount;

  public Passenger() {}
  public Passenger(int ci, String name, int age) {
    this.name = name;
    this.age = age;
    this.ci = ci;
    // this.attributeCount = attributeCount;
  }

  public void mostrar() {
    System.out.println("name : " + this.name);
    System.out.println("age: " + this.age);
    System.out.println("ci: " + this.ci);
  }

  // public void leer() {
  //   Scanner lee = new Scanner(System.in);
  //   System.out.println("Datos persona: h");
  //   this.nom = lee.next();
  //   this.edad = lee.nextInt();
  // }

  public String getName() { return name; }

  // public int getAttributeCount() { return attributeCount; }

  public void setName(String name) { this.name = name; }

  public int getAge() { return age; }

  public void setAge(int age) { this.age = age; }

  public void setCi(int ci) { this.ci = ci; }
  public int getCi() { return ci; }

  public String parseDataToCSVFormat() { return ci + "," + name + "," + age; }

  @Override
  public String toString() {
    return "Passenger{"
        + "name='" + name + '\'' + ", age=" + age + '}';
  }
}
