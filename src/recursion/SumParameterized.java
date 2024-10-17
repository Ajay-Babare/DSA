package recursion;

public class SumParameterized {
	public static void sumParameterized(int n , int sum) {
		//Base Case
		if(n==0) {
			System.out.println(sum);
			return;
		}
		//Recursive Call & Work
		sumParameterized(n-1,sum+n);
	}
	public static void main(String[] args) {
		int n = 5;
		sumParameterized(n,0);
	}
}
