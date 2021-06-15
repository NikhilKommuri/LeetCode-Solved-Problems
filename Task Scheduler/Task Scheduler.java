class Solution {
    public int leastInterval(char[] tasks, int n) {
        Map<Character,Integer> hm = new HashMap<>();
        for(char chr:tasks){
            hm.put(chr,hm.getOrDefault(chr,0)+1);
        }  
        PriorityQueue<Map.Entry<Character,Integer>> maxHeap = new
            PriorityQueue<Map.Entry<Character,Integer>>((e1,e2)->(e2.getValue()-e1.getValue()));
        
        maxHeap.addAll(hm.entrySet());
        
        int count = 0;
        
        while(!maxHeap.isEmpty()){
            
            List<Map.Entry<Character,Integer>> waitList = new ArrayList<>();
            int i;
            for(i = n+1; i>0 && !maxHeap.isEmpty(); i--){
                count++;
                System.out.print(" i is "+ i);
                System.out.print(" count is "+ count);
                Map.Entry<Character,Integer> entry = maxHeap.poll();
                System.out.print(" "+ entry.getKey() + " : " + entry.getValue());
                
                entry.setValue(entry.getValue()-1);
                
                if(entry.getValue()>0){
                    waitList.add(entry);
                }
                
            }
            
                maxHeap.addAll(waitList);
                
                if(!maxHeap.isEmpty()){
                    count += i;
                }
        }
        
        return count;
        
    }
}
