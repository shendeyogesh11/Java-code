package collectionFramework;

import java.util.ArrayList;
import java.util.Arrays;

public class DemoList {
	
	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>(Arrays.asList("swapnil", "tejas", "prajwal", "vivian"));
		
		
		for(String name: names) {
			
			System.out.println("length of string is: " + name.length() );
		}
		
	}

}
