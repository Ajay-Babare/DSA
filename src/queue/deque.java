package queue;

import java.util.*;

public class deque {

	public static void main(String[] args) {
		Deque<Integer> dq = new LinkedList<>();
		dq.add(1);
		dq.add(2);
		dq.add(3);
		dq.add(4);
		System.out.println(dq);
		dq.addFirst(5);
		System.out.println(dq);
		dq.removeLast();
		System.out.println(dq);
		dq.removeFirst();
		System.out.println(dq);
		System.out.println(dq.getFirst());
		System.out.println(dq.getLast());
		dq.addLast(1);
		dq.addLast(2);
		dq.addLast(3);
		dq.addLast(2);
		dq.add(5);//add last
		System.out.println(dq);
		
	}

}
