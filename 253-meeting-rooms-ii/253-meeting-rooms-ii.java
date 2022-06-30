class Solution {
    public int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals,((a,b)-> a[0]-b[0]));
        if(intervals.length <= 0){
            return 0;
        }
        if(intervals.length == 1){
            return 1;
        }
        PriorityQueue<Integer> q = new PriorityQueue<>(); 
        //stores  end time of meetings,  at top we have meeting with minimum end time,
        //means at top the meeting which ends first will be present
        int minRooms = 1;
        q.add(intervals[0][1]);
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]>=q.peek()){
                q.poll();
            }
            else{
                minRooms++;
            }
            q.add(intervals[i][1]);
        }
        
        return minRooms;
    }
}