//22. Generate Parentheses
//Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

package recursion;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
	public static List<String> ans;
	
	public static List<String> generateParentheses(int open, int close,int n, String s ) {
		if(s.length()==2*n) {
			ans.add(s);
			return ans ;
		}
		if(open<n)
			generateParentheses(open+1,close,n,s+"(");
		if(close<open)
			generateParentheses(open,close+1,n,s+")");
		return ans;
	}
	
	public static void main(String[] args) {
		ans=new ArrayList<>();
		int n =3;
		System.out.println(generateParentheses(0,0,n,""));
	}
}
