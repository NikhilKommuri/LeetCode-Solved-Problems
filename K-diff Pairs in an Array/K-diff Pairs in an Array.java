class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for(int x : nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        if(k==0){
            for(int x : map.keySet()){
                if(map.get(x)>1){
                    count++;
                }
            }
        }
        else{
            for(int x : map.keySet()){
                if(map.containsKey(k+x)){
                    count++;
                }
            }
        }
        return count;
        
    }
}
