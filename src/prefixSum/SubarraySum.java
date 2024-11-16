//560. Subarray Sum Equals K
//Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
//A subarray is a contiguous non-empty sequence of elements within an array.
package prefixSum;

import java.util.HashMap;
import java.util.Map;

public class SubarraySum {
    public int subarraySum(int[] nums, int k) {
        int count = 0, n = nums.length;
        //PrefixSum
        for(int i=1; i<n; i++) {
        	nums[i]+=nums[i-1];
        }
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<n; i++) {
        	int ele = nums[i];
        	if(ele==k) count++;
        	int rem = ele - k;
        	if(map.containsKey(rem)) count+=map.get(rem);
        	if(map.containsKey(ele)) {
        		int freq = map.get(ele);
        		map.put(ele, freq+1);
        	}
        	else map.put(ele, 1);
        }
        return count;
    }
}
