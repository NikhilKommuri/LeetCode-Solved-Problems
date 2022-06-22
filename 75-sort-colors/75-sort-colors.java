class Solution {
    public void sortColors(int[] nums) {
        int left = 0;
        int k = 0;
        int right = nums.length - 1;
        
        while(k <= right){
            if(nums[k] == 2){
                int temp = nums[right];
                nums[right] = nums[k];
                nums[k] = temp;
                right--;
            }
            
            else if (nums[k] == 0){
                int temp = nums[left];
                nums[left] = nums[k];
                nums[k] = temp;
                left++;
                k++;
            }
            else{
                k++;    
            }
            
        }
    }
}
