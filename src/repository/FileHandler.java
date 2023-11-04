package repository;
import entity.Passenger;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {
  protected String path = "./data/";

  public List<String[]> readFile(String file) {
    String fileName = path + "/" + file + ".csv";
    List<String[]> data = new ArrayList<>();

    try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
      String line;

      while ((line = reader.readLine()) != null) {
        String[] row = line.split(",");
        data.add(row);
      }

    } catch (IOException e) {
      e.printStackTrace();
    }
    // return data.toArray(new String[0][]);
    return data;
  }

  public void removeLine(String file, Passenger passenger) {
    String fileName = path + "/" + file + ".csv";
    try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
      String line;
      String newFile = "";

      while ((line = reader.readLine()) != null) {
        String[] arrayLine = line.split(",");
        String name = arrayLine[0];
        String age = arrayLine[1];
        String ci = arrayLine[2];

        if (!name.equals(passenger.getName()) &&
            !ci.equals(Integer.toString(passenger.getCi())) &&
            !age.equals(Integer.toString(passenger.getAge()))) {
          newFile += name + "," + age + "," + ci + ";";
        }
      }

      appendNewLine(file, normalizeString(newFile), false);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public String normalizeString(String str) {
    String line = "";
    for (int i = 0; i < str.length() - 1; i++) {
      if (str.charAt(i) == ';') {
        line += "\n";
      } else {
        line += str.charAt(i);
      }
    }
    return line;
  }

  public void appendNewLine(String file, String textToAppend, boolean clean) {
    String fileName = path + "/" + file + ".csv";
    try (BufferedWriter writer =
             new BufferedWriter(new FileWriter(fileName, clean))) {
      writer.write(textToAppend);
      writer.newLine();
    } catch (IOException e) {
      System.err.println("An Error just ocurred: " + e.getMessage());
    }
  }
}
