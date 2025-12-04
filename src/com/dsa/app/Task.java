package com.dsa.app;

import java.util.Scanner;

public class Task {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] arr = {4,5,6,7,8};
		
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i] > max) {
				secondMax= max;
				max=arr[i];
			} 
			else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
			
		}
		
		System.out.println("max is : " + max );
		System.out.println("second max is : " + secondMax);
			
		
	}

}
