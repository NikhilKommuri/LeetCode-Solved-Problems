class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> map.get(a) == map.get(b) ? b - a : map.get(a) - map.get(b));
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        pq.addAll(map.keySet());
        int i =0;
        while(i<nums.length){
            if(!pq.isEmpty()){
                int element = pq.poll(); 
                int count = map.get(element);
                while(count>0){
                    nums[i] = element;
                    i++;
                    count--;
                }
            }
        }
        return nums;
    }
}