class Solution {
    public void rotate(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;
        
        for(int i=0;i<row;i++){
            for(int j=0; j<column; j++){
                if(i==j){
                    continue;
                }
                if(i<j){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;    
                }
            }
        }
        for(int i =0; i<row;i++){
            int p =0;
            int q = column-1;
            while(p<q){
                int temp = matrix[i][p];
                matrix[i][p] = matrix[i][q];
                matrix[i][q] = temp;
                p++;
                q--;
            }
        }
        
    }
 }