//Unstable Sort
//TC = O(n^2)
//SC = O(1)
package basicSorting.selectionSort;

public class SelectionSort {
	
	public static void printArray(int[] arr) {
		for(int ele: arr) {
			System.out.print(ele+" ");
		}
		System.out.println();
	}
	
	public static void swap(int [] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
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
			swap(arr,mindex,i);
		}
	}
	public static void main(String[] args) {
		int [] arr = {2,3,8,1,4,5};
		System.out.println("Before Sort: ");
		printArray(arr);
		selectionSort(arr);
		System.out.println("After Sort: ");
		printArray(arr);
	}
}
