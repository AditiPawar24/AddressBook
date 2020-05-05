package com.bridgelabz.codinclub.services.AddressBookServicesImpl;
import com.bridgelabz.codinclub.utils.AddressBookUtil;

public class AddressBookServicesImpl implements AddressBookServices
{
	
	public AddressBookServicesImpl(final AddressBookRepo repo);
	//final static AddressBookRepo repo = new AddressBookRepo();
	@Override
	public void addPerson()
	{
            System.out.print("\nPlease enter your First Name : ");
			final String firstName = AddressBookUtil.getUserString();
			System.out.print("\nPlease enter your last Name : ");
			final String lastName = AddressBookUtil.getUserString();
			System.out.print("\nPlease enter your Address : ");
			final String address = AddressBookUtil.getUserString();
		    System.out.print("\nPlease enter your state : ");
			final String state = AddressBookUtil.getUserString();
            System.out.print("\nPlease enter your city : ");
			final String city = AddressBookUtil.getUserString();
			System.out.print("\nPlease enter pinCode: ");
			final String pinCode = AddressBookUtil.getUserString();
		    System.out.print("\nPlease enter your phone no: ");
		    final String phone = AddressBookUtil.getUserString();
		    final Person person = new Person(fristName, lastName, address, state, city, pinCode, phone );
	        AddressBook.add(person);
	}
}



