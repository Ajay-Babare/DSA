package recursion;

public class PrintIncreasing {
	public static void printIncreasing(int n) {
		//Base Case
		if(n==0)
			return;
		//Recursive Call
		printIncreasing(n-1);
		//Self Work
		System.out.println(n);
		
	}
	public static void main(String[] args) {
		int n = 5;
		printIncreasing(n);
	}

}
