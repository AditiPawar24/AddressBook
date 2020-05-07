package com.bridgelabz.codinclub.models;
import java.util.Comparator;
//import java.lang.Object;
/**
* This POJO class helps to store address data like person Name, address, State
* and etc.
*
* @author Aditi
*
*/

public class Person
 {
	
    // Attribute to hold Index
    //private String id;	
	//Attribute to hold fullName
    private String fullName;
    // Attribute to hold first name
    private String firstName;
    // Attribute to hold last name
    private String lastName;
    // Attribute to hold State
    private String state;
    // Attribute to hold Address
    private String address;
    // Attribute to hold city
    private String city;
    // Attribute to hold pin code
    private String pinCode;
    //Attribute to hold mobile no
    private String phone;

public Person() {
}
public Person(String fullName, String firstName, String lastName, String city, String address, String state, String pinCode, String phone)
{
   this.fullName = fullName;
   this.firstName = firstName;
   this.lastName = lastName;
   this.city = city;
   this.address = address;
   this.state = state;
   this.pinCode = pinCode;
   this.phone = phone;
}

/**
* This method for index
*
* @return integer
*/
//public int getId() {
//return id;
//}

//public void setId(int id) {
//this.id = id;
//}
/**
* This method retrieve full Name
*
* @return String
*/

public String getFullName() {
String fullName = firstName + "" +lastName;
return fullName;	
}

/**
* This method helps to set Name
*
* @param fullName
*/
public void setFullName(String fullName) {
this.fullName = fullName;
}

/**
* This method retrieve Name
*
* @return String
*/
public String getFirstName() {
return firstName;
}

/**
* This method helps to set first Name
*
* @param firstName
*/
public void setFirstName(String firstName) {
this.firstName = firstName;
}

/**
* This method helps to retrieve last name
*
* @return String
*/
public String getLastName() {
return lastName;
}

/**
* This method helps set to last name
*
* @param 
*/
public void setLastName(String lastName) {
this.lastName = lastName;
}

/**
* This method helps to retrieve State
*
* @return String
*/
public String getState() {
return state;
}

/**
* This method helps to set State
*
* @param state
*/
public void setState(String state) {
this.state = state;
}

/**
* This method helps to retrieve address
*
* @return String
*/
public String getAddress() {
return address;
}

/**
* This method helps to set State
*
* @param state
*/
public void setAddress(String address) {
this.address = address;
}

/**
* This method helps to retrieve City
*
* @return String
*/
public String getCity() {
return city;
}

/**
* This method helps to set City
*
* @param country
*/
public void setCity(String city) {
this.city = city;
}

/**
* This method helps to retrieve Pin code
*
* @return String
*/
public String getPinCode() {
return pinCode;
}

/**
* This method helps to set Pin Code
*
* @param pinCode
*/
public void setPinCode(String pinCode) {
this.pinCode = pinCode;
}

/**
* This method helps to retrieve Phone no
*
* @return String
*/
public String getPhone() {
return phone;
}

/**
* This method helps to set Phone no
*
* @param phone
*/
public void setPhone(String phone) {
this.phone = phone;
}

public static Comparator<Person> fullNameSort = new Comparator<Person>()
{
	public int compare(Person person, Person person1)
	{
		String fullName1 = person.getFullName().toUpperCase();
		String fullName2 = person1.getFullName().toUpperCase();
		return fullName1.compareTo(fullName2);
		
	}
};


/**
* This method helps to return object as String
*
* @return String
*/
@Override
public String toString() {
return "Person [fullName :" +fullName + ", firstName :" + firstName + ", lastName:" +lastName + ", State:" + state + ", address:" + address + ", city=" + city + ", pinCode:" +pinCode + ", phone=" + phone +"]"; 

}
/**
* update person information except name
*
* @return String
*/
//public void update(String city, String address, String state, String pinCode, String phone)
//{
//}
 
 }


