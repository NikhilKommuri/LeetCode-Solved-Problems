class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum=0;
        for(int i: cardPoints){
            sum+=i;
        }
        if(cardPoints.length == k){
            return sum;
        }
        int subarraySize= cardPoints.length-k;
        int i=0;
        int left = 0;
        int subArraySum = 0;
        int startIndex = 0;
        int globalMin = sum;
        while(i<cardPoints.length){
            subArraySum += cardPoints[i];
            int presentWindowSize = i - startIndex+1;
            if(presentWindowSize == subarraySize){
                globalMin = Math.min(globalMin,subArraySum);
                subArraySum = subArraySum - cardPoints[startIndex];
                startIndex++;
            }
            i++;
        }
        return sum-globalMin;
    }
}