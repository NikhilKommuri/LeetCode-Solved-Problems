class Solution {
    public int pivotIndex(int[] nums) {
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        leftSum[0] = 0;
        for(int i=1;i<nums.length;i++){
            leftSum[i] = leftSum[i-1]+nums[i-1];
        }
        rightSum[nums.length-1] = 0;
        for(int i=nums.length-2;i>=0;i--){
            rightSum[i] = rightSum[i+1]+nums[i+1]; 
        }
        for(int i=0;i<nums.length;i++){
            if(leftSum[i] == rightSum[i]){ 
                return i;
            }
        }
        return -1;
    }
}


