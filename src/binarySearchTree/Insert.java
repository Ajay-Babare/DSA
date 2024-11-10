//701. Insert into a Binary Search Tree
//You are given the root node of a binary search tree (BST) and a value to insert into the tree. Return the root node of the BST after the insertion. It is guaranteed that the new value does not exist in the original BST.
//Notice that there may exist multiple valid ways for the insertion, as long as the tree remains a BST after insertion. You can return any of them.
package binarySearchTree;
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
public class Insert {
//Approach 1:
    public void insert(TreeNode root, int val){
        if(val < root.val){ // attach to left
            if(root.left == null)
                root.left = new TreeNode(val);
            else
                insert(root.left,val);
        }
        else{//(val>root.val) //attach to right
            if(root.right == null)
                root.right = new TreeNode(val);
            else
                insert(root.right,val);
        }

    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null) return new TreeNode(val);
        insert(root, val);
        return root;
    }
    
//Approach 2:
//    public TreeNode insertIntoBST(TreeNode root, int val) {
//        if(root == null) return new TreeNode(val);
//        if(val < root.val) root.left = insertIntoBST(root.left,val);
//        else root.right = insertIntoBST(root.right,val);
//        return root;
//    }
}
