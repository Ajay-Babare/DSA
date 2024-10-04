//Stable Sort
//TC = O(n^2)
//SC = O(1)
package basicSorting.bubbleSort;

public class BubbleSort {
	
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
	
		//bubble sort
		public static void bubbleSort(int[] arr) {
			for(int i=0;i<arr.length-1;i++) { // n-1 pass
				boolean flag = true;
				for(int j=0;j<arr.length-1-i;j++) {
					if(arr[j]>arr[j+1]) {
						swap(arr,j,j+1);
						flag = false;
					}
				}
				if(flag)
					break;
			}
		}
	public static void main(String[] args) {
		int[] arr = {5,2,4,3,1};
		System.out.println("Before Sort: ");
		printArray(arr);
		bubbleSort(arr);
		System.out.println("After Sort: ");
		printArray(arr);
		
	}

}
