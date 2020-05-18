class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> myset = new HashSet<Integer>();
        
        for(int i : nums)
        {
            if( myset.contains(i))
            {
                myset.remove(i);
            }
            else
                myset.add(i);
        }
        
        Iterator<Integer> it = myset.iterator();
        return it.next();
        
        
        
    }
}
