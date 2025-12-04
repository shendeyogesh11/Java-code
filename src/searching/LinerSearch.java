package searching;

public class LinerSearch {
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50,60};
		int target = 77;
		boolean flag = false;
		
		for(int i =0; i<arr.length; i++) {
			if(arr[i] == target) {
				flag = true;
				System.out.println(arr[i] + " found at index:"+ i);
				break;
			}
		}
		
		if(!flag) {
			System.out.println("Not found!");
		}
		
		
	}

}
