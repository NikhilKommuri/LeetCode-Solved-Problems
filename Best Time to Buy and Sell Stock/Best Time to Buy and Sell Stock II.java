class Solution {
    public int maxProfit(int[] prices) {
        
        if(prices == null || prices.length==0)
        {
            return 0;
        }
        
        int totalprofit = 0;
        
        for(int i=0; i<prices.length -1 ; i++)
        {
            if(prices[i+1] > prices[i])
            {
                totalprofit = prices[i+1] - prices[i] + totalprofit; 
            }
            
        }
        
        return totalprofit;
        
        
    }
}
