//973. K Closest Points to Origin
//Given an array of points where points[i] = [xi, yi] represents a point on the X-Y plane and an integer k, return the k closest points to the origin (0, 0).
//The distance between two points on the X-Y plane is the Euclidean distance (i.e., √(x1 - x2)2 + (y1 - y2)2).
//You may return the answer in any order. The answer is guaranteed to be unique (except for the order that it is in).
package heap;

import java.util.Collections;
import java.util.PriorityQueue;

class Triplet implements Comparable<Triplet>{

	int d;
	int x;
	int y;
	
	Triplet(int d, int x, int y){
		this.d=d;
		this.x=x;
		this.y=y;
	}
	
	@Override
	public int compareTo(Triplet t) {
		return this.d-t.d;
	}
	
}
public class kClosest {

    public int[][] kClosest(int[][] points, int k) {
        //maxheap
    	PriorityQueue<Triplet> pq = new PriorityQueue<>(Collections.reverseOrder());
    	for(int i=0; i<points.length;i++) {
    		int x = points[i][0];
    		int y = points[i][1];
    		int d = x*x+y*y;
    		pq.add(new Triplet(d,x,y));
    		if(pq.size()>k)
    			pq.remove();
    	}
    	int ans[][]= new int[k][2];
    	for(int i=0; i<ans.length;i++) {
    		Triplet t = pq.remove();
    		ans[i][0]=t.x;
    		ans[i][1]=t.y;
    	}
    	return ans;
    }
}
