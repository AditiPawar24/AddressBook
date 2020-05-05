package com.bridgelabz.codinclub.ReadCSV;
import com.bridgelabz.codinclub.models.Person;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.util.scanner;
import java.io.file;
 /**
  Read data in csv
  @author Aditi
  */
  public class ReadCSV
  {
	  final private static List<Person> person = new ArrayList<Person>();
	  private static void split(String data) {
		  
	  }
	  public static void Read() {
		  try{
			  File data = new File("com/bridgelabz/codinclub/utils/AddressBookUtil");
			  Scanner fileReader = new Scanner(data);
			  while(fileReader.hasNextLine()) {
				  System.out.println(fileReader.nextLine());
			  }
		  }catch(FileNotFoundException e) {
          //System.out.println(e.printStackTrace());
		    System.out.println("File noyt fount exception");
			  
		  }
	  }
  }
  
