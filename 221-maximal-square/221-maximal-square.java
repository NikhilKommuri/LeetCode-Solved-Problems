class Solution {
    public int maximalSquare(char[][] matrix) {
        
        int rowLength = matrix.length;
        int columnLength = rowLength>0 ? matrix[0].length : 0;
        
        int[][] dp = new int[rowLength][columnLength];
        
        int count = 0;
        for(int i=0; i<rowLength;i++){
            dp[i][0] = Character.getNumericValue(matrix[i][0]);
            count = Math.max(count,dp[i][0]);
        }
        for(int i=0; i<columnLength;i++){
            dp[0][i] = Character.getNumericValue(matrix[0][i]);
            count = Math.max(count,dp[0][i]);
        }
        
        for(int i=1;i<rowLength;i++){
            for(int j=1;j<columnLength;j++){
                if(matrix[i][j] == '1'){
                    dp[i][j] = Math.min(Math.min(dp[i][j-1],dp[i-1][j]),dp[i-1][j-1]) + 1;
                }
                else{
                    continue;
                }
                count = Math.max(count,dp[i][j]);
            }
        }
        
        return count*count;
    }
}

/*

*/