//543. Diameter of Binary Tree
//Given the root of a binary tree, return the length of the diameter of the tree.
//The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.
//The length of a path between two nodes is represented by the number of edges between them.
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
public class DiameterOfBinaryTree {

//Approach 1: 
	
//    public int levels(TreeNode root){
//        if(root == null) return 0;
//        return 1 + Math.max(levels(root.left),levels(root.right));
//    }
//    public int diameterOfBinaryTree(TreeNode root) {
//        if(root == null) return 0;
//        int myDia = levels(root.left)+levels(root.right);
//        int leftDia = diameterOfBinaryTree(root.left);
//        int rightDia = diameterOfBinaryTree(root.right);
//        return Math.max(myDia,Math.max(leftDia,rightDia));
//    }
	
// Approach 2:
	
    public int levels(TreeNode root, int[] maxDia){
        if(root == null) return 0;
        int leftLevels = levels(root.left, maxDia);
        int rightLevels = levels(root.right, maxDia);
        int dia = leftLevels + rightLevels;
        maxDia[0] = Math.max(dia, maxDia[0]);
        return 1 + Math.max(leftLevels,rightLevels);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int[] maxDia={0};
        levels(root,maxDia);
        return maxDia[0];
    }
	
}
