class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int left = 0;
        int right =0;
        int currLength = 0;
        HashSet<Character> set = new HashSet<>();
        while(left<s.length() && right < s.length()){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                currLength = right - left + 1;
                right++;
            }
            else{
                set.remove(s.charAt(left));
                left++;
            }
            maxLength = Math.max(currLength,maxLength);   
        }
               
               return maxLength;
    }
}