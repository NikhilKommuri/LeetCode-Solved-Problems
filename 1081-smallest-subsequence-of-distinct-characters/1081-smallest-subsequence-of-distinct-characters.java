class Solution {
    public String smallestSubsequence(String s) {
                //Set to Check the current character exists or not
        HashSet<Character> seen = new HashSet<Character>();
        
        //Map to store the last or greatest index of curr char in the string
        //If the charecter already exists its replaced with the latest occurence
        HashMap<Character,Integer> occurence = new HashMap<>();
        for(int i=0;i<s.length();i++){
            occurence.put(s.charAt(i), i);
        }
        
        Stack<Character> stack = new Stack<>();
        
        for(int i=0;i<s.length();i++){
            char curr = s.charAt(i);
            
            if(!seen.contains(curr)){
                while(!stack.isEmpty() && curr < stack.peek() && occurence.get(stack.peek()) > i){
                    seen.remove(stack.pop());
                }
                
                seen.add(curr);
                stack.push(curr);
            }
        }
        
        StringBuilder sb = new StringBuilder(stack.size());
        
        for(Character c : stack){
            sb.append(c.charValue());
        }
        
        return sb.toString(); 
        
    }
}