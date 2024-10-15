//2064. Minimized Maximum of Products Distributed to Any Store
//You are given an integer n indicating there are n specialty retail stores. There are m product types of varying amounts, which are given as a 0-indexed integer array quantities, where quantities[i] represents the number of products of the ith product type.
//You need to distribute all products to the retail stores following these rules:
//A store can only be given at most one product type but can be given any amount of it.
//After distribution, each store will have been given some number of products (possibly 0). Let x represent the maximum number of products given to any store. You want x to be as small as possible, i.e., you want to minimize the maximum number of products that are given to any store.
//Return the minimum possible x.

package binarySearch;

public class MinimizedMaximum {
	public static boolean isPossible(int[]arr, int maxQ, int n) {
		int m= arr.length;
		int stores=0;
		for(int i=0;i<m;i++) {
			if(arr[i]%maxQ==0)
				stores+=arr[i]/maxQ;
			else
				stores+=arr[i]/maxQ+1;
		}
		return stores<=n;
	}
	public static int minimizedMaximum(int []arr, int n) {
		int m = arr.length;
		int mx=Integer.MIN_VALUE;
		for (int i=0; i<m;i++) {
			mx=Math.max(mx, arr[i]);
		}
		int lo=1;
		int hi=mx;
		int ans=mx;
		while(lo<=hi) {
			int mid=lo+(hi-lo)/2;
			if(isPossible(arr,mid,n)) {
				ans=mid;
				hi=mid-1;
			}
			else
				lo=mid+1;
		}
		return ans;
	}
	public static void main(String[] args) {
		int arr[] = {15,10,10};
		int n= 7;
		System.out.println("Output : "+minimizedMaximum(arr,n));
	}

}
