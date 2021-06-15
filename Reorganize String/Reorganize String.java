class Solution {
    public String reorganizeString(String S) {
        HashMap<Character,Integer> hm = new HashMap<>();
        //Putting the counts of all characters in a map
        for(char c : S.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        
        //maxheap to sort characters based on frequncy
        PriorityQueue<Map.Entry<Character,Integer>> maxheap = new
            PriorityQueue<Map.Entry<Character,Integer>>((e1,e2)-> e2.getValue()-e1.getValue());
        
        maxheap.addAll(hm.entrySet());
        
        StringBuilder sb = new StringBuilder();
        
        Queue<Map.Entry<Character,Integer>> waitingqueue = new LinkedList<>();
        
        while(!maxheap.isEmpty()){
            
            Map.Entry<Character,Integer> entry = maxheap.poll();
            sb.append(entry.getKey());
            entry.setValue(entry.getValue()-1);
            waitingqueue.add(entry);
            
            if (waitingqueue.size() < 2){
                continue;
            }
            
            while(!waitingqueue.isEmpty()){
                 Map.Entry<Character,Integer> waitingelement = waitingqueue.poll();
                 if(waitingelement.getValue()>0){
                     maxheap.add(waitingelement);
                 }
            }
            
        }
        
        return sb.length() == S.length() ? sb.toString() : "";
        
    }
}
