//LeetCode 283. Move Zeroes
//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//Note that you must do this in-place without making a copy of the array.

package basicSorting.bubbleSort;
//TC = O(n^2)
//SC = O(1)
import java.util.Arrays;

public class MoveZeroes {
	//Approach
	public static void moveZeroes(int[] nums) {
        int noz = 0;
        for(int ele : nums){
            if(ele == 0)
                noz++;
        }
        for(int i=0; i<noz; i++){
            for(int j=0; j<nums.length-1-i;j++){
                if(nums[j]==0){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }
	public static void main(String[] args) {
		int[] arr = {5,1,0,4,2,0,6,};
		moveZeroes(arr);
		System.out.println(Arrays.toString(arr));
	}

}
