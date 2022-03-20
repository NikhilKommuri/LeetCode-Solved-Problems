class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();
        while( n!=1 && !seen.contains(n)){
            seen.add(n);
            n = getSquareSum(n);
        }
        
        if(n==1) return true ;
        else return false;
        
    }
    
    private int getSquareSum(int n){
        int totalsum = 0;
        while(n>0){
            int d = n % 10;
            n = n / 10;
            totalsum = totalsum + (d*d);
        }
        return totalsum;
    }
}