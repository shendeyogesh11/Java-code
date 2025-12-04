package com.excelr.app;

import java.util.Scanner;

public class AreaOfCircle {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		double radius;
		System.out.println("Enter Redius");
		radius = sc.nextDouble();		
		
		double area = 3.14*radius*radius;
		
		System.out.println("Area of Circle is: "+ area);
	}

}
