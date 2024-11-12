package mapsAndSet;

import java.util.HashSet;

public class SetIterate {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		for(int ele : set) {
			System.out.print(ele+" ");
//			set.add(10);//can't add or remove while iterate the hashset
		}
		System.out.println();
	}

}
