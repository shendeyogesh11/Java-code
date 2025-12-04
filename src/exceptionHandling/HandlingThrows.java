package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HandlingThrows {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("enter the first number");
		int num1 = sc.nextInt();
		
		System.out.println("enter the second number");
		int num2 = sc.nextInt();

		
		callee(num1,num2);
		
		} catch(ArithmeticException e1) {
			System.out.println(e1.getMessage());
		}
		
		catch(InputMismatchException e2) {
			System.out.println("please enter the valid int value " + e2.getMessage());
		}
	
	}

	public static int callee(int num1, int num2) throws ArithmeticException, InputMismatchException {
		
		return num1/num2;
	}
	
	
	
	
//	public int callee(int num1, int num2) throws ArithmeticException, InputMismatchException {
//		
//		return num1/num2;
//	}
		
}
