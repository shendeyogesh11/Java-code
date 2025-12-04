package com.dsa.app;
import java.util.Arrays;

public class RotatedArray {
	public static void main(String[] args) {
		int[] arr = {20,40,30,10,50,60};
		int n = arr.length;
		int mid = n / 2;
		
		int[] rotated = new int[n];
		
		for(int i = 0; i<n-mid; i++) {
			rotated[i] = arr[mid + i];
		}
		
		for(int i =0; i<mid; i++) {
			rotated[n-mid+i] = arr[i];
		}
		
		System.out.println(Arrays.toString(rotated));
	}
}
