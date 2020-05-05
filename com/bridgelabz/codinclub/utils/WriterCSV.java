package com.bridgelabz.codinclub.utils.WriterCSV;
import com.bridgelabz.codinclub.models;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
This class writes person data into file in csv format
@author Aditi
*/

public static WriterCSV {

    public static void write(ArrayList<Person> data) {
    try{
        PrintWriter printwriter = new PrintWriter("com/bridgelabz/codinclub/models")
        for(Person obj : data)
        {
         String csv = obj.getFirstName()+","+obj.getLastName()+","+obj.getAddress()+","+obj.getCity()+","+obj.getState()+","+obj.getPhone()+","+obj.getPinCode();
         printwriter.println(csv);
        }
        printWriter.close();
		
      }catch(IOException e) {
        System.out.println("IOException in file WriterCSV:");
     }
    System.out.println("Writtten into file");

 }

}
}
