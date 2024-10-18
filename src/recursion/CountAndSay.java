package recursion;

public class CountAndSay {
	public static String countAndSay(int n) {
		//Base Case
		
		if(n==1)
			return "1";
		String s = countAndSay(n-1)+"@";
		//we have to modify s
		String ans="";
		int i=0;
		int j=0;
		while(j<s.length()) {
			if(s.charAt(i)==s.charAt(j))
				j++;
			else {
				int len=j-i;
				ans+=len;
				ans+=s.charAt(i);
				i=j;
			}
		}
		//for last set or we can do by adding extra special character to increase string s length by 1 above
//		int len=j-i;
//		ans+=len;
//		ans+=s.charAt(i);
		return ans;
	}
	public static void main(String[] args) {
		int n = 4;
		System.out.println(countAndSay(n));
	}

}
