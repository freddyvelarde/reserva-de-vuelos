package com.storeData;
import com.handleFile.FileHandler;

public class DataHandler<T> extends FileHandler {
  private T entity;

  public DataHandler() { super(); }

  public T getEntity() { return entity; }

  // create methods
  public void create(String file, String textToAppend) {
    this.appendNewLine(file, textToAppend, true);
  }

  // read methods
  public void read() {}

  // update methods
  public void update() {}

  // delete methods
  public void delete() {}
}
