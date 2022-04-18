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
         List<List<Integer>> ans = new ArrayList();
        Queue<TreeNode> q = new LinkedList();
        if(root == null) return ans;
        q.offer(root);
        List<Integer> list;
        int c = -1;
        while(!q.isEmpty()){
            int n = q.size();
            list = new ArrayList();
            for(int i =0; i< n; i++){
                TreeNode cur = q.poll();
                if(cur.left != null) q.offer(cur.left);
                if(cur.right != null) q.offer(cur.right);
                list.add(cur.val);
            }
            c++;
            if(c % 2 == 0){
                ans.add(list);
            }else{
                Collections.reverse(list);
                ans.add(list);
            }
        }
        return ans;
        
    }
}