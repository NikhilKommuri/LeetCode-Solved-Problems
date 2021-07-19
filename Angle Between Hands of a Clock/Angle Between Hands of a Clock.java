class Solution {
    public double angleClock(int hour, int minutes) {
        double hourdegrees = 0;
        double minutedegrees;
        
        if(hour == 12){
            hour = 0;
        }
        
        minutedegrees = (minutes) * (6.0);
        
        hourdegrees = (hour + (minutes/60.0)) * 30.0;
        
        double diff = Math.abs(minutedegrees - hourdegrees);
        
        if(diff > 180.0){
            diff = 360.0 - diff;
        }
        
        return diff;
        
        
        
    }
}
