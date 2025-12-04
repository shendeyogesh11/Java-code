package com.dsa.app;
import java.util.Arrays;

public class SortingSearchingAndRotate {
	public static void main(String[] args) {
		int[] arr = {43,22,32,21,12,44,56,82};
		int target = 12;
		
		// original Array
		System.out.println("Original array is : " + Arrays.toString(arr));
		
		//sort it first
		System.out.println("Sorted array is : " + Arrays.toString(sortedArr(arr)));
		
		//next leftRotate it
		System.out.println("Left rotated array from mid is : " + Arrays.toString(leftRotate(arr)));
				
		
		// now search element
//		System.out.println("Element found at index : " + binarySearch(arr,target));
		
		
		System.out.println("Element found at index : " + advanceBinarySearch(arr,target));
		
		
		
	}

	private static int advanceBinarySearch(int[] arr, int target) {
		
		int start = 0;
		int end = arr.length-1;
		int n = arr.length;
		int mid = n / 2;
		
		if(target == arr[mid]) {
			return mid;
		}
		else if(target > arr[0]) {
			return binarySearch(arr, target, 0, mid-1);
		}
		else {
			return binarySearch(arr, target, mid+1, end);
		}
	}

	private static int binarySearch(int[] arr, int target, int start, int end) {
		
		while(start <= end) {
			
			int mid = (start + end) / 2;
			
			if(target == arr[mid]) {
				return mid;
			}
			else if(target > arr[mid]) {
				start = mid+1;
			}
			else {
				end = mid-1;
			}
		}
	
		return -1;
	}

	private static int[] leftRotate(int[] arr) {
		int n = arr.length;
		int mid = n/2;
		
		for(int i=0; i<mid; i++) {
			
			int temp = arr[n-1];
			
			for(int j=n-1; j>0; j--) {
				arr[j] = arr[j-1];
			}
			
			arr[0] = temp;
		}
		
		return arr;
	}

	private static int[] sortedArr(int[] arr) {
		
		for(int k=1; k<arr.length; k++) {
			int temp = arr[k];
			int j = k-1;
			
			while(j>=0 && temp<= arr[j]) {
				arr[j+1] = arr[j];
				j--;
			}
			
			arr[j+1] = temp;
		}
		
		return arr;
		
	}
	
	

}
