class Solution {
    public int calculateTime(String keyboard, String word) {
        int time =0;
        Map<Character, Integer> lettermap = new HashMap<>();
        for(int i=0; i<keyboard.length();i++){
            char c = keyboard.charAt(i);
            lettermap.put(c,i);
        }
        int cur_index = 0;
        for(int i=0;i<word.length();i++){
            int index = lettermap.get(word.charAt(i));
            int diff = Math.abs(index-cur_index);
            cur_index = index;
            time = time + diff;
        }
     
        return time;
        
        
    }
}
