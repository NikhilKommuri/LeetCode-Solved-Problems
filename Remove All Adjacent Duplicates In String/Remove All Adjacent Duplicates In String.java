class Solution {
    public String removeDuplicates(String S) {
    StringBuilder sb = new StringBuilder();
        for(char c: S.toCharArray()){
            sb.append(c);
            int length = sb.length();
            if(length>=2){
                if(sb.charAt(length-1)==sb.charAt(length-2)){
                    sb.deleteCharAt(length-1);
                    sb.deleteCharAt(length-2);
                    
                }
            }
        }
           
         return sb.toString();
     

        
    }
}
