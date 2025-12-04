package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HandleException {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		boolean valid = false;
		
		while (!valid) {
		try {
		
		System.out.println("Enter a first number");
		num1 = sc.nextInt();
		
		System.out.println("Enter a second number");
		num2 = sc.nextInt();
		
		int result = num1+num2;
		System.out.println("Sum of two numbers is: " + result);
		
		valid = true;
		
		} catch(InputMismatchException e) {
			System.out.println("Please enter a valid integer input");
			sc.nextLine();
		}
		
		}
		
	}

}
