class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> counts = new HashMap<>();
        for(int num : nums){
            counts.put(num,counts.getOrDefault(num,0)+1);
        }
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>((a,b) -> counts.get(b) - counts.get(a));
        
        maxHeap.addAll(counts.keySet());
        
        int[] res = new int[k];
        for(int i=0; i<k;i++){
            res[i] = maxHeap.poll();
        }
        
        return res;
        
    }
}