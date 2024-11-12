package mapsAndSet;

import java.util.HashMap;

public class MapIterate {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>(); 
		map.put("Ajay", 27);
		map.put("Akash", 30);
		map.put("Shubham", 30);
		
		for(String key : map.keySet()) {
			int val = map.get(key);
			System.out.println(key+" "+val+" ");
		}
		System.out.println();
		
		for(int ele : map.values()) {
			System.out.println(ele);
		}
		
		System.out.println();
		
		for(Object pair : map.entrySet()) {
			System.out.println(pair);
		}
	}

}
