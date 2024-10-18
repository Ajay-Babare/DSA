package recursion;

public class Subset1 {
	public static void subset(int i, String s, String ans) {
		if(i==s.length()) {
			System.out.println(ans);
			return;
		}
		char ch = s.charAt(i);
		subset(i+1,s,ans);//not take
		subset(i+1,s,ans+ch);//take
		
	}
	public static void main(String[] args) {
		String s = "abc";
		subset(0,s,"");
	}

}
