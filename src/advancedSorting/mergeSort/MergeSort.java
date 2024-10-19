package advancedSorting.mergeSort;

public class MergeSort {
	public static void printArray(int[] arr) {
		for(int ele:arr) {
			System.out.print(ele+" ");
		}
			System.out.println();
	}
	public static void merge(int[]a, int[] b, int[] arr) {
		int i=0, j=0, k=0;
		while(i<a.length && j< b.length) {
			if(a[i]<=b[j])
				arr[k++]=a[i++];
			else
				arr[k++]=b[j++];
		}
		while(i<a.length)
			arr[k++]=a[i++];
		while(j<b.length)
			arr[k++]=b[j++];
	}
	public static void mergeSort(int[] arr) {
		int n = arr.length;
		//base case
		if(n==1)
			return;
		//create 2 array of n/2 size each
		int[] a = new int[n/2];
		int[] b = new int[n-n/2];
		
		//copying array
		for(int i=0; i<a.length;i++) {
			a[i]=arr[i];
		}
		for(int i=0; i<b.length;i++) {
			b[i]=arr[i+n/2];
		}
		
		//recusice call
		mergeSort(a);
		mergeSort(b);
		//merge
		merge(a,b,arr);
	}
	public static void main(String[] args) {
		int [] arr = {50,20,10,80,30};
		printArray(arr);
		mergeSort(arr);
		printArray(arr);
	}

}
