class Trie {
    
    private class TrieNode{
        private boolean isEnd;//该节点是否为一个字符串的结束
        private TrieNode[] next;//字母映射表
        
        public TrieNode(){
            isEnd=false;
            next=new TrieNode[26];//每个节点最多有26个小写字母
        }
    }

    private TrieNode root;
    
    /** Initialize your data structure here. */
    public Trie() {
        root=new TrieNode();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode curr = root;
        
        for(int i=0,ch;i<word.length();i++){
            
            ch=word.charAt(i)-'a';
            
            if(curr.next[ch] == null){
                curr.next[ch]= new TrieNode();
            }
            
            curr=curr.next[ch];
        }
        
       curr.isEnd = true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode curr = root;
        
		for (int i = 0,ch; i<word.length(); i++) {
            ch = word.charAt(i) - 'a';
            
			if (curr.next[ch] == null) return false;
			
            curr = curr.next[ch];
		}
        
		return curr.isEnd;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode curr = root;
        
		for (int i = 0,ch; i < prefix.length(); i++) {
			ch = prefix.charAt(i) - 'a';
			if (curr.next[ch] == null) return false; // 若还没遍历完给定的前缀子串，则直接返回false
				
			curr = curr.next[ch];
		}
		return true; // 直接返回true
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */