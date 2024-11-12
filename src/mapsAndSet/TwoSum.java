//1. Two Sum
//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.
package mapsAndSet;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = {-1,-1};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int rem = target-nums[i];
            if(map.containsKey(rem)){
                ans[0]=i;
                ans[1]=map.get(rem);
                break;
            }
            else map.put(nums[i],i);
        } 
        return ans;
    }
}