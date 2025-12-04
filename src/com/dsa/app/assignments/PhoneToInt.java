package com.dsa.app.assignments;
import java.util.Scanner;

public class PhoneToInt {
	
public static void main(String[] args) {
        
	 Scanner sc = new Scanner(System.in);

     System.out.print("Enter your phone number (max 9 digits): ");
     String phoneStr = sc.nextLine();

     
     if (phoneStr.length() > 9) {
         System.out.println("❌ Number too long! Please enter up to 9 digits only.");
     } else {
         int phoneNum = Integer.parseInt(phoneStr); 
         System.out.println("✅ Phone number as integer: " + phoneNum);
     }
    }

}
