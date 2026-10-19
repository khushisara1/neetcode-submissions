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
    boolean mark = true;
    public boolean isBalanced(TreeNode root) {
        is(root);
        return mark;
    }
    public int is(TreeNode root){
        if(root==null){
            return 0;
        }
        int left = is(root.left);
        int right = is(root.right);
        if(Math.abs(left-right)>1){
            mark=false;
        }
        return 1+Math.max(left,right);

    }
}
