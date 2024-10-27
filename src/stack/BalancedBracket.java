package stack;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBracket {

	public static boolean isBalanced(String str) {
			Stack<Character> st = new Stack<>();
			int n = str.length();
			//Traverse String
			for(int i=0; i<n;i++) {
				char ch =str.charAt(i);
				if(ch=='(')
					st.push(ch);
				else{//ch==')'
					if(st.size()==0) return false;
					if(st.peek()=='(')
						st.pop();
				}
			}
			if(st.size()>0) return false;
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Input ");
		String str = sc.nextLine();
		System.out.println(isBalanced(str));
	}



}
