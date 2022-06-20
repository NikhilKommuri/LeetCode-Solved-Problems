class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        if(nums.length==2) return Math.max(nums[0],nums[1]);
        int[] dp= new int[nums.length-1];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[1],nums[0]);
        for(int i=2;i<nums.length-1;i++){
            dp[i]= Math.max(dp[i-1],nums[i]+dp[i-2]);
        }
        int first_max= dp[nums.length-2];
        dp[0]= nums[1]; 
        dp[1]= Math.max(nums[1],nums[2]);
        for(int i=2;i<nums.length-1;i++){ 
            dp[i]= Math.max(dp[i-1], nums[i+1]+dp[i-2]);
        }
        return Math.max(first_max, dp[nums.length-2]);
    }
}