class Solution {
    public int titleToNumber(String columnTitle) {
        
        int columnNumber =  0;
        int j =0;
        
        for(int i = columnTitle.length()-1; i >=0; i--){
            int charEquivalent = columnTitle.charAt(i) - 'A' + 1;
            columnNumber = columnNumber + (charEquivalent *(int)Math.pow(26,j));
            j++;
        }
        
        return columnNumber;
        
    }
} 