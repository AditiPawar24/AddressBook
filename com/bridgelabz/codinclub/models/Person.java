package com.bridgelabz.codinclub.models;
//import java.lang.Object;
/**
* This POJO class helps to store address data like person Name, address, State
* and etc.
*
* @author Aditi
*
*/

public class Person {
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

public Person(String firstName, String lastName, String city, String address, String state, String pinCode, String phone)
{
this.firstName = firstName;
this.lastName = lastName;
this.city = city;
this.address = address;
this.state = state;
this.pinCode = pinCode;
this.phone = phone;
}

/**
* This method retrieve frist Name
*
* @return String
*/

public String getFirstName() {
return firstName;
}

/**
* This method helps to set frist Name
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
* This method helps to last name
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

/**
* This method helps to return object as String
*
* @return String
*/
@Override
public String toString() {
return "Person [firstName :" + firstName + ", lastName:" +lastName + ", State:" + state + ", address:" + address + ", city=" + city + ", pinCode:" +pinCode + ", phone=" + phone +"]"; 

}
/**
* update person information erxcept name
*
* @return String
*/
public void update(String city, String address, String state, String pinCode, String phone)
{	

	
}

}


