class Solution {
    public int[][] kClosest(int[][] points, int K) {
        int n = points.length;
        int distances[] = new int[n];
        for(int i=0; i<n ; i++){
            distances[i] = finddistance(points[i]);
        }
        
        Arrays.sort(distances);
        int Kdistance = distances[K-1];
        
        int [][] res = new int[K][2];
        int j=0;
        for(int i=0;i<n;i++){
            if(finddistance(points[i]) <= Kdistance){
                res[j] = points[i];
                j++;
            }
        }
        
        return res;
    }
    
    
    public int finddistance(int[] point){
        return (point[0] * point[0] + point[1] * point[1]);
    }
}
