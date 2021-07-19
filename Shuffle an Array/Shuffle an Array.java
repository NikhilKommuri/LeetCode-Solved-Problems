class Solution {
    private int[] original;
    private int[] nums;

    public Solution(int[] nums) {
        this.nums = nums;
        this.original = nums.clone();
        
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        nums = original;
        original = original.clone();
        return original;
        
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int length = nums.length;
        for(int i=0; i< length;i++){
            int randomidx = (int)(Math.random() * (length - i)) + i;
            System.out.print(randomidx+" ");
            int temp = nums[i];
            nums[i] = nums[randomidx];
            nums[randomidx] = temp;
        }
        
        return nums;
        
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
