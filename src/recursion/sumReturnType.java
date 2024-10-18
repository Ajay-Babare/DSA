package recursion;

public class SumReturnType {

	public static int sum(int n) {
		//Base Case
		if(n==0 || n==1)
			return n;
		//self work + Recursive Call
		return n+sum(n-1);
	}
	public static void main(String[] args) {
		int n = 10;
		System.out.println(sum(n));
	}

}
