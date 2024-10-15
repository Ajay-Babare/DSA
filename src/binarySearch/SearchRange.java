//34. Find First and Last Position of Element in Sorted Array
//Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
//If target is not found in the array, return [-1, -1].
//You must write an algorithm with O(log n) runtime complexity.

package binarySearch;

import java.util.Arrays;

public class SearchRange {

	public static int[] searchRange(int[] nums, int target) {
		int[] ans = new int[2];
		int n = nums.length;
		int lo = 0, hi = n-1;
		int fp=-1, lp=-1;
		int mid;
		//find first postion
		while(lo<=hi) {
			mid=lo+(hi-lo)/2;
			if(nums[mid]==target) {
				if(mid>0&&nums[mid]==nums[mid-1]) {
					hi = mid-1;
				}
				else {
					fp=mid;
					break;
				}
			}
			else if(nums[mid]>target) {
				hi= mid-1;
			}
			else {
				lo=mid+1;
			}
		}
		
		//find last postion
		lo=0; hi=n-1;
		while(lo<=hi) {
			mid=lo+(hi-lo)/2;
			if(nums[mid]==target) {
				if(mid+1<n && nums[mid]==nums[mid+1]) {
					lo = mid+1;
				}
				else {
					lp=mid;
					break;
				}
			}
			else if(nums[mid]>target) {
				hi= mid-1;
			}
			else {
				lo=mid+1;
			}
		}
		//Add first and last postion to the ans array
		ans[0]=fp; ans[1]=lp;
		return ans;
	}
	public static void main(String[] args) {
		int nums[]= {5,7,7,8,8,10};
		int target= 8;
		int[] ans = searchRange(nums, target);
		System.out.println("Output: "+Arrays.toString(ans));
	}

}
