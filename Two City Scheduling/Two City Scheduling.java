class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int totalcost = 0;
        //Sorting the Costs array in the increasing order of profit between two Cities A and B
        Arrays.sort(costs, (p1, p2) -> (p1[0] - p2[0]) - (p1[1] - p2[1]));
        
        //Sending the First N persons to city A
        for (int i=0 ; i<(costs.length/2);i++)
        {
            totalcost = totalcost+costs[i][0];
        }
        
        //Sending the Remaining N persons to City B
        for(int i = costs.length/2; i<costs.length;i++){
            totalcost = totalcost+costs[i][1];
        }
        return totalcost;
    }
}
