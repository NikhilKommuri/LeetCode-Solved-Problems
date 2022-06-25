class Solution {
    public boolean checkPossibility(int[] nums) {
        int modifies = 0;   //variable to hold number of modifications
		
        for(int i = 1; i < nums.length; i++){ // loop to check if previous element in greater than present (starting from index 1)
		
            if(nums[i-1] > nums[i]){ //if previous element is greater than present
			
                modifies += 1; //it needs modification so increment modifies by 1
				
                if(i-2 >= 0 && i+1 < nums.length){  //this is special case for test cases like 3,4,2,3 explained in the textual part above.
				
                    if(nums[i-2] > nums[i] && nums[i-1] > nums[i+1]){
					
                       return false;
					   
                    }
                }
                if(modifies > 1){ //check everytime if modfications cross over 1.
				
                    return false;
                }
            }
        }
        return true;
    }
}