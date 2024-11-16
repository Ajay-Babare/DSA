//2483. Minimum Penalty for a Shop
//You are given the customer visit log of a shop represented by a 0-indexed string customers consisting only of characters 'N' and 'Y':
//if the ith character is 'Y', it means that customers come at the ith hour
//whereas 'N' indicates that no customers come at the ith hour.
//If the shop closes at the jth hour (0 <= j <= n), the penalty is calculated as follows:
//For every hour when the shop is open and no customers come, the penalty increases by 1.
//For every hour when the shop is closed and customers come, the penalty increases by 1.
//Return the earliest hour at which the shop must be closed to incur a minimum penalty.
//Note that if a shop closes at the jth hour, it means the shop is closed at the hour j.
package prefixSum;

public class BestClosingTime {
    public int bestClosingTime(String customers) {
        int n = customers.length();
        int[] pre = new int[n+1];
        for(int i=1; i<=n;i++) {
        	pre[i] = pre[i-1];
        	if(customers.charAt(i-1)=='N') pre[i] += 1;
        }
        int[] suf = new int[n+1];
        for(int i=n-1;i>=0;i--) {
        	suf[i]=suf[i+1];
        	if(customers.charAt(i)=='Y') suf[i] +=1;
        }
        int min = n+5;
        for(int i=0;i<=n;i++) {
        	pre[i] += suf[i];
        	min = Math.min(min, pre[i]);
        }
        for(int i=0;i<=n;i++) {
        	if(pre[i]==min) return i;
        }
        return 3525;
    }
}