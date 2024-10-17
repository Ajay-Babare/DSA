package recursion;

public class PowerLog {
	public static int powLog(int a, int b) {
		//base case
		if(b==0)
			return 1;
		//recursive call
		int ans = powLog(a,b/2);
		//self work
		return (b%2==0) ? ans*ans : ans*ans*a;
	}
	public static void main(String[] args) {
		System.out.println(powLog(2,7));
	}
}
