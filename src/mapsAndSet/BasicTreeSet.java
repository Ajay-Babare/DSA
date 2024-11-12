package mapsAndSet;

import java.util.TreeSet;

public class BasicTreeSet {

	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<>();
		treeSet.add(10);
		treeSet.add(50);
		treeSet.add(60);	
		treeSet.add(40);
		treeSet.add(20);
		treeSet.add(30);

		System.out.println(treeSet);
	}

}
