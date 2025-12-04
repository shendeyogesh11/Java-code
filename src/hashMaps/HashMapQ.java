package hashMaps;
import java.util.HashMap;
import java.util.Map;

public class HashMapQ {
	
	public static void main(String[] args) {
		
//		String sentence = "one two one two three four three";
//		String[] words = sentence.split(" ");
//		
//		Map<String, Integer>  map = new HashMap();
//		
//		for(String word: words) {
//			
//			map.put(word, map.getOrDefault(word, 0) + 1);
//			
//		}
//
//		System.out.println(map);
		
		
		
		
		int[] nums = {1,2,3,4,5};
		
		
		Map<String, Integer> map = new HashMap();
		
		
		for(int i: nums) {
			
			
			if(i % 2 == 0) {
				
				
				map.put("even", map.getOrDefault("even", 0) + 1);
				
			}
			else {
				
				map.put("odd", map.getOrDefault("odd", 0) + 1);
				
			}
			
			
			
		}
		
		System.out.println(map);	
		
	}

}
