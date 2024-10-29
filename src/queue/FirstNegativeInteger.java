package queue;

import java.util.*;

public class FirstNegativeInteger {
	
	public static long[] printFirstNegativeInteger(long[] A, int N, int K) {
		long[] res = new long[N-K+1];
		Queue<Integer> q = new LinkedList<>();
		
		for(int i=0; i<N;i++) {//adding -ve value indices
			if(A[i]<0) {
				q.add(i);
			}
		}
		for(int i=0;i<N-K+1;i++) {
			if(q.size()>0 && q.peek()<i) q.remove();
			
			if(q.size()>0 && q.peek()<=i+K-1) {
				res[i] = A[q.peek()];
			}
			else if(q.size()==0) res[i]=0;
			else res[i]=0;
		}
		return res;
	}
	
	public static void main(String[] args) {
		int N = 8;
		long[] A = {12,-1,-7,8,-15,30,16,28};
		int K =3;
		long[] ans = printFirstNegativeInteger(A,N,K);
		System.out.println(Arrays.toString(ans));
	}

}
