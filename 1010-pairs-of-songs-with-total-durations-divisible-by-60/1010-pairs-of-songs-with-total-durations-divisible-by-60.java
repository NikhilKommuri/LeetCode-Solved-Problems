class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(time[0]%60,1);
        int count = 0;
        for(int i =1;i<time.length;i++){
            int numToCheck = 60 - (time[i]%60);
            if(map.containsKey(numToCheck%60)){
                count = count + map.get(numToCheck%60);
            }
            map.put(time[i]%60,map.getOrDefault(time[i]%60,0)+1);
        }
        
        return count;
    }
}