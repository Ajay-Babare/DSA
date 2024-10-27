//155. Min Stack
//Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
//Implement the MinStack class:
//MinStack() initializes the stack object.
//void push(int val) pushes the element val onto the stack.
//void pop() removes the element on the top of the stack.
//int top() gets the top element of the stack.
//int getMin() retrieves the minimum element in the stack.
//You must implement a solution with O(1) time complexity for each function.

package stack;
import java.util.Stack;
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
public class MinStack {
    Stack<Long> st = new Stack<>();
    long min=-1;

    public MinStack() {
        //constructor   
    }
    
    public void push(int val) {
        long x = (long) val;
        if(st.size()==0){
            st.push(x);
            min=x;
        }
        else if(x>=min){
            st.push(x);
        }
        else if(x<=min){
            st.push(2*x-min);
            min=x;
        }
    }
    
    public void pop() {
        if(st.size()==0) return;
        else if(st.peek()>=min) st.pop();
        else if(st.peek()<min){//peek pe fake value padi hai
        //restore the old min
        long old = 2*min-st.peek();
        min=old;
        st.pop();
        }
    }
    
    public int top() {
        if(st.size()==0) return -1;
        long q = st.peek();
        if(q>=min) return (int)(q);
        if(q<min) return (int)min;
        return 0;
    }
    
    public int getMin() {
        if(st.size()==0) return -1;
        return (int)min;
    }
}
