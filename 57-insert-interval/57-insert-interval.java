class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        int newStart = newInterval[0];
        int newEnd = newInterval[1];
        
        int index=0, n= intervals.length;
        
        // add all intervals before newInterval
        while(index<n && intervals[index][1] < newStart){
            result.add(intervals[index]);
            index++;
        }
        
        // merge newInterval
        while(index < n && intervals[index][0] <= newEnd ){
            newStart = Math.min(intervals[index][0],newStart);
            newEnd   = Math.max(intervals[index][1],newEnd);
            index++;
        }
        result.add(new int[]{newStart,newEnd});
        
        // add all intervals after newInterval 
        while(index < n){
            result.add(intervals[index]);
            index++;
        }
        
        return result.toArray(new int[0][0]);
        
    }
}