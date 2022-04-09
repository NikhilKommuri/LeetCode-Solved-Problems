class Solution {
    public boolean validPalindrome(String s) {
        
        int i = 0;
        int j = s.length()-1;
        
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                boolean left = checkPalindrome(s,i,j-1);
                boolean right = checkPalindrome (s,i+1,j);
                
                return (left || right);
            }
            
            i++;
            j--;
        }
        
        return true;
        
    }
    
    private boolean checkPalindrome(String s, int i , int j){
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}