package com.bridgelabz.codinclub.utils;
import com.bridgelabz.codinclub.models.Person;
import java.io.FileWriter;
import java.io.IOException;
//import java.util.Arrays;
//import java.util.List;
//import java.util.*;

public class WriteCSV {

  private static final String CSV_HEADER = "fristName,lastName,address,city,state,pinCode,phone";
 
 

  public static boolean writePerson(Person person)
  {
	  
	  FileWriter fileWriter = null;
	  boolean flag=false;
	    try {
	      fileWriter = new FileWriter("Person.csv");
	 
	      fileWriter.append(CSV_HEADER);
	      fileWriter.append('\n');
	 
	      
	        fileWriter.append(person.getFirstName());
	        fileWriter.append(',');
	        fileWriter.append(person.getLastName());
	        fileWriter.append(',');
	        fileWriter.append(person.getAddress());
	        fileWriter.append(',');
			fileWriter.append(person.getCity());
	        fileWriter.append(',');
			fileWriter.append(person.getState());
	        fileWriter.append(',');
			fileWriter.append(person.getPhone());
	        fileWriter.append(',');
	        fileWriter.append(String.valueOf(person.getPinCode()));
	        fileWriter.append('\n');
	      
	 
	      System.out.println("Write CSV successfully!");
	      flag=true;
	    } catch (Exception e) {
	      System.out.println("Writing CSV error!");
	      e.printStackTrace();
	      flag=false;
	    } finally {
	      try {
	        fileWriter.flush();
	        fileWriter.close();
	      } catch (IOException e) {
	        System.out.println("Flushing/closing error!");
	        flag=false;
	        
	        
	        e.printStackTrace();
	      }
	    }
	    
	    
return flag;
	  
  }
}

