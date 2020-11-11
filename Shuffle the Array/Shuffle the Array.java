class Solution {
    public int[] shuffle(int[] nums, int n) {
        if(nums.length<1){
            return null;
        }
        int[] result = new int[nums.length];
        int j = 0;    
        for(int i=0 ; i< (nums.length)/2;i++){
            result[j] = nums[i];
            j = j+2;
        }
        j = 1;
        for(int i=(nums.length)/2 ; i< (nums.length);i++){
            result[j] = nums[i];
            j = j+2;
        }
        
        
        return result;
        
    }
}
