package stack;

class AStack{
	 int[] arr = new int[5];
	 int idx = 0;
	
	void push(int x) {
		if(isFull()) return;
		arr[idx++]=x;
	}
	int pop() {
		if(isEmpty()) return -1;
		int top = arr[idx-1];
		idx--;
		return top ;
	}
	int peek() {
		if(isEmpty())return -1;
		return arr[idx-1] ;
	}
	int size() {
		return idx;
	}
	boolean isFull() {
		if(idx==arr.length)
			return true;
		return false;
	}
	boolean isEmpty() {
		if(idx==0)
			return true;
		return false;
	}
	void display() {
		for(int i=0;i<=idx-1;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
}
public class ArrayImplementation {

	public static void main(String[] args) {
		System.out.println("disp");
		AStack st = new AStack();
		st.push(11);
		st.push(22);
		st.push(33);
		st.push(44);
		st.display();
		System.out.println(st.peek());
		System.out.println(st.pop());
		st.display();
		System.out.println(st.size());
		System.out.println(st.isFull());
		System.out.println(st.isEmpty());
	}

}
