class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        
        int[] res = new int[nums.length];
        int i = nums.length - 1;
        
        int square = 0;
        while(left <= right){
            if(Math.abs(nums[left]) > Math.abs(nums[right])){
                square = nums[left];
                left++;
            }
            else{
                square = nums[right];
                right--;
            }
            
            res[i] = square * square;
            i--;
            
        }
        
        return res;
        
    }
}