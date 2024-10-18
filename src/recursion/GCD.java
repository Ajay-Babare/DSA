package recursion;

public class GCD {
	public static int gcd(int a, int b) {
		//Base Case
		if(b%a==0)
			return a;
		//Recursive Call
		return gcd(b%a,a);
	}
	public static void main(String[] args) {
		System.out.println(gcd(30, 96));
	}
}
