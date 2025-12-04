package hashMaps;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		Map<String,Integer> map = new HashMap();
		
		map.put("Alice",800);
		map.put("ben",900);
		map.put("cris",1000);
		
		System.out.println(map.entrySet());
		
	}

}
