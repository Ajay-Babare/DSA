//Stable Sort
//TC = O(n^2)
//SC = O(1)
package basicSorting.insertionSort;

public class InsertionSort {
	
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
	
	//Insertion Sort
	public static void insertionSort(int[] arr) {
		int n = arr.length;
		
		//Insertion Sort
		
//Approach1
//		for (int i=1; i<n;i++) {
//			for(int j=i;j>=1;j--) {
//				if(arr[j]<arr[j-1]) {
//					swap(arr,j,j-1);
//				}else {
//					break;
//				}
//			}
//		}
		
//Approach2		
//		for (int i=1; i<n;i++) {
//			for(int j=i;j>=1 && arr[j]<arr[j-1];j--) {
//					swap(arr,j,j-1);
//			}
//		}
	
//Approach3
	for (int i=1; i<n;i++) {
		int j = i;
		while(j>=1 && arr[j]<arr[j-1]) {
			swap(arr,j,j-1);
			j--;
		}
	}
}
	public static void main(String[] args) {
		int[] arr = {-2,-1,3,6,8,1};
		System.out.println("Before Sort: ");
		printArray(arr);
		insertionSort(arr);
		System.out.println("After Sort: ");
		printArray(arr);
	}
}
