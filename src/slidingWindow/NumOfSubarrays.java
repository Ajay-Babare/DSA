//1343. Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold
//Given an array of integers arr and two integers k and threshold, return the number of sub-arrays of size k and average greater than or equal to threshold.
package slidingWindow;

public class NumOfSubarrays {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;
        int sum = 0;
        int i=0;
        int j=k-1;
        int count=0;
        for(int a=0; a<=k-1; a++){
            sum = sum + arr[a];
        }
        if(sum/k>=threshold) count++;
        i++; j++;
        while(j<n){
            sum = sum - arr[i-1] + arr[j];
            if(sum/k>=threshold) count++;
            i++; j++;
        }
        return count;
    }
}
