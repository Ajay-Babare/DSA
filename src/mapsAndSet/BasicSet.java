package mapsAndSet;

import java.util.HashSet;

public class BasicSet {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		set.add(60);
		System.out.println(set);
		System.out.println(set.size());
		System.out.println(set.contains(10));
		set.remove(60);
		System.out.println(set);
		Object[] arr = set.toArray();
		for(Object ob : arr) {
			System.out.print(ob+" ");
		}
		System.out.println();
		
	}

}
