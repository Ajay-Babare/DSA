package recursion;

public class ArrayTraversal {
	public static void printArr(int i, int[]arr) {
		if(i==arr.length)
			return;
		System.out.print(arr[i]);
		printArr(i+1,arr);
	}
	public static void main(String[] args) {
		int arr[]= {4,3,5,2,1};
		printArr(0,arr);
	}

}
