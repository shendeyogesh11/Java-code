package com.excelr.app;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {

		System.out.println("1. Area of Circle");
		System.out.println("2. Area of Rectangle");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice : ");
		int choice = sc.nextInt();

		switch (choice) {

		case 1: {

			double radius;
			System.out.println("Enter Redius");
			radius = sc.nextDouble();

			double area = 3.14 * radius * radius;

			System.out.println("Area of Circle is: " + area);

			break;
		}

		case 2: {

			double length;
			double breadth;
			System.out.println("Enter the length: ");
			length = sc.nextDouble();
			System.out.println("Enter the breadth: ");
			breadth = sc.nextDouble();

			double area = length * breadth;

			System.out.println("area of rectangle is: " + area);
			break;
		}

		default:
			System.out.println("Invalid Input");

		}

	}

}
