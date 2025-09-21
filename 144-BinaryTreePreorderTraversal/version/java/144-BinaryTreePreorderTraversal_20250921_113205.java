// Last updated: 9/21/2025, 11:32:05 AM
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

    public void postorder_Recursively(TreeNode root,List<Integer> al){

        if(root!=null){
            postorder_Recursively(root.left,al);
            postorder_Recursively(root.right,al);
            al.add(root.val);
        }
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        
        List<Integer> al=new ArrayList<>();
        postorder_Recursively(root,al);
        return al;
    }
}