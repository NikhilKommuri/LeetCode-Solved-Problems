class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List> map = new HashMap<>();
       // List<String> list = new ArrayList<>();
        for(String s : strs){
            char[] charray = s.toCharArray();
            Arrays.sort(charray);
            String k = String.valueOf(charray);
            if(!map.containsKey(k)){
                map.put(k,new ArrayList());
            }
            map.get(k).add(s);
        }
        List<List<String>> result = new ArrayList(map.values());
        
        return result;
        
    }
}
