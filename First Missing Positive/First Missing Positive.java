class Solution {
    public int firstMissingPositive(int[] nums) {
        boolean Contains1 = false; 
        int len = nums.length;
        for(int i=0;i<len;i++){
            if(nums[i]==1){
               Contains1 = true;
                break;
            }
        }
        if(!Contains1){
            return 1;
        }
        
        for(int i=0;i<len;i++){
            if(nums[i]<=0 || nums[i]>len){
                nums[i] = 1;
            }
        }
        
        for(int i=0; i<len;i++){
            int curr = Math.abs(nums[i]);
            if(curr == len){
                nums[0] = (-1) * Math.abs(nums[0]);
            }
            else{
                nums[curr] = (-1) * Math.abs(nums[curr]);
            }
            
        }
        
        for(int i=1;i<len;i++){
            if(nums[i]>0){
                return i;
            }
        }
        if(nums[0] > 0){
            return len;
        }
        
        return len + 1;
        
        
    }
}
