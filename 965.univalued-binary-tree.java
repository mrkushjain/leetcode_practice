/*
 * @lc app=leetcode id=965 lang=java
 *
 * [965] Univalued Binary Tree
 */

// @lc code=start
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
        if(root==null){
            return true;
        }
        boolean isLeftUnival = (root.left==null)||(root.left.val==root.val && isUnivalTree(root.left));
        boolean isRightUnival = (root.right==null)||(root.right.val==root.val && isUnivalTree(root.right));
        return isLeftUnival && isRightUnival;

    }
}
// @lc code=end

