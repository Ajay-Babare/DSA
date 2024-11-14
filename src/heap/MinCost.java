package heap;

import java.util.PriorityQueue;

public class MinCost {

	public static void main(String[] args) {
		int[] arr = {2,7,1,4,8};
		System.out.println(minCost(arr));
	}

	private static int minCost(int[] arr) {
		//minHeap
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int ele : arr) {
			pq.add(ele);
		}
		int cost=0;
		while(pq.size()>1) {
			int x=pq.remove();
			int y=pq.remove();
			cost+=x+y;
			pq.add(x+y);
		}
		return cost;
	}

}
