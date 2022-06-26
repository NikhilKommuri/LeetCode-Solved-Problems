class Solution {
    public int minimumDeletions(int[] nums) {
        int max = 0,min = 0;
        for(int i = 1; i < nums.length; i++) // We would find the index of Max & Min Elements here
        {
            max = nums[i] > nums[max] ? i : max;
            min = nums[i] < nums[min] ? i : min;
        }
        int front = Math.max(max,min) + 1; // To check the case when we remove elements from the Front
        int back = nums.length - Math.min(max,min); // To check the case when we remove elements from the Back
        int both = Math.min(max,min) + 1 + nums.length - Math.max(min,max); // To check the case when we remove elements from both ends
        return Math.min(both, Math.min(front, back)); // return the minimum of all
    }
}