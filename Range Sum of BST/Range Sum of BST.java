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
    int result = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {         
           preorderRecursive(root,low,high);      
            return result;  
        }
        
    

    public void preorderRecursive(TreeNode root, int low, int high)
    {
        if(root != null){
            if (low <= root.val && root.val <= high) result += root.val;
            preorderRecursive(root.left,low,high);
            preorderRecursive(root.right,low,high);
        }
    }
}
