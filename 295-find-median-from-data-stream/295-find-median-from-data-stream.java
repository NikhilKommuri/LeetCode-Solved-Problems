class MedianFinder {

    
     PriorityQueue<Integer> lowerHalf ;
     PriorityQueue<Integer> upperHalf;
    public MedianFinder() {
        lowerHalf = new PriorityQueue<>((a,b)-> b-a); //MaxHeap
        upperHalf = new PriorityQueue<>(); //MinHeap
    }
    public void addNum(int num) {
        if(lowerHalf.isEmpty() || num <= lowerHalf.peek()){
           lowerHalf.add(num);   
        }
        else{
            upperHalf.add(num);
        }
        
        
        if(upperHalf.size() > lowerHalf.size()){
            lowerHalf.add(upperHalf.poll());
        }
        else if(lowerHalf.size() > upperHalf.size() + 1){
            upperHalf.add(lowerHalf.poll());
        }
    }
    
    public double findMedian() {
        double median = 0.0;
        if(lowerHalf.size() == upperHalf.size()){
            median = (lowerHalf.peek() + upperHalf.peek()) / 2.0 ;
        }
        else{
            median = lowerHalf.peek();
        }
        
        return median;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */