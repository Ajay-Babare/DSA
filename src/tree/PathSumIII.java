//437. Path Sum III
//Given the root of a binary tree and an integer targetSum, return the number of paths where the sum of the values along the path equals targetSum.
//The path does not need to start or end at the root or a leaf, but it must go downwards (i.e., traveling only from parent nodes to child nodes).
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
public class PathSumIII {
    public int helper(TreeNode root, long sum){
        if(root == null) return 0;
        int count = 0;
        if(root.val == sum) count++;
        count += helper(root.left, sum-root.val) + helper(root.right, sum-root.val);
        return count;
    }
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null) return 0;
        return helper(root, targetSum) + pathSum(root.left,targetSum) + pathSum(root.right,targetSum);
    }
}
