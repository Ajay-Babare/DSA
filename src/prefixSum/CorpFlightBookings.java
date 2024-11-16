//1109. Corporate Flight Bookings
//There are n flights that are labeled from 1 to n.
//You are given an array of flight bookings bookings, where bookings[i] = [firsti, lasti, seatsi] represents a booking for flights firsti through lasti (inclusive) with seatsi seats reserved for each flight in the range.
//Return an array answer of length n, where answer[i] is the total number of seats reserved for flight i.
package prefixSum;

public class CorpFlightBookings {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int ans[] = new int[n];
        for(int i=0;i<bookings.length;i++){
            int first= bookings[i][0];
            int last= bookings[i][1];
            int seats= bookings[i][2];
            ans[first-1]+=seats;
            if(last<n) ans[last]-=seats; 
        }
        for(int i=1;i<n;i++){
            ans[i]+=ans[i-1];
        }
        return ans;
    }
}
