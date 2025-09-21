// Last updated: 9/21/2025, 7:34:46 PM
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
    public boolean isUnivalTree(TreeNode root) {
        
        if (root == null) {
            return true;
        }
        
        return inorderCheck(root, root.val);
    }

    public boolean inorderCheck(TreeNode root, int value) {
        
        if (root == null) return true;

        // Traverse left subtree
        if (!inorderCheck(root.left, value)) return false;

        // Check current node
        if (root.val != value) return false;

        // Traverse right subtree
        return inorderCheck(root.right, value);
    }
}
