class Solution {
    public int jump(int[] nums) {
         if(nums.length <= 1) return 0;
        //Imagine this as building floors and at each floor we get a ladder of length i + nums[i].
        //we need to climb one ladder and then get a bigger ladder on the way.
        //once we reach the current ladder to the top we jump onto the next bigger ladder we picked
        
        int ladder = nums[0]; //ladder size
        int steps = nums[0]; //number of steps in that ladder
        int climb = 1; //already climbing one

        //for each floor
        for(int i = 1; i< nums.length ; i++){
            if(i == nums.length - 1){ //we reached last floor
                return climb;
          }  
            //check ladder size at current level, if bigger pick up that ladder
            if(ladder < i + nums[i]) ladder = i + nums[i];
            
            steps--; //decrement number of steps climbed in current ladder
            
            if(steps == 0) { //once we climbed the older ladder completely, jump onto the bigger ladder we just picked up
                climb++;
                steps = ladder - i; 
                //now number of steps remaining in the bigger ladder will be ladder length - the floor  number we are in
            }
        }
        
        return climb;
    }
}