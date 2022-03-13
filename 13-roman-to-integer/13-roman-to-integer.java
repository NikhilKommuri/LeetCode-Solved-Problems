class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> RomanValues = new HashMap<>(); 
        RomanValues.put('I',1);
        RomanValues.put('V',5);
        RomanValues.put('X',10);
        RomanValues.put('L',50);
        RomanValues.put('C',100);
        RomanValues.put('D',500);
        RomanValues.put('M',1000);
        
         int i = s.length()-1;
        int result = RomanValues.get(s.charAt(i));
        for(i=s.length()-1; i>0 ; i--)
        {
            if( RomanValues.get(s.charAt(i)) > RomanValues.get(s.charAt(i-1)) )
            {
             result = result - RomanValues.get(s.charAt(i-1));          
                
            } 
            else
             result = result + RomanValues.get(s.charAt(i-1));
        }
        
        return result;
    }
}