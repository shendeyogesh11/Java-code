package com.dsa.app;

public class ArmStrong {
	public static void main(String[] args) {
		
		int[] arr = {1,232,153,23,370,702};	
		
//		for(int i=1; i<=1000; i++) {
//			if (checkArmStrong(i)) {
//                System.out.println(i);
//            }
//		} 
		
		for(int i : arr) {
			if (checkArmStrong(i)) {
                System.out.println(i);
            }
		}
		
	}

	private static boolean checkArmStrong(int i) {
		
		int bu=i;
		int rem;								
		int sum=0;									
		while(i>0)								
		{					
			rem=i%10;
			sum+=rem*rem*rem;
			i=i/10;
		}

		return sum == bu;
		
	}

}
