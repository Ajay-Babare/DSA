package recursion;

public class Factorial {

	public static int fact(int n) {
		//base case
		if(n==1 || n==0)
			return 1;
		//self work * recursive call(parameter must to hit base case)
		return n*fact(n-1); 
	}
	public static void main(String[] args) {
		int n = 5;
		System.out.println("Factorial : "+fact(n));
	}
}
