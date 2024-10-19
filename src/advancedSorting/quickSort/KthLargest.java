//215. Kth Largest Element in an Array
//Given an integer array nums and an integer k, return the kth largest element in the array.
//Note that it is the kth largest element in the sorted order, not the kth distinct element.
//Can you solve it without sorting?
		
package advancedSorting.quickSort;

public class KthLargest {
	static int ans;
	public static void printArray(int[] arr) {
		for(int ele: arr) {
			System.out.print(ele+" ");
		}
		System.out.println();
	}
	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b]=temp;
	}
	public static int partition(int[] arr, int lo, int hi) {
		int mid=lo+(hi-lo)/2;
		int smallerCount=0;
		int pivotIndex=mid;
		int pivot=arr[mid];
		for(int i=lo;i<=hi;i++) {
			if(i==mid)
					continue;
			if(arr[i]<=pivot)
				smallerCount++;
		}
		int correctIndex=lo+smallerCount;
		swap(arr,pivotIndex,correctIndex);
		int i=lo, j=hi;
		while(i<correctIndex && j>correctIndex) {
			if(arr[i]<=pivot) 
				i++;
			else if(arr[j]>pivot)
				j--;
			else if(arr[i]>pivot && arr[j]<=pivot)
				swap(arr,i,j);
		}
		return correctIndex;
	}
	public static void quickSelect(int[] arr, int lo, int hi,int k) {
		//Base Case
		if(lo>hi)
			return;
		//partion left<=pivot & right>pivot
		int idx = partition(arr, lo, hi);
		if(k-1==idx) {
			ans = arr[idx];
			return;
		}
		if(k-1<idx)
			quickSelect(arr,lo,idx-1,k);
		else
			quickSelect(arr,idx+1,hi,k);
	}
	public static void main(String[] args) {
		ans=-1;
		int[] arr = {10,5,1580,50,26,89};
		int n = arr.length;
		int k =2;
		printArray(arr);
		quickSelect(arr,0,n-1,n-k+1);
		printArray(arr);
		System.out.println("Element : "+ans);
	}
}
