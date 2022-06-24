/*class RandomizedSet {

    private int BUCKET_SIZE = 100;
    private List<LinkedList<Integer>> parentList;
    private LinkedList<Integer> childList;
    private Random r;
    public RandomizedSet() {
        
      r = new Random();
      parentList = new ArrayList<>(BUCKET_SIZE);
        for(int i=0;i<BUCKET_SIZE;i++){
            parentList.add(null);
        }
    }
    
    public boolean insert(int val) {
        boolean Inserted = false;
        int index = val % BUCKET_SIZE;
        childList = parentList.get(index);
        if(childList == null){
            childList = new LinkedList<Integer>();
            childList.add(val);
            parentList.add(childList);
            Inserted = true;
        }
        else{
            if(!childList.contains(val)){
                childList.addLast(val);
                Inserted = true;
            }
            else{
                Inserted = false;
            }
        }
        
        return Inserted;
    }
    
    public boolean remove(int val) {
        boolean Removed = false;
        int index = val % BUCKET_SIZE;
        LinkedList<Integer> childList = parentList.get(index);
        if(childList!=null){
            childList.remove(Integer.valueOf(val));
            Removed = true;
        }
        else{
            Removed = false;
        }
        
        return Removed;
    }
    
    public int getRandom() {
        int randomIndex;        
       // do{
            randomIndex = r.nextInt(BUCKET_SIZE-1);
            childList = parentList.get(0);
      //  }
        //while(childList == null);
        
        int first = (int) childList.removeFirst();
        
        childList.addLast(first);
        
        return first;
    }
    
}*/

class RandomizedSet {
  Map<Integer, Integer> dict;
  List<Integer> list;
  Random rand = new Random();

  /** Initialize your data structure here. */
  public RandomizedSet() {
    dict = new HashMap();
    list = new ArrayList();
  }

  /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
  public boolean insert(int val) {
    if (dict.containsKey(val)) return false;

    dict.put(val, list.size());
    list.add(list.size(), val);
    return true;
  }

  /** Removes a value from the set. Returns true if the set contained the specified element. */
  public boolean remove(int val) {
    if (! dict.containsKey(val)) return false;

    // move the last element to the place idx of the element to delete
    int lastElement = list.get(list.size() - 1);
    int idx = dict.get(val);
    list.set(idx, lastElement);
    dict.put(lastElement, idx);
    // delete the last element
    list.remove(list.size() - 1);
    dict.remove(val);
    return true;
  }

  /** Get a random element from the set. */
  public int getRandom() {
    return list.get(rand.nextInt(list.size()));
  }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */