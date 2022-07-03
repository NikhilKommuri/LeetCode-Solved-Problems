class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tank=0;
        for(int i=0;i<gas.length;i++){
            tank+=gas[i]-cost[i];
        }
        if(tank<0) return -1;
        int start=0;
        int accumulate=0;
        for(int i=0;i<gas.length;i++){
            int currGain= gas[i]-cost[i];
            if(accumulate+currGain<0){
                start=i+1;
                accumulate=0;
            }
            else{
                accumulate+=currGain;
            }
        }
        return start;
    }
}