package com.handleFile;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class HandleFile {
  public HandleFile() { this.appendNewLine(); }

  public void appendNewLine() {
    String fileName = "./data/text.csv";
    String textToAppend = "Freddy Erick Velarde Silva";
    try (BufferedWriter writer =
             new BufferedWriter(new FileWriter(fileName, true))) {
      writer.write(textToAppend);
      writer.newLine();
      System.out.println("Line appended");
    } catch (IOException e) {
      System.err.println("An Error just ocurred: " + e.getMessage());
    }
  }
}
