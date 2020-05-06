package com.bridgelabz.codinclub.main;
import com.bridgelabz.codinclub.main.AddressBookMain;
import com.bridgelabz.codinclub.utils.AddressBookUtil;
import com.bridgelabz.codinclub.services.AddressBookServices;
import com.bridgelabz.codinclub.services.AddressBookServicesImpl;
//import java.util.Scanner;
import java.lang.Exception;
// main class
//@author Aditi

public class AddressBookMain
{
  // final private static	Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {		
		//menu options
        System.out.print("Welcome to my Address book!");
        System.out.print("\n");
        System.out.println("Enter your choice");
        System.out.print("\n1 - Insert a New Person \n2 - Sort by Last Name \n3 - Delete Person \n4 - Edit person \n5 - Disply print Entries \n6 - Exit " );
        System.out.print("\n");
        // Scanner input = new Scanner(System.in);
	      try{
            } catch(Exception e) {
			System.out.println("Error");
	        }
	        AddressBookServices addressBookServices=new AddressBookServicesImpl();
            final String option = AddressBookUtil.getUserString();
            switch(option) {
		    //Add person's information
	        case "1":
                    System.out.print("Insert Person, Enter your  info : \n");
                    addressBookServices.addPerson();
            break;
            case "2":
                    System.out.print("Sort by last name : ");
            break;
            case "3":
                    System.out.print("Delete person: ");
                    addressBookServices.deletePerson();
            break;
	        case "4":
	                System.out.print("Edit person : ");
                    addressBookServices.editPerson();
	        break;
	        case "5":
                    System.out.print(" Disply print entries : ");
                    addressBookServices.displayPersons();
            break;
	        case "6":
                    System.out.println("Exit: ");
            break;
            default:
        	        System.out.println("Invalid Entry, pleasr try again");
     }
}

}

