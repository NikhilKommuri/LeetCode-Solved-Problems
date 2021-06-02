class Solution {
    public int numTeams(int[] rating) {
        int total = 0;
        for(int i=1;i<rating.length-1;i++){
            int leftsmall = 0;
            int rightlarge = 0;
            int leftlarge  = 0;
            int rightsmall = 0;
            for(int j=0;j<i;j++){
                if(rating[j]>rating[i]){
                    leftlarge++;
                }
                else{
                    leftsmall++;
                }
            }
            
            for(int j=i+1;j<rating.length;j++){
                if(rating[j]>rating[i]){
                    rightlarge++;
                }
                else{
                    rightsmall++;
                }
            }
            
         total = total + (leftlarge*rightsmall) + (rightlarge*leftsmall); 
        }
        return total;
    }
}
