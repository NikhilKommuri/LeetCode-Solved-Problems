class Solution {
    public int[] getModifiedArray(int length, int[][] updates) {
        
        int[] result = new int[length];
        
        for(int[] update : updates){
            int start = update[0];
            int end   = update[1];
            int value = update[2];
            
            result[start] =  result[start] + value;
            
            if(end < length-1){
                result[end+1] = result[end+1] - value;
            }
            
        }
        
        for(int i=1;i<length;i++){
            result[i] = result[i-1] + result[i];
        }
        
        return result;
        
    }
}