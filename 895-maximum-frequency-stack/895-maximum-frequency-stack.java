class FreqStack {
    
    static class PriorityNode{
        int value;
        int frequency;
        int index;
        
        public PriorityNode(int val, int freq, int idx){
            this.value = val;
            this.frequency = freq;
            this.index = idx;
        }
        
    }
    
    private PriorityQueue<PriorityNode> pq;
    private HashMap<Integer,Integer> map;
    private int i;

    public FreqStack() {
        
       //This priority queue will sort the elements based on frequency if the frequency is equal
       //Then the element with latest index will be on the top
       pq = new PriorityQueue<>((o1,o2) ->{
            if(o1.frequency != o2.frequency){
                return o2.frequency - o1.frequency;
            }
           else{
               return o2.index - o1.index;
           }
        });
        
     map = new HashMap<>();
     i=0;
        
    }
    
    public void push(int val) {
        
        map.put(val, map.getOrDefault(val,0) + 1);
        pq.add(new PriorityNode(val,map.get(val),i));
        i++;
    }
    
    public int pop() {
       
        int maxfreqelement = pq.remove().value;
        map.put(maxfreqelement,map.get(maxfreqelement)-1);
        return maxfreqelement;
            
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */