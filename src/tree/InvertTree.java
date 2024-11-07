//226. Invert Binary Tree
//Given the root of a binary tree, invert the tree, and return its root.
package tree;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class InvertTree {
	   public TreeNode invertTree(TreeNode root) {
	        if(root == null) return root;
	        if(root.left == null && root.right == null) return root;

	        TreeNode temp = root.left;
	        root.left = root.right;
	        root.right = temp;
	        
	        invertTree(root.left);
	        invertTree(root.right);
	        return root;
	    }
}
