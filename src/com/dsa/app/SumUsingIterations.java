package com.dsa.app;

import java.util.Scanner;

public class SumUsingIterations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		int result = sumUrecursion(num);
		System.out.println("SUM of numbers till "+ num + " is: " + result);
	}

	private static int sumUrecursion(int num) {
		if(num == 1) {
			return 1;
		} 
		else {
				return num + sumUrecursion(num-1); 
		}
	}
	
	
}
