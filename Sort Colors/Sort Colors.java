class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        while(mid<=high){
            if(nums[mid] == 1){
                mid = mid + 1;
            }
            else if(nums[mid] == 0){
                int temp1 = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp1;
                
                mid = mid + 1;
                low = low + 1;
            }
            else{
                int temp2 = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp2;
                high = high - 1;
            }
        }
        
        
    }
}
