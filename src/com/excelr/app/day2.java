package com.excelr.app;

import java.util.Scanner;

public class day2 {
	
	public static void main(String [] args) {
		
		int hindiMarks;
		int engMarks;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter hindi marks: ");
		hindiMarks = sc.nextInt();
		
		System.out.println("enter english marks: ");
		engMarks = sc.nextInt();
		
		System.out.println(" sum is " + (hindiMarks + engMarks));
		
		
		
	}

}
