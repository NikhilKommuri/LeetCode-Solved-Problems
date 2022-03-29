class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        
        int duplicate = -1;
        for (int i = 0; i < n; i++) {
            int cur = Math.abs(nums[i]);
            if (nums[cur] < 0) {
                duplicate = cur;
                break;
            }
            nums[cur] *= -1;
        }
     
        return duplicate;
    }
}