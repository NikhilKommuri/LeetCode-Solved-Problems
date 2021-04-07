class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
        Comparator<int[]> mycomp = new Comparator<int[]>(){
            @Override
            public int compare(int[] a, int[] b){
                return a[1]-b[1];
            }
        };
        
        Arrays.sort(intervals,mycomp);
        
        for(int i=0;i<intervals.length-1;i++){
            if(intervals[i][1] > intervals[i+1][0]){
                return false;
            }
        }
        
        return true;
    }
}
