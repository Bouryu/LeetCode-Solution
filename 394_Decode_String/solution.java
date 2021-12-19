class Solution {
    public String decodeString(String s) {
        Stack<Integer> numk = new Stack<>();
        Stack<StringBuilder> chStk = new Stack<>();
        StringBuilder cur = new StringBuilder();
        int k = 0;
        for(char chr: s.toCharArray()) {
            if(Character.isDigit(chr)) {
                k = k*10 + chr - '0';
            } else if(chr == '[') {
                numk.push(k);
                chStk.push(cur);
                cur = new StringBuilder();
                k = 0;
            } else if(chr == ']') {
                StringBuilder tmp = cur;
                cur = chStk.pop();
                for (k = numk.pop(); k > 0; --k) cur.append(tmp);
            } else cur.append(chr);
        }
        return cur.toString();
    }
}