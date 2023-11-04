/* package com.storeData; */
/* import com.handleFile.FileHandler; */
/* import java.util.ArrayList; */
/* import java.util.List; */
/*  */
/* public class StoreData extends DataValidation { */
/*  */
/*   public StoreData() { super(); } */
/*  */
/*   // create methods */
/*   public void create(String file, String textToAppend) { */
/*     String[] data = textToAppend.split(","); */
/*  */
/*     List<String[]> reader = this.readFile(file); */
/*  */
/*     for (String[] rows : reader) { */
/*       if (rows[0].equals(data[0])) { */
/*         System.out.println("An error ocurred while new creating entity."); */
/*         return; */
/*       } */
/*     } */
/*  */
/*     this.appendNewLine(file, textToAppend, true); */
/*   } */
/*  */
/*   // read methods */
/*   // public List<String[]> findManyById(String file, String id) { */
/*   //   List<String[]> table = this.readFile(file); */
/*   // */
/*   //   List<String[]> data = new ArrayList<>(); */
/*   // */
/*   //   for (String[] row : table) { */
/*   //     if (row[2].equals(id)) { */
/*   //       data.add(row); */
/*   //       System.out.println(row[0]); */
/*   //       System.out.println(row[1]); */
/*   //       System.out.println(row[2]); */
/*   //     } */
/*   //   } */
/*   //   return data; */
/*   // } */
/*  */
/*   public String[] findOneById(String file, String id) { */
/*     List<String[]> table = this.readFile(file); */
/*  */
/*     String[] data = null; */
/*  */
/*     for (String[] row : table) { */
/*       if (row[2].equals(id)) { */
/*         data = row; */
/*       } */
/*     } */
/*  */
/*     return data; */
/*   } */
/*  */
/*   // update methods */
/*   public void update() {} */
/*  */
/*   // delete methods */
/*   public void delete() {} */
/* } */
