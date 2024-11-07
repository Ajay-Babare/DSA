package tree;

public class Traversal {

	public static void main(String[] args) {
		Node a = new Node(1);
		Node b = new Node(4);
		Node c = new Node(3);
		Node d = new Node(2);
		Node e = new Node(26);
		Node f = new Node(5);
		Node g = new Node(5);
		
		a.left=b; a.right=c;
		b.left=d; b.right=e;
		c.left=f; c.right=g;
		
		System.out.println("PreOrder Traversal: ");
		preOrder(a);
		System.out.println();
		System.out.println("InOrder Traversal: ");
		inOrder(a);		
		System.out.println();
		System.out.println("PostOrder Traversal: ");
		postOrder(a);
	}

	public static void preOrder(Node root) {
		if(root==null) return;
		System.out.print(root.val+" ");  
		preOrder(root.left);
		preOrder(root.right);
	}
	public static void inOrder(Node root) {
		if(root==null) return;
		inOrder(root.left);
		System.out.print(root.val+" ");  
		inOrder(root.right);
	}
	public static void postOrder(Node root) {
		if(root==null) return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.val+" ");  
	}
}
