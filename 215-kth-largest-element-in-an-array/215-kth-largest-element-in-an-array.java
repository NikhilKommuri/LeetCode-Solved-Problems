class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        PriorityQueue<Integer> heap =
            new PriorityQueue<Integer>((n1, n2) -> n2 - n1);
        
        for(int num : nums){
            heap.add(num);
        }
        
        int res = 0;
        
        for(int i=0;i< k;i++){
            res = heap.poll();
        }
        
        return res;
        
    }
}