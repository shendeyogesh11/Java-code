package com.dsa.app;

import java.util.Scanner;
import java.util.Arrays;

public class AnagramString {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String str1 = in.next();
        String str2 = in.next();
        		
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		
		Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        String str11 = new String(arr1);
        String str22 = new String(arr2);
        
        if(str11.equals(str22)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
		
	}

}
