class Solution {
    public int rob(int[] nums) {
        int prev = 0;
        int prev2 = 0;
        int cur = 0;
        for(int house : nums)
        {
            cur = Math.max(prev, house+prev2);
            prev2 = prev;
            prev = cur;
        }
        return cur;
    }
}