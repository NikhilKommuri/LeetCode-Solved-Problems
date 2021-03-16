class Solution {
    public int xorOperation(int n, int start) {
        int[] nums = new int[n];
        nums[0] = start;
        for(int i=1;i<n;i++){
            nums[i] = start + (2*i);
        }
        int result = nums[0];
        
        for(int i=1;i<n;i++){
            
            result = (result ^ nums[i]);
        }
        
        return result;
    }
}
