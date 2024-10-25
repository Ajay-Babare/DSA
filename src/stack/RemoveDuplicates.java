//1047. Remove All Adjacent Duplicates In String
//You are given a string s consisting of lowercase English letters. A duplicate removal consists of choosing two adjacent and equal letters and removing them.
//We repeatedly make duplicate removals on s until we no longer can.
//Return the final string after all such duplicate removals have been made. It can be proven that the answer is unique.
package stack;
import java.util.Stack;

public class RemoveDuplicates {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<Character>();
        for(char c : s.toCharArray()){
            if(!st.isEmpty() && c == st.peek())
                st.pop();
            else
                st.push(c);
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty())
            sb.append(st.pop());

        return sb.reverse().toString();
    }
}
