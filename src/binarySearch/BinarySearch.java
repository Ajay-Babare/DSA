//Leetcode 704. Binary Search
//Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
//You must write an algorithm with O(log n) runtime complexity.

package binarySearch;

public class BinarySearch {
    
	public static int binarySearch(int[] nums, int target) {
        
        int n = nums.length;
        int lo = 0;
        int hi = n-1;
        //Binary Search
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid]>target)
                hi=mid-1;
            else
                lo=mid+1;
        }
        return -1;
    }

	public static void main(String[] args) {
		int [] nums = {-1,0,3,5,9,12};
		int  target = 9;
		System.out.println(binarySearch(nums,target));
		
		
	}

}
