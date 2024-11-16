//2389. Longest Subsequence With Limited Sum
//You are given an integer array nums of length n, and an integer array queries of length m.
//Return an array answer of length m where answer[i] is the maximum size of a subsequence that you can take from nums such that the sum of its elements is less than or equal to queries[i].
//A subsequence is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements.
package prefixSum;

import java.util.Arrays;

public class AnswerQueries {
    public int[] answerQueries(int[] nums, int[] queries) {
        int n =nums.length;
        int m = queries.length;
        Arrays.sort(nums);
        for(int i=1;i<n;i++){
            nums[i]+=nums[i-1];
        }
        int ans[] = new int[m];
        for(int i=0;i<m;i++){
            int lo=0;int hi=n-1;
            while(lo<=hi){
                int mid=lo+(hi-lo)/2;
                if(nums[mid]>queries[i]) hi=mid-1;
                else{
                    ans[i]=Math.max(ans[i],mid+1);
                    lo=mid+1;
                }
            }
        }
        return ans;
    }
}
