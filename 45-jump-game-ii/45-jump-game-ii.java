class Solution {
    public int jump(int[] nums) {
        int len = nums.length;
		int[] dp = new int[len];
		Arrays.fill(dp, len + 1);
		dp[0] = 0;

		for (int i = 0; i < len; i++) {
			int start = i;
			int end = Math.min(i + nums[i], len - 1);
			for (int j = start; j <= end; j++) {
				dp[j] = Math.min(dp[j], dp[start] + 1);
			}
		}

		return dp[len - 1] == len + 1 ? -1 : dp[len - 1];
    }
}