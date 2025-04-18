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

    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> currAns = new ArrayList<>();

        if(root == null) return ans;

        Queue<TreeNode> main = new LinkedList<>();
        Queue<TreeNode> helperQueue = new LinkedList<>();

        main.offer(root);

        while(!main.isEmpty()){
            
            TreeNode node = main.poll();

            currAns.add(node.val);

            if(node.left != null){
                helperQueue.offer(node.left);
            }
            if(node.right != null){
                helperQueue.offer(node.right);
            }

            if(main.isEmpty()){
                main = helperQueue;
                helperQueue = new LinkedList<>();

                ans.add(currAns);
                currAns = new ArrayList<>();
            }
        }
        return ans;
    }
}