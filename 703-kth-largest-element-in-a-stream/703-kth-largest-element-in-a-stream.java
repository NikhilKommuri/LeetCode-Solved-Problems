class KthLargest {
    
    private int K;
    
    private PriorityQueue<Integer> minHeap;
    
    public KthLargest(int k, int[] nums) {
        this.K = k;
        minHeap = new PriorityQueue<Integer>();
        
        for(int num:nums){
            minHeap.add(num);
        }
        
        while(minHeap.size() > K){
            minHeap.poll();
        }
        
    }
    
    public int add(int val) {
        
        minHeap.add(val);
        
        if(minHeap.size() > K){
             minHeap.poll();
        }
       
        
        return minHeap.peek();
        
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */