class Solution {
    public int[] findBuildings(int[] heights) {
        int maxHeight = Integer.MIN_VALUE;
        
        List<Integer> result = new ArrayList<>();
        for(int i= heights.length-1; i>=0;i--){
            if(heights[i] > maxHeight){
                result.add(0,i);
            }
            maxHeight = Math.max(maxHeight,heights[i]);
        }
        
        return  result.stream().mapToInt(i -> i).toArray();
    }
}