//303. Range Sum Query - Immutable
//Given an integer array nums, handle multiple queries of the following type:
//Calculate the sum of the elements of nums between indices left and right inclusive where left <= right.
//Implement the NumArray class:
//NumArray(int[] nums) Initializes the object with the integer array nums.
//int sumRange(int left, int right) Returns the sum of the elements of nums between indices left and right inclusive (i.e. nums[left] + nums[left + 1] + ... + nums[right]).
package prefixSum;

import java.util.Arrays;

public class SumRange {
    int[] arr;
    public SumRange(int[] nums) {
        arr=Arrays.copyOf(nums,nums.length);//deep copy
        for(int i=1; i<nums.length;i++){
            arr[i]+=arr[i-1];
        }
    }
    
    public int sumRange(int left, int right) {
        if(left==0) 
            return arr[right];
        return arr[right]-arr[left-1];
    }
}
/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */