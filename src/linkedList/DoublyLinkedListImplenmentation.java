package linkedList;
class dNode{
	int val;
	dNode next;
	dNode prev;
	dNode(int val){
		this.val=val;
	}
}
class DLL{
	dNode head;
	dNode tail;
	int size;
	void display() {
		dNode temp = head;
		while(temp!=null) {
			System.out.print(temp.val+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	void insertAtHead(int val) {
		dNode temp = new dNode(val);
		if(size==0)head=tail=temp;
		else {
			temp.next=head;
			head.prev=temp;
			head=temp;
		}
		size++;
	}
	void insertAtTail(int val) {
		dNode temp = new dNode(val);
		if(size==0) head=tail=temp;
		else {
			tail.next=temp;
			temp.prev=tail;
			tail=temp;
		}
		size++;
	}
	
	void insert(int index, int val) {
		if(index==0) {
			insertAtHead(val);
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
		dNode temp = new dNode(val);
		dNode x = head;
		for(int i=1;i<=index-1;i++) {
			x=x.next;
		}

		dNode y = x.next;
		x.next=temp; temp.prev=x;
		y.prev=temp; temp.next=y;
		size++;	
	}
	void deleteAtHead()throws Error {
		if(size==0)
			throw new Error("List is empty");
		head=head.next;
		head.prev=null;//extra
		size--;
	}
	void deleteAtTail()throws Error {
		if(size==0)
			throw new Error("List is empty");
		tail=tail.prev;
		tail.next=null;//extra
		size--;
	}
	void delete(int index) {
		if(index==0) {
			deleteAtHead();
			return;
		}
		if(index==size-1) {
			deleteAtTail();
			return;
		}
		if(index<0 ||index>=size) 
			throw new Error("Invalid Index");
		
		dNode temp=head;
		for(int i=1;i<=index-1;i++) {
			temp=temp.next;
		}		
		temp.next=temp.next.next;
		temp=temp.next;
		temp.prev=temp.prev.prev;//extra
		size--;
	}
}
public class DoublyLinkedListImplenmentation {
	public static void print(dNode head) {
		dNode temp=head;
		while(temp!=null) {
			System.out.print(temp.val+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	public static void printReverse(dNode tail) {
		dNode temp=tail;
		while(temp!=null) {
			System.out.print(temp.val+" ");
			temp=temp.prev;
		}
		System.out.println();
	}
	public static void display(dNode node) {
		dNode temp=node;
		while(temp.prev!=null) {
			temp=temp.prev;
		}
		//Now temp is at head
		print(temp);
	}
	public static void main(String[] args) {
		dNode a = new dNode(10);
		dNode b = new dNode(20);
		dNode c = new dNode(30);
		dNode d = new dNode(40);
		a.next=b; b.prev=a;
		b.next=c; c.prev=b;
		c.next=d; d.prev=c;
		print(a);
		printReverse(d);
		display(c);
		DLL list = new DLL();

		list.insertAtTail(100);
		list.display();
		list.insertAtTail(200);
		list.insertAtTail(300);
		list.insertAtTail(400);
		list.insertAtTail(500);
		list.display();
		System.out.println(list.size);
		list.insertAtHead(123);
		list.display();
		list.insert(2,222);
		list.display();
		list.deleteAtHead();
		list.display();
		list.deleteAtTail();
		list.display();
		list.delete(2);
		list.display();
	}

}
