class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        int rowtosearch = 0;
        for(int i=0;i<rows;i++){
            if(matrix[i][0] == target || matrix[i][cols-1]==target){
                return true;
            }
            if(matrix[i][0] < target && target < matrix[i][cols-1]){
                rowtosearch = i;
                break;
            }
        }
        
        int left = 0;
        int right = matrix[0].length-1;
        int mid =  0 ;
        while(left<= right){
            mid = left+ (right-left)/2;
            if(matrix[rowtosearch][mid] == target){
                return true;
            }
            else if(matrix[rowtosearch][mid] < target){
                left = mid+1;
            }
            else{
                right= mid-1;
            }
        }
        
       return false;
    }
}