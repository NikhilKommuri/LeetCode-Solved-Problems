class Solution {
    public int minimumDeletions(int[] nums) {
        int maxIdx = 0,minIdx = 0;
        for(int i = 1; i < nums.length; i++) // We would find the index of Max & Min Elements here
        {
            maxIdx = nums[i] > nums[maxIdx] ? i : maxIdx;
            minIdx = nums[i] < nums[minIdx] ? i : minIdx;
        }
        int front = Math.max(maxIdx,minIdx) + 1; // To check the case when we remove elements from the Front
        int back = nums.length - Math.min(maxIdx,minIdx); // To check the case when we remove elements from the Back
        int both = Math.min(maxIdx,minIdx) + 1 + nums.length - Math.max(minIdx,maxIdx); // To check the case when we remove elements from both ends
        return Math.min(both, Math.min(front, back)); // return the minimum of all
    }
}