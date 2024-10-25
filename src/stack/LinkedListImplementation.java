package stack;
class Node{
	int val;
	Node next;	
	Node(int val){
		this.val=val;
	}
}
class Stack{
	
	Node head= null;
	int size=0;
	
	void push(int x) {
		Node temp = new Node(x);
		temp.next=head;
		head=temp;
		size++;
	}
	int size() {
		return size;
	}
	int pop() {
		if(head==null) {
			System.out.println("Empty Stack");
			return -1;
		}
		int x = head.val;
		head=head.next;
		size--;
		return x;
	}
	int peek() {
		if(head==null) {
			System.out.println("Empty Stack");
			return -1;
		}
		return head.val;
	}
	boolean isEmpty() {
		if(size==0)
			return true;
		return false;
	}
	void display() {
		displayRec(head);
	}
	void displayRec(Node head) {
		Node temp = head;
		if(temp==null)
			return;
		displayRec(temp.next);
		System.out.println(temp.val);
		
	}
	
}
public class LinkedListImplementation {

	public static void main(String[] args) {
		Stack st = new Stack();
		st.push(100);
		st.push(200);
		st.push(300);
		st.push(400);
		st.display();
		System.out.println("Peek "+st.peek());
		System.out.println("Size "+st.size);
		System.out.println("Pop "+st.pop());
		System.out.println("Size "+st.size);
		st.display();
		System.out.println("IsEmpty: "+st.isEmpty());
		

	}

}
