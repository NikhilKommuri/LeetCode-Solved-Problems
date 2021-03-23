class Solution {
    public String addBinary(String a, String b) {
        int aidx = a.length() - 1;
        int bidx = b.length() - 1;
        var carry = 0;
        StringBuilder sb = new StringBuilder();
        while(aidx >=0 || bidx>=0){
            var sum = carry;
            if(aidx>=0){
                sum = sum + a.charAt(aidx) - '0';
                aidx--;
            }
             if(bidx>=0){
                sum = sum + b.charAt(bidx) - '0';
                bidx--;
            }
            sb.append(sum%2);
            carry = sum > 1 ? 1 : 0;
        }
        if(carry == 1){
            sb.append('1');
        }
        
        return sb.reverse().toString();
    }
}
