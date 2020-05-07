package com.bridgelabz.codinclub.utils;
import com.bridgelabz.codinclub.models.Person;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;


/**
* This class helps to Read address data like person Name, address, State
* and etc.
*
* @author Aditi
*
*/

public class ReadCSV {
 /*
  private static final int PERSON_FULLNAME_FULLNAMEX = 0; 	
  private static final int PERSON_FIRSTNAME_FIRSTNAMEX = 1; 
  private static final int PERSON_LASTNAME_LASTNAMEX = 2;
  private static final int PERSON_ADDRESS_ADDRESSX = 3;
  private static final int PERSON_CITY_CITYX = 4;
  private static final int PERSON_STATE_STATEX = 5;
  private static final int PERSON_PINCODE_PINCODEX = 6;
  private static final int PERSON_PHONE_PHONEX = 7;*/
 
	
  //public static void main(String[] args) {
   //BufferedReader fileReader = null;

     final private static ArrayList<Person> persons = new ArrayList<Person>();
     private static void split(String data) {
          ArrayList<String> person = new ArrayList<>();
          int index = 0;
          String line = "";
          while(data.charAt(index) != ';') {
              while(data.charAt(index) != ';' && data.charAt(index) != ';') { 
            	  line = line + data.charAt(index);
            	  
            	  index++;
           }
              person.add(line);
              line = "";
              index++;
              
          }
          addToList(person);
     }
     
     private static void addToList(ArrayList<String> data)
     {
    	
      //fileReader = new BufferedReader(new FileReader("person.csv"));
      // Read CSV header
     // fileReader.readLine();
      // Read customer data line by line
     // while ((line = fileReader.readLine()) != null) 
      
      Person person = new Person(data.get(0),data.get(1),data.get(2),data.get(3),data.get(4),data.get(5),data.get(6),data.get(7));
          persons.add(person);
    }
     
     public static ArrayList<Person> Read() {
       try{
    	 File data = new File("person.csv");
       
		Scanner fileReader= new Scanner(data);
         // Read CSV header
        // fileReader1.readLine();
         //Read customer data line by line
         while (fileReader.hasNextLine()){
        	 split(fileReader.nextLine());
        	 
         }
       } catch (Exception e) {
    	      System.out.println("Reading CSV Error!");
    	      e.printStackTrace();
    	      } 
    	 
    	 return persons;
     }
     
}
 
  


