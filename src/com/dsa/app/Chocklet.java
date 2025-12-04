package com.dsa.app;

import java.util.Scanner;

public class Chocklet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of students in Class: ");
		int students = sc.nextInt();
		int chocolates = 0;
		
		
		for(int i=1; i<=students; i++) {
			chocolates += i;
			
		}
		
		System.out.println("peon will collect "+ chocolates + " chocolates from " + students+ " students.");
		
		
	}

}
