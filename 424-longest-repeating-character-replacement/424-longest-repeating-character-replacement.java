class Solution {
     public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int N = s.length();
        int windowStart = 0;
        int maxcharCount = 0;
        int maxLength = 0; 
        for(int windowEnd =0; windowEnd<N;windowEnd++){
            freq[s.charAt(windowEnd) - 'A']++;
            int currCharCount = freq[s.charAt(windowEnd) - 'A'];
            maxcharCount = Math.max(maxcharCount,currCharCount);
            while(windowEnd - windowStart - maxcharCount + 1 > k){
                freq[s.charAt(windowStart) - 'A']--;
                windowStart++;
            }
            
            maxLength = Math.max(maxLength,windowEnd - windowStart + 1);
            
        } 
        return maxLength;
    }
}