class Solution {
    public int findClosestNumber(int[] nums) {
        int min=Integer.MAX_VALUE;
        int val=0;
        for(int i=0;i<nums.length;i++)
        {
            if(min>Math.abs(nums[i]))
            {
                min=Math.abs(nums[i]);
                val=nums[i];
            }
            
            if(min==Math.abs(nums[i]))
            {
                if(nums[i]>0)
                    val=nums[i];
            }
        }
        
        return val;
    }
}