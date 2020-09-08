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
          if(root==null){
            return Collections.EMPTY_LIST;
        }
        List<Integer> output = new ArrayList<Integer>();
        Stack<TreeNode> nodestack = new Stack<TreeNode>();
        TreeNode curr = root;
        
        while(curr!=null || !(nodestack.isEmpty())){
            while(curr!=null){
            nodestack.push(curr);
            curr = curr.left;
            }
            curr = nodestack.pop();
            output.add(curr.val);
            curr = curr.right;
            
        }
        
        return output;
        
    }
}
