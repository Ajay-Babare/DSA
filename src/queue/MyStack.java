//225. Implement Stack using Queues
//Implement a last-in-first-out (LIFO) stack using only two queues. The implemented stack should support all the functions of a normal stack (push, top, pop, and empty).
//Implement the MyStack class:
//void push(int x) Pushes element x to the top of the stack.
//int pop() Removes the element on the top of the stack and returns it.
//int top() Returns the element on the top of the stack.
//boolean empty() Returns true if the stack is empty, false otherwise.
//Notes:
//You must use only standard operations of a queue, which means that only push to back, peek/pop from front, size and is empty operations are valid.
//Depending on your language, the queue may not be supported natively. You may simulate a queue using a list or deque (double-ended queue) as long as you use only a queue's standard operations.
 
package queue;

import java.util.*;

public class MyStack {
    Queue <Integer> q = new LinkedList<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
        q.add(x);
    }
    
    public int pop() {
        for(int i=1;i<=q.size()-1;i++){
            q.add(q.remove());
        }
        return q.remove();
    }
    
    public int top() {
        for(int i=1;i<=q.size()-1;i++){
            q.add(q.remove());
        }
        int x = q.peek();
        q.add(q.remove());
        return x;
    }
    
    public boolean empty() {
        if(q.size()==0) return true;
        else return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */