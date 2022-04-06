class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
         Set<Character> assignedValues = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if (map.containsKey(c1) && map.get(c1) != c2) {
                return false;
            }
            if(!map.containsKey(c1) && assignedValues.contains(c2)){
                return false;
            }
            map.put(c1, c2);
            assignedValues.add(c2);
        }
        return true;
        
    }
}