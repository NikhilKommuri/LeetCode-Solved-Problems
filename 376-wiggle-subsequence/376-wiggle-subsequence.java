class Solution {
    public int wiggleMaxLength(int[] nums) {
        
        if(nums.length <= 0) return 0;
        if(nums.length == 1) return 1;
        
        
      
        int prevDiff = nums[1] - nums[0];
        int max_length =prevDiff==0 ? 1 : 2;
        int i = 2;
        while(i<nums.length){
            int diff = nums[i] - nums[i-1];
            if((diff>0 && prevDiff<=0) || (diff < 0 && prevDiff >=0)){
                max_length++;
                prevDiff = diff;
            }
            i++;
        }
        
        return max_length;
        
    }
}



