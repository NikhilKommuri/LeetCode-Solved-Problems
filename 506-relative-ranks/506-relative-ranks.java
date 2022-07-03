import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
class Solution {
    public String[] findRelativeRanks(int[] score) {
        SortedMap<Integer,Integer> map = new TreeMap<Integer, Integer>(); 
        for(int i = 0 ; i < score.length; i++) //add elements off scores to map
            map.put(score[i],0);

        int j = 0;
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){  
            //add n-th positions of elements in map by updatingvalues;
            map.put(entry.getKey(),map.size() - j);
            j++;
        }
        String[] res = new String[score.length]; //result array
        for(int i = 0 ; i < score.length; i++){
            if(map.get(score[i]) == 1)
                res[i] = "Gold Medal";
            else if(map.get(score[i]) == 2)
                res[i] = "Silver Medal";
            else if(map.get(score[i]) == 3)
                res[i] = "Bronze Medal";
            else
                res[i] = Integer.toString(map.get(score[i]));

        }
        return res;
    }
}