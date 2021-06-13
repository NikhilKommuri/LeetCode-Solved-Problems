class Solution {
    public int minPathSum(int[][] grid) {
        int result = 0;
        int rows= grid.length;
        int columns = grid[0].length;
        //In the first row we can only move right to add the sum
        //In the first column we can only move down to add the sum
        int [][] dp = new int[rows+1][columns+1];
        dp[0][0] = grid[0][0];
        
        //1st column
        for(int i=1;i<rows;i++){
            dp[i][0] = grid[i][0] + dp[i-1][0];
        }
        
        //1st row
        for(int j=1;j<columns;j++){
            dp[0][j] = grid[0][j] + dp[0][j-1]; 
        }
        
        //traverse the full matrix and fill up the dp array
        for(int i=1;i<rows;i++){
            for(int j=1;j<columns;j++){
                int gridvalue = grid[i][j];
                dp[i][j] = Math.min(gridvalue + dp[i-1][j] , gridvalue + dp[i][j-1]);
            }
        }
        
        
        return dp[rows-1][columns-1];
        
        
    }
}
