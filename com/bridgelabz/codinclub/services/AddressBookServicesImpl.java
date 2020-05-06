package com.bridgelabz.codinclub.services;
import com.bridgelabz.codinclub.models.Person;
import com.bridgelabz.codinclub.utils.AddressBookUtil;
//import com.bridgelabz.codinclub.utils.WriteCSV;
import com.bridgelabz.codinclub.utils.AddressBookRepo;

public class AddressBookServicesImpl implements AddressBookServices
{
	
	public AddressBookServicesImpl() {
	}
	//final static AddressBookRepo repo = new AddressBookRepo();
	 final AddressBookRepo addressBookRepo =new AddressBookRepo();
	 
	@Override
	public void addPerson()
	{
            System.out.print("Please enter your First Name:");
			final String firstName = AddressBookUtil.getUserNumber();
			
			System.out.print("Please enter your last Name:");
			//System.out.print("\n");
			final String lastName = AddressBookUtil.getUserNumber();
			 
			System.out.print("Please enter your Address:");
			final String address = AddressBookUtil.getUserNumber();
		    System.out.print("Please enter your state:");
			final String state = AddressBookUtil.getUserNumber();
            System.out.print("Please enter your city :");
			final String city = AddressBookUtil.getUserNumber();
			System.out.print("Please enter pinCode:");
			final String pinCode = AddressBookUtil.getUserNumber();
		    System.out.print("Please enter your phone no:");
		    final String phone = AddressBookUtil.getUserNumber();
		    
		    final Person person = new Person(firstName, lastName, address, state, city, pinCode, phone );
		   
		    addressBookRepo.addToAddressBook(person);
		    
		    //writeCSV.writePerson(person);
		    //addressBookRepo.(person);
	}
}



