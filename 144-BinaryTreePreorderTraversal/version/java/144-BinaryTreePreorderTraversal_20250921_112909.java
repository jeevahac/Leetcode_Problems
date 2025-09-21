// Last updated: 9/21/2025, 11:29:09 AM
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

    public void preorder_Recursively(TreeNode root,List<Integer> al){
        
        if(root!=null){
            al.add(root.val);
            preorder_Recursively(root.left,al);
            preorder_Recursively(root.right,al);
        }
    }
    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> al=new ArrayList<>();
        preorder_Recursively(root,al);
        return al;
        
    }
}