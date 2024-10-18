package recursion;

public class PowerLinear {
	public static int pow(int a, int b) {
		//base case
		if(b==0)
			return 1; 
		//self work * recursive call
		return a*pow(a,b-1);
	}
	public static void main(String[] args) {
		System.out.println(pow(2,5));
	}
}
