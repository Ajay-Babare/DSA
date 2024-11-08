//145. Binary Tree Postorder Traversal
//Given the root of a binary tree, return the postorder traversal of its nodes' values.
package tree;

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
public class PostorderTraversal {
    public void helper(TreeNode root, List<Integer> ans){
        if(root == null) return;
        helper(root.left,ans);
        helper(root.right,ans);
        ans.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        helper(root, ans);
        return ans;
    }
}