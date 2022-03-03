class Solution {
    public boolean isValidSudoku(char[][] board) {
        int N = 9;
        HashSet<Character>[] rows  = new HashSet[N];
        HashSet<Character>[] cols  = new HashSet[N];
        HashSet<Character>[] boxes = new HashSet[N];
                
        
        for (int r = 0; r < N; r++) {
            rows[r]  = new HashSet<Character>();
            cols[r]  = new HashSet<Character>();
            boxes[r] = new HashSet<Character>();
        }
        
        for(int r=0;r<N;r++){
            for(int c=0; c<N;c++){
                char curr_val = board[r][c];
                
                if(curr_val == '.'){
                    continue;
                }
                
                if(rows[r].contains(curr_val)){
                    return false;
                }
                rows[r].add(curr_val);
                
                if(cols[c].contains(curr_val)){
                    return false;
                }
                cols[c].add(curr_val);
                
                //This Represents the 9 boxes from 0 to 8
                int box_idx = (r/3) * 3 + c/3 ;
                
                if(boxes[box_idx].contains(curr_val)){
                    return false;
                }
                boxes[box_idx].add(curr_val);
                
            }
        }
        
        return true;
        
        
        
        
        
    }
}