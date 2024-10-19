//493. Reverse Pairs
//Given an integer array nums, return the number of reverse pairs in the array.
//A reverse pair is a pair (i, j) where:
//0 <= i < j < nums.length and
//nums[i] > 2 * nums[j].

package advancedSorting.mergeSort;

public class ReversePairs {
    public static int  count;
	public static void inversion(int[] a, int[] b) {
		int i=0,j=0;
		while(i<a.length && j<b.length) {
			if((long)a[i]>(long)2*(long)b[j]) {
				count+=(a.length-i);
				j++;
			}
			else
				i++;
		}
	}
	public static void merge(int[] a, int[] b, int[] arr) {
		int i=0, j=0,k=0;
		while(i<a.length && j<b.length) {
			if(a[i]<b[j])
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
		if(n==1)
			return;
		int a[]= new int[n/2];
		int b[]= new int[n-n/2];
		for(int i=0; i<a.length;i++) {
			a[i]=arr[i];
		}
		for(int i=0; i<b.length;i++) {
			b[i]=arr[i+n/2];
		}
		mergeSort(a);
		mergeSort(b);
		inversion(a,b);
		merge(a,b,arr);
	}
    public static int  reversePairs(int[] nums) {
        count = 0;
        mergeSort(nums);
        return count;
    }
    public static void main(String[] args) {
    	int[] nums= {3,5,7,9,1};
    	System.out.println(reversePairs(nums));
    }
}
