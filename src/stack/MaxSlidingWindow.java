//239. Sliding Window Maximum
//You are given an array of integers nums, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position.
//Return the max sliding window.
package stack;
import java.util.Arrays;
import java.util.Stack;

public class MaxSlidingWindow {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        //n-(k-1) =n-k+1;
        int[] ans = new int[n-k+1];
        int z = 0;
        Stack<Integer> st = new Stack<>();
        int[] nge = new int[n];
        st.push(n-1);
        nge[n-1]=n;
        for(int i=n-2;i>=0;i--){
            while(st.size()>0 && nums[i]>nums[st.peek()])
                st.pop();
            if(st.size()==0)
                nge[i]=n;
            else
                nge[i]=st.peek();
            st.push(i);
        }
        int j=0;
        for(int i=0; i<n-k+1;i++){
            if(j>=i+k) j=i;
            int max = nums[j];
            while(j<i+k){
                max=nums[j];
                j=nge[j];
            }
            ans[z++]=max;
        }
        return ans;
    }
	public static void main(String[] args) {
		int[] nums = {1,3,-1,-3,5,3,6,7};
		int k = 3;
		int ans[] = maxSlidingWindow(nums,k);
		System.out.println(Arrays.toString(ans));
	}
}
