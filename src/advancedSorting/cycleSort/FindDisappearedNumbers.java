//448. Find All Numbers Disappeared in an Array
//Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.
package advancedSorting.cycleSort;

import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumbers {
	
    public static void swap(int a, int b, int[] arr){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        int i=0;
        while(i<n){
            int ele = nums[i];//ele should be at ele-1 index
            if(nums[i]==i+1 || nums[i]==nums[ele-1])
                i++;
            else
                swap(i,ele-1,nums);
        }
            List<Integer> ans = new ArrayList<>();
        for(i=0;i<n;i++){
            if(nums[i]!=i+1)
                ans.add(i+1);
        }
        return ans;
    }
	public static void main(String[] args) {
		int arr[] = {4,3,2,7,8,2,3,1};
		System.out.println(findDisappearedNumbers(arr));
	}

}
