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
    public int maxDepth(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        
        if(root==null) return 0;
        
        queue.add(root);
        int depth = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            while(size > 0){
                TreeNode curr = queue.poll();
                if(curr.left!=null) queue.add(curr.left);
                if(curr.right!= null) queue.add(curr.right);
                size--;
            }
            depth = depth + 1;
            
        }
        
        return depth;
        
    }
}