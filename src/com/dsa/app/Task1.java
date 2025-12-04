package com.dsa.app;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double p,n,r;
		
		System.out.println("Enter the value of P, N and R : ");
		p = sc.nextDouble();
		n = sc.nextDouble();
		r = sc.nextDouble();
		
		simpleIntrest(p,n,r);	
		
	}
	
	static void simpleIntrest(double p, double n, double r) {
		
		System.out.println("Simple Intrest is: " + (p*n*r) / 100);
	}

}
