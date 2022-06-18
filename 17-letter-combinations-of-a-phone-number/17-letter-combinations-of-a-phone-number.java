class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result= new ArrayList<>();
        if(digits.length()==0) return result;
        Map<Character, String> map= new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        
        recursiveCombination(digits,map,result,0,"");
        return result;
        
    }
    public void recursiveCombination(String digits, Map<Character, String> map,List<String> result, int index, String current){
        if(index==digits.length()){
            result.add(current);
            return;
        }
        String prefix= map.get(digits.charAt(index));
        for(int i=0;i<prefix.length();i++){
            recursiveCombination(digits, map,result,index+1, current+prefix.charAt(i));
        }
        
    }
}