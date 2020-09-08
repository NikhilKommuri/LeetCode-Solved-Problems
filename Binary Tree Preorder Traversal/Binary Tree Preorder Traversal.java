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
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null){
            return Collections.EMPTY_LIST;
        }
        List<Integer> output = new ArrayList<Integer>();
        Stack<TreeNode> nodestack = new Stack<TreeNode>();
        nodestack.push(root);
        while(!(nodestack.isEmpty())){
            TreeNode curr =  nodestack.peek();
            output.add(curr.val);
            nodestack.pop();
            if(curr.right!=null){
                nodestack.push(curr.right);
            }
            if(curr.left!=null){
                nodestack.push(curr.left);
            }
        }
        
        return output;
        
    }
}
