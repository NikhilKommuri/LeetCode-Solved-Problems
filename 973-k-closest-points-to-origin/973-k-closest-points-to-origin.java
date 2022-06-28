class Solution {
    public int[][] kClosest(int[][] points, int k) {
        
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a,b)->b[0]-a[0]); // 
        for(int i=0;i<points.length;i++){
            int distance = findDistance(points[i]);
            int[] entry = {distance,i};
            if(maxHeap.size() < k){
                maxHeap.add(entry);
            }
            else{
                if(distance < maxHeap.peek()[0]){
                    maxHeap.poll();
                    maxHeap.add(entry);
                }
            }
        }
        int[][] result = new int[k][2];
        for(int i=0;i<k;i++){
            int pointIdx = maxHeap.poll()[1];
            result[i] = points[pointIdx];
        }
        
        return result;
    }
    
    public int findDistance(int[] point){
        int distance = ((point[0]*point[0]) + (point[1]*point[1]));
        return distance;
    }
}