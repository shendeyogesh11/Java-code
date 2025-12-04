package hashMaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;



public class UnionAndIntersection {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4};
		
		int[] arr2 = {4,5,6,7};
		Map<Integer,Boolean> map = new HashMap<>();
		
		
		findUnion(arr, arr2, map);
		findIntersection(arr, arr2, map);
				
		
	}

	private static void findUnion(int[] arr, int[] arr2, Map<Integer,Boolean> map) {
		
		
		
		for(int num: arr) {
			
			map.put(num, true);		
		}
		
		for(int num: arr2) {
						
			map.put(num, true);	
		}
		
		System.out.print("Union: ");
		
	 for(Entry<Integer,Boolean> entry: map.entrySet()) {
		 
		 System.out.print(entry.getKey() + " ");
		 
	 }
	 
	 System.out.println();
				
		
	}

	private static void findIntersection(int[] arr, int[] arr2, Map<Integer,Boolean> map) {
		
		for(int num: arr2)
		if(map.containsKey(num)) {
			
			System.out.println("Intersection is: " + num);
			break;
		}
		
	}

}
