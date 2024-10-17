package recursion;

public class FibonacciNumber {
	public static int fibo(int n) {
		//base case
		if(n<=1)
			return n;
		//recursive call + recursive call
		return fibo(n-1)+fibo(n-2);
	}
	public static void main(String[] args) {
		System.out.println(fibo(4));
	}
}
