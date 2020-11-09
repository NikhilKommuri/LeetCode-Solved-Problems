class Solution {
    public String removeVowels(String S) {
        StringBuilder sb = new StringBuilder();
        if(S.isEmpty()){
            return "";
        }
        for(char c : S.toCharArray())
        {
            if(c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u'){
                sb.append(c);
            }
        }
        return sb.toString();
        
    }
}
