import com.storeData.Model;

class Main {
  public static void main(String[] args) {
    Model<String> m = new Model<String>("Freddy Velarde");

    System.out.println(m.getEntity());

    System.out.println("Hello, world!");
  }
}
