//Unstable Sort
//TC = O(n^2)
//SC = O(1)
package basicSorting.selectionSort;

import java.util.Arrays;

public class SelectionSort {

	public static void selectionSort(int[] arr) {
		int n = arr.length;
		//Selection Sort
		for(int i=0; i<n-1;i++) {
			int min = Integer.MAX_VALUE;
			int mindex = -1;
			for(int j=i;j<n;j++) {
				if(arr[j]<min) {
					min = arr[j];
					mindex=j;
				}
			}
			int temp = arr[mindex];
			arr[mindex] = arr[i];
			arr[i] = temp;
		}
	}
	public static void main(String[] args) {
		int [] arr = {2,3,8,1,4,5};
		System.out.println("Before Sort: "+Arrays.toString(arr));
		selectionSort(arr);
		System.out.println("After Sort: "+Arrays.toString(arr));
	}
}
