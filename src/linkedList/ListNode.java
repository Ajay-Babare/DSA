package linkedList;


public class ListNode {
	public static void printList(Node head) {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.val+" ");
			temp =temp.next;
		}
		
	}

	public static void displayRecursive(Node head) {
		//Base Case
		if(head== null)
			return;
		System.out.print(head.val+" ");
		displayRecursive(head.next);
	}
	public static void main(String[] args) {
		Node a = new Node(10);
		Node b = new Node(20);
		Node c = new Node(30);
		Node d = new Node(40);

		a.next = b;
		b.next = c;
		c.next = d;
		
		printList(a);
		System.out.println();
		displayRecursive(a);
		
//		System.out.println(a.val);
//		System.out.println(a.next.val);
//		System.out.println(a.next.next.val);
//		System.out.println(a.next.next.next.val);

	}

}
