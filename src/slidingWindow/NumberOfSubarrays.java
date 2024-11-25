//1248. Count Number of Nice Subarrays
//Given an array of integers nums and an integer k. A continuous subarray is called nice if there are k odd numbers on it.
//Return the number of nice sub-arrays.
package slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class NumberOfSubarrays {
	//Aproach 1
    public int numberOfSubarrays(int[] arr, int k) {
        int i = 0, j = 0, a = 0, b = 0, n = arr.length, k2 = 0;
        int count = 0;
        while(i<n && arr[i]%2==0) i++;
        while (j<n && k2<k) if(arr[j++]%2!=0) k2++;
        if(k2<k)return 0;
        j--;
        b=j+1;
        while(b<n && arr[b]%2==0)b++;
        b--;
        while(b<n) {//sliding window
        	count+=(i-a+1)*(b-j+1);//math
        	a=i+1;
        	i++;
        	while(i<n && arr[i]%2==0) i++;
        	j=b+1;
        	b=j+1;
        	while(b<n && arr[b]%2==0)b++;
        	b--;
        }
        return count;
    }
    //Approach 2
    public int numberOfSubarrays1(int[] arr, int k) {
    	int n = arr.length,count = 0;
    	for(int i=0;i<n;i++) arr[i]%=2;
    	for(int i=1;i<n;i++) arr[i] += arr[i-1];
    	Map<Integer,Integer> map = new HashMap<>();
    	for(int i=0;i<n;i++) {
    		if(!map.containsKey(arr[i])) map.put(arr[i], i);
    		int a = 0;
    		if(map.containsKey(arr[i]-k)) a=map.get(arr[i]-k);
    		int b=0;
    		if(map.containsKey(arr[i]-k+1)) b=map.get(arr[i]-k+1);
    		if(arr[i]==k)count += (b-a+1);
    		if(arr[i]>k) count += (b-a);
    	}
    	return count;
    }
}
