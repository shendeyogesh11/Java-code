package com.excelr.app;

import java.util.Scanner;

public class AreaOfRectangle {
	
public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		double length;
		double breadth;
		System.out.println("Enter the length: ");
		length = sc.nextDouble();
		System.out.println("Enter the breadth: ");
		breadth = sc.nextDouble();
		
		
		double area = length*breadth;
		
		System.out.println("area of rectangle is: " +area);
		
		if(area >=100) {
			System.out.println("Big Circle");
		}else {
			System.out.println("Small Circle");
		}
		
		
		
		
		
		
	}


}
