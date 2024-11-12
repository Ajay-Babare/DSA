package mapsAndSet;

import java.util.HashSet;

public class AddSameInSet {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("Ajay");
		set.add("Ajay");
		set.add("Ajay");
		set.add("Ajay");
		System.out.println(set);//only one occurance in set
	}

}
