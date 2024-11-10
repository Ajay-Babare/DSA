//1038. Binary Search Tree to Greater Sum Tree
//Given the root of a Binary Search Tree (BST), convert it to a Greater Tree such that every key of the original BST is changed to the original key plus the sum of all keys greater than the original key in BST.
//As a reminder, a binary search tree is a tree that satisfies these constraints:
//The left subtree of a node contains only nodes with keys less than the node's key.
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
public class BstToGst {
//Approach 1
	
//    public void inorder(TreeNode root, List<TreeNode> arr){
//        if(root == null) return;
//        inorder(root.left,arr);
//        arr.add(root);
//        inorder(root.right,arr);
//    }
//    public TreeNode bstToGst(TreeNode root) {
//        List<TreeNode> arr = new ArrayList<>();
//        inorder(root,arr);
//        int n = arr.size();
//        for(int i=n-2;i>=0;i--){
//            arr.get(i).val += arr.get(i+1).val;
//        }
//    return root;
//    }
    
//Approach 2
	
    static int sum;
    public void reverseInorder(TreeNode root){
        if(root == null) return;
        reverseInorder(root.right);
        root.val += sum;
        sum = root.val;
        reverseInorder(root.left);
    }
    public TreeNode bstToGst(TreeNode root) {
        sum=0;
        reverseInorder(root);
        return root;
    }
	
}
