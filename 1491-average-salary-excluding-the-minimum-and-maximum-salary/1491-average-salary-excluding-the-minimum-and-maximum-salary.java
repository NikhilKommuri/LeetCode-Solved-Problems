class Solution {
    public double average(int[] salary) {
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for(int i=0;i<salary.length;i++){
            max = Math.max(max,salary[i]);
            min = Math.min(min,salary[i]);
            sum = sum + salary[i];
        }
        
        sum = sum - (max + min);
        
        return (double) sum/(salary.length - 2);
        
    }
}