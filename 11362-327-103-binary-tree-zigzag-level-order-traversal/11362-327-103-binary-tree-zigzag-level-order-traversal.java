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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> currAns = new ArrayList<>();

        if(root == null){
            return ans;
        }

        boolean flag = true;

        Stack<TreeNode> main = new Stack<>();
        Stack<TreeNode> helper = new Stack<>();

        main.add(root);

        while(!main.isEmpty()){
            
            TreeNode node = main.pop();

            currAns.add(node.val);

                if(flag){

                    if(node.left != null){
                    helper.add(node.left);
                    }
                    if(node.right != null){
                    helper.add(node.right);
                    }
                    
                    }else{
                        
                    if(node.right != null){
                    helper.add(node.right);
                    }
                    if(node.left != null){
                    helper.add(node.left);
                    }
 
                }

                if(main.isEmpty()){

                flag = flag ? false : true; 

                main = helper;
                helper = new Stack<>();

                ans.add(currAns);
                currAns = new ArrayList<>();            
                }
            }
        return ans;    
    }
}