package tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

	static class Pair{
		Node node;
		int level;
		Pair(Node node, int level){
			this.node = node;
			this.level = level;
		}
	}
	
	public static void main(String[] args) {
		Node a = new Node(1);
		Node b = new Node(4);
		Node c = new Node(3);
		Node d = new Node(2);
		Node e = new Node(6);
		Node f = new Node(5);
		Node g = new Node(7);
		
		a.left=b; a.right=c;
		b.left=d; b.right=e;
		c.left=f; c.right=g;
		System.out.print("Level Order Traversal: ");// 1 4 3 2 6 5 7
		levelOrder(a);
		System.out.println("Level Order structure: ");
		levelOrderTraversal(a);
	}
	public static void levelOrder(Node root) {
		Queue<Node> queue = new LinkedList<>();
		if(root != null) queue.add(root);
		while(queue.size()>0) {
			Node front = queue.remove();
			System.out.print(front.val+" ");
			if(front.left != null)queue.add(front.left);
			if(front.right!= null) queue.add(front.right);		
		}
		System.out.println();
	}
	
	public static void levelOrderTraversal(Node root) {
		int prevLevel=0;
		Queue<Pair> queue = new LinkedList<>();
		if(root != null) queue.add(new Pair(root, 0));
		while(queue.size()>0) {
			Pair front = queue.remove();
			Node temp = front.node;
			int lvl = front.level;
			if(lvl!=prevLevel) {
				System.out.println();
				prevLevel++;
			}
			System.out.print(temp.val+" ");
			if(temp.left != null)queue.add(new Pair(temp.left,lvl+1));
			if(temp.right!= null)queue.add(new Pair(temp.right,lvl+1));		
		}
		System.out.println();
	}

}
