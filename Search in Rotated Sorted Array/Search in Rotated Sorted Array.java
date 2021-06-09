class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        if(nums.length == 1){
            if(nums[0] == target) return 0;
            else return -1;
        }
        
        int pivot = findpivot(nums);
        if(nums[pivot] == target) return pivot;
        if(pivot == 0) return binarysearch(nums,start,end,target);
         
        if( target < nums[start]){
            return binarysearch(nums,pivot,end,target);
        }
        else{
            return binarysearch(nums,start,pivot,target);
        }
            
    }
    
    public int findpivot(int[] nums){
        int left = 0;
        int right = nums.length - 1;
        //this means array is not rotated
        if(nums[left] < nums[right]) return 0;
        
        while(left <= right){
            int pivot = left + (right - left) / 2;
            if(nums[pivot] > nums[pivot+1])
                return pivot+1;
            else{
                if(nums[pivot] < nums[left])
                    right = pivot - 1;
                else
                    left = pivot + 1;
            }
        }
        return 0;
    }
    
    
    public int binarysearch(int[] nums, int left, int right, int target){
        while(left <= right){
         int mid = left + (right - left) / 2;
         if(nums[mid] == target){
             return mid;
         }
         if(nums[mid] > target){
             right = mid - 1;
         }
            else{
                left = mid +1;
            }
        }
        
        return -1;
    }
}
