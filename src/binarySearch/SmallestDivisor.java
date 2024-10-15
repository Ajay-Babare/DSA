//Leetcode 1283. Find the Smallest Divisor Given a Threshold
//Given an array of integers nums and an integer threshold, we will choose a positive integer divisor, divide all the array by it, and sum the division's result. Find the smallest divisor such that the result mentioned above is less than or equal to threshold.
//Each result of the division is rounded to the nearest integer greater than or equal to that element. (For example: 7/3 = 3 and 10/2 = 5).
//The test cases are generated so that there will be an answer.

package binarySearch;

public class SmallestDivisor {
	public static boolean isLess(int[]nums, int mid, int t) {
		int sum=0;
		for (int i=0;i<nums.length;i++) {
			if(nums[i]%mid==0)
				sum+=nums[i]/mid;
			else
				sum+=nums[i]/mid+1;
		}
		if(sum<=t)
			return true;
		
		return false;
	}
	public static int smallestDivisor(int nums[],int t) {
		int n=nums.length;
		int mx=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			mx=Math.max(mx, nums[i]);
		}
		int lo=1;
		int hi=mx;
		int d=mx;
		while(lo<=hi) {
			int mid=lo+(hi-lo)/2;
			if(isLess(nums,mid,t)) {
				d=mid;
				hi=mid-1;
			}
			else
				lo=mid+1;
		}
		return d;
	}
	public static void main(String[] args) {
		int []nums= {44,22,33,11,1};
		int t=5;
		System.out.println("Smallest Divisor: "+smallestDivisor(nums,t));
	}

}
