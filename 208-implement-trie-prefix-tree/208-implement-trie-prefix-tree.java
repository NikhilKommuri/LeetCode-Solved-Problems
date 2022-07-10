class Trie {
    
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode node = root;
        for(int i=0;i<word.length();i++){
            char currChar = word.charAt(i);
            if(!node.containsChar(currChar)){
                node.put(currChar,new TrieNode());
            }
            node = node.get(currChar);
        }
        
        node.setWordEnd();
    }
    
    public boolean search(String word) {
        TrieNode node = searchPrefix(word);
        if(node == null || !node.isWordEnd()){
            return false;
        }
        else{
            return true;
        }
    }
    
    public boolean startsWith(String prefix) {
        TrieNode node = searchPrefix(prefix);
        if(node == null){
            return false;
        }
        else{
            return true;
        }
    }
    
      private TrieNode searchPrefix(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
           char curLetter = word.charAt(i);
           if (node.containsChar(curLetter)) {
               node = node.get(curLetter);
           } else {
               return null;
           }
        }
        return node;
    }
    
    
}

class TrieNode{
    
    private TrieNode[] children;
    
    private final int N = 26;
    
    private boolean isWordEnd;
    
    public TrieNode(){
        children = new TrieNode[N];
    }
    
    public boolean containsChar(char ch){
        return children[ch-'a'] !=null;
    }
    
    public TrieNode get(char ch){
        return children[ch - 'a'];
    }
    
    public void put(char ch, TrieNode node){
        children[ch - 'a'] = node;
    }
    
    public void setWordEnd(){
        isWordEnd = true;
    }
    
    public boolean isWordEnd(){
        return isWordEnd;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */