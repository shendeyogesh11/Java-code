package com.dsa.app.assignments;

import java.util.Scanner;

public class UserDetails {
	
public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        
        System.out.print("Enter your phone number: ");
        long phone = sc.nextLong();
        
        System.out.print("Enter your city: ");
        sc.nextLine(); // consume leftover newline
        String city = sc.nextLine();
        
        System.out.println("\n----- User Details -----");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone: " + phone);
        System.out.println("City: " + city);
    }

}
