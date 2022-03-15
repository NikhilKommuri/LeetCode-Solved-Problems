class Solution {
    public String reorganizeString(String s) {
        
        HashMap<Character,Integer> counts = new HashMap<Character,Integer>();
        
        for(char ch : s.toCharArray()){
            counts.put(ch, counts.getOrDefault(ch,0)+1);
        }
        
        PriorityQueue<Character> maxHeap = new PriorityQueue<Character>((a,b) -> counts.get(b) - counts.get(a));
        
        maxHeap.addAll(counts.keySet());
        
        StringBuilder sb = new StringBuilder();
        
        while(maxHeap.size() > 1){
            char top = maxHeap.remove();
            char topnext = maxHeap.remove();
            
            sb.append(top);
            sb.append(topnext);
            
            counts.put(top,counts.get(top) - 1);
            counts.put(topnext,counts.get(topnext) - 1);
            
            if(counts.get(top) > 0){
                maxHeap.add(top);
            }
            
            if(counts.get(topnext) > 0){
                maxHeap.add(topnext);
            }
        }
        
        if(!maxHeap.isEmpty()){
            char last = maxHeap.remove();
            if(counts.get(last) > 1){
                return "";
            }
            sb.append(last);
        }
        
        
        
        return sb.toString();
    }
}