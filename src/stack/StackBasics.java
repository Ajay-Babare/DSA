package stack;

import java.util.Stack;

public class StackBasics {
	public static void RecDisplay(Stack<Integer> st) {
		if(st.isEmpty()) return;
		int top=st.pop();
		RecDisplay(st);
		System.out.println("r: "+top);
		st.push(top);
		
	}
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
         System.out.println(st.isEmpty());
         st.push(10);
         st.push(20);
         st.push(30);
         st.push(40);
//         System.out.println(st.isEmpty());
//         System.out.println(st);
//         System.out.println(st.peek());
//         System.out.println(st);
//         System.out.println(st.pop());
         System.out.println(st);
         
         //ReverseStack
         Stack<Integer> stReverse = new Stack<>();
         while(!st.isEmpty()) {
        	 stReverse.push(st.pop());
         }
         System.out.println(stReverse);
         
         //Copy Stack taken tempStack(ReverseStack)
         Stack<Integer> stCopy = new Stack<>();
         while(!stReverse.isEmpty()) {
        	 stCopy.push(stReverse.pop());
         }
         System.out.println(stCopy);

         //Insert at Index need temp Stack
         int index=2;
         Stack<Integer> temp = new Stack<>();
         while(stCopy.size()>index) {
        	 temp.push(stCopy.pop());
         }
         stCopy.push(123);
         while(temp.size()>0) {
        	 stCopy.push(temp.pop());
         }
         System.out.println(stCopy);
         RecDisplay(stCopy);
         
     }
}
