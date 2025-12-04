package com.dsa.app.functions;

import java.util.Scanner;

public class day8 {
	
	public static void main(String[] args) {
		
		
		areaOfRectangle();
		System.out.println("Area of Circle: " + areaOfCircle());
	}
	
	

	static void areaOfRectangle() {
		
		int length;
		int breadth;
		
		Scanner sc = new Scanner(System.in);
		length = sc.nextInt();
		breadth = sc.nextInt();
		
		System.out.println("Area of rectangle is: " + length*breadth);
	}
	
	
	static double areaOfCircle() {
		
		double radius;
		Scanner sc = new Scanner(System.in);
		radius = sc.nextDouble();
		
		return 3.14*radius*radius;
		
	}

}
