class Solution {
     public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int mostFreqLetter = 0;
        int left = 0;
        int max = 0;
        
        for(int right = 0; right < s.length(); right++){
            freq[s.charAt(right) - 'A']++;
            mostFreqLetter = Math.max(mostFreqLetter, freq[s.charAt(right) - 'A']);
            
            int lettersToChange = (right - left + 1) - mostFreqLetter;
            while(lettersToChange > k){
                freq[s.charAt(left) - 'A']--;
                left++;
                lettersToChange = (right - left + 1) - mostFreqLetter;
            }
            
            max = Math.max(max, right - left + 1);
        }
        
        return max;
    }
}