package com.dsa.app;
import java.util.Arrays;

// right shift
public class RotateFromMid {
	public static void main(String[] args) {
		int[] arr = {20,40,30,10,50,60};
		int n = arr.length;
		int mid = n / 2;
		
	
		for(int i=0; i<mid; i++) {
			int temp = arr[0];
			
			int j;
			for(j=1; j<arr.length; j++) {
				arr[j-1] = arr[j];	
			}
			
			arr[j-1] = temp;
			
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
