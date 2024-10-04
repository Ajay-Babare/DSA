//Given an array with N distinct elements, convert the
//given array to a form where all elements are in the range
//from 0 to N-1. The order of elements is the same, i.e., 0 is
//placed in the place of the smallest element, 1 is placed for
//the second smallest element, ... N-1 is placed for the largest
//element.
package basicSorting.selectionSort;

public class TransformArray {
 public static void printArray(int[] arr) {
	 for(int ele: arr) {
		 System.out.print(ele+" ");
	 }
	 System.out.println();
 }
	public static void main(String[] args) {
		int arr[] = {54,11,28,47,91,63};
		printArray(arr);
		int n = arr.length;
		int x=0;
		//Approach
		for(int i=0;i<n;i++) {
			int min = Integer.MAX_VALUE;
			int mindex = -1;
			for(int j=0;j<n;j++) {
				if(arr[j]<min&&arr[j]>0) {
					min = arr[j];
					mindex=j;
				}
			}
			arr[mindex]=x;
			x--;
		}
		for(int i=0;i<n;i++) {
			arr[i]*=-1;
		}
		printArray(arr);
	}
}
