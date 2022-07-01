class LRUCache {
    
    private int CAPACITY;
    private HashMap<Integer,Node> map;
    
    private Node head;
    private Node tail;
    private int currSize;
    public LRUCache(int capacity) {
        
        CAPACITY = capacity;
        currSize = 0;
        map = new HashMap<>();
        
        head= new Node();
        tail = new Node();
        
        head.next = tail;
        tail.prev = head;
        
    }
    
    public int get(int key) {
        
        Node node = map.get(key);
        if(node == null){
            return -1;
        }
        moveToHead(node);
        return node.val;
        
    }
    
    public void put(int key, int value) {
        Node node = map.get(key);
        
        if(node == null){
            Node newNode  = new Node();
            newNode.key = key;
            newNode.val = value;
            
            map.put(key,newNode);
            addNode(newNode);
            currSize++;
            if(currSize > CAPACITY){
                Node tail = popTail();
                map.remove(tail.key);
                currSize--;
            }
        }
        else{
            node.val = value;
            moveToHead(node);
        }
    }
    
    
    class Node{
        int key;
        int val;
        Node next;
        Node prev;
    }
    
    private void addNode(Node node){
        node.prev = head;
        node.next = head.next;
        
        head.next.prev = node;
        head.next = node;
    }
    
    private void removeNode(Node node){
        Node prev = node.prev;
        Node next = node.next;
        
        prev.next = next;
        next.prev = prev;
    }
    
    private void moveToHead(Node node){
        removeNode(node);
        addNode(node);
    }
    
    private Node popTail(){
        
        Node node = tail.prev;
        removeNode(node);
        
        return node;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */