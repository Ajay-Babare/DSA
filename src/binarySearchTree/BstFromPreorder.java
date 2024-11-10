//1008. Construct Binary Search Tree from Preorder Traversal
//Given an array of integers preorder, which represents the preorder traversal of a BST (i.e., binary search tree), construct the tree and return its root.
//It is guaranteed that there is always possible to find a binary search tree with the given requirements for the given test cases.
//A binary search tree is a binary tree where for every node, any descendant of Node.left has a value strictly less than Node.val, and any descendant of Node.right has a value strictly greater than Node.val.
//A preorder traversal of a binary tree displays the value of the node first, then traverses Node.left, then traverses Node.right.
package binarySearchTree;

import java.util.Arrays;

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
public class BstFromPreorder {
    public TreeNode helper(int[] preorder, int[] inorder, int prelo, int prehi, int inlo, int inhi){
        if(prelo>prehi || inlo> inhi) return null;
        TreeNode root = new TreeNode(preorder[prelo]);
        int r=0;
        while(inorder[r]!=preorder[prelo]) r++;
        int leftsize = r - inlo;
         root.left = helper(preorder, inorder, prelo+1, prelo+leftsize, inlo, r-1);
         root.right = helper(preorder, inorder, prelo+leftsize+1, prehi, r+1, inhi);
        return root;
     }
     public TreeNode bstFromPreorder(int[] preorder) {
         int n = preorder.length;
         int[] inorder = Arrays.copyOf(preorder,n);
         Arrays.sort(inorder);
         return helper(preorder, inorder, 0, n-1, 0, n-1);
     }
}
