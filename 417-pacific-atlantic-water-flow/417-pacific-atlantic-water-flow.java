class Solution {
    
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<heights.length;i++){
            for(int j=0; j<heights[0].length;j++){
                if((i==heights.length-1 && j==0) || i==0 && j==heights[i].length-1){
                    result.add(Arrays.asList(i,j));
                    continue;
                }
                boolean[] pair= new boolean[2];
                //boolean[][] visited= new boolean[heights.length][heights[i].length];
                dfs(i,j,heights, heights[i][j], pair);
                if(pair[0] &&pair[1]) result.add(Arrays.asList(i,j));
            }
        }
        return result;
    }
    public void dfs(int i,int j, int[][] heights, int prev, boolean[] pair){
        if(i<0 || j<0 || i>=heights.length || j>= heights[0].length || heights[i][j]== -1 
           || heights[i][j] > prev){
            return;
        }
        
        if(i==0 || j==0) pair[0]= true;
        if(i==heights.length-1 || j== heights[0].length-1) pair[1]= true;
        if(pair[0] && pair[1]) return;
        prev= heights[i][j];
        int temp= heights[i][j];
        heights[i][j]=-1;
        dfs(i-1,j,heights,  prev, pair);
        dfs(i+1,j,heights, prev, pair);
        dfs(i,j-1,heights,  prev,  pair);
        dfs(i,j+1,heights,  prev,  pair);
        heights[i][j]=temp;
    }
}