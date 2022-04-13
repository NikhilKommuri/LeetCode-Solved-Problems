class Solution {
    public String convertToTitle(int columnNumber) {
        char[] map = new char[26];
        
        for(int i=0;i<26;i++){
            map[i] = (char) ('A' + i);
        }
        
        StringBuilder sb = new StringBuilder();
        
        while(columnNumber > 0){
            
            char c = map[((columnNumber-1)  % 26)];
            sb.append(c);
            columnNumber = (columnNumber-1) / 26;    
        }
        
        return sb.reverse().toString();
    }
}