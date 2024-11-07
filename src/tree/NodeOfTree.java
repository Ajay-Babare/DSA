package tree;

class Node{
	int val;
	Node left;
	Node right;
	Node(int val){
		this.val = val;
	}
}
public class NodeOfTree {

	public static void main(String[] args) {
		Node a = new Node(1);
		Node b = new Node(4);
		Node c = new Node(3);
		Node d = new Node(2);
		Node e = new Node(26);
		Node f = new Node(5);
		
		a.left=b; a.right=c;
		b.left=d; b.right=e;
		c.right=f;
//		System.out.println(a.left.right.val);//6
		display(a);
		System.out.println();
		System.out.println("Sum: "+sum(a));
		System.out.println("Max: "+max(a));
		System.out.println("Size: "+size(a));
		System.out.println("Levels: "+levels(a));
	}
	public static void display(Node root) {
		if(root==null) return; //base case
		System.out.print(root.val+" "); //self
		display(root.left);// left subtree
		display(root.right);//right subtree
	}
	private static int sum(Node root) {
		if(root==null) return 0; //base case
			return root.val+sum(root.left)+sum(root.right);
	}
	public static int max(Node root) {
		if(root==null)return Integer.MIN_VALUE;
		int a = root.val; int b=max(root.left); int c= max(root.right);
		return Math.max(a, Math.max(b, c));
	}
	public static int size(Node root) {
		if(root==null) return 0;
		return 1 + size(root.left)+size(root.right);
	}
	public static int levels(Node root) {
		if(root==null)return 0;
		return 1+Math.max(levels(root.left), levels(root.right));
	}
}
