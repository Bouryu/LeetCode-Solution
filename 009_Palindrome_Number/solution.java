class Solution {
    public boolean isPalindrome(int x) {
        char[] s = String.valueOf(x).toCharArray();
        for(int i = 0; i < s.length/2; i++) {
            if(s[i] != s[s.length - (i+1)]) {
                return false;
            }
        }
        return true;
    }
}