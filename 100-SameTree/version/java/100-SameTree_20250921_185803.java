// Last updated: 9/21/2025, 6:58:03 PM
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
class Solution {


    public boolean isSameTree(TreeNode p, TreeNode q) {

        
        if(p==null && q==null){ // both the tree is empty root
            return true;
        }
        if(p==null||q==null){ // if any tree is null 
            return false;
        }
        if(p.val!=q.val){ // if current root val is different;
            return false;
        }

        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);  // recursive call to check left and right trees;

        
    }
}