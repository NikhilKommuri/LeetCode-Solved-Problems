class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int j=nums.length-1;
        int count=0;
        while(j>0)
        {
        int diff=nums[j]-nums[0];
            count+=diff;
            j--;
        }
        return count;
    }
}