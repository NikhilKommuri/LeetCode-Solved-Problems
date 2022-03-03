class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> counts = new HashMap<>();
        for(char c : s.toCharArray()){
            counts.put(c,counts.getOrDefault(c,0)+1);
        }
        
        for(int i=0;i<s.length();i++){
            if(counts.get(s.charAt(i)) == 1){
                return i;
            }
        }
        
        return -1;
        
    }
}