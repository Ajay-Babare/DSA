package mapsAndSet;

import java.util.HashMap;

public class BasicMap {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>(); 
		map.put("Ajay", 27);
		map.put("Akash", 29);
		map.put("Shubham", 30);
		System.out.println(map);
		System.out.println(map.get("Ajay"));
		System.out.println(map.size());
		map.remove("Shubham");
		System.out.println(map);
		System.out.println(map.containsKey("Akash"));
		System.out.println(map.containsValue(30));
	}

}
