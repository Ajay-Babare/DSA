//236. Lowest Common Ancestor of a Binary Tree
//Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.
//According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”
package tree;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class LowestCommonAncestor {
    public boolean exists(TreeNode root, TreeNode node){
        if(node==root) return true;
        if(root==null) return false;
        return exists(root.left,node) || exists(root.right,node);
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p==root || q==root) return root;
        boolean pLiesInLST = exists(root.left,p);
        boolean qLiesInLST = exists(root.left,q);
        if(pLiesInLST==true && qLiesInLST==true) return lowestCommonAncestor(root.left,p,q);
        if(pLiesInLST==false && qLiesInLST==false) return lowestCommonAncestor(root.right,p,q);
        else return root;
    }
}
