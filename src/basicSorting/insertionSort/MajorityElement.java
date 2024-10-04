//LeetCode 169. Majority Element
//Given an array nums of size n, return the majority element.
//The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

package basicSorting.insertionSort;

public class MajorityElement {
	
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
	
	//Approach
	public static int majorityElement(int[] nums){
		int n = nums.length;
		
		for(int i=1;i<n;i++) {
			int j=i;
			while(j>=1 && nums[j]<nums[j-1]) {
				swap(nums,j,j-1);
				j--;
			}
		}
		return nums[n/2];
	}
	public static void main(String[] args) {
		int[] arr = {2,1,3,1,1,2,2,2,2,1,1,1,1,1,1,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,};
		int majorityElement = majorityElement(arr);
		System.out.println("Majority Element: "+majorityElement);

	}

}
