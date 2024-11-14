package heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class HeapBasics {

	public static void main(String[] args) {
		//minHeap
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(11);
		System.out.println(pq+" "+pq.peek());
		pq.add(12);
		System.out.println(pq+" "+pq.peek());
		pq.add(1);
		System.out.println(pq+" "+pq.peek());
		
		System.out.println("************");
		//maxHeap
		PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());
		p.add(11);
		System.out.println(p+" "+p.peek());
		p.add(12);
		System.out.println(p+" "+p.peek());
		p.add(1);
		System.out.println(p+" "+p.peek());
		
	}

}
