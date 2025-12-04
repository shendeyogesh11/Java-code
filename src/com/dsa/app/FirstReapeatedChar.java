package com.dsa.app;

import java.util.Scanner;

public class FirstReapeatedChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		System.out.println(firstOccurance(str));
	}

	private static int firstOccurance(String str) {
		
		for(int i=0; i< str.length(); i++) {
			
			for(int j=i+1; j<str.length(); j++) {
				
				if( str.charAt(i) == str.charAt(j)) {
					return i;
				}
			}
		}
		
		return -1;
	}
		
}
