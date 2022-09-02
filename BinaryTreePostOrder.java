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
    List<Integer> res=new ArrayList<Integer>();
    
    public List<Integer> postorderTraversal(TreeNode root) {
        
        if(root==null) return res;
              
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        res.add(root.val);
         
        return res;
    }
}
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Tree Postorder Traversal.
Memory Usage: 42 MB, less than 73.78% of Java online submissions for Binary Tree Postorder Traversal.
*/
