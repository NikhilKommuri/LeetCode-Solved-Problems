class Solution {
    public String countAndSay(int n) {
        if(n==0){
            return "";
        }
        if(n==1){
            return "1";
        }
        if(n==2){
             return "11";
        }
        
        String result = "1";
        
        for (int i=1;i<n;i++){
            StringBuilder builder = new StringBuilder();
            
            for (int j =0; j<result.length();j++){
                char c = result.charAt(j);
                int count = 1;
                while(j+count < result.length() && c==result.charAt(j+count))  {
                    count ++;    
                }
                j = j+count-1;
                
                builder.append(count);
                builder.append(c);
                
            }
            result = builder.toString();
            
        }
        return result;
        
        
    }
}
