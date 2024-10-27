//1944. Number of Visible People in a Queue
//There are n people standing in a queue, and they numbered from 0 to n - 1 in left to right order. You are given an array heights of distinct integers where heights[i] represents the height of the ith person.
//A person can see another person to their right in the queue if everybody in between is shorter than both of them. More formally, the ith person can see the jth person if i < j and min(heights[i], heights[j]) > max(heights[i+1], heights[i+2], ..., heights[j-1]).
//Return an array answer of length n where answer[i] is the number of people the ith person can see to their right in the queue.
package stack;
import java.util.Stack;
public class CanSeePersonsCount {
    public int[] canSeePersonsCount(int[] heights) {
        int n = heights.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<Integer>();
        for(int i=0; i<n; i++){
            while(!st.isEmpty() && heights[st.peek()] <= heights[i]){
                res[st.peek()]++;
                st.pop();
            }
            if(!st.isEmpty()){
                res[st.peek()]++;
            }
            st.push(i);
        }
        return res;
    }
}
