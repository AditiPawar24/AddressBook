package com.bridgelabz.codinclub.utils;
import java.util.Scanner;

public final class AddressBookUtil {
   private final static Scanner scanner = new Scanner(System.in);

   private AddressBookUtil() {
   // default constructor
    }

   public static String getUserString() {
    return scanner.nextLine();
    }

   public static int getUserNumber() {
	    return scanner.nextInt();
    }
}

