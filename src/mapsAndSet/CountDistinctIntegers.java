//2442. Count Number of Distinct Integers After Reverse Operations
//You are given an array nums consisting of positive integers.
//You have to take each integer in the array, reverse its digits, and add it to the end of the array. You should apply this operation to the original integers in nums.
//Return the number of distinct integers in the final array.
package mapsAndSet;

import java.util.HashSet;

public class CountDistinctIntegers {
    public int reverse(int n){
        int r = 0;
        while(n!=0){
            r=r*10+n%10;
            n/=10;
        }
        return r;
    }
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length;i++){
            set.add(nums[i]);
            set.add(reverse(nums[i]));
        }
        return set.size();
    }
}
