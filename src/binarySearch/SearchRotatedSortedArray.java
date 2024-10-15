//Leetcode 33. Search in Rotated Sorted Array
//There is an integer array nums sorted in ascending order (with distinct values).
//Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
//Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
//You must write an algorithm with O(log n) runtime complexity.

package binarySearch;

public class SearchRotatedSortedArray {
	public static int search(int[] nums, int target) {
		int n =  nums.length;
		int low = 0;
		int high = n-1;
		while (low<=high) {
			int mid = low + (high-low)/2;
			//element found
			if(target==nums[mid])
				return mid;
			else if(nums[mid]>=high) {//left part(low to mid sorted)
				if(target>=nums[low] && target<nums[mid])
					high = mid-1;
				else
					low = mid+1;
			}
			else {//Right Part(mid to high sorted)
				if(target>nums[mid]&&target<=nums[high])
					low = mid+1;
				else
					high=mid-1;
			}
		}
		//element not present
		return -1;
	}
	public static void main(String[] args) {
		int [] arr = {4,5,6,7,0,1,2};
		int target = 7;
		System.out.println("Element found at index: "+search(arr,target));
	}

}
