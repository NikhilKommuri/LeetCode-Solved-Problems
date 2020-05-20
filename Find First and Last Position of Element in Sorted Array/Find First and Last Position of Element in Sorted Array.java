class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int[] result = new int[]{-1,-1};
        
        if(nums.length <=0) return result;
        
        result[0] = findfirstpos(nums,target);
        result[1] = findlastpos(nums,target);
        
        return result;
    }
    
    
    public int findfirstpos(int[] nums, int target){
        int firstposition = -1;
        int left = 0;
        int right = nums.length - 1;
        
        while(left<=right)
        {
            int mid = left + (right-left) / 2;
            
            if(nums[mid]==target)
            {
                firstposition = mid;
                right = mid -1;
            }
            
            else if(nums[mid] < target)
            {
                left = mid + 1;
            }
            else
                right = mid - 1;
        }
         return firstposition;
    }
    
    public int findlastpos(int[] nums, int target){
        int lastposition = -1;
        int left = 0;
        int right = nums.length - 1;
        
        while(left<=right)
        {
            int mid = left + (right-left) / 2;
            if(nums[mid] == target)
            {
                lastposition = mid;
                left = mid + 1;
            }
            else if(nums[mid] < target)
            {
                left = mid + 1;
            }
            else
                right = mid - 1;
        }
        
        return lastposition;
            
        }
        
        
}
