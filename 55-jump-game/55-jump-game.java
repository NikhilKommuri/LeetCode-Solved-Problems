class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length<=1) return true;
        int[] dp = new int[nums.length+1];
        dp[0] = nums[0];
        if(nums[0] == 0){
            return false;
        }
        for(int i=1;i<nums.length-1;i++){
            dp[i] = Math.max(nums[i],dp[i-1]-1);
            if(dp[i]==0){
                return false;
            }
        }
        
        return true;
    }
}