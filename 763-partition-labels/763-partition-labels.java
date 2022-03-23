class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] last_occurence = new int[26];
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            last_occurence[c-'a'] = i;
        }
        
        
        List<Integer> res = new ArrayList<>();
        int i=0;
        int start=0;
        for(int j=0;j<s.length();j++){
            char c = s.charAt(j);
            i= Math.max(i, last_occurence[c-'a']);
            if(i==j){
              res.add(i-start + 1);
              start = j+1;   
            }
        }
        
        return res;
        
    }
}