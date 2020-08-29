class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        for(char c : s.trim().toCharArray()){
            count = count+1;
            if(c==' ')
            {
              count = 0;
            }
            
        }
        return count;
    }
}
