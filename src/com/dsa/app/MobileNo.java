package com.dsa.app;

public class MobileNo {
	public static void main(String[] args) {
		long[] arr = {4848448112L,4841148151L,8418178156L,4841881851L,8515515176L,8415187410L,1854184125L};
		
		
		for(long i: arr) {
			
			int evenCount=0;
			int oddCount=0;
			long mob = i;
			
			while(i>0) {
				
				long digit = i % 10;
				if(digit % 2 == 0) {
					evenCount++;
				}
				else {
					oddCount++;
				}
				
				i = i/10;
			}
			
			System.out.print("Mobile Number: " + mob + " has Even Count : " + evenCount + " has Odd Count : " + oddCount );
			
			
			if(evenCount > oddCount) {
				System.out.println(" Even baised");
			
			}else if(evenCount < oddCount) {
				System.out.println(" Odd baised");
			}else {
				System.out.println(" Neutral");
			}
			
		}
	}
}
