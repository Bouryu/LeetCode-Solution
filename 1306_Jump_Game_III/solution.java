class Solution {
    public boolean canReach(int[] arr, int start) {
        int len = arr.length;
        HashSet<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        while(!queue.isEmpty()) {
            int i = queue.poll();
            if(arr[i] == 0) {
                return true;
            }
            if(visited.contains(i)) {
                continue;
            }
            visited.add(i);
            if(i+arr[i] < len) {
                queue.offer(i+arr[i]);
            }
            if(i - arr[i] >= 0) {
                queue.offer(i - arr[i]);
            }
        }
         return false;
    }
}