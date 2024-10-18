package recursion;

public class PreInPost {
	public static void pip(int n) {
		//Base Case
		if(n==0)
			return;
		//Pre
		System.out.print(n);
		pip(n-1);
		//In
		System.out.print(n);
		pip(n-1);
		//Post
		System.out.print(n);
	}
	public static void main(String[] args) {
		pip(3);
	}

}
