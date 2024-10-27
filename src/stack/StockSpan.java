package stack;
import java.util.Stack;

public class StockSpan {
	public static int[] calculateSpan(int price[], int n) {
		int[] arr = new int[n];
		
		Stack<Integer> st = new Stack<>();
		st.push(0);
		for(int i=0;i<n;i++) {
			while(!st.isEmpty() && price[i] >= price[st.peek()])
				st.pop();
			if(st.isEmpty())
				arr[i]=i+1;
			else
				arr[i]=i-st.peek();
			st.push(i);
		}
		return arr;
	}
}
