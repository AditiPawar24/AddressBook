package com.bridgelabz.codinclub.utils;
import com.bridgelabz.codinclub.models.Person;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
 
public class ReadCSV {
 
  private static final int PERSON_FIRSTNAME_FIRSTNAMEX = 0; 
  private static final int PERSON_LASTNAME_LASTNAMEX = 1;
  private static final int PERSON_ADDRESS_ADDRESSX = 2;
  private static final int PERSON_CITY_CITYX = 3;
  private static final int PERSON_STATE_STATEX = 4;
  private static final int PERSON_PINCODE_PINCODEX = 5;
  private static final int PERSON_PHONE_PHONEX = 6;
 
  public static void main(String[] args) {
 
    BufferedReader fileReader = null;
 
    try {
      List<Person> persons = new ArrayList<Person>();
      String line = "";
      
      
      fileReader = new BufferedReader(new FileReader("person.csv"));
 
      // Read CSV header
      fileReader.readLine();
 
      // Read customer data line by line
      while ((line = fileReader.readLine()) != null) {
        String[] tokens = line.split(",");
        if (tokens.length > 0) {
          Person person = new Person(
              tokens[PERSON_FIRSTNAME_FIRSTNAMEX], 
              tokens[PERSON_LASTNAME_LASTNAMEX],
              tokens[PERSON_ADDRESS_ADDRESSX], 
			  tokens[PERSON_CITY_CITYX], 
              tokens[PERSON_STATE_STATEX], 
			  tokens[PERSON_PINCODE_PINCODEX],
              tokens[PERSON_PHONE_PHONEX]);

          persons.add(person);
        }
      }
 
      for (Person person: persons) {
        System.out.println(person);
      }
 
    } catch (Exception e) {
      System.out.println("Reading CSV Error!");
      e.printStackTrace();
    } finally {
      try {
        fileReader.close();
      } catch (IOException e) {
        System.out.println("Closing fileReader Error!");
        e.printStackTrace();
      }
    }
  }
}


