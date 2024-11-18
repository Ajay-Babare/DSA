package slidingWindow;

public class maximumSumSubArraySizeK {

	public static void main(String[] args) {
		int arr[] = {10,20,1,3,-40,80,10};
		int n = arr.length;
		int k=2;
		int i=0;
		int j=k-1;
		int sum=0;
		int maxSum=0;
		for(int a=i;a<=k-1;a++) {
			sum+=arr[a];
		}
		i++;
		j++;
		while(j<n) {//n-k times
			sum = sum - arr[i-1]+ arr[j];
			maxSum = Math.max(maxSum, sum);
			i++; j++;
		}
		System.out.println(maxSum);
	}

}
