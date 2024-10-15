//1539. Kth Missing Positive Number
//Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.
//Return the kth positive integer that is missing from this array.
 
package binarySearch;

public class FindKthPositive {
	public static int findKthPositive(int[] arr, int k) {
		int n= arr.length;
		int lo=0;
		int hi=n-1;
		while(lo<=hi) {
			int mid=lo+(hi-lo)/2;
			int missed=arr[mid]-(mid+1);
			if(missed<k)
				lo=mid+1;
			else
				hi=mid-1;
		}
		return k+lo;
	}
	public static void main(String[] args) {
		int arr[] = {2,3,4,7,11};
		int k=5;
		System.out.println("Output: "+findKthPositive(arr,k));
	}

}
