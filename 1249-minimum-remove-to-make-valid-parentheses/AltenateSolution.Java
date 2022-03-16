class Solution {
    public String minRemoveToMakeValid(String s) {
        
        if (s == null || s.length() == 0) return s;       
        int open = 0, closed = 0;       
        for (int i = 0; i < s.length(); ++i) {
            if(s.charAt(i) == ')') closed++;
        }
        StringBuilder result = new StringBuilder();
    for (int i = 0; i < s.length(); ++i) {
        if (s.charAt(i) == '(') {
            if (closed > 0) {
                open++;     
                closed--;
                
                result.append(s.charAt(i));    
            }
        } else if (s.charAt(i) == ')') {
            if (open > 0) {
                open--;
                
                result.append(s.charAt(i));
            } else {
                closed--;   
            }
        } else {
            result.append(s.charAt(i));  
        }
    }
    return result.toString();
        
    }
}
