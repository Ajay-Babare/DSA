package recursion;

public class StringTravesal {
	public static void stringTravesal(int i, String s) {
		if(i==s.length()) 
			return;
		System.out.print(s.charAt(i));
		stringTravesal(i+1,s);
	}
	public static void main(String[] args) {
		stringTravesal(0,"Ajay Babare");
	}

}
