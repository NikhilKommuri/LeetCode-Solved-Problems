class Solution {
    public int change(int amount, int[] coins) {
        
        int[] dparray = new int[amount+1];
        
        dparray[0] = 1;
        
        for (int i =0 ; i<coins.length; i++){
            for (int j = coins[i]; j<=amount ; j++){
                dparray[j] = dparray[j] +  dparray[j-coins[i]];
            }
        }
        return dparray[amount] ;
    }
}
