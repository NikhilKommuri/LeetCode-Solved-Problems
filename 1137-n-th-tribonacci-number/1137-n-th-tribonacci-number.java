class Solution {
    public int tribonacci(int n) {
        if(n<=1){
            return n;
        }
        
        if(n==2) return 1;
        
        int curr; 
        int prev1=1,prev2=1,prev3=0;
        
        for(int i=3;i<=n;i++){
            curr = prev1+ prev2+ prev3;
            
            prev3 = prev2;
            prev2 = prev1;
            prev1 = curr;
            
        }
        
        return prev1;
        
    }
} 