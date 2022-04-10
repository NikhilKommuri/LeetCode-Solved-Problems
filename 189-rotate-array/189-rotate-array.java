class Solution {
    public void rotate(int[] nums, int k) {
     
        k = k % nums.length;
        reverse(nums,nums.length-k,nums.length-1);
        reverse(nums,0,nums.length-k-1);
        reverse(nums,0,nums.length-1);
        
    }
    
    private void reverse(int[] nums, int i, int j){
        int temp = 0;
        while(i<=j){
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}