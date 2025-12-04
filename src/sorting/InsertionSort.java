package sorting;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		
		
		
		int[] arr = {7,5,8,6,2};
		
		insertionsortAsc(arr);
		insertionsortDesc(arr);
		
		
	}
	
	public static void insertionsortAsc(int[] arr) {
		
    System.out.println("array before" + Arrays.toString(arr));
		
		for(int k=1; k<arr.length; k++) {
			int temp = arr[k];
			int j = k-1;
			
			
			while(j>=0 && temp<= arr[j]) {
				arr[j+1] = arr[j];
				j--;
			}
			
			arr[j+1] = temp;
		}
		
		System.out.println("array after" + Arrays.toString(arr));
		
		
	}
	
	
	public static void insertionsortDesc(int[] arr) {
		
	    System.out.println("array before" + Arrays.toString(arr));
			
			for(int k=1; k<arr.length; k++) {
				int temp = arr[k];
				int j = k-1;
				
				
				while(j>=0 && temp>= arr[j]) {
					arr[j+1] = arr[j];
					j--;
				}
				
				arr[j+1] = temp;
			}
			
			System.out.println("array after" + Arrays.toString(arr));
			
			
		}
}
