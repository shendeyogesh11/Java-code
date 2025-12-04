package hashMaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class GroupWordsByAnagram {
	
	public static void main(String[] args) {
		
	   String word = "silent listen note tone cab abc bca enot";
		
		List<List<String>> str = groupWordsByAnagram(word);
		
		System.out.println(str);
		
	}

	private static List<List<String>> groupWordsByAnagram(String word) {
		
		
		      String[] words = word.split(" ");
				
				
				List<List<String>> result = new ArrayList();
				
				Map<String, List<String>> map = new HashMap();
				
				
				for(String str: words) {	
					
					char[] chars = str.toCharArray();
		            Arrays.sort(chars);
		            String key = new String(chars);
		            
		            map.putIfAbsent(key, new ArrayList());
		            
		            map.get(key).add(str);    
					
				}
				
				
				for(Entry<String, List<String>> entry: map.entrySet() ) {
					
					result.add(entry.getValue());
					
				}
				
				
				return result;
		
	}
	
	
	
	

}
