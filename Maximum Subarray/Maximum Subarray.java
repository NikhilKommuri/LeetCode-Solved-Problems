class Solution {
    public int maxSubArray(int[] nums) {
        int global_max_sum = nums[0];
        int local_max_sum = nums[0];
        for(int i=1;i<nums.length;i++){
            local_max_sum = Math.max(nums[i],nums[i]+local_max_sum);
            if(local_max_sum >= global_max_sum){
                global_max_sum = local_max_sum;
            }
        }
        
        return global_max_sum;
        
    }
}
