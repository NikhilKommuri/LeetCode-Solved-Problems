class Solution {
    public boolean isAnagram(String s, String t) {
       int[] s_count = new int[26];
       int[] t_count = new int[26];
        
       if(s.length() != t.length()){
           return false;
       } 
        
       for(char c : s.toCharArray()){
           s_count[c-'a'] = s_count[c-'a'] + 1;  
       }
       
       for(char c : t.toCharArray()){
           t_count[c-'a'] = t_count[c-'a'] + 1;  
       }
        
       for(int i=0;i<s_count.length;i++){
           if(s_count[i] != t_count[i]){
               return false;
           }
       } 
        
        return true;
        
    }
}