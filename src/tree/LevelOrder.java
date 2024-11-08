//102. Binary Tree Level Order Traversal
//Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).
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
public class LevelOrder {
    private int levels(TreeNode root){
        if(root == null) return 0;
            return 1 + Math.max(levels(root.left),levels(root.right));
    }
    private void nThLevel(TreeNode root, int level, int lvl, List<Integer> arr){
        if(root == null) return;
        if(level>lvl) return;
        if(level == lvl) arr.add(root.val);
        nThLevel(root.left, level+1,lvl,arr);
        nThLevel(root.right, level+1,lvl,arr);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        int lvl = levels(root);
        for(int i=0; i<lvl; i++){
            List<Integer> arr = new ArrayList<>();
            nThLevel(root,0,i,arr);
            ans.add(arr);
        }
        return ans;
    }
}
