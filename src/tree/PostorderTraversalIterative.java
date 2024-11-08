//145. Binary Tree Postorder Traversal
//Given the root of a binary tree, return the postorder traversal of its nodes' values.
package tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

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
public class PostorderTraversalIterative {
	
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        if(root != null) st.push(root);
        while(st.size()>0){
            TreeNode top = st.pop();
            ans.add(top.val);
            if(top.left != null) st.push(top.left);
            if(top.right != null) st.push(top.right);
        }
        Collections.reverse(ans);
        return ans;
    }
}
