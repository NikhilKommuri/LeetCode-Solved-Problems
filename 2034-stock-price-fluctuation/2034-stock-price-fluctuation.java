class StockPrice {
    PriorityQueue<int[]> maxHeap;
    PriorityQueue<int[]> minHeap;
    HashMap<Integer, Integer> map;
    int latestTimestamp;
    public StockPrice() {
        maxHeap= new PriorityQueue<>((a,b)->b[0]-a[0]);
        minHeap= new PriorityQueue<>((a,b)->a[0]-b[0]);
        map= new HashMap<>();
        latestTimestamp=0;
    }
    
    public void update(int timestamp, int price) {
        latestTimestamp= Math.max(timestamp,latestTimestamp);
        map.put(timestamp,price);
        maxHeap.add(new int[]{price,timestamp});
        minHeap.add(new int[]{price,timestamp});
        
    }
    
    public int current() {
     return map.get(latestTimestamp);   
    }
    
    public int maximum() {
        int[] top= maxHeap.peek();
        while(top[0]!=map.get(top[1])){
            maxHeap.remove();
            top= maxHeap.peek();
        }
        return top[0];
    }
    
    public int minimum() {
        int[] top= minHeap.peek();
        while(top[0]!=map.get(top[1])){
            minHeap.remove();
            top= minHeap.peek();
        }
        return top[0];
    }
}

/**
 * Your StockPrice object will be instantiated and called as such:
 * StockPrice obj = new StockPrice();
 * obj.update(timestamp,price);
 * int param_2 = obj.current();
 * int param_3 = obj.maximum();
 * int param_4 = obj.minimum();
 */