package com/bridgelabz/codinclub/models/Person.java;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class WriteCSV {

  private static final String CSV_HEADER = "fristName,lastName,address,city,state,pinCode,phone";
 
  public static void main(String[] args) {
 
    List<Person> persons = new Arrays.asList(
        new Person("Aditi","pawar","Kothrud","pune","MH","411004","8408010733"),
        new Person("Aditi","pawar","Kothrud","pune","MH","411004","8408010733"),
	    new Person("Aditi","pawar","Kothrud","pune","MH","411004","8408010733"),
	    new Person("Aditi","pawar","Kothrud","pune","MH","411004","8408010733"),
	    new Person("Aditi","pawar","Kothrud","pune","MH","411004","8408010733"),
        new Person("Aditi","pawar","Kothrud","pune","MH","411004","8408010733"));
	
    FileWriter fileWriter = null;
 
    try {
      fileWriter = new FileWriter("Person.csv");
 
      fileWriter.append(CSV_HEADER);
      fileWriter.append('\n');
 
      for (Person person : persons) {
        fileWriter.append(person.getFristName());
        fileWriter.append(',');
        fileWriter.append(person.getLastName());
        fileWriter.append(',');
        fileWriter.append(person.getAddress());
        fileWriter.append(',');
        fileWriter.append(String.valueOf(person.getPinCode()));
        fileWriter.append('\n');
      }
 
      System.out.println("Write CSV successfully!");
    } catch (Exception e) {
      System.out.println("Writing CSV error!");
      e.printStackTrace();
    } finally {
      try {
        fileWriter.flush();
        fileWriter.close();
      } catch (IOException e) {
        System.out.println("Flushing/closing error!");
        e.printStackTrace();
      }
    }
  }
}

