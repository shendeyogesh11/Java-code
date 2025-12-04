package com.excelr.app;

import java.util.Scanner;

public class Income {
	
	public static void main(String [] args) {
		
		
		Scanner sc = new Scanner(System.in);
		double salary;
		System.out.println("Enter your salary: ");
		salary = sc.nextDouble();
		
		
		if(salary >= 100000) {
			System.out.println("Excellent");
		}else if(salary >= 75000) {
			System.out.println("Very good");
		}else if(salary >= 50000) {
			System.out.println("Good");
		}else if(salary >= 25000) {
			System.out.println("Ok");
		}else {
			System.out.println("Below average or low income");
		}
		
;	}

}
