package com.excelr.app;

import java.util.Scanner;

public class Average {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a;
		double b;
		double c;
		
		System.out.println("Enter num 1: ");
		a = sc.nextDouble();
		
		System.out.println("Enter num 2: ");
		b = sc.nextDouble();
		
		System.out.println("Enter num 3: ");
		c = sc.nextDouble();
		
		double average = (a+b+c) / 3;
		double sum = (a+b+c);
		
		System.out.println("sum is: "+ sum);
		System.out.println("Average of three numbers is: "+ average);
		
		if(average>= 70) {
			System.out.println("Dist");
		} else if(average >= 60) {
			System.out.println("1st class");
		} else if(average >= 50) {
			System.out.println("2nd class");
		} else if(average >= 40) {
			System.out.println("3rd class");
		}else   {
			System.out.println("failed! marks are :"+ average);
		}
		
	}

}
