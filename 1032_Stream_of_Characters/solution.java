class StreamChecker {
    class TrieNode{
        boolean inList;
        TrieNode child[] = new TrieNode[26];
    }
    
    TrieNode root = new TrieNode();
    StringBuilder sb = new StringBuilder();

    public StreamChecker(String[] words) {
        for(String s : words) {
            TrieNode curr = root;
            for(int i = s.length() - 1; i >=0; i--) {
                char chr = s.charAt(i);
                if(curr.child[chr-'a'] == null) {
                    curr.child[chr-'a'] = new TrieNode();
                }
                curr = curr.child[chr-'a'];
            }
            curr.inList = true;
        }
    }
    
    public boolean query(char letter) {
        sb.append(letter);
        TrieNode curr = root;
        for(int i = sb.length() - 1; i>=0 && curr != null; i--) {
            char chr = sb.charAt(i);
            curr = curr.child[chr-'a'];
            if(curr != null && curr.inList) return true;
        }
        return false;
    }
}

/**
 * Your StreamChecker object will be instantiated and called as such:
 * StreamChecker obj = new StreamChecker(words);
 * boolean param_1 = obj.query(letter);
 */