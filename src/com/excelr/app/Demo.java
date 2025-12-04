package com.excelr.app;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Day: ");
		int day = sc.nextInt();

		switch (day) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("tuesday");
			break;
		case 4:
			System.out.println("wednesday");
			break;
		case 5:
			System.out.println("thursday");
			break;
		case 6:
			System.out.println("friday");
			break;
		case 7:
			System.out.println("saturday");
			break;
		default:
			System.out.println("Invalid Input!");
		}

		if (day == 1 || day == 7) {
			System.out.println("weekend");
		} else {
			System.out.println("weekday");
		}

	}

}
