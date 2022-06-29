class TimeMap {

    private HashMap<String,List<Pair>> map;
    public TimeMap() {
        map = new HashMap<String,List<Pair>>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(map.containsKey(key)){
             List<Pair> currList = map.get(key);
              currList.add(new Pair(timestamp,value));
             map.put(key,currList);
        }
        else{
             List<Pair> currList = new ArrayList();
             currList.add(new Pair(timestamp,value));
             map.put(key,currList);
        }
       
        
    }
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)){
            return "";
        }
        List<Pair> list = map.get(key);
        int left = 0; int right = list.size()-1;
        String result = "";
        while(left <= right){
            int mid = left + (right-left)/2;
            if(list.get(mid).timeStamp == timestamp){
                result = list.get(mid).value;
                break;
            }
            else if(list.get(mid).timeStamp < timestamp){
                result = list.get(mid).value;
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        
        return result;
    }
    
    
    class Pair{
        int timeStamp;
        String value;
        public Pair(int timeStamp, String value){
            this.timeStamp = timeStamp;
            this.value = value;
        }
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */