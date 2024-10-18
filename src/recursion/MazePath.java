package recursion;

public class MazePath {
	//Approach1
	public static int maze1(int row, int col, int m, int n) {
		//base case
		if(row==m||col==n)
			return 1;
		//recursive call
		int rightways = maze1(row, col+1, m, n);
		int downways = maze1(row+1, col,m,n);
		//self work
		return rightways+downways;
	}
	//Approach2
	public static int maze2(int m, int n) {
		//base case
		if(m==1||n==1)
			return 1;
		//recursive call
		int rightways = maze2(m, n-1);
		int downways = maze2(m-1,n);
		//self work
		return rightways+downways;	
	}
	public static void main(String[] args) {
		System.out.println(maze1(1,1,4,4));
		System.out.println(maze2(4,4));
	}
}
