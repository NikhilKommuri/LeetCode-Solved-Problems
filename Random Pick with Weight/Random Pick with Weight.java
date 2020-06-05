class Solution {
    private int[] presum;                   //Array to Hold the sum of numbers till that index
    private int n;                            

    public Solution(int[] w) {    
        n = w.length;
        presum = new int[n];

        int sum = 0;
        for (int i=0; i<n;i++){
            sum = sum + w[i];
            presum[i] = sum;  
            
        }
        
    }
    
    public int pickIndex() {
        
        Random rand = new Random();                 // Generating a randomnumber between 1 and total sum 
        int r = rand.nextInt(presum[n-1]) + 1 ;
        int left = 0;
        int right = presum.length - 1;
        while(left<right){
            int mid = left + (right - left) / 2 ;
            if(r > presum[mid]){                     // Binary Search for that number in the array
                left = mid + 1;
            }
            else{
                right = mid;
            }
        }
        return left;
            
        
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */
