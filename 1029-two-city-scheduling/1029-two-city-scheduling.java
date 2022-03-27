class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int totalcost = 0;
        Arrays.sort(costs, (p1, p2) -> (p1[0] - p2[0]) - (p1[1] - p2[1]));
        for (int i=0 ; i<(costs.length/2);i++)
        {
            totalcost = totalcost+costs[i][0];
        }
        for(int i = costs.length/2; i<costs.length;i++){
            totalcost = totalcost+costs[i][1];
        }
        return totalcost;
        
    }
}