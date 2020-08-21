class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int copyofx = x;
        int rev = 0;
        while(copyofx>0){
            int digit = copyofx%10;
            rev = rev*10 + digit;
            copyofx = copyofx/10;
        }
        
        if(rev == x){
            return true;
        }
        else{
            return false;
        }
    }
}
