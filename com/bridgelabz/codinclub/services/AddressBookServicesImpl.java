package com.bridgelabz.codinclub.services;
import com.bridgelabz.codinclub.services.AddressBookServices;
import com.bridgelabz.codinclub.models.Person;
import com.bridgelabz.codinclub.utils.AddressBookUtil;
import com.bridgelabz.codinclub.utils.WriteCSV;
import java.util.ArrayList;
/** Interface implementation class
* @author Aditi
**/

public class AddressBookServicesImpl implements AddressBookServices
{
	final private static ArrayList<Person> AddressBookServicesImpl = new ArrayList<>();
	public AddressBookServicesImpl() {
         }
	@Override
	public void addPerson()
	{
        System.out.print("Please enter your First Name:");
		final String firstName = AddressBookUtil.getUserString();		
		System.out.print("Please enter your last Name:");
		//System.out.print("\n");
		final String lastName = AddressBookUtil.getUserString();
	    System.out.print("Please enter your Address:");
		final String address = AddressBookUtil.getUserString();
		System.out.print("Please enter your state:");
		final String state = AddressBookUtil.getUserString();
        System.out.print("Please enter your city :");
	    final String city = AddressBookUtil.getUserString();
	    System.out.print("Please enter pinCode:");
		final String pinCode = AddressBookUtil.getUserString();
		System.out.print("Please enter your phone no:");
	    final String phone = AddressBookUtil.getUserString();
		    
	    final Person person = new Person(firstName, lastName, address, state, city, pinCode, phone );
		   
	    WriteCSV.writePerson(person);
		AddressBookServicesImpl.add(person);
	}
	

    @Override
    public void deletePerson() {
        Person person = getFirstName();
        if(person != null ){
       	AddressBookServicesImpl.remove(person);
        System.out.println("contact deleted");
        }else{
        System.out.println("contact not found.");
        }
    }
  
    private Person getFirstName(){
        AddressBookUtil.getUserString();
        System.out.print("Enter first name of contact you want delete/edit: ");
        String firstName = AddressBookUtil.getUserString();
        Person person = serach(firstName);
        return person;
    }
    private Person serach(String firstName) {
		Person person= getFirstName(); 
		return person;
	}

    @Override
    public void editPerson() {
        Person person = getFirstName();
        if(person!= null ){
        System.out.print("Edit person's Address: ");
        final String address = AddressBookUtil.getUserString();
        person.setAddress(address);
        System.out.print("Edit person's City: ");
        final String city =  AddressBookUtil.getUserString();
        person.setCity(city);
		System.out.print("Edit person's State: ");
        final String state = AddressBookUtil.getUserString();
        person.setState(state);
		System.out.print("Edit person's pincode: ");
        final String pinCode = AddressBookUtil.getUserString();
        person.setPinCode(pinCode);
        System.out.print("Edit person's Phone number: ");
        final String phone = AddressBookUtil.getUserString();
        person.setPhone(phone);
        }
    }
    
    @Override
    public void displayPersons()
	{
	 // Enhanced for loop
		for(Person person : AddressBookServicesImpl)
		{
			System.out.println("FirstName:" +person.getFirstName());
	        System.out.println("LastName:" +person.getLastName());
            System.out.println("City:" +person.getCity());
			System.out.println("State:" +person.getState());
			System.out.println("Address:" +person.getAddress());
			System.out.println("PinCode:" +person.getPinCode());
			System.out.println("Phone:" +person.getPhone());
		}
    
    }

}




