class Logger {
    
    private HashMap<String,Integer> map;
    public Logger() {
        map = new HashMap<>();
        
    }
    
    public boolean shouldPrintMessage(int timestamp, String message) {
        if(!map.containsKey(message)){
            map.put(message,timestamp+10);
        }
        else if(map.get(message)> timestamp){
            return false;
        }
        else{
            timestamp = timestamp+10;
            map.put(message,timestamp);
        }
        
        return true;
    }
}

/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */