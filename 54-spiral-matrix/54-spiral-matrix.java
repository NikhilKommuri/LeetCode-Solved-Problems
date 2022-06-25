class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int bottom = matrix.length - 1;
        
        int matrixSize = matrix[0].length * matrix.length ;
        while(result.size() < matrixSize){
            for(int i=left;i<=right && result.size() < matrixSize;i++){
                result.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom  && result.size() < matrixSize;i++){
                result.add(matrix[i][right]);
            }
            right--;
            for(int i=right;i>=left  && result.size() < matrixSize;i--){
                result.add(matrix[bottom][i]);
            }
            bottom--;
            for(int i=bottom;i>=top && result.size() < matrixSize;i--){
                result.add(matrix[i][left]);
            }
            left++;
        }
        
        return result;
    }
}