//114. Flatten Binary Tree to Linked List
//Given the root of a binary tree, flatten the tree into a "linked list":
//The "linked list" should use the same TreeNode class where the right child pointer points to the next node in the list and the left child pointer is always null.
//The "linked list" should be in the same order as a pre-order traversal of the binary tree.
package binarySearchTree;

import java.util.ArrayList;
import java.util.List;

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
public class Flatten {
//Approach 1
	
//    public void preorder(TreeNode root, List<TreeNode> pre){
//        if(root == null) return;
//        pre.add(root);
//        preorder(root.left,pre);
//        preorder(root.right,pre);
//    }
//    public void flatten(TreeNode root) {
//        List<TreeNode> pre = new ArrayList<>();
//        preorder(root, pre);
//        int n = pre.size();
//        for(int i=0; i<n; i++){
//            if(i!=n-1) pre.get(i).right = pre.get(i+1);
//            pre.get(i).left = null;
//        }
//    }
	
//Approach 2:
//    public void flatten(TreeNode root) {
//        if(root == null) return;
//        if(root.left==null && root.right==null) return;
//        TreeNode lst= root.left;
//        TreeNode rst = root.right;
//        flatten(lst);
//        flatten(rst);
//        root.left=null;
//        root.right=lst;
//        TreeNode temp = root;
//        while(temp.right != null) temp = temp.right;
//        temp.right = rst;
//    }
	
// Approach 3: Like Morris Traversal
	   public void flatten(TreeNode root) {
	        TreeNode curr = root;
	        while(curr!=null){
	            if(curr.left!=null){
	                TreeNode r = curr.right;
	                curr.right = curr.left;
	                TreeNode pred = curr.left;
	                while(pred.right != null) pred = pred.right;
	                pred.right = r;
	                curr.left = null;//Important
	                curr = curr.right;
	            }
	            else{
	                curr = curr.right;
	            }
	        }
	    }	
}
