class Solution {
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);//Sorting to break the loop for not searching higher amount coins;
        int[] dp= new int[amount+1];
        Arrays.fill(dp, amount+1);
        dp[0]=0;
        for(int i=0;i<amount+1;i++){
            for(int j=0;j<coins.length;j++){
                if(coins[j]<=i){
                    dp[i]= Math.min(dp[i],1+dp[i-coins[j]]);
                }
                else{
                    break;
                }
            }
        }
        return dp[amount]>amount ? -1: dp[amount];
    }
}