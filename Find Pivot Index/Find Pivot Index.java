class Solution {
    public int pivotIndex(int[] nums) {
     int[] leftsum = new int[nums.length];
     int[] rightsum = new int[nums.length];
     leftsum[0] = 0;
     for(int i=1;i<leftsum.length;i++){
         leftsum[i] = leftsum[i-1]+nums[i-1];
     }
     rightsum[rightsum.length-1] = 0;
     for(int i=rightsum.length-2; i>=0; i--){
          rightsum[i] = nums[i+1] + rightsum[i+1];
     }
     
     for(int i=0;i<nums.length;i++){
         if(leftsum[i] == rightsum[i]){
             return i;
         }
     }
        
        return -1;
        
    }
}
