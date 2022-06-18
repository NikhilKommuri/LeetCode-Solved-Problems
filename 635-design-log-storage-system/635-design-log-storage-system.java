class LogSystem {
    
    Map<Integer,String[]> map;

    public LogSystem() {
        map = new HashMap<>();   
    }
    
    public void put(int id, String timestamp) {
        String[] stamp = timestamp.split(":");
        map.put(id,stamp);
        
    }
    
    public List<Integer> retrieve(String start, String end, String granularity) {
        
        StringBuilder sbStart = new StringBuilder();
        StringBuilder sbEnd = new StringBuilder();
        
        String[] startArr = start.split(":");
        String[] endArr = end.split(":");
        
        int idxToSearch = -1;
        
        switch(granularity){
            case "Year":
                idxToSearch = 0;
                break;
            case "Month":
                idxToSearch = 1;
                break;
            case "Day":
                idxToSearch = 2;
                break;
            case "Hour":
                idxToSearch = 3;
                break;
            case "Minute":
                idxToSearch = 4;
                break;
            case "Second":
                idxToSearch = 5;
                break;
        }

        for(int i=0;i<=idxToSearch;i++){
            sbStart.append(startArr[i]);
            sbEnd.append(endArr[i]);
        }
        
        List<Integer> res = new ArrayList<>();
        for(Map.Entry<Integer,String[]> entry : map.entrySet()){
            String[] currlog = entry.getValue();
            StringBuilder sbCurr = new StringBuilder();
            for(int i=0;i<=idxToSearch;i++){
                sbCurr.append(currlog[i]);
            }
            
            if(sbStart.compareTo(sbCurr)<=0 && sbCurr.compareTo(sbEnd)<=0){
                res.add(entry.getKey());
            }
        } 
        
        return res;
        
    }

}

/**
 * Your LogSystem object will be instantiated and called as such:
 * LogSystem obj = new LogSystem();
 * obj.put(id,timestamp);
 * List<Integer> param_2 = obj.retrieve(start,end,granularity);
 */