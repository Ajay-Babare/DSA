package recursion;

public class BinaryStrings {
	public static void binaryString(String s, int n) {
		int m = s.length();
		//Base case
		if(m==n) {
			System.out.println(s);
			return;
		}
		//Recursive call on condition
		if(m==0 || s.charAt(m-1)=='0') {
			binaryString(s+0,n);
			binaryString(s+1,n);			
		}
		else
		binaryString(s+0,n);			
	}
	public static void main(String[] args) {
		binaryString("",3);
	}

}
