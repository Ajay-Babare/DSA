package recursion;

public class PrintDecreasing {
	public static void printDecreasing(int n) {
		//Base case
		if(n==0)
			return ;
		//self work
		System.out.println(n);
		//recursive call
		printDecreasing(n-1);
	}
	public static void main(String[] args) {
		int n = 5;
		printDecreasing(n);
	}

}
