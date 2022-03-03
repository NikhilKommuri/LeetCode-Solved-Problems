class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        
     /*   //Linear search to find the row in which the target might exist
        int rowtosearch = 0;
        for(int i=0;i<rows;i++){
            if(matrix[i][0] == target || matrix[i][cols-1]==target){
                return true;
            }
            if(matrix[i][0] < target && target < matrix[i][cols-1]){
                rowtosearch = i;
                break;
            }
        }*/
        
        
        //Binary Search to find the row
        
        int start = 0;
        int end = rows-1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(matrix[mid][cols-1] == target){
                return true;
            }
            else if (matrix[mid][cols-1] < target){
                start = mid + 1;
            }
            else{
                end = mid -1 ;
            }
        }
        
        int rowtosearch = start;
        if(rowtosearch == rows) return false;
        if(matrix[rowtosearch][0] == target || matrix[rowtosearch][cols-1] == target) return true;
        
        
        //Binary search to find the target in the row that might exist
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