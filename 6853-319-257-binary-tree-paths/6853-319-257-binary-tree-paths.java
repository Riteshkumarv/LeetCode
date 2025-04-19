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
    public List<String> binaryTreePaths(TreeNode root) {
        
        List<String> ans = new ArrayList<>();

        if(root == null) return ans;
        else if(root.left == null && root.right == null){
            ans.add(String.valueOf(root.val));
        }

        List<String> leftAns = binaryTreePaths(root.left);
        List<String> rightAns = binaryTreePaths(root.right);

        for(String str : leftAns){
            ans.add(String.valueOf(root.val) + "->" + str);
        }
        for(String str : rightAns){
            ans.add(String.valueOf(root.val) + "->" + str);
        }

        return ans;  
    } 
}