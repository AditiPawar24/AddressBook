package com.bridgelabz.codinclub.utils.AddressBookRepo;
package com.bridgelabz.codinclub.models.Person;
import java.util.List;
import java.util.Scanner;

public class AddresssBookRepo {
	
	final private List<Person> addressBook = new ArrayList<>();
	
	public void addToAddressBook(final Person person)
	{
		addressBook.add(person);
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
	public static void writeOut()
	{
		WriterCSV.write(AddressBook);
        }
	
}

