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
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> res=new ArrayList<Integer>();
        
        if(root==null) return res;
        res=inorder(root,res);
        
        return res;
          
    }
    public List<Integer> inorder(TreeNode temp, List<Integer> inlist){
        if(temp.left!=null) inorder(temp.left,inlist);
        inlist.add(temp.val);
        if(temp.right!=null) inorder(temp.right,inlist);
        
        return inlist;
    }
}
