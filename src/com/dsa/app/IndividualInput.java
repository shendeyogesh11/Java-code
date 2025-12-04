package com.dsa.app;

import java.util.Scanner;

public class IndividualInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of students in class: ");
		int students = sc.nextInt();
		int sum = 0;
		int target = 30;
		
		
		for(int i=1; i<=students; i++) {
			
			
			
			if(sum < target) {
				System.out.println(" roll no: " + i + " enter the no of chocolates you bought: ");
				int chocolate = sc.nextInt();
				if(chocolate < 10) {
					continue;
				}
				sum+=chocolate;
			}else {
				break;
			}
			
		}
		
		System.out.println("total chocolates collected by peon is: " + sum );
	}

}
