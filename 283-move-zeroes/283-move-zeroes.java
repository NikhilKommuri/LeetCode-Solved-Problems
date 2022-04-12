class Solution {
    public void moveZeroes(int[] nums) {
        int nonzeroindex = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[nonzeroindex] = nums[i];
                nonzeroindex++;
            }
        }
        
        for(int i=nonzeroindex;i<nums.length;i++){
            nums[i] = 0;
        }
    }
}