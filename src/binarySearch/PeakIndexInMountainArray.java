//Leetcode 852. Peak Index in a Mountain Array
//You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.
//Return the index of the peak element.
//Your task is to solve it in O(log(n)) time complexity.

package binarySearch;

public class PeakIndexInMountainArray {

	public static int peakIndexInMountainArray(int[] arr) {
		
		int n = arr.length;
		int low = 1;
		int high = n-2;
		
		while(low<=high) {
			int mid = low+(high-low)/2;
			//if mid element greater than both previous and next (Target index)
			if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) 
				return mid;
			// if mid element smaller than previous and greater than next(Descending slope)
			else if(arr[mid]<arr[mid-1] && arr[mid]>arr[mid+1])
				high=mid-1;
			//if mid element grater than previous and less than next (Ascending slope)
			else
				low=mid+1;
			
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr = {0,2,1,0};
		System.out.println("Peak Index: "+peakIndexInMountainArray(arr));
		
	}
}
