package searching;

public class DayTarget {
	
	public static void main(String[] args) {
		int[] arr = {100,200,300,400,500,600,700};
		int target = 1000;
		boolean flag = false;
		int daySum = 0;
		
		for(int i =0; i<arr.length; i++) {
			
			
			daySum = daySum + arr[i];
			
			if( daySum >= target ) {
				flag = true;
				System.out.println(target + " Target completed at Day: "+ i);
				break;
			}
		}
		
		
		if(!flag) {
			System.out.println("Target Not completed! ");
		}
		
		
	}

}
