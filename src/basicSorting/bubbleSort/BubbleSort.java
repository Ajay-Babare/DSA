package basicSorting.bubbleSort;

import java.util.Arrays;
//Stable Sort
//TC = O(n^2)
//SC = O(1)
public class BubbleSort {
		//bubble sort
		public static void bubbleSort(int[] arr) {
			for(int i=0;i<arr.length-1;i++) { // n-1 pass
				boolean flag = true;
				for(int j=0;j<arr.length-1-i;j++) {
					if(arr[j]>arr[j+1]) {
						int temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
						flag = false;
					}
				}
				if(flag)
					break;
			}
		}
	public static void main(String[] args) {
		int[] arr = {5,2,4,3,1};
		System.out.println("Before Sort: "+Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println("After Sort: "+Arrays.toString(arr));
		
	}

}
