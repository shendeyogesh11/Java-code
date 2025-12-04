package com.dsa.app;

import java.util.Scanner;

public class Arrays {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] arr = new int[5];
		int max = Integer.MIN_VALUE;
		
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = in.nextInt();
		}
		
		int evensum =0;
		int oddsum =0;
		int secondMax = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i] > max) {
				secondMax= max;
				max=arr[i];
			} else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
			
			
			if(arr[i] %2 == 0) {
				evensum += arr[i];
			}else {
				oddsum += arr[i];
			}
		}
		
		System.out.println("even sum is: " + evensum);
		System.out.println("odd sum is: " + oddsum);
		System.out.println("max is : " + max );
		System.out.println("second max is : " + secondMax);
		
		
		
		
		
		
		
		
	}

}
