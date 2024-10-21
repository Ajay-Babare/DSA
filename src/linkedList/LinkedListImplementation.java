package linkedList;

class Node{
	int val;
	Node next;
	
	Node(int val){
		this.val = val;
	}
}

class SLL{
	private Node head;
	private Node tail;
	private int size;
	
	void insertAtTail(int val) {
		Node temp = new Node(val);
		if(head==null)
			head = tail = temp;
		else {
			tail.next=temp;
			tail=temp;
		}
		size++;
	}
	void inserAtHead(int val) {
		Node temp = new Node(val);
		if(head==null)
			head=tail=temp;
		else {
			temp.next=head;
			head = temp;
		}
		size++;
	}
	void insert(int index, int val) {
		if(index==0) {
			inserAtHead(val);
			return;
		}
		if(index==size) {
			insertAtTail(val);
			return;
		}
		if(index>size ||index<0) {
			System.out.println("Invaid Index");
			return;
		}
		Node temp = new Node(val);
		Node x = head;
		for(int i=1;i<=index-1;i++) {
			x=x.next;
		}
		temp.next=x.next;
		x.next=temp;
		size++;	
	}
	int get (int index) {
		if(index==size-1)
			return tail.val;
		if(index<0 || index>size)
			throw new Error("Invalid Index give another Index");
		Node temp = head;
		for(int i=0; i<index;i++) {
			temp=temp.next;
		}
		return temp.val;
	}
	void set (int index, int val) {
		if(index==size-1)
			tail.val=val;
		if(index<0 || index>size)
			throw new Error("Invalid Index give another Index");
		Node temp = head;
		for(int i=0; i<index;i++) {
			temp=temp.next;
		}
		temp.val=val;
	}
	void deleteAtHead()throws Error {
		if(head==null)
			throw new Error("List is empty");
		head=head.next;
		size--;
	}
	void delete(int index) {
		if(index==0) {
			deleteAtHead();
			return;
		}
		if(index<0 ||index>size) 
			throw new Error("Invalid Index");
		
		Node temp=head;
		for(int i=1;i<=index-1;i++) {
			temp=temp.next;
		}
		
		if(temp.next==tail)
			tail=temp;
		
		temp.next=temp.next.next;
		size--;
	}
	void display() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.val+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	void size() {
		System.out.println("Size : "+size);
	}
}
public class LinkedListImplementation {

	public static void main(String[] args) {
		SLL ll = new SLL();
		ll.insertAtTail(10);
		ll.insertAtTail(20);
		ll.insertAtTail(30);
		ll.insertAtTail(40);
		ll.inserAtHead(50);
		ll.display();
		ll.insert(2, 80);
		ll.display();
		ll.insert(0, 1000);
		ll.display();
		ll.insert(7, 1);
		ll.display();
		ll.insert(12, 5);
		ll.display();
		ll.insert(-12, 5);
		ll.display();
		System.out.println(ll.get(7));
		ll.set(5, 22);
		ll.display();
		ll.deleteAtHead();
		ll.display();
		ll.delete(2);
		ll.display();
		ll.set(3, 22);
		ll.display();
	}

}
