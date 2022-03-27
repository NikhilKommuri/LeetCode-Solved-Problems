class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        
        PriorityQueue<int []> pq = new PriorityQueue<>( (a,b) ->{
            if(a[0] == b[0]) return b[1] - a[1];
            else return b[0] - a[0];
        });
        
        for(int i=0; i<m; i++){
            int strength = numberofsoldiers(mat[i]);
            int[] rowstrength = new int[]{strength,i};
            pq.add(rowstrength);
            if(pq.size()>k){
                pq.poll();
            }   
        }
        
        
        int[] result = new int[k];
        for(int i = k-1; i>=0;i--){
            int[] curr = pq.poll();
            result[i] = curr[1];
        }
        
        return result;
        
    }
    
    
    public int numberofsoldiers(int[] arr){
        int size = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                break;
            }
            size++;
        }
        return size;
    }
}