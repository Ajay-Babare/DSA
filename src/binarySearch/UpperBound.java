// Given a Sorted Integer array and an integer x, find Upper Bound  of x. UB is the minimum Index such that arr[idex]> x.

package binarySearch;

public class UpperBound {

	public static void main(String[] args) {
		
		int[] arr = {10,20,28,28,30,40,50};
		int target = 28;
		int n = arr.length;
		int ub = n;
		int  lo = 0, hi = n-1;
		while(lo<=hi) {
			int mid = lo+(hi-lo)/2;
			//arr[idex]> x.
			if(arr[mid]>target) {
				ub=Math.min(ub, mid);
				hi=mid-1;
			}
			else lo=mid+1;			
		}
		System.out.println("Lower Bound : "+ub );
	}
}

