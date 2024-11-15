//632. Smallest Range Covering Elements from K Lists
//You have k lists of sorted integers in non-decreasing order. Find the smallest range that includes at least one number from each of the k lists.
//We define the range [a, b] is smaller than range [c, d] if b - a < d - c or a < c if b - a == d - c.
package heaps;

import java.util.List;
import java.util.PriorityQueue;

class Triplet1 implements Comparable<Triplet1>{
	int ele;
	int row;
	int col;
	
	Triplet1(int ele, int row, int col){
		this.ele=ele;
		this.row=row;
		this.col=col;
	}
	@Override
	public int compareTo(Triplet1 t) {
		return this.ele-t.ele;
	}
	
}
public class SmallestRange {
    public int[] smallestRange(List<List<Integer>> nums) {
        int[] ans = {0,Integer.MAX_VALUE};
        //MinHeap
        PriorityQueue<Triplet1> pq = new PriorityQueue<>();
        int k = nums.size();
        int max = Integer.MIN_VALUE;
        for(int i=0; i<k;i++) {
        	int ele = nums.get(i).get(0);
        	pq.add(new Triplet1(ele,i,0));
        	max=Math.max(max, ele);
        }
        while(true) {
        	Triplet1 top = pq.remove();
        	int ele = top.ele, row = top.row, col = top.col;
        	//Update the minimum range
        	if(max-ele < ans[1]-ans[0]) {
        		ans[0] = ele;
        		ans[1] = max;
        	}
        	if(col==nums.get(row).size()-1) break;
        	int next = nums.get(row).get(col+1);
        	max = Math.max(max, next);
        	pq.add(new Triplet1(next,row,col+1));
        }
        return ans;
    }
}
