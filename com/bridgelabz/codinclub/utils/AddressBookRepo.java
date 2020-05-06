package com.bridgelabz.codinclub.utils;
import com.bridgelabz.codinclub.models.Person;
import com.bridgelabz.codinclub.utils.WriteCSV;
import java.util.List;
import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Scanner;

public class AddressBookRepo {
	
	
	final private static List<Person> AddressBook = new ArrayList<Person>();
//	final private static Scanner input = new Scanner(System.in);
	
	public void addToAddressBook(final Person person)
	{
		AddressBook.add(person);
		WriteCSV.writePerson(person);
	}

	public static void displayContacts()
	{
	 // Enhanced for loop
		for(Person obj : AddressBook)
		{
			System.out.println("FirstName:" +obj.getFirstName());
	        System.out.println("LastName:" +obj.getLastName());
            System.out.println("City:" +obj.getCity());
			System.out.println("State:" +obj.getState());
			System.out.println("Address:" +obj.getAddress());
			System.out.println("PinCode:" +obj.getPinCode());
			System.out.println("Phone:" +obj.getPhone());

         }
	 }
	
	
}

