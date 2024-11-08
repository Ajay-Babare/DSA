//199. Binary Tree Right Side View
//Given the root of a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.
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
public class RightSideView {
    public int levels(TreeNode root){
        if(root ==  null) return 0;
        return 1+ Math.max(levels(root.left),levels(root.right));
    }
    public void dfs(TreeNode root, int level,List<Integer> ans){
        if(root == null) return;
        ans.set(level,root.val);//Important
        dfs(root.left,level+1,ans);
        dfs(root.right,level+1,ans);
    }
    public List<Integer> rightSideView(TreeNode root) {
        int n = levels(root);
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            ans.add(0);
        }
        dfs(root,0,ans);
        return ans;
    }
}
