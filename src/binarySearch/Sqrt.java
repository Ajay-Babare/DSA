//69. Sqrt(x)
//Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

package binarySearch;

public class Sqrt {
	
	public static int sqrt(int x) {
		if(x<=1)
			return x;
		
		int low = 0;
		int high = x;
		
		while(low<=high) {
			int mid = low + (high-low)/2;
			//mid*mid==x
			if(mid==x/mid)
				return mid;
			else if(mid > x/mid) {
				high = mid-1;
			}
			else
				low=mid+1;
		}
		return high;
	}
	public static void main(String[] args) {
		int x = 15;
		System.out.println("Sqrt : "+sqrt(x));
	}

}
