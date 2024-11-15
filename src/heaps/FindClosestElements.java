//658. Find K Closest Elements
//Given a sorted integer array arr, two integers k and x, return the k closest integers to x in the array. The result should also be sorted in ascending order.
//An integer a is closer to x than an integer b if:
//|a - x| < |b - x|, or
//|a - x| == |b - x| and a < b
package heaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

//class Pair implements Comparable<Pair>{
//
//	int ele;
//	int diff;
//	
//	Pair(int ele, int diff){
//		this.ele=ele;
//		this.diff=diff;
//	}
//	
//	@Override
//	public int compareTo(Pair p) {
//		if(this.diff==p.diff)
//			return this.ele-p.ele;
//		return this.diff-p.diff;
//	}
//	
//}
public class FindClosestElements {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
    	//maxHeap
        PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele : arr) {
        	int diff = Math.abs(x-ele);
        	pq.add(new Pair(ele,diff));
        	if(pq.size()>k)pq.remove();
        }
        List<Integer> ans = new ArrayList<Integer>();
        while(pq.size()>0) {
        	Pair p = pq.remove();
        	ans.add(p.ele);
        }
        Collections.sort(ans);
        return ans;
    }
}
