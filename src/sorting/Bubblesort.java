package sorting;

import java.util.Arrays;

public class Bubblesort {
	public static void main(String[] args) {
		int[] arr = {7,5,8,6,2};
		System.out.println("Array before: " + Arrays.toString(arr));
		
		bubblesort(arr);
		
		System.out.println("Array After: " + Arrays.toString(arr));
			
		
	}

	private static void bubblesort(int[] arr) {
		
		int temp;
		
		for(int i=1; i<=arr.length; i++) {
			for(int j =0; j<arr.length-i; j++) {
				
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
	}

}
