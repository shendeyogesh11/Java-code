package com.dsa.app;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		
		
		int zero = 0;
		int one = 1;
		System.out.println(zero);
		System.out.println(one);
		int second;
		
		for(int i=3; i<=length; i++) {
			
		    second = zero + one;
		    System.out.println(second);
		    zero = one;
		    one = second;
		}
	}

}
