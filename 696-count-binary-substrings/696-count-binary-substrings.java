class Solution {
    public int countBinarySubstrings(String s) {
        
        int res = 0;
        int i = 0;
        int n = s.length();
        
        while(i<s.length()){
            int count0 = 0;
            int count1 = 0;
            
            if(s.charAt(i) == '0'){
                
                while(i<n && s.charAt(i) == '0'){
                    count0++;
                    i++;
                }
                
                int j = i;
                
                while(j<n && s.charAt(j) == '1'){
                    count1++;
                    j++;
                }
                
            }
            
            else{
                while(i<n && s.charAt(i) == '1'){
                    count1++;
                    i++;
                }
                
                int j = i;
                
                while(j<n && s.charAt(j) == '0'){
                    count0++;
                    j++;
                }
                
            }
            
            res = res + Math.min(count0,count1);
        }
        
        return res;
        
    }
}