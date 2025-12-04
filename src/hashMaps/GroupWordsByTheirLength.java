package hashMaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class GroupWordsByTheirLength {
	
	public static void main(String[] args) {
		
		String word = "one two three four five six seven";
		
		List<List<String>> str = groupByTheirLength (word);
		
		
		System.out.println(str);
		
		
//		
//		String word = "one two three four five six seven";
//		
//		
//		groupByTheirLength(word);
//		
		
	}

	private static List<List<String>> groupByTheirLength (String word) {
		
		String[] words = word.split(" ");
		
		
		List<List<String>> result = new ArrayList<>();
		
		Map<Integer, List<String>> map = new HashMap<>();
		
		
		for(String str: words) {
			
			int len = str.length();
			
			map.putIfAbsent(len, new ArrayList());
			
			map.get(len).add(str);
			
		}
		
		
		
		for(Entry<Integer, List<String>> entry: map.entrySet() ) {
			
			result.add(entry.getValue());
			
		}		
		
		
		return result;
		
		
		
//		String[] words = word.split(" ");
//		
//		Map<Integer, List<String>> map = new HashMap<>();
//		
//		
//		for(String str: words) {
//			
//			int len = str.length();
//			
//			
//			
//			if(map.containsKey(len)) {
//				
//				map.get(len).add(str);
//			}
//			
//			else {
//				
//				map.put(len, new ArrayList<>((Arrays.asList(str))));
//			}
//			
//		}
//		
//		
//		System.out.println(map);
			
}
		
		
	
	
	

}
