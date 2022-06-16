class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> anagrams= new ArrayList<>();
        HashMap<String, List<String>> map= new HashMap<>();
        for(String s: strs){
            char[] ch= s.toCharArray();
            Arrays.sort(ch);
            String curr= new String(ch); //aet
            if(!map.containsKey(curr)){
               // List<String> present= new ArrayList<>();
               // present.add(s);
                map.put(curr, new ArrayList<>());
            }
            map.get(curr).add(s);
            
        }
        anagrams.addAll(map.values());
        return anagrams;
    }
}