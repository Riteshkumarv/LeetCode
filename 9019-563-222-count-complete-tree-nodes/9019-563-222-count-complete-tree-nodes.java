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
    public int countNodes(TreeNode root) {
        
        // Base case: if the tree is empty return 0
        if(root == null) return 0;

        // Recursively count the nodes in the left subtree
        int leftAns = countNodes(root.left);

        // Recursively count the nodes in the left subtree
        int rightAns = countNodes(root.right);

        // Return the total count: left + right + 1 (for the current node)
        return leftAns + rightAns + 1;
    }
}