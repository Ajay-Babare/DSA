//287. Find the Duplicate Number
//Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
//There is only one repeated number in nums, return this repeated number.
//You must solve the problem without modifying the array nums and using only constant extra space.

package advancedSorting.cycleSort;

public class FindDuplicate {
	public static void swap(int i, int j, int[] nums) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
	public static int findDuplicate(int[] nums) {
		while(true) {
			int ele = nums[0];
			if(ele==nums[ele])
				return ele;
			swap(0, ele, nums);
			
		}
	}
	public static void main(String[] args) {
		int[] arr = {1,3,4,2,2};
		System.out.println("Duplicate : "+findDuplicate(arr));
	}

}
