class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Character> char_stack = new Stack<>();
        Stack<Integer> count_stack = new Stack<>();
        for(char c: s.toCharArray()){
            if(char_stack.isEmpty() || char_stack.peek() != c ){
                char_stack.push(c);
                count_stack.push(1);
             }

            else{
                char_stack.push(c);
                count_stack.push(count_stack.pop()+1); 
            }
            if(k==count_stack.peek()){
                int count = k;
                while(count !=0){
                    char_stack.pop();
                    count--;
                }
                count_stack.pop();
            }

        }
        
         StringBuilder sb = new StringBuilder();
           while(!char_stack.isEmpty()){
               sb.append(char_stack.pop());
           }
        
        return sb.reverse().toString();
}
}
