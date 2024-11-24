//1052. Grumpy Bookstore Owner
//There is a bookstore owner that has a store open for n minutes. You are given an integer array customers of length n where customers[i] is the number of the customers that enter the store at the start of the ith minute and all those customers leave after the end of that minute.
//During certain minutes, the bookstore owner is grumpy. You are given a binary array grumpy where grumpy[i] is 1 if the bookstore owner is grumpy during the ith minute, and is 0 otherwise.
//When the bookstore owner is grumpy, the customers entering during that minute are not satisfied. Otherwise, they are satisfied.
//The bookstore owner knows a secret technique to remain not grumpy for minutes consecutive minutes, but this technique can only be used once.
//Return the maximum number of customers that can be satisfied throughout the day.
package slidingWindow;

public class MaxSatisfied {
    public int maxSatisfied(int[] arr, int[] grumpy, int k) {
        int n = arr.length, i = 0, j = k-1, unsatisfied = 0;
        int a = i, b = j, maxUnsatisfied = 0;
        for(int x=i;x<=j;x++){
            if(grumpy[x]==1) unsatisfied +=arr[x];
        }
        while(j<n){
            if(maxUnsatisfied<unsatisfied){
                maxUnsatisfied = unsatisfied;
                a=i;b=j;
            }
            i++;j++;
            if(j<n && grumpy[j]==1) unsatisfied += arr[j];
            if(grumpy[i-1]==1) unsatisfied -= arr[i-1];
        }
        for(int x=a;x<=b;x++){
            grumpy[x] = 0;
        }
        int satisfied = 0;
        for(int x=0;x<n;x++){
            if(grumpy[x]==0) satisfied += arr[x];
        }
        return satisfied;
    }
}
