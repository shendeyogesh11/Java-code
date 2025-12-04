package com.dsa.app;

import java.util.Scanner;

public class Loops {
	public static void main(String[] args) {
		
		
//		int i=0;
//		
//		while(i<5) {
//			System.out.println("VIVIAN "+ (5-i));
//			i++;
//		}
		
//         int i=5;
//		
//		while(i>=1) {
//			System.out.println("VIVIAN "+ i);
//			i--;
//		}
		
//		for(int i=5; i>=1; i--) {
//			System.out.println("vivian" + i);
//			
//		}
		
//		int sum=0;
//		for(int i=1; i<=5; i=i+2) {
//			sum += i;
//		}
//		
//		System.out.println("sum is: "+ sum);
//		
		int n;
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		n = sc.nextInt();
		
		for(int i=1; i<=n; i=i+2) {
			sum += i;
			System.out.println("odd numbers are "+ i);
		}
		
		System.out.println("sum is: "+ sum);
		
		e
		
	}

}
