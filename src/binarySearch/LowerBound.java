// Given a Sorted Integer array and an integer x, find lower bound of x. smallest Indexsuch that arr[idex]>=x.

package binarySearch;

public class LowerBound {

	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50};
		int target = 28;
		int n = arr.length;
		int lb = n;
		int  lo = 0, hi = n-1;
		while(lo<=hi) {
			int mid = lo+(hi-lo)/2;
			//arr[idex]>=x.
			if(arr[mid]>=target) {
				lb=Math.min(lb, mid);
				hi=mid-1;
			}
			else lo=mid+1;			
		}
		System.out.println("Lower Bound : "+lb );
	}
}
