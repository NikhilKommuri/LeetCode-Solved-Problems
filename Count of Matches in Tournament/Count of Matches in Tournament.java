class Solution {
    public int numberOfMatches(int n) {
        int no_of_matches = 0;
        
        while(n!=1){
            if(isEven(n)){
                no_of_matches = no_of_matches + n/2;
                n = n/2;
            }
            else{
                no_of_matches = no_of_matches + ((n-1) / 2) + 1 ;
                n = ((n-1) / 2) ;
            }
        }
        return no_of_matches;
        
    }
    
    public boolean isEven(int a){
        if(a%2 == 0) return true;
        else return false;
    }
}
