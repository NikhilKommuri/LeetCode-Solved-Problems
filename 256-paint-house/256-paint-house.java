class Solution {
    public int minCost(int[][] costs) {
        if(costs==null || costs.length == 0){
            return 0;
        }
        
        if(costs.length == 1){
            return Math.min(Math.min(costs[0][0],costs[0][1]),costs[0][2]);
        }
        
        for(int i=1;i<costs.length;i++){
            costs[i][0] = costs[i][0] + Math.min(costs[i-1][1],costs[i-1][2]);
            costs[i][1] = costs[i][1] + Math.min(costs[i-1][0],costs[i-1][2]);
            costs[i][2] = costs[i][2] + Math.min(costs[i-1][0],costs[i-1][1]);
        }
        
       return Math.min(Math.min(costs[costs.length-1][0],costs[costs.length-1][1]),costs[costs.length-1][2]);
    }
}