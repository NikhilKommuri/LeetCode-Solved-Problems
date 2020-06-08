/*
We can find the Max Product of 3 numbers with the following logic considering that we can have negative numbers in an array
the max product of 3 numbers will always be the maximum of either the product of largest 3 numbers in an array or the product of 1st maximum and 2 minimum numbers in an array

*/

class Solution {
    public int maximumProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int result = -1;
        for(int i=0; i<nums.length;i++){
            if(nums[i]>=max1){
                max3 = max2;
                max2 = max1;
                max1 = nums[i];
            }
            else if(nums[i] >= max2){
                max3 = max2;
                max2 = nums[i];
            }
            else if (nums[i] >= max3){
                max3 = nums[i];
            }
            
         if(nums[i] <= min1){
             min2 = min1;
             min1 = nums[i];
         }
            else if( nums[i] <= min2){
                min2 = nums[i];
            }
            
        }
        
        result = Math.max((min1*min2*max1),(max1*max2*max3));
        
        return result;
        
    }
}
