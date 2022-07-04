class Solution {
    public double angleClock(int hour, int minutes) {
        int oneMinAngle = 6;
        int oneHourAngle = 30;
        
        double minutesAngle = minutes * oneMinAngle;
        double hourAngle = (hour%12 * oneHourAngle) + minutes * 0.5;
            
        double angle = Math.abs(minutesAngle - hourAngle);
        
        return Math.min(angle, 360-angle);
    }
}

