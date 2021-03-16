class Solution {
    public int balancedStringSplit(String s) {
        int Lcount=0;
        int Rcount=0;
        int No_bal_strings=0;
        for(char ch : s.toCharArray()){
            if(ch == 'L') Lcount++;
            if(ch == 'R') Rcount++;
            if(Lcount == Rcount){
                No_bal_strings +=1;
                Lcount = 0;
                Rcount = 0;
            }
        }
        
        return No_bal_strings;
        
    }
}
