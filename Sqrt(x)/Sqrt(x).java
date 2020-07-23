class Solution {
    public int mySqrt(int x) {
        if (x<2){
            return x;
        }
        int left = 2;
        int right = x/2;
        long result;
        
        while(left<=right){
            int mid = left + (right-left)/2;
            result = (long)mid*mid;
            if(result>x){
                right = mid -1;
            }
            else if(result<x){
                left = mid + 1;
            }
            else
                return mid;
        }
        return right;
        
    }
}
