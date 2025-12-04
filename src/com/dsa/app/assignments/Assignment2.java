package com.dsa.app.assignments;

public class Assignment2 {
	public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        int size = findSize(arr);

        System.out.println("Size of the array: " + size);
    }

    private static int findSize(int[] arr) {
        int count = 0;

        try {
        	
            while (true) {
                int temp = arr[count];
                count++;
            }
            
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage() + " Occured!");
        }

        return count;
    }
}
