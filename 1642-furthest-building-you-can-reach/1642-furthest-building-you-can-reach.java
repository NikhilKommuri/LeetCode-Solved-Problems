class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<heights.length-1;i++){
            int diff= heights[i+1]-heights[i];
           if(diff<=0) continue;
            if(ladders>0){
                pq.add(diff);
                ladders--;
            }
            else if(!pq.isEmpty() && diff>pq.peek()){
                pq.add(diff);
                bricks -= pq.poll();
            }
            else{
                bricks-=diff;
            }
            if(bricks<0) return i;
        }
        return heights.length-1; 
    }
}