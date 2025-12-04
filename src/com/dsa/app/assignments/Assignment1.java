package com.dsa.app.assignments;

import java.util.Arrays;

public class Assignment1 {
	public static void main(String[] args) {
		int[] arr = {5,4,23,45,234,56,23,567,87,875};
		int mid = (arr.length) / 2;
		System.out.println(Arrays.toString(arr));
		
		ascendingOrder(arr, mid);
		System.out.println(Arrays.toString(arr));
		
		descendingOrder(arr, mid);
		System.out.println(Arrays.toString(arr));
	}

	private static void ascendingOrder(int[] arr, int mid) {
		
		for(int i=0; i<mid; i++) {
			int temp;
			for(int j=i+1; j<mid; j++)
			if(arr[i]> arr[j]) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
	}
	
	
private static void descendingOrder(int[] arr, int mid) {
		
		for(int i=mid; i<arr.length; i++) {
			int temp;
			for(int j=i+1; j<arr.length; j++)
			if(arr[i] < arr[j]) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
	

}

}
