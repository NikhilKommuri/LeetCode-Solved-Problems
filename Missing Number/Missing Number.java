class Solution {
    public int missingNumber(int[] nums) {
        int generalsum = (nums.length*(nums.length+1) / 2);
        int actualsum = 0;
        for(int i=0; i<nums.length;i++){
            actualsum += nums[i];
        }
        
        return (generalsum-actualsum);
    }
}
