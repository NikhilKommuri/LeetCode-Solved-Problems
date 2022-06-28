class Solution {
    public int minDeletions(String s) {
       int result = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for(char c: s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c : map.keySet()){
            int currVal = map.get(c);
            if(!set.contains(currVal)){
                set.add(currVal);
            }
            else{
                while(currVal>0 && set.contains(currVal)){
                    currVal--;
                    result++;
                }
                set.add(currVal);
                map.put(c,currVal);
            } 
         }
        
        return result;
    }
}