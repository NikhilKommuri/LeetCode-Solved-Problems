class Solution {
    public boolean areOccurrencesEqual(String s) {
        
        int[] counts = new int[26];
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            counts[c -'a'] =  counts[c -'a'] + 1;
        }
        int freq = counts[s.charAt(0) - 'a'];
        
        for(int i=1;i<s.length();i++){
            char c = s.charAt(i);
            if(counts[c -'a'] != freq){
                return false;
            }
        }
        
        return true;
    }
}