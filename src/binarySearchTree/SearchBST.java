//700. Search in a Binary Search Tree
//You are given the root of a binary search tree (BST) and an integer val.
//Find the node in the BST that the node's value equals val and return the subtree rooted with that node. If such a node does not exist, return null.
package binarySearchTree;

// Definition for a binary tree node.
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
         this.left = left;
         this.right = right;
     }
 }

public class SearchBST {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null) return null;
        if(root.val<val) return searchBST(root.right,val);
        else if(root.val>val) return searchBST(root.left, val);
        else return root;
    }
}
