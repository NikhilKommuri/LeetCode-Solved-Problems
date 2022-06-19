class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> map.get(b)- map.get(a));
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        pq.addAll(map.keySet());
        int[] result = new int[k];
        while(k>0){
            result[k-1] = pq.poll();
            k--;
        }
        
        return result;
        
    }
}