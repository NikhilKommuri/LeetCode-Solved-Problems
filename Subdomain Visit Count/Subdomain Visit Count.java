class Solution {
    
    HashMap<String,Integer> counts = new HashMap<>(); 
    public List<String> subdomainVisits(String[] cpdomains) {
        for(String cpdomain : cpdomains){
            processor(cpdomain);        
        }
        List<String> result = new ArrayList<>();
        for(Map.Entry<String,Integer> entry : counts.entrySet()){
            StringBuilder sb = new StringBuilder();
            sb.append(entry.getValue());
            sb.append(" ");
            sb.append(entry.getKey());
            result.add(sb.toString());
            
        }
        
        return result;
    }
    
    
    public void processor(String s){
        int domaincount = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ' '){
                String link = s.substring(i+1);
                domaincount = Integer.parseInt(s.substring(0,i));
                counts.put(link,counts.getOrDefault(link,0)+domaincount);
            }
            if(s.charAt(i) == '.'){
                String link = s.substring(i+1);
                counts.put(link,counts.getOrDefault(link,0)+domaincount);
            }
        }
    }
}
