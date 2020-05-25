class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        
        int curr_sum = 0;
        int result = Integer.MAX_VALUE;
        int left = 0;
        
        if(nums.length==0)
        {
            return 0;
        }
        for (int i=0; i <nums.length;i++)
        {
            curr_sum = curr_sum + nums[i];
            
            while(curr_sum >=s)
            {
                result = Math.min(result, i+1 - left);
                curr_sum = curr_sum - nums[left];
                left++;
            }
        }
        
        if(result == Integer.MAX_VALUE)
        {
            return 0;
        }
        else
        {
            return result;
        }
        
        
        
    }
}
