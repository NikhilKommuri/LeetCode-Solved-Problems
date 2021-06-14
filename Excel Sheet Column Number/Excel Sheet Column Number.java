class Solution {
    public int titleToNumber(String columnTitle) {
        int n = columnTitle.length();
        int res = 0,j=0;
        for(int i=n-1 ; i>=0 ;i--){
            res = res + (columnTitle.charAt(i) - '@') * (int)Math.pow(26,j);
            j++;
        }
        
        return res;
    }
}
