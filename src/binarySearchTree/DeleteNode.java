//450. Delete Node in a BST
//Given a root node reference of a BST and a key, delete the node with the given key in the BST. Return the root node reference (possibly updated) of the BST.
//Basically, the deletion can be divided into two stages:
//Search for a node to remove.
//If the node is found, delete the node.
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
public class DeleteNode {
    public TreeNode iop(TreeNode root){
        TreeNode temp = root.left;
        while(temp.right != null) temp = temp.right;
        return temp;
    }
    public TreeNode parent(TreeNode root, TreeNode pred){
        if(root.left == pred || root.right == pred) return root;
        TreeNode temp = root.left;
        while(temp.right != pred) temp = temp.right;
        return temp;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null;
        if(root.val == key){// deletion
            //case 1: ) child nodes
            if(root.left == null && root.right == null) return null;

            //case 2: 1 child node
            else if(root.left==null || root.right==null){
                if(root.left == null) return root.right;
                else return root.left;
            }
            // case 3: 2 child nodes
            else{
                TreeNode pred = iop(root);
                TreeNode predParent = parent(root,pred);
                if(root == predParent){
                    pred.right = root.right;
                    return pred;
                }
                predParent.right = pred.left;
                pred.left = root.left;
                pred.right= root.right;
                return pred;
            }
        }
        else if(root.val>key){//LST will change
            root.left=deleteNode(root.left, key);
        }
        else{//root.val<key : RST will change
            root.right = deleteNode(root.right, key);
        }
        return root;
    }
}
