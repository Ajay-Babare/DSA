//41. First Missing Positive
//Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.
//You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.
package advancedSorting.cycleSort;

public class FirstMissingPositive {
	
    public static void swap(int a, int b, int[] nums){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int i = 0;
        while(i<n){
            int ele = nums[i];
            if(ele==i+1 || ele <= 0 || ele > n || ele == nums[ele-1])
                i++;
            else
                swap(i,ele-1,nums);
        }
        for(i=0;i<n;i++){
            if(nums[i]!=i+1)
                return i+1;
        }
        return i+1;
    }
	public static void main(String[] args) {
		int[] nums = {3,4,-1,1};
		System.out.println(firstMissingPositive(nums));
	}

}
