class Solution {
    public long subArrayRanges(int[] nums) {
        long sum = 0;
        for(int i = 0; i < nums.length;i++){
            int min = nums[i];
            int max = nums[i];
            int j = i;
            while(j<nums.length){
             min = Math.min(min,nums[j]);
             max = Math.max(max,nums[j]);
            sum += max-min;
            j++;    
            }
        }
        return sum;
    }
}