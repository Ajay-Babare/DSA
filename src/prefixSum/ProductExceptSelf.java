//238. Product of Array Except Self
//Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
//The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
//You must write an algorithm that runs in O(n) time and without using the division operation.
package prefixSum;

public class ProductExceptSelf {
	
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefixProduct = new int[n]; 
        prefixProduct[0]=1;
        for(int i=1;i<n;i++){
            prefixProduct[i] = nums[i-1]*prefixProduct[i-1];
        }
        int[] suffixProduct = new int[n];
        suffixProduct[n-1]=1;
        for(int i=n-2;i>=0;i--){
            suffixProduct[i] = nums[i+1]*suffixProduct[i+1];
        } 
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            ans[i] = prefixProduct[i]*suffixProduct[i];
        } 
        return ans;
    }
}
