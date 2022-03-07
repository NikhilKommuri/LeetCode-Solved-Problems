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
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList();
        
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode curr = stack.pop();
            if(curr != null)
            {
                list.add(0,curr.val);
                if(curr.left != null) stack.push(curr.left);
                if(curr.right != null) stack.push(curr.right);
            }
        }
        return list;
    }
}