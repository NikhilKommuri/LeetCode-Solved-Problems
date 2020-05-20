class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int result = 0;
        
        while(left<=right)
        {
            int mid = left + (right-left) / 2 ;
            if(left == right)
            {
                return nums[left];
            }
            if(nums[mid] == nums[mid+1]){
                if ((mid-left+1) % 2 == 0)
                    right = mid - 1;
                else
                    left = mid;
            }
            else 
            {
                if ((mid-left+1) % 2 == 0)
                    left = mid + 1;
                else
                    right = mid;
            }
        }

        return -1;
    }
}
