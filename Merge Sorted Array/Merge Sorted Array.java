class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int pointer1 = 0;
        int pointer2 = 0;
        
        int [] nums1copy = new int[m];
        System.arraycopy(nums1,0,nums1copy,0,m);
        
        int result_pointer=0;
         
        while(pointer1<m && pointer2<n)
        {
            if(nums1copy[pointer1] < nums2 [pointer2])
            {
                nums1[result_pointer] = nums1copy[pointer1];
                result_pointer++;
                pointer1++;
            }
            else
            {
                nums1[result_pointer] = nums2[pointer2];
                result_pointer++;
                pointer2++;
            }
        }
        
        if(pointer1<m)
        {
            
        System.arraycopy(nums1copy,pointer1,nums1,result_pointer, m+n-pointer1-pointer2);
            
        } 
        
        if(pointer2<n)
        {
          System.arraycopy(nums2,pointer2,nums1,result_pointer, m+n-pointer1-pointer2);   
        }
        
        
        
        
        
    }
}
