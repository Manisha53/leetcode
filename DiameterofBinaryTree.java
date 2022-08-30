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
    public int diameterOfBinaryTree(TreeNode root) {
        TreeNode temp=root; 
        if(temp == null) return 0;
        
            int llen=maxLen(temp.left);
            int rlen=maxLen(temp.right);
             return Math.max(diameterOfBinaryTree(root.right), Math.max(diameterOfBinaryTree(root.left), llen+rlen ));
        
    }
    
     public int maxLen(TreeNode root){
         return (root==null ? 0 : 1+Math.max(maxLen(root.left),maxLen(root.right)));
     }
}
