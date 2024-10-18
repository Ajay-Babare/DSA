package recursion;

import java.util.ArrayList;

public class Subset3 {
	static ArrayList<String> arr = new ArrayList<>();//global
	public static void subset(int i, String s, String ans) {
		if(i==s.length()) {
			arr.add(ans);
			return;
		}
		subset(i+1,s,ans);// not take 
		ans+=s.charAt(i);
		subset(i+1,s,ans);// take
	}
	public static void main(String[] args) {
		String s= "abcd";
		arr= new ArrayList<>();//reset
		subset(0,s,"");
		System.out.println(arr);
		
	}

}
