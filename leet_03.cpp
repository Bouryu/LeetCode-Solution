class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int slength = s.length();
        set<char> st;
        int maxlen = 0, winStart = 0,winEnd = 0;
        while(winEnd < slength){
            if(st.find(s[winEnd]) == st.end()){
                st.insert(s[winEnd]);
                maxlen = max(maxlen,winEnd-winStart+1);
                winEnd++;
            }else{
                st.erase(st.find(s[winStart]));
                winStart++;
            }
        }
        return maxlen;
    }
};
