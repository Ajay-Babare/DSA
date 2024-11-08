package tree;

import java.util.Scanner;

public class NthLevel {
 static int n;
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
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n :");
		 n = sc.nextInt();
		nthLevel(a,0);	
		System.out.println();
		
//		for(int x=0;x<3;x++) {
//			n=x;
//			nthLevel(a,0);	
//			System.out.println();
//		}
	}	
	public static void nthLevel(Node root,int level) {
		if(root==null) return; //base case
		if(level == n)System.out.print(root.val+" "); 
		nthLevel(root.left,level+1);
		nthLevel(root.right,level+1);
	}
}
