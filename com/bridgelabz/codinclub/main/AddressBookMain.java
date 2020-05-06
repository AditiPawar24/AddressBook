package com.bridgelabz.codinclub.main;
import com.bridgelabz.codinclub.main.AddressBookMain;
import com.bridgelabz.codinclub.utils.AddressBookUtil;
import com.bridgelabz.codinclub.utils.ReadCSV;
import com.bridgelabz.codinclub.services.AddressBookServices;
import com.bridgelabz.codinclub.services.AddressBookServicesImpl;

import java.util.Scanner;
import java.lang.Exception;
// main class

public class AddressBookMain
{
   final private static	Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
		
		//menu options
        System.out.print("Welcome to my Address book!");
        System.out.print("\n");
        System.out.println("Enter your choice");
        System.out.print("\n1 - Insert a New Person \n2 - Sort by Last Name \n3 - Delete Person \n4 - Edit person \n5 - print Entries \n6 - Exit " );
        System.out.print("\n");
       // Scanner input = new Scanner(System.in);

	  try{

            } catch(Exception e) {
			System.out.println("Error");
	    }

        final String option = AddressBookUtil.getUserNumber();
        switch(option) {
	        case "1":
            System.out.print("Insert Person, Enter your  info : \n");
            AddressBookServices addressBookServices=new AddressBookServicesImpl();
            addressBookServices.addPerson();
            break;
            case "2":
            System.out.print("Sort by last name : ");
            break;
            case "3":
            System.out.print("Delete person: ");
            break;
	        case "4":
	        System.out.print("Edit person : ");
	        break;
	        case "5":
            System.out.print("print entries : ");
	        break;
	        case "6":
            System.out.println("Exit: ");
            break;
           default:
        	   System.out.println("Invalid Entry, pleasr try again");
     }
}

}
