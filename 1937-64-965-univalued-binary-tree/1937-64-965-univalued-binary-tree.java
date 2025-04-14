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
    // Helper function to check if all nodes in the tree have the same value
    public boolean helper(TreeNode root , int val){

        // If the current node is null, return true (null doesn't violate univalued condition)
        if(root == null){
            return true;
        }

        // If current node's value is not equal to the target value, return false
        if(root.val != val) return false;

        // Recursively check left and right subtrees
        Boolean leftAns = helper(root.left , val);
        Boolean rightAns = helper(root.right , val);

        // Return true only if both left and right subtrees are univalued
        return leftAns && rightAns;
    }

    // Main function to check if the tree is univalued 
    public boolean isUnivalTree(TreeNode root) {
        // Start the helper with the root's value
        return helper(root , root.val);
    }
}