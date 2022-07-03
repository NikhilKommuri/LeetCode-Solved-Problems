class Solution {
    public int missingElement(int[] nums, int k) {
    int left = 1, right = nums.length;
    int target = nums[0] + k;
    
    while (left < right) {
        int mid = left + (right - left) / 2;
        if (nums[mid] <= target + mid - 1) {
            left = mid + 1;
        } else {
            right = mid;
        }
    }
    return target + left - 1;
    }
}