class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map = new HashMap<>();
        PriorityQueue<Character> pq = new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        
        pq.addAll(map.keySet());
        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()){
            char topChar = pq.poll();
            int numOfTimes = map.get(topChar);
            for(int i=0;i<numOfTimes;i++){
                sb.append(topChar);
            }
        }
        
        return sb.toString();
        
    }
}