package queue;

import java.util.*;

public class DisplayQueue {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		
		Queue<Integer> helper = new ArrayDeque<>();
		while(q.size()>0) {
			System.out.print(q.peek()+" ");
			helper.add(q.remove());
		}
		while(helper.size()>0) {
			q.add(helper.remove());
		}
		
	}

}
