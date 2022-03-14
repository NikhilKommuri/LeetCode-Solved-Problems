class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        
        HashMap<Integer,Integer> counts = new HashMap<>();
        
        for(int num : nums){
            counts.put(num,counts.getOrDefault(num,0)+1);
            
        }
        
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if( entry.getValue() > n/2 ) {
             
                return entry.getKey();
            }
        }
        
        
       return 0; 
        
    }
}