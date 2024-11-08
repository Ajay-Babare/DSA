package queue;

import java.util.*;

public class ReOrderQueue {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		q.add(6);
		q.add(7);
		q.add(8);
		System.out.println(q);//1 2 3 4 5 6 7 8
		Stack<Integer> st = new Stack<>();
		int n = q.size();
		
		for(int i=1;i<=n/2;i++) {
			st.add(q.remove());
		}// 5 6 7 8       top 4 3 2 1
		while(st.size()>0) {
			q.add(st.pop());
		}// 5 6 7 8 4 3 2 1 
		for(int i=1;i<=n/2;i++) {
			st.add(q.remove());
		}// 4 3 2 1    top 8 7 6 5 
		while(st.size()>0) {
			//one by one 1st stack then queue
			q.add(st.pop());
			q.add(q.remove());
		} // 8 4 7 3 6 2 5 1
		for(int i=1;i<=n;i++) {
			st.add(q.remove());
		} //reverse the queue
		for(int i=1;i<=n;i++) {
			q.add(st.pop());
		} //add in queue
		System.out.println(q);
	}
}