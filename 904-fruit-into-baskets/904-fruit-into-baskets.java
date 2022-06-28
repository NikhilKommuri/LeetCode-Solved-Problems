class Solution {
    public int totalFruit(int[] fruits) {
        int maxFruits = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int left = 0;
        
        
        for(int right=0;right<fruits.length;right++){
            map.put(fruits[right],map.getOrDefault(fruits[right],0)+1);
            
            while(map.size()>2){
                int leftFruitCount = map.getOrDefault(fruits[left],0)-1;
                if(leftFruitCount<=0){
                    map.remove(fruits[left]);
                }
                else{
                    map.put(fruits[left],leftFruitCount);
                }
                left++;
            }
            maxFruits = Math.max(maxFruits,right-left+1);
            
        }
        
        return maxFruits;
    }
}