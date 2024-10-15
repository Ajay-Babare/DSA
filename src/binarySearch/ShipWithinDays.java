//1011. Capacity To Ship Packages Within D Days
//A conveyor belt has packages that must be shipped from one port to another within days days.
//The ith package on the conveyor belt has a weight of weights[i]. Each day, we load the ship with packages on the conveyor belt (in the order given by weights). We may not load more weight than the maximum weight capacity of the ship.
//Return the least weight capacity of the ship that will result in all the packages on the conveyor belt being shipped within days days.

package binarySearch;

public class ShipWithinDays {
	public static boolean isPossible(int [] arr, int c, int d) {
		int n= arr.length;
		int days=1;
		int load=0;
		for(int i=0; i<n;i++) {
			if(load+arr[i]<=c)
				load+=arr[i];
			else {
				load=arr[i];
				days++;
			}
		}
		return days<=d;
	}
	public static int shipWithinDays(int arr[], int d) {
		int n= arr.length;
		int sum = 0;
		int mx=Integer.MIN_VALUE;
		for(int i =0; i<n;i++) {
			mx=Math.max(mx, arr[i]);
			sum+=arr[i];
		}
		int lo=mx;
		int hi=sum;
		int minC=sum;
		while(lo<=hi) {
			int mid=lo+(hi-lo)/2;
			if(isPossible(arr,mid,d)) {
				minC=mid;
				hi=mid-1;
			}
			else
				lo=mid+1;
		}
		return minC;
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int d = 5;
		System.out.println("Output: "+shipWithinDays(arr,d));
	}

}
