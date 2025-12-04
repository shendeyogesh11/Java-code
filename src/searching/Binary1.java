package searching;

import java.util.Scanner;

public class Binary1 {
	
	public static void main(String[] args) {
		
//		int[] arr = {44,56,76,77,89,99,101,204};
//		
//		int start = 0;
//		int end = arr.length-1;
//		int target = 101;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter an elements of Array : ");
		for(int i=0; i<arr.length; i++) {
			arr[i] =  sc.nextInt();
		}
		
		System.out.println("Enter taarget : ");
		int target = sc.nextInt();
		
		
		binarySearch(arr,target);
		
		
//		while(start <= end){
//			
//			int mid = (start+end) / 2;
//			
//			if( target == arr[mid]) {
//				System.out.println("Element found at index: " + mid);
//				break;
//			}
//			else if(target > arr[mid]) {
//				start = mid+1;
//			}else {
//				end = mid-1;
//			}
//			
//		}
//	
//		if(start > end) {
//			System.out.println("Element not found");
//		}
		
		sc.close();
		
	}
	
	static void binarySearch(int[] arr , int target) {
		
			int start = 0;
			int end = arr.length-1;
		
            while(start <= end){
			
			int mid = (start+end) / 2;
			
			if( target == arr[mid]) {
				System.out.println("Element found at index: " + mid);
				break;
			}
			else if(target > arr[mid]) {
				start = mid+1;
			}
			else {
				end = mid-1;
			}
			
		}
	
		if(start > end) {
			System.out.println("Element not found");
		}
		
	}

}
