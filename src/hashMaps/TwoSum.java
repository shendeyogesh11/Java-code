package hashMaps;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	public static void main(String[] args) {
		
		int[] arr = {2,7,8,10,11};
		int target = 9;
		
		solveTwoSum(arr, target);
	}

	private static void solveTwoSum(int[] arr, int target) {
		
		Map<Integer,Integer> map = new HashMap<>();
		
		for (int i = 0; i < arr.length; i++) {
		    
		    int Complement = target - arr[i];
		    
		    if (map.containsKey(Complement)) {
		        System.out.println("Pair found: " + arr[i] + " + " + Complement + " = " + target);
		        System.out.println("Indices: " + i + " and " + map.get(Complement));
		        return;
		    }

		    map.put(arr[i], i);
		}

			
		
		
	}

}
