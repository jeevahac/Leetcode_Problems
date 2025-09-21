// Last updated: 9/21/2025, 7:26:36 PM
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

    int count=0;
    int result=-1;

    public void inorder_Recursively(TreeNode root,int k){

        if(root==null){
            return;
        }

        inorder_Recursively(root.left,k);

        count++;

        if(count==k){
            result=root.val;
            return;
        }

        inorder_Recursively(root.right,k);
    }
    public int kthSmallest(TreeNode root, int k) {

        inorder_Recursively(root,k);
        return result;
        
    }
}