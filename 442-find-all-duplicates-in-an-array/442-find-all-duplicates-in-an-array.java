class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        List<Integer> result = new ArrayList<>();
        
        if(nums.length <= 1){
            return result;
        }
        
        HashSet<Integer> set = new HashSet<>();
        
        set.add(nums[0]);
        
        for(int i=1; i<nums.length; i++){
            if(set.contains(nums[i])){
                result.add(nums[i]);
            }
            else{
                set.add(nums[i]);
            }
               
        }
               
       return result;        
        
    }
}
               