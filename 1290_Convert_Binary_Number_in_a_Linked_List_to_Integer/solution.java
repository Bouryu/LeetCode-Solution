class Solution {
    public int getDecimalValue(ListNode head) {
        StringBuilder bin = new StringBuilder();
        
        while(head != null){
            bin.append(head.val);
            head = head.next;
        }
        return Integer.parseInt(bin.toString(),2);
    }
}