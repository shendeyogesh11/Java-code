package com.dsa.app;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		boolean flag = true;
		
		// brute better best 
		for(int i=2; i<Math.sqrt(n); i++) {  //1.  2 to  <n  //2. 2 to < n/2   //3. 2 to < Math.sqrt(n) 
			
			if(n%i == 0) {
				flag = false;
			}
		}
		if(flag) {
			System.out.println("prime");
		}else {
			System.out.println("not prime");
		}
		
		
		
		
		
	}

}
