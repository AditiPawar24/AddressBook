package com.bridgelabz.codinclub.utils;
import java.util.Scanner;

public final class AddressBookUtil {
   private final static Scanner scanner = new Scanner(System.in);

   private AddressBookUtil() {
   // default constructer
 }

   public static String getUserNumber() {
    return scanner.nextLine();
  }

}

