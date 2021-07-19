class Solution {
    public int tupleSameProduct(int[] nums) {
        HashMap<Integer,Integer> counts = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int x = nums[i];
            for(int j= i+1; j<nums.length;j++){
                int prod = x * nums[j];
                counts.put(prod,counts.getOrDefault(prod,0)+1);
            }
        }
        
        int result = 0;
        for(int x : counts.keySet()){
            System.out.print(x + " ");
        }
        
        for(int x : counts.keySet()){
            if(counts.get(x) > 1){
                int count = counts.get(x);
                result = result + (count) * (count-1) * 4;
            }
        }
        
        return result;
        
        
    }
}
