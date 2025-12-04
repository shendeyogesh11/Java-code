package com.dsa.app;

import java.util.Scanner;

public class hw {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number & see table below: ");
		int n = sc.nextInt();
		
		table(n);
	}
	
	
	static void table(int n) {
		
		System.out.println("table of "+ n+ " is: ");
		
		for(int i=1; i<=10; i++) {
			System.out.println(n*i);
		}
	}
}
