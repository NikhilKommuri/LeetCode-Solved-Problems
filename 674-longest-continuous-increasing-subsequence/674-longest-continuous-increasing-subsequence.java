class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int left=0;
        int right = 1;
        int maxLength = 1;
        
        if(nums.length <=1){
            return nums.length;
        }
        while(left < nums.length && right < nums.length){
            int currLength = 1;
            while(right <nums.length && left <nums.length && nums[right] > nums[left]){
                currLength++;
                right++;
                left++;
            }
            left = right++;
            maxLength = Math.max(maxLength,currLength);
        }
        
        return maxLength;
        
    }
}