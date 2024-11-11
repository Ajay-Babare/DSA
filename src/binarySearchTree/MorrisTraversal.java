//94. Binary Tree Inorder Traversal
//Given the root of a binary tree, return the inorder traversal of its nodes' values.
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
public class MorrisTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        TreeNode curr = root;
        while(curr!=null){
            if(curr.left!=null){//left hai
                TreeNode pred = curr.left;
                while(pred.right != null && pred.right!=curr)
                    pred = pred.right;
                if(pred.right == null){//Link
                    pred.right = curr;
                    curr = curr.left;
                }
                else{//pred.right = curr : Unlink
                    pred.right = null;
                    ans.add(curr.val);
                    curr=curr.right;
                }
            }
            else{//left nahi hai
                ans.add(curr.val);
                curr = curr.right;
            }
        }
        return ans;
    }
}
