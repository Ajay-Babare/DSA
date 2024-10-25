package stack;

import java.util.Arrays;
import java.util.Stack;
public class NextGreaterElement {
	public static long[] nextLargerElement(long[] arr, int n){
		
		long[] output = new long[n];
		output[n-1] = -1;
		Stack<Long> st = new Stack<>();
		st.push(arr[n-1]);
		
		for(int i = n-2; i>=0;i--) {
			while(!st.isEmpty()&& st.peek()<=arr[i])
				st.pop();
			output[i] = st.isEmpty()? -1 : st.peek();
			st.push(arr[i]);
		}
		return output;
	}
	public static void main(String[] args) {
		int n=4;
		long[] arr= {1,2,3,4};
		long[] ans = nextLargerElement(arr,n);
		System.out.println(Arrays.toString(ans));
	}

}
