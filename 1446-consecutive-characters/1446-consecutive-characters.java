class Solution {
    public int maxPower(String s) {
        int max = 1;
        int localmax = 1;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                localmax = localmax + 1;
            }
            else{
                localmax = 1;
            }
            max = Math.max(localmax,max);
        }
        
        return max;
    }
}