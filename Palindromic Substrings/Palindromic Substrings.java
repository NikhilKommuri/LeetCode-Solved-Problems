class Solution {
    public int countSubstrings(String s) {
        int total = 0;
        for(int i=0;i<s.length();i++){
            int left= i-1;
            int right = i+1;
            while(left>=0 && right < s.length() && s.charAt(left) == s.charAt(right))
            {
                total++;
                left--;
                right++;
            }
             left= i;
             right = i+1;
            while(left>=0 && right < s.length() && s.charAt(left) == s.charAt(right))
            {
                total++;
                left--;
                right++;
            }

        }
      
        total = total + s.length();
        return total;
    }
} 
