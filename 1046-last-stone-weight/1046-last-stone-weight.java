class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>((a,b) ->  (b-a)); 
        for(int stone: stones){
            maxHeap.add(stone);
        }
        int count = 0;
        while(maxHeap.size()>1){
                int x = maxHeap.poll();
                int y = maxHeap.poll();
            
            if(x!=y){
                maxHeap.add(x-y);
            }
        }
        
        if(!maxHeap.isEmpty()){
            return maxHeap.poll();
        }
        else{
            return 0;
        }
    }
}