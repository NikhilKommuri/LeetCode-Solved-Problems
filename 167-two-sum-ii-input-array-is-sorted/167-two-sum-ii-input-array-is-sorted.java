class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
	    int j=numbers.length-1;
	    while(i<=j){
	        if(numbers[i]+numbers[j]==target){
	            int array[]=new int[2];
	            array[0]=i+1;
	            array[1]=j+1;
	            return array;
	        }
	        if(numbers[i]+numbers[j]>target)
	            j--;
	       else
	            i++;
	    }
        int arr[]=new int[2];
        return arr;
        
    }
}