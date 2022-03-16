class Solution {
    public String minRemoveToMakeValid(String s) {
        
        if (s == null || s.length() == 0) return s;       
        
        Set<Integer> indexes = new HashSet<Integer>();
        
        Stack<Integer> stack = new Stack<Integer>();
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                stack.push(i);
            }
            if(s.charAt(i) == ')'){
                if(stack.isEmpty()){
                    indexes.add(i);
                }
                else{
                    stack.pop();
                }
            }
        }
        
        while(!stack.isEmpty()){
            indexes.add(stack.pop());
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int i =0 ; i< s.length();i++){
            if(!indexes.contains(i)){
                sb.append(s.charAt(i));
            }
        }
        
        return sb.toString();
        
        
    }
}