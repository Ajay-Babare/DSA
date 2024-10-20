//268. Missing Number
//Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
		
package advancedSorting.cycleSort;

public class MissingNumber {
	public static void swap(int[] arr,int a, int b) {
		int temp = arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	public static int missingNumber(int[] arr) {
		int n = arr.length;
		int i = 0;
		while(i<n) {
			if(arr[i]==i || arr[i]==n)
				i++;
			else {
				swap(arr,arr[i],i);
			}	
		}
		for(i=0;i<n;i++) {
			if(arr[i]!=i)
				return i;
		}
		return i;
	}
	public static void main(String[] args) {
		int[] arr= {9,6,4,2,3,5,7,0,1};
		System.out.println(missingNumber(arr));
	}
}
