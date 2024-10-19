package advancedSorting.quickSort;

public class QuickSort {
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
	public static int partition(int [] arr, int lo, int hi) {
		int pivot = arr[lo];
		int pivotIndex= lo;
		int smallerCount=0;
		for(int i=lo+1; i<=hi;i++) {
			 if(arr[i]<=pivot)
				 smallerCount++;
		}
		int correctIndex= pivotIndex+smallerCount;
		swap(arr,pivotIndex,correctIndex);
		//Partition 
		int i =lo ,j=hi;
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
	public static void quickSort(int[] arr, int lo, int hi) {
		//Base Case 
		if(lo>=hi)
			 return;
		
		 //pivot (arr[lo]) place correcct position
		 //left <= pivot & right > pivot
		 int idx = partition(arr, lo, hi);
		 quickSort(arr,lo,idx-1);
		 quickSort(arr,idx+1,hi);
	}
	public static void main(String[] args) {
		int[] arr = {10,5,1580,50,26,89};
		printArray(arr);
		quickSort(arr,0,arr.length-1);
		printArray(arr);
	}
}
