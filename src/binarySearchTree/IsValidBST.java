//98. Validate Binary Search Tree
//Given the root of a binary tree, determine if it is a valid binary search tree (BST).
//A valid BST is defined as follows:
//The left 
//subtree
// of a node contains only nodes with keys less than the node's key.
//The right subtree of a node contains only nodes with keys greater than the node's key.
//Both the left and right subtrees must also be binary search trees.
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
public class IsValidBST {
	
	//Approach 1:
	
//    public long max(TreeNode root){
//        if(root == null) return Long.MIN_VALUE;
//        long a = root.val; long b = max(root.left); long c = max(root.right);
//        return Math.max(a,Math.max(b,c));
//    }
//    public long min(TreeNode root){
//        if(root == null) return Long.MAX_VALUE;
//        long a = root.val; long b = min(root.left); long c = min(root.right);
//        return Math.min(a,Math.min(b,c));
//    }
//    public boolean isValidBST(TreeNode root) {
//        if(root == null) return true;
//        if(root.val<=max(root.left)) return false;
//        if(root.val>=min(root.right)) return false;
//        return isValidBST(root.left) && isValidBST(root.right);
//    }
	
//	Approach 2
	
    public void inorder(TreeNode root,List<Integer> arr){
        if(root == null) return;
        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
    }
    public boolean isValidBST(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        inorder(root,arr);
        for(int i=1; i<arr.size();i++){
            if(arr.get(i) <= arr.get(i-1)) return false;
        }
        return true;
    }
    
    //Approach 3
    
//    static boolean flag;
//   public long max(TreeNode root){
//       if(root == null) return Long.MIN_VALUE;
//       long leftMax = max(root.left); 
//       if(leftMax>=root.val) flag = false;
//       long rightMax = max(root.right);
//       return Math.max(root.val,Math.max(leftMax,rightMax));
//   }
//   public long min(TreeNode root){
//       if(root == null) return Long.MAX_VALUE;
//       long a = root.val; 
//       long leftMin = min(root.left); 
//       long rightMin = min(root.right);
//       if(rightMin<=root.val) flag= false;
//       return Math.min(root.val,Math.min(leftMin,rightMin));
//   }
//   public boolean isValidBST(TreeNode root) {
//        flag = true;
//        max(root);
//        min(root);
//        return flag;
//   }
}
