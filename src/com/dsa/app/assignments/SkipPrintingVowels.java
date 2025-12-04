package com.dsa.app.assignments;

import java.util.Scanner;

public class SkipPrintingVowels {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String vowels ="aeiouAEIOU";
		
		
		String result = skipPrintingVowels(input , vowels);
		System.out.println(result);
		
		
		
	}

	private static String skipPrintingVowels(String input, String vowels) {
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<input.length(); i++) {
			
			if(vowels.contains(String.valueOf(input.charAt(i)))) {
				continue;
			}else {
				sb.append(input.charAt(i));
			}
		}
		
		return sb.toString();
		 
	}

}
