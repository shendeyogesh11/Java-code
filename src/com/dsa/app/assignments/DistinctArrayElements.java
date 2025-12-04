package com.dsa.app.assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class DistinctArrayElements {
	
	public static void main(String[] args) {
		
//		int[] arr = {1,2,3,3,5,6,6,6,7,8,3,5,7,9};
//		
//		Set<Integer> set = new HashSet<>();
//		
//		for(int i: arr) {
//				set.add(i);	
//		}
//		
//		System.out.println("unique elements are: " + set);
//		System.out.println("Total unique numbers are: "+ set.size());
		
		
		
		HashMap<Integer,Integer> map = new HashMap<>(); 
		
		int[] arr = {1,2,3,3,5,6,6,6,7,8,3,5,7,9};
		
		
		for(int i: arr) {
			
			map.put(i, map.getOrDefault(i, 0) + 1);
			
		}
		
		System.out.println(map.get(3));
		System.out.println(map.values());
		
		
		for(Entry<Integer, Integer>  entry : map.entrySet()) {
			
			System.out.println(entry.getKey() + " " + entry.getValue());
			
		}
		
		
	}

}
