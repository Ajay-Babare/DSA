package queue;

import java.util.*;

public class QueueBasics {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		System.out.println(q.size());
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		System.out.println(q.size());
		System.out.println(q);
		q.remove();
		System.out.println(q);
		System.out.println(q.size());
		System.out.println(q.peek());
		
	}

}
