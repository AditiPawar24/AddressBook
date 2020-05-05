package AddressBookMain;
import java.io.*;
import java.util.Scanner;

public class AddressBookMain
{
   final private static	Scanner input = new Scanner(System.in);
   
    public static void main(String[] args)
    {
		System.out.println("Enter your choice");
		//menu options
        System.out.print("Welcome to my Address book!");
        System.out.print("\n");
        System.out.print("\n1 - Insert a New Contact \n2 - Search Contact by Last Name \n3 - Delete Contact \n4 - Display Contacts \n5 - Exit " );
        System.out.print("\n");
       // Scanner input = new Scanner(System.in);
       //System.out.println("Enter name");
		try{
			

		} catch(Exception e) {
			System.out.println("Error");
	    }

        int option = input.nextInt();
        switch(option){
			
	    case 1:
 
            System.out.print("Enter your  info : ");
			InputOutput.readInput();
		break;
        
        case 2: 
       
			System.out.print("Display Contacts : ");
         
		break;

        case 3: 
       
			System.out.print("Display Contacts : ");
         
		break;
		case 4: 
       
			System.out.print("Display Contacts : ");
         
		break;
		case 5: 
       
			System.out.print("Display Contacts : ");
         
		break;
		case 6: 
       
			System.out.print("Display Contacts : ");
         
		break;
		
	       
	}	
}

}

