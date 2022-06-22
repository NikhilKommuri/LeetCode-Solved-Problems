class Leaderboard {
    
    private Map<Integer,Integer> map;
    private PriorityQueue<Integer> pq;
    public Leaderboard() {
        map = new HashMap<Integer,Integer>();
    }
    
    public void addScore(int playerId, int score) {
        map.put(playerId,map.getOrDefault(playerId,0)+score);
    }
    
    public int top(int K) {
        int sum = 0;
        pq =  new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        pq.addAll(map.keySet());
        while(K>0 && !pq.isEmpty()){
            int topElement = pq.poll();
            sum = sum + map.get(topElement);
            K--;
        }
        return sum;
    }
    
    public void reset(int playerId) {
        map.put(playerId,0);
    }
}

/**
 * Your Leaderboard object will be instantiated and called as such:
 * Leaderboard obj = new Leaderboard();
 * obj.addScore(playerId,score);
 * int param_2 = obj.top(K);
 * obj.reset(playerId);
 */