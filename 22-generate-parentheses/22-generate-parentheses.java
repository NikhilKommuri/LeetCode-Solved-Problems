class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result= new ArrayList<>();
        helper(n,result,"",0);
       return result;
    }
    public void helper(int n, List<String> result, String s, int index){
        if(s.length()==n*2){
            if(valid(s.toCharArray())){ 
                result.add(s); 
            }
            return;
        }
        
        helper(n,result, s+"(" ,index+1); //(+ (+ (
        helper(n,result, s+")" ,index+1);
    }
    public boolean valid(char[] current) {
        int balance = 0;
        for (char c: current) {
            if (c == '(') balance++;
            else balance--;
            if (balance < 0) return false;
        }
        return (balance == 0);
    }
}